package biblio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserDAOInterface userDAO = new UserService();
        GestionnaireUser gestionnaireUser = new GestionnaireUser(userDAO);

        LivreDAOInterface livreDAO = new LivreServices();
        GestionnaireLivre gestionnaireLivre = new GestionnaireLivre(livreDAO);

        EmpruntDAOInterface empruntDAO = new EmpruntServices();
        GestionnaireEmprunt gestionnaireEmprunt = new GestionnaireEmprunt(empruntDAO);

        while (true) {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1. Gestion des auteurs");
            System.out.println("2. Gestion des abonnés");
            System.out.println("3. Gestion des livres");
            System.out.println("4. Gestion des emprunts");
            System.out.println("0. Quitter");
            System.out.print("Veuillez choisir une option : ");
            int choixPrincipal = scanner.nextInt();

            switch (choixPrincipal) {
                case 1:
                    gestionAuteurs(scanner, gestionnaireUser);
                    break;
                case 2:
                    gestionAbonnes(scanner, gestionnaireUser);
                    break;
                case 3:
                    gestionLivres(scanner, gestionnaireLivre);
                    break;
                case 4:
                    gestionEmprunts(scanner, gestionnaireEmprunt);
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide. Veuillez saisir une option valide.");
            }
        }
    }

    public static void gestionAuteurs(Scanner scanner, GestionnaireUser gestionnaireUser) {
        while (true) {
            System.out.println("\n----- Gestion des Auteurs -----");
            System.out.println("1. Ajouter un auteur");
            System.out.println("2. Supprimer un auteur");
            System.out.println("3. Afficher la liste des auteurs");
            System.out.println("4. Afficher la liste des auteurs par ordre alphabétique");
            System.out.println("5. Rechercher un auteur par nom");
            System.out.println("6. Mettre à jour un auteur");
            System.out.println("0. Retourner au menu principal");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer after reading an integer
            
            switch (choix) {
                case 1:
                    gestionnaireUser.ajouterAuteur();
                    break;
                case 2:
                    gestionnaireUser.supprimerAuteur();
                    break;
                case 3:
                    gestionnaireUser.afficherListeAuteur();
                    break;
                case 4:
                    gestionnaireUser.afficherListeAuteurParOrdreAlphabetique();
                    break;
                case 5:
                    gestionnaireUser.rechercherAuteurParNom();
                    break;
                case 6:
                    gestionnaireUser.updateAuteur();
                    break;
                case 0:
                    return; // Return to the main menu
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }


    public static void gestionAbonnes(Scanner scanner, GestionnaireUser gestionnaireUser) {
        while (true) {
            System.out.println("\n----- Gestion des Abonnés -----");
            System.out.println("1. Ajouter un abonné");
            System.out.println("2. Supprimer un abonné");
            System.out.println("3. Afficher la liste des abonnés");
            System.out.println("4. Afficher la liste des abonnés par ordre alphabétique");
            System.out.println("5. Rechercher un abonné par nom");
            System.out.println("6. Mettre à jour un abonné");
            System.out.println("0. Retourner au menu principal");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer after reading an integer

            switch (choix) {
                case 1:
                    // gestionnaireUser.ajouterAbonnee();
                    break;
                case 2:
                    gestionnaireUser.supprimerAbonnee();
                    break;
                case 3:
                    gestionnaireUser.afficherListeAbonnee();
                    break;
                case 4:
                    gestionnaireUser.afficherListeAbonneeParOrdreAlphabetique();
                    break;
                case 5:
                    gestionnaireUser.rechercherAbonneeParNom();
                    break;
                case 6:
                    gestionnaireUser.updateAbonne();
                    break;
                case 0:
                    return; // Return to the main menu
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }


    public static void gestionLivres(Scanner scanner, GestionnaireLivre gestionnaireLivre) {
        while (true) {
            System.out.println("\n----- Gestion des Livres -----");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Supprimer un livre");
            System.out.println("3. Afficher la liste des livres");
            System.out.println("4. Afficher la liste des livres par ordre alphabétique");
            System.out.println("5. Rechercher un livre par titre");
            System.out.println("6. Mettre à jour un livre");
            System.out.println("0. Retourner au menu principal");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    gestionnaireLivre.ajouterLivre();
                    break;
                case 2:
                    gestionnaireLivre.supprimerLivre();
                    break;
                case 3:
                    gestionnaireLivre.afficherListeLivres();
                    break;
                case 4:
                    gestionnaireLivre.afficherListeLivresParOrdreAlphabetique();
                    break;
                case 5:
                    gestionnaireLivre.rechercherLivresParAuteur();
                    break;
                case 6:
                	gestionnaireLivre.updateLivre(); 
                    break;
                case 0:
                    return; // Return to the main menu
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }
    public static void gestionEmprunts(Scanner scanner, GestionnaireEmprunt gestionnaireEmprunt) {
        while (true) {
            System.out.println("\n----- Gestion des Emprunts -----");
            System.out.println("1. Ajouter un emprunt");
            System.out.println("2. Supprimer un emprunt");
            System.out.println("3. Afficher la liste des emprunts");
            System.out.println("4. Afficher la liste des emprunts par date");
            System.out.println("5. Rechercher emprunts par abonné");
            System.out.println("6. Retourner un livre");
            System.out.println("7. Afficher les retards");
            System.out.println("8. Mettre à jour un emprunt");
            System.out.println("0. Retourner au menu principal");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    gestionnaireEmprunt.ajouterEmprunt();
                    break;
                case 2:
                    gestionnaireEmprunt.supprimerEmprunt();
                    break;
                case 3:
                    gestionnaireEmprunt.afficherListeEmprunts();
                    break;
                case 4:
                    gestionnaireEmprunt.afficherListeEmpruntsParDate();
                    break;
                case 5:
                    gestionnaireEmprunt.rechercherEmpruntsParAbonne();
                    break;
                case 6:
                    gestionnaireEmprunt.retournerLivre();
                    break;
                case 7:
                    gestionnaireEmprunt.afficherRetards();
                    break;
                case 8:
                    gestionnaireEmprunt.updateEmprunt();
                    break;
                case 0:
                    return; 
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }
}
