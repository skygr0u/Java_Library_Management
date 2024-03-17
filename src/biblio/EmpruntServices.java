package biblio;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class EmpruntServices implements EmpruntDAOInterface {

    private Vector<Emprunt> emprunts = new Vector<>();

    @Override
    public Emprunt getEmprunt(int id) {
        Connection conn = DatabaseConnection.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Emprunts WHERE idEmprunt = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {

                return new Emprunt(
                        rs.getInt("idEmprunt"),
                        rs.getInt("idLivre"),
                        rs.getInt("idAbonné"),
                        rs.getDate("dateEmprunt"),
                        rs.getDate("Retour")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
    
    
    @Override
    public Vector<Emprunt> getAllEmprunts() {
        Vector<Emprunt> emprunts = new Vector<>();
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.prepareStatement("SELECT * FROM Emprunts");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idEmprunt = resultSet.getInt("idEmprunt");
                int idLivre = resultSet.getInt("idLivre");
                int idAbonne = resultSet.getInt("idAbonné"); 
                Date dateEmprunt = resultSet.getDate("dateEmprunt");
                Date retour = resultSet.getDate("Retour"); 

                Emprunt emprunt = new Emprunt(idEmprunt, idLivre, idAbonne, dateEmprunt, retour);
                emprunts.add(emprunt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return emprunts;
    }


    @Override
    public boolean insertEmprunt(Emprunt emprunt, Scanner scanner) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection != null) {
                connection.setAutoCommit(false); 
                

                if (isLivreDisponible(connection, emprunt.getIdLivre())) {
                    // Insertion de l'emprunt
                    String insertEmpruntSQL = "INSERT INTO Emprunts (idLivre, idAbonné, dateEmprunt, Retour) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement insertEmpruntStatement = connection.prepareStatement(insertEmpruntSQL)) {
                        insertEmpruntStatement.setInt(1, emprunt.getIdLivre());
                        insertEmpruntStatement.setInt(2, emprunt.getIdAbonne());
                        insertEmpruntStatement.setDate(3, emprunt.getDateEmprunt());
                        insertEmpruntStatement.setDate(4, emprunt.getRetour());
                        
                        int rowsInserted = insertEmpruntStatement.executeUpdate();
                        
                        if (rowsInserted > 0) {
     
                            String updateLivreDisponibiliteSQL = "UPDATE Livres SET disponibilite = FALSE WHERE idLivre = ?";
                            try (PreparedStatement updateLivreDisponibiliteStatement = connection.prepareStatement(updateLivreDisponibiliteSQL)) {
                                updateLivreDisponibiliteStatement.setInt(1, emprunt.getIdLivre());
                                updateLivreDisponibiliteStatement.executeUpdate();
                            }
                            
                            connection.commit(); 
                            System.out.println("Nouvel emprunt inséré avec succès !");
                            return true;
                        } else {
                            System.out.println("Échec de l'insertion de l'emprunt.");
                        }
                    }
                } else {
                    System.out.println("Le livre n'est pas disponible. Voici la liste des livres disponibles :");
                    afficherLivresDisponibles(connection);
                }
            } else {
                System.out.println("La connexion à la base de données a échoué.");
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'insertion de l'emprunt : " + e.getMessage());

        }
        return false;
    }



    private boolean isLivreDisponible(Connection connection, int idLivre) throws SQLException {
        String sql = "SELECT disponibilite FROM Livres WHERE idLivre = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idLivre);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getBoolean("disponibilite");
                } else {
                    throw new SQLException("Le livre avec l'ID " + idLivre + " n'existe pas.");
                }
            }
        }
    }



    public void afficherLivresDisponibles(Connection connection) {
        String sql = "SELECT idLivre, titre FROM Livres WHERE disponibilite = TRUE";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                System.out.println("Livres disponibles :");
                System.out.println("---------------------");
                while (resultSet.next()) {
                    int idLivre = resultSet.getInt("idLivre");
                    String titre = resultSet.getString("titre");
                    System.out.println("ID : " + idLivre + ", Titre : " + titre);
                }
                System.out.println("---------------------");
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la récupération des livres disponibles : " + e.getMessage());
        }
    }


    @Override
    public boolean updateEmprunt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez l'ID de l'emprunt à mettre à jour :");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        Emprunt existingEmprunt = getEmprunt(id);
        if (existingEmprunt == null) {
            System.out.println("Aucun emprunt trouvé avec l'ID spécifié.");
            return false;
        }

        System.out.println("Entrez l'ID de l'abonné pour cet emprunt (" + existingEmprunt.getIdAbonne() + "): Appuyez sur Enter pour conserver la valeur existante.");
        String input = scanner.nextLine();
        int idAbonne = input.isEmpty() ? existingEmprunt.getIdAbonne() : Integer.parseInt(input);

        System.out.println("Entrez l'ID du livre emprunté (" + existingEmprunt.getIdLivre() + "): Appuyez sur Enter pour conserver la valeur existante.");
        input = scanner.nextLine();
        int idLivre = input.isEmpty() ? existingEmprunt.getIdLivre() : Integer.parseInt(input);

        System.out.println("Entrez la date de retour de l'emprunt (au format jj/mm/aaaa) (" + existingEmprunt.getRetour() + "): Appuyez sur Enter pour conserver la valeur existante.");
        input = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateRetour = existingEmprunt.getRetour();
        try {
            if (!input.isEmpty()) {
                dateRetour = new Date(dateFormat.parse(input).getTime());
            }
        } catch (ParseException e) {
            System.out.println("Format de date invalide. La date de retour ne sera pas mise à jour.");
        }

        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "UPDATE Emprunts SET idAbonné = ?, idLivre = ?, Retour = ? WHERE idEmprunt = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, idAbonne);
                statement.setInt(2, idLivre);
                statement.setDate(3, dateRetour != null ? new java.sql.Date(dateRetour.getTime()) : null);
                statement.setInt(4, id);

                int rowsUpdated = statement.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("Mise à jour de l'emprunt avec l'ID " + id + " effectuée avec succès.");
                    return true;
                } else {
                    System.out.println("La mise à jour de l'emprunt avec l'ID " + id + " a échoué.");
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }




	@Override
	public boolean deleteEmprunt(int id) {
	    if (id <= 0) {
	        System.out.println("L'ID de l'emprunt doit être un entier positif.");
	        return false;
	    }

	    Connection connection = null;
	    PreparedStatement statement = null;
	    try {
	        connection = DatabaseConnection.getConnection();
	        String query = "DELETE FROM emprunts WHERE idEmprunt = ?";
	        statement = connection.prepareStatement(query);
	        statement.setInt(1, id);
	        int rowsDeleted = statement.executeUpdate();
	        return rowsDeleted > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (statement != null) {
	                statement.close();
	            }
	            if (connection != null) {
	                connection.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return false;
	}


	@Override
	public boolean retournerLivre(int idEmprunt) {
	    if (idEmprunt <= 0) {
	        System.out.println("Erreur: L'ID de l'emprunt doit être un entier positif.");
	        return false;
	    }

	    Connection connection = null;
	    PreparedStatement checkStatement = null;
	    PreparedStatement updateEmpruntStatement = null;
	    PreparedStatement updateLivreStatement = null;
	    ResultSet resultSet = null;

	    try {
	        connection = DatabaseConnection.getConnection();

	        if (connection == null) {
	            System.err.println("Impossible d'établir une connexion à la base de données.");
	            return false;
	        }

	        // D'abord, vérifier si l'enregistrement d'emprunt existe et si le livre n'a pas été retourné
	        String checkQuery = "SELECT idLivre FROM Emprunts WHERE idEmprunt = ? ";
	        checkStatement = connection.prepareStatement(checkQuery);
	        checkStatement.setInt(1, idEmprunt);
	        resultSet = checkStatement.executeQuery();

	        if (resultSet.next()) {
	            int idLivre = resultSet.getInt("idLivre");

	            // Maintenant, procéder à marquer l'emprunt comme retourné en mettant à jour la date de 'Retour' à la date actuelle
	            String updateEmpruntQuery = "UPDATE Emprunts SET Retour = CURDATE() WHERE idEmprunt = ?";
	            updateEmpruntStatement = connection.prepareStatement(updateEmpruntQuery);
	            updateEmpruntStatement.setInt(1, idEmprunt);
	            int rowsUpdated = updateEmpruntStatement.executeUpdate();

	            if (rowsUpdated > 0) {
	                // Le livre a été marqué comme retourné dans 'Emprunts', maintenant mettre à jour sa disponibilité dans 'Livres'
	                String updateLivreQuery = "UPDATE Livres SET disponibilite = TRUE WHERE idLivre = ?";
	                updateLivreStatement = connection.prepareStatement(updateLivreQuery);
	                updateLivreStatement.setInt(1, idLivre);
	                updateLivreStatement.executeUpdate();

	                System.out.println("Le livre a été marqué comme retourné avec succès.");
	                return true;
	            } else {
	                System.out.println("Échec de la mise à jour de l'emprunt.");
	                return false;
	            }
	        } else {
	            System.out.println("Aucun emprunt en cours trouvé avec cet ID.");
	            return false;
	        }
	    } catch (SQLException e) {
	        System.out.println("Erreur de la base de données lors du retour du livre. " + e.getMessage());
	    } finally {
	        try {
	            if (resultSet != null) resultSet.close();
	            if (checkStatement != null) checkStatement.close();
	            if (updateEmpruntStatement != null) updateEmpruntStatement.close();
	            if (updateLivreStatement != null) updateLivreStatement.close();
	            if (connection != null) connection.close();
	        } catch (SQLException ex) {
	            System.out.println("Erreur lors de la fermeture des ressources. " + ex.getMessage());
	        }
	    }
	    return false;
	}




	@Override
	public Vector<Emprunt> afficherRetards() {
	    Vector<Emprunt> retards = new Vector<>();

	    // Requête SQL pour trouver les emprunts en retard
	    String query = "SELECT * FROM Emprunts WHERE Retour < CURDATE() ";

	    try (Connection connection = DatabaseConnection.getConnection();
	         PreparedStatement statement = connection.prepareStatement(query);
	         ResultSet resultSet = statement.executeQuery()) {

	        while (resultSet.next()) {
	            // En supposant qu'il existe un constructeur pour Emprunt qui correspond à la structure des colonnes de votre table Emprunts
	            int idEmprunt = resultSet.getInt("idEmprunt");
	            int idLivre = resultSet.getInt("idLivre");
	            int idUtilisateur = resultSet.getInt("idAbonné");
	            Date dateEmprunt = resultSet.getDate("DateEmprunt");
	            Date dateRetour = resultSet.getDate("Retour");
	            // Remarque : Les paramètres réels du constructeur dépendent de la définition de votre classe Emprunt
	            Emprunt emprunt = new Emprunt(idEmprunt, idLivre, idUtilisateur, dateEmprunt, dateRetour);
	            
	            retards.add(emprunt);
	        }

	    } catch (SQLException e) {
	        System.out.println("Erreur de base de données : " + e.getMessage());
	        // Gérer l'exception de manière appropriée (journalisation, etc.)
	        return null;
	    }

	    return retards;
	}


	@Override
	public Vector<Emprunt> rechercherEmpruntsEnCours() {
	    Vector<Emprunt> empruntsEnCours = new Vector<>();

	    // Requête SQL pour sélectionner les emprunts qui n'ont pas été retournés
	    String query = "SELECT * FROM Emprunts WHERE Retour IS NULL";

	    try (Connection connection = DatabaseConnection.getConnection();
	         PreparedStatement statement = connection.prepareStatement(query);
	         ResultSet resultSet = statement.executeQuery()) {

	        while (resultSet.next()) {
	            // En supposant qu'un constructeur approprié pour Emprunt correspond à la structure de votre table
	            int idEmprunt = resultSet.getInt("idEmprunt");
	            int idLivre = resultSet.getInt("idLivre");
	            int idUtilisateur = resultSet.getInt("idUtilisateur");
	            Date dateEmprunt = resultSet.getDate("DateEmprunt");
	            Date dateRetour = resultSet.getDate("DateRetour");
	            // Ajustez les paramètres du constructeur en fonction de la conception de votre classe Emprunt
	            Emprunt emprunt = new Emprunt(idEmprunt, idLivre, idUtilisateur, dateEmprunt, dateRetour);
	            
	            // Ajoutez l'emprunt à la liste des emprunts en cours
	            empruntsEnCours.add(emprunt);
	        }

	    } catch (SQLException e) {
	        System.out.println("Erreur de base de données : " + e.getMessage());
	        // Gérez l'exception de manière appropriée
	        return null;
	    }

	    return empruntsEnCours;
	}


}