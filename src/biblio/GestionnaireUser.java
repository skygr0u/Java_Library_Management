package biblio;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

public class GestionnaireUser {
    private UserDAOInterface userDAO;

    public GestionnaireUser(UserDAOInterface userDAO) {
        this.userDAO = userDAO;
    }

    public void ajouterAuteur(String nom, String prenom, String username, String password, String email) {
        Auteur auteur = new Auteur(nom, prenom, username, password, email);

        if (userDAO.insertAuteur(auteur)) {
            JOptionPane.showMessageDialog(null, "The Author has been added successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Error adding Author.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public void afficherListeAuteur() {
        Vector<Auteur> auteurs = userDAO.getAllAuteurs();
        if (auteurs.isEmpty()) {
            System.out.println("Il n'y a aucun auteur dans la base de données.");
        } else {
            for (Auteur auteur : auteurs) {
                System.out.println(auteur.toString());
            }
        }
    }

    public void afficherListeAuteurParOrdreAlphabetique() {
        Vector<Auteur> auteurs = userDAO.getAllAuteurs();
        if (!auteurs.isEmpty()) {
            Collections.sort(auteurs, Comparator.comparing(Auteur::getNom));
            for (Auteur auteur : auteurs) {
                System.out.println(auteur);
            }
        } else {
            System.out.println("Il n'y a aucun auteur dans la base de données.");
        }
    }

    public void rechercherAuteurParNom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de l'auteur à rechercher :");
        String nom = scanner.nextLine();
        Vector<Auteur> auteurs = userDAO.getAllAuteurs();
        boolean found = false;
        for (Auteur auteur : auteurs) {
            if (auteur.getNom().equalsIgnoreCase(nom)) {
                System.out.println(auteur);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun auteur trouvé avec ce nom.");
        }
    }
    
    public void ajouterAbonnee(String username, String password, String email, String contact) {
        abonnes abonne = new abonnes(username, password, email, contact);
        if (userDAO.insertAbonne(abonne)) {
            JOptionPane.showMessageDialog(null, "The subscriber has been added successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Error adding subscriber.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void supprimerAbonnee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'ID de l'abonné à supprimer :");
        int id = scanner.nextInt();
        if (userDAO.deleteAbonne(id)) {
            System.out.println("L'abonné a été supprimé avec succès.");
        } else {
            System.out.println("Erreur lors de la suppression de l'abonné.");
        }
    }

    public void afficherListeAbonnee() {
        Vector<abonnes> abonnes = userDAO.getAllAbonnes();
        if (abonnes.isEmpty()) {
            System.out.println("Il n'y a aucun abonné dans la base de données.");
        } else {
            for (abonnes abonne : abonnes) {
                System.out.println(abonne);
            }
        }
    }

    public void afficherListeAbonneeParOrdreAlphabetique() {


    	}
    public void rechercherAbonneeParNom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de l'abonné à rechercher :");
        String nom = scanner.nextLine();
        Vector<abonnes> abonnes = userDAO.getAllAbonnes();
        boolean found = false;
        for (abonnes abonne : abonnes) {
            if (abonne.getUsername().equalsIgnoreCase(nom)) {
                System.out.println(abonne);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun abonné trouvé avec ce nom.");
        }
    }
    


    public void updateAbonne() {
    	userDAO.updateAbonne();
      
    }

    public void updateAuteur() {
    	userDAO.updateAuteur();
       
}
}
