package biblio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class GestionnaireEmprunt {
    
    private EmpruntDAOInterface empruntDAO;
    
    public GestionnaireEmprunt(EmpruntDAOInterface empruntDAO) {
        this.empruntDAO = empruntDAO;
    }

    public void ajouterEmprunt() {
    	   Scanner scanner = new Scanner(System.in);
    	   
    	   System.out.println("Entrez l'ID du livre à emprunter :");
    	   int idLivre = scanner.nextInt();
    	   scanner.nextLine(); // Consume newline character

    	   System.out.println("Entrez l'ID de l'abonné :");
    	   int idAbonne = scanner.nextInt();
    	   scanner.nextLine(); // Consume newline character
    	   
    	   System.out.println("Entrez la date d'emprunt (au format jj/mm/aaaa) :");
    	   String dateEmpruntStr = scanner.nextLine();

    	   SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    	   try {
    	       java.util.Date parsedDate = dateFormat.parse(dateEmpruntStr);
    	       java.sql.Date dateEmprunt = new java.sql.Date(parsedDate.getTime());

    	       // Ajoutez la date de retour ici
    	       System.out.println("Entrez la date de retour (au format jj/mm/aaaa) :");
    	       String dateRetourStr = scanner.nextLine();
    	       java.util.Date parsedDateRetour = dateFormat.parse(dateRetourStr);
    	       java.sql.Date dateRetour = new java.sql.Date(parsedDateRetour.getTime());

    	       Emprunt emprunt = new Emprunt(idLivre, idAbonne, dateEmprunt, dateRetour);

    	       if (empruntDAO.insertEmprunt(emprunt, scanner)) {
    	           System.out.println("L'emprunt a été ajouté avec succès.");
    	       } else {
    	           System.out.println("Erreur lors de l'ajout de l'emprunt.");
    	       }
    	   } catch (ParseException e) {
    	       System.out.println("Format de date invalide. Utilisez le format jj/mm/aaaa.");
    	   }
    	}

    public void supprimerEmprunt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'ID de l'emprunt à supprimer :");
        int id = scanner.nextInt();
        
        if (empruntDAO.deleteEmprunt(id)) {
            System.out.println("L'emprunt a été supprimé avec succès.");
        } else {
            System.out.println("Erreur lors de la suppression de l'emprunt.");
        }
    }

    public void afficherListeEmprunts() {
        Vector<Emprunt> emprunts = empruntDAO.getAllEmprunts();
        if (emprunts.isEmpty()) {
            System.out.println("Il n'y a aucun emprunt dans la base de données.");
        } else {
            for (Emprunt emprunt : emprunts) {
                System.out.println(emprunt.toString());
            }
        }
    }

    public void afficherListeEmpruntsParDate() {
        Vector<Emprunt> emprunts = empruntDAO.getAllEmprunts();
        if (!emprunts.isEmpty()) {
            Collections.sort(emprunts, Comparator.comparing(Emprunt::getDateEmprunt));
            for (Emprunt emprunt : emprunts) {
                System.out.println(emprunt);
            }
        } else {
            System.out.println("Il n'y a aucun emprunt dans la base de données.");
        }
    }

    public void rechercherEmpruntsParAbonne() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entrez l'ID de l'abonné à rechercher :");
        int idAbonne = scanner.nextInt();
        
        Vector<Emprunt> emprunts = empruntDAO.getAllEmprunts();
        boolean found = false;
        for (Emprunt emprunt : emprunts) {
            if (emprunt.getIdAbonne() == idAbonne) {
                System.out.println(emprunt);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun emprunt trouvé avec cet abonné.");
        }
    }

    public void retournerLivre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'ID de l'emprunt à retourner :");
        int idEmprunt = scanner.nextInt();
        
        if (empruntDAO.retournerLivre(idEmprunt)) {
            System.out.println("Le livre a été marqué comme retourné avec succès.");
        } else {
            System.out.println("Erreur lors du marquage du livre comme retourné.");
        }
    }

    public void afficherRetards() {
        Vector<Emprunt> retards = empruntDAO.afficherRetards();
        if (retards.isEmpty()) {
            System.out.println("Il n'y a aucun retard d'emprunt dans la base de données.");
        } else {
            for (Emprunt emprunt : retards) {
                System.out.println(emprunt.toString());
            }
        }
    }
    public void updateEmprunt() {
    	empruntDAO.updateEmprunt();
      
    }

}
