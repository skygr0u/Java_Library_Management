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
import java.util.Scanner;
import java.util.Vector;

public class LivreServices implements LivreDAOInterface {

	@Override
	public Livre getLivre(int id) {
	    Connection connection = DatabaseConnection.getConnection();
	    try {
	        PreparedStatement statement = connection.prepareStatement("SELECT * FROM livres WHERE idLivre = ?");
	        statement.setInt(1, id);
	        ResultSet resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            int idLivre = resultSet.getInt("idLivre");
	            String titre = resultSet.getString("titre");
	            int idAuteur = resultSet.getInt("idAuteur");
	            String isbn = resultSet.getString("ISBN");
	            Date datePublication = resultSet.getDate("datePublication");
	            Livre livre = new Livre(idLivre, titre, idAuteur, isbn, datePublication);
	            return livre;
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
	public Vector<Livre> getAllLivres() {
	    Vector<Livre> livres = new Vector<>();
	    Connection connection = DatabaseConnection.getConnection();
	    try {
	        PreparedStatement statement = connection.prepareStatement("SELECT * FROM livres");
	        ResultSet resultSet = statement.executeQuery();

	        while (resultSet.next()) {
	            int idLivre = resultSet.getInt("idLivre");
	            String titre = resultSet.getString("titre");
	            int idAuteur = resultSet.getInt("idAuteur");
	            String isbn = resultSet.getString("ISBN");
	            Date datePublication = resultSet.getDate("datePublication");
	            Livre livre = new Livre(idLivre, titre, idAuteur, isbn, datePublication);
	            livres.add(livre);
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
	    return livres;
	}


	@Override
	public boolean insertLivre(Livre livre, Scanner scanner) {
	    UserDAOInterface userDAO = new UserService();
	    GestionnaireUser gestionnaireUser = new GestionnaireUser(userDAO);
	    Connection connection = null;
	    PreparedStatement statement = null;
	    ResultSet generatedKeys = null;
	    try {
	        connection = DatabaseConnection.getConnection();

	        // Step 1: Fetch and display list of authors
	        Vector<Auteur> authors = userDAO.getAllAuteurs();
	        if (authors.isEmpty()) {
	            System.out.println("Aucun auteur trouvé. Veuillez ajouter un auteur avant d'insérer un livre.");
	            return false;
	        }

	        // Display authors and prompt user to choose one
	        System.out.println("Veuillez choisir un auteur par ID dans la liste suivante :");
	        for (Auteur author : authors) {
	            System.out.println("ID: " + author.getIdAuteur() + ", Name: " + author.getNom());
	        }
	        System.out.print("Enter author ID: ");
	        int authorId = scanner.nextInt();
	        scanner.nextLine(); // Clear buffer

	        // Validate chosen author ID
	        if (authors.stream().noneMatch(a -> a.getIdAuteur() == authorId)) {
	            System.out.println("Invalid auteur ID. Operation cancelled.");
	            return false;
	        }

	        // Step 2: Proceed with book insertion using the valid author ID
	        String query = "INSERT INTO livres (titre, idAuteur, ISBN, datePublication) VALUES (?, ?, ?, ?)";
	        statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
	        statement.setString(1, livre.getTitre());
	        statement.setInt(2, authorId); // Use validated author ID
	        statement.setString(3, livre.getISBN());
	        statement.setDate(4, livre.getDatePublication());

	        int rowsInserted = statement.executeUpdate();

	        if (rowsInserted > 0) {
	            generatedKeys = statement.getGeneratedKeys();
	            if (generatedKeys.next()) {
	                livre.setIdLivre(generatedKeys.getInt(1));
	                return true;
	            } else {
	                throw new SQLException("Échec lors de la récupération de l'ID généré pour le livre inséré.");
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (generatedKeys != null) generatedKeys.close();
	            if (statement != null) statement.close();
	            if (connection != null) connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return false;
	}

	
	@Override
	public boolean updateLivre() {
	    UserDAOInterface userDAO = new UserService();
	    GestionnaireUser gestionnaireUser = new GestionnaireUser(userDAO);
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Entrez l'ID du livre à mettre à jour :");
	    int id = scanner.nextInt();
	    scanner.nextLine();

	    Livre existingLivre = getLivre(id);
	    if (existingLivre == null) {
	        System.out.println("Aucun livre trouvé avec l'ID spécifié.");
	        return false;
	    }


	    Vector<Auteur> authors = userDAO.getAllAuteurs();
	    if (authors.isEmpty()) {
	        System.out.println("Aucun auteur disponible. Veuillez ajouter un auteur d'abord.");
	        return false;
	    }
	    System.out.println("Veuillez sélectionner un auteur pour le livre par ID :");
	    for (Auteur author : authors) {
	        System.out.println("ID: " + author.getIdAuteur() + ", Name: " + author.getNom());
	    }

	    System.out.println("Entrez l'ID de l'auteur du livre (" + existingLivre.getIdAuteur() + ") :");
	    String idAuteurInput = scanner.nextLine(); // Input as string to check for empty
	    int idAuteur = idAuteurInput.isEmpty() ? existingLivre.getIdAuteur() : Integer.parseInt(idAuteurInput);

	    System.out.println("Entrez le titre du livre (" + existingLivre.getTitre() + ") :");
	    String titre = scanner.nextLine();
	    titre = titre.isEmpty() ? existingLivre.getTitre() : titre; // Use existing if empty

	    System.out.println("Entrez le code ISBN du livre (" + existingLivre.getISBN() + ") :");
	    String isbn = scanner.nextLine();
	    isbn = isbn.isEmpty() ? existingLivre.getISBN() : isbn;

	    System.out.println("Entrez la date de publication du livre (au format jj/mm/aaaa) (" + existingLivre.getDatePublication() + ") :");
	    String dateStr = scanner.nextLine();

	    // Process date publication
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date datePublication = existingLivre.getDatePublication();
	    try {
	        if (!dateStr.isEmpty()) {
	            datePublication = new Date(dateFormat.parse(dateStr).getTime());
	        }
	    } catch (ParseException e) {
	        System.out.println("Format de date invalide. La date de publication ne sera pas mise à jour.");
	    }


	    try (Connection connection = DatabaseConnection.getConnection()) {
	        String query = "UPDATE livres SET titre = ?, idAuteur = ?, ISBN = ?, datePublication = ? WHERE idLivre = ?";
	        try (PreparedStatement statement = connection.prepareStatement(query)) {
	            statement.setString(1, titre);
	            statement.setInt(2, idAuteur);
	            statement.setString(3, isbn);
	            statement.setDate(4, new java.sql.Date(datePublication.getTime())); 
	            statement.setInt(5, id);

	            int rowsUpdated = statement.executeUpdate();

	            if (rowsUpdated > 0) {
	                System.out.println("Mise à jour du livre avec l'ID " + id + " effectuée avec succès.");
	                return true;
	            } else {
	                System.out.println("La mise à jour du livre avec l'ID " + id + " a échoué.");
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}


	@Override
	public boolean deleteLivre(int id) {
	    if (id <= 0) {
	        System.out.println("L'ID du livre doit être un entier positif.");
	        return false;
	    }

	    Connection connection = null;
	    PreparedStatement statement = null;
	    try {
	        connection = DatabaseConnection.getConnection();
	        
	        String query = "DELETE FROM livres WHERE idLivre = ?";
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
