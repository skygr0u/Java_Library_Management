package biblio;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class GestionnaireLivre {
	
    private LivreDAOInterface livreDAO;
    
    public GestionnaireLivre(LivreDAOInterface livreDAO) {
        this.livreDAO = livreDAO;
    }

    public void ajouterLivre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le titre du livre :");
        String titre = scanner.nextLine();

        System.out.println("Entrez l'ID de l'auteur du livre :");
        int idAuteur = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Entrez le code ISBN du livre :");
        String isbn = scanner.nextLine();

        System.out.println("Entrez la date de publication du livre (au format jj/mm/aaaa) :");
        String dateStr = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            java.util.Date parsedDate = dateFormat.parse(dateStr);
            Date datePublication = new Date(parsedDate.getTime());

            Livre livre = new Livre(titre, idAuteur, isbn, datePublication);

            if (livreDAO.insertLivre(livre, scanner)) {
                System.out.println("Le livre a été ajouté avec succès.");
            } else {
                System.out.println("Erreur lors de l'ajout du livre.");
            }
        } catch (ParseException e) {
            System.out.println("Format de date invalide. Utilisez le format jj/mm/aaaa.");
        }
    }


    public void supprimerLivre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'ID du livre à supprimer :");
        int id = scanner.nextInt();
        
        if (livreDAO.deleteLivre(id)) {
            System.out.println("Le livre a été supprimé avec succès.");
        } else {
            System.out.println("Erreur lors de la suppression du livre.");
        }
    }
    

    public void afficherListeLivres() {
        Vector<Livre> livres = livreDAO.getAllLivres();
        if (livres.isEmpty()) {
            System.out.println("Il n'y a aucun livre dans la base de données.");
        } else {
            for (Livre livre : livres) {
                System.out.println(livre.toString());
            }
        }
    }
    
    public void afficherListeLivresParOrdreAlphabetique() {
        Vector<Livre> livres = livreDAO.getAllLivres();
        if (!livres.isEmpty()) {
            Collections.sort(livres, Comparator.comparing(Livre::getTitre));
            for (Livre livre : livres) {
                System.out.println(livre);
            }
        } else {
            System.out.println("Il n'y a aucun livre dans la base de données.");
        }
    }
    

    public void rechercherLivresParAuteur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le titre à rechercher :");
        String titre = scanner.nextLine();
        Vector<Livre> livres = livreDAO.getAllLivres();
        boolean found = false;
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) { // Assuming the Livre class has a method getNomAuteur() to get the author's name
                System.out.println(livre);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun livre trouvé avec ce titre.");
        }
    }
    
    public void updateLivre() {
    	livreDAO.updateLivre();
      
    }
    
    


}

