package biblio;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;


public class UserService implements UserDAOInterface {

   @Override
 public Auteur getAuteur(int id) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM auteurs WHERE idAuteur = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                int idd =resultSet.getInt("idAuteur");
                String nom=resultSet.getString("nom");
                String prenom=resultSet.getString("prenom");
                String username=resultSet.getString("username");
                String password=resultSet.getString("password");
                Auteur auteur =new Auteur (idd,nom,prenom,username,password);
                return auteur;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Vector<Auteur> getAllAuteurs() {
        Vector<Auteur> auteurs = new Vector<>();
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM auteurs");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

               int id =resultSet.getInt("idAuteur");    
               String nom=resultSet.getString("nom");
               String prenom=resultSet.getString("prenom");
               String username=resultSet.getString("username");
               String password=resultSet.getString("password");
               Auteur auteur =new Auteur (id,nom,prenom,username,password);
               auteurs.add(auteur);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return auteurs;
    }

  @Override
public abonnes getAbonne(int id) {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        connection = DatabaseConnection.getConnection();
        String query = "SELECT * FROM abonnes WHERE idAbonné = ?"; 
        statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            abonnes abonne = new abonnes();
            abonne.setIdAbonne(resultSet.getInt("idAbonné")); // Adjust the column name as needed
            abonne.setEmail(resultSet.getString("email"));    // Assuming the column exists based on previous context
            abonne.setContact(resultSet.getString("contact")); // Adjust based on your schema
            abonne.setUsername(resultSet.getString("username"));
            abonne.setPassword(resultSet.getString("password"));
            return abonne;
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Consider a more sophisticated error handling mechanism
    } finally {
        // Ensure resources are always closed to avoid memory leaks
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return null;
}


  @Override
public Vector<abonnes> getAllAbonnes() {
    Vector<abonnes> abonnesList = new Vector<>();
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    try {
        connection = DatabaseConnection.getConnection();
        String query = "SELECT * FROM abonnes"; // Make sure the table name matches your DB schema
        statement = connection.prepareStatement(query);
        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            abonnes abonne = new abonnes();
            abonne.setIdAbonne(resultSet.getInt("idAbonné")); // Ensure column names match your DB
            abonne.setEmail(resultSet.getString("email")); // Assuming you have these fields based on prior context
            abonne.setContact(resultSet.getString("contact")); 
            abonne.setUsername(resultSet.getString("username"));
            abonne.setPassword(resultSet.getString("password"));
            abonnesList.add(abonne);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Consider logging this exception or handling it more gracefully
    } finally {
        // Ensure all resources are closed to avoid memory leaks
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Consider a more robust handling or logging
        }
    }
    return abonnesList;
}

  @Override
public boolean insertAuteur(Auteur auteur) {
    Connection connection = null;
    PreparedStatement statement = null;
    try {
        connection = DatabaseConnection.getConnection();

        String query = "INSERT INTO auteurs (nom, prenom, username, password, email) VALUES (?, ?, ?, ?, ?)";
        statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, auteur.getNom());
        statement.setString(2, auteur.getPrenom());
        statement.setString(3, auteur.getUsername());
        statement.setString(4, auteur.getPassword());
        statement.setString(5, auteur.getEmail());

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    auteur.setIdAuteur(generatedKeys.getInt(1));
                    
                    // Afficher un succès via une boîte de dialogue
                    JOptionPane.showMessageDialog(null, "Auteur inséré avec succès!");
                } else {
                    throw new SQLException("Échec lors de la récupération de l'ID de l'auteur généré.");
                }
            }
            return true;
        }


        // Si aucune ligne n'est insérée
        return false;
    } catch (SQLException e) {
        // Affichage de l'erreur dans une boîte de dialogue
        JOptionPane.showMessageDialog(null, "Erreur d'insertion de l'auteur : " + e.getMessage());
    } finally {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de fermeture de la connexion : " + e.getMessage());
        }
    }
    return false;
}


  @Override
public boolean insertAbonne(abonnes abonne) {
   Connection connection = null;
   PreparedStatement statement = null;
   try {
       connection = DatabaseConnection.getConnection();

       String query = "INSERT INTO abonnés (email, contact, username, password) VALUES (?, ?, ?, ?)";
       statement = connection.prepareStatement(query);
       statement.setString(1, abonne.getEmail());
       statement.setString(2, abonne.getContact());
       statement.setString(3, abonne.getUsername());
       statement.setString(4, abonne.getPassword());

       int rowsInserted = statement.executeUpdate();
       return rowsInserted > 0;
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
           // Handle the SQLException appropriately, such as logging or throwing a custom exception
      }
   }
   return false;
}



    @Override
    public boolean updateAuteur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le ID :");
        int id = scanner.nextInt();
        scanner.nextLine(); 


        Auteur existingAuteur = getAuteur(id);
        if (existingAuteur == null) {
            System.out.println("Aucun auteur trouvé avec l'ID spécifié.");
            return false;
        }


        System.out.println("Entrez le nom de l'auteur (" + existingAuteur.getNom() + ") :");
        String nom = scanner.nextLine();
        System.out.println("Entrez le prénom de l'auteur (" + existingAuteur.getPrenom() + ") :");
        String prenom = scanner.nextLine();
        System.out.println("Entrez le nom d'utilisateur de l'auteur (" + existingAuteur.getUsername() + ") :");
        String username = scanner.nextLine();
        System.out.println("Entrez le mot de passe de l'auteur :");
        String password = scanner.nextLine();


        nom = !nom.isEmpty() ? nom : existingAuteur.getNom();
        prenom = !prenom.isEmpty() ? prenom : existingAuteur.getPrenom();
        username = !username.isEmpty() ? username : existingAuteur.getUsername();
        password = !password.isEmpty() ? password : existingAuteur.getPassword();
        Auteur updatedAuteur = new Auteur(nom, prenom, username, password);


        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DatabaseConnection.getConnection();
            String query = "UPDATE auteurs SET nom = ?, prenom = ?, username = ?, password = ? WHERE idAuteur = ?";
            statement = connection.prepareStatement(query);

            statement.setString(1, updatedAuteur.getNom());
            statement.setString(2, updatedAuteur.getPrenom());
            statement.setString(3, updatedAuteur.getUsername());
            statement.setString(4, updatedAuteur.getPassword());
            statement.setInt(5, id);

            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Mise à jour de l'auteur avec l'ID " + id + " effectuée avec succès.");
                return true;
            } else {
                System.out.println("La mise à jour de l'auteur avec l'ID " + id + " a échoué.");
            }
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
    public boolean updateAbonne() {
    	  Scanner scanner = new Scanner(System.in);
    	    System.out.println("Donner le ID :");
    	    int id = scanner.nextInt();
    	    scanner.nextLine(); 

    	    abonnes existingAbonne = getAbonne(id);
    	    if (existingAbonne == null) {
    	        System.out.println("Aucun abonné trouvé avec l'ID spécifié.");
    	        return false;
    	    }

    	    System.out.println("Entrez le nom d'utilisateur de l'abonné (" + existingAbonne.getUsername() + ") :");
    	    String username = scanner.nextLine();
    	    System.out.println("Entrez le mot de passe de l'abonné (" + existingAbonne.getUsername() + ") :");
    	    String password = scanner.nextLine();
            System.out.println("Entrez le nom de l'abonné (" + existingAbonne.getEmail() + ") :");
    	    String email = scanner.nextLine();
    	    System.out.println("Entrez le prénom de l'abonné (" + existingAbonne.getContact() + ") :");
    	    String contact = scanner.nextLine();

    	    email = !email.isEmpty() ? email : existingAbonne.getEmail();
    	    contact = !contact.isEmpty() ? contact : existingAbonne.getContact();
    	    username = !username.isEmpty() ? username : existingAbonne.getUsername();
    	    password = !password.isEmpty() ? password : existingAbonne.getPassword();
    	    abonnes updatedAbonne = new abonnes(email, contact, username, password);

    	    Connection connection = null;
    	    PreparedStatement statement = null;
    	    try {
    	        connection = DatabaseConnection.getConnection();
    	        String query = "UPDATE abonnés SET nom = ?, prenom = ?, username = ?, password = ? WHERE idAbonné = ?";
    	        statement = connection.prepareStatement(query);

    	        statement.setString(1, updatedAbonne.getEmail());
    	        statement.setString(2, updatedAbonne.getContact());
    	        statement.setString(3, updatedAbonne.getUsername());
    	        statement.setString(4, updatedAbonne.getPassword());
    	        statement.setInt(5, id);

    	        int rowsUpdated = statement.executeUpdate();

    	        if (rowsUpdated > 0) {
    	            System.out.println("Mise à jour de l'abonné avec l'ID " + id + " effectuée avec succès.");
    	            return true;
    	        } else {
    	            System.out.println("La mise à jour de l'abonné avec l'ID " + id + " a échoué.");
    	        }
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
    public boolean deleteAuteur(int id) {
        if (id <= 0) {
            System.out.println("L'ID de l'auteur doit être un entier positif.");
            return false;
        }

        Connection connection = null;
        PreparedStatement statement = null;
        try {

            connection = DatabaseConnection.getConnection();
            

            String query = "DELETE FROM Auteurs WHERE idAuteur = ?";
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
    public boolean deleteAbonne(int id) {
        if (id <= 0) {
            System.out.println("L'ID de l'abonné doit être un entier positif.");
            return false;
        }

        Connection connection = null;
        PreparedStatement statement = null;
        try {

            connection = DatabaseConnection.getConnection();
            
 
            String query = "DELETE FROM abonnés WHERE idAbonné = ?";
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
   


}