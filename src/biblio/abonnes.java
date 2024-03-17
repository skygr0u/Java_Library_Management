package biblio;
import java.util.Scanner;

public class abonnes {
	 private int idAbonne;
	 private String username;
	 private String password;
         private String email;
         private String contact;

        public abonnes(String username, String password, String email, String contact) {
            this.username = username;
            this.password = password;
            this.email = email;
            this.contact = contact;
        }
	 

	 public abonnes() {/*
	        Scanner scanner = new Scanner(System.in);


	        System.out.println("Entrez le nom de l'abonné :");
	        scanner.nextLine(); 
	        this.nom = scanner.nextLine();

	        System.out.println("Entrez le prénom de l'abonné :");
	        this.prenom = scanner.nextLine();

	        System.out.println("Entrez le nom d'utilisateur :");
	        this.username = scanner.nextLine();

	        System.out.println("Entrez le mot de passe :");
	        this.password = scanner.nextLine();

	        scanner.close();*/
	    }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getEmail() {
            return email;
        }

        public String getContact() {
            return contact;
        }

        public int getIdAbonne() {
                return idAbonne;
        }
        public void setIdAbonne(int idAbonne) {
                this.idAbonne = idAbonne;
        }

        public String getUsername() {
                return username;
        }
        public void setUsername(String username) {
                this.username = username;
        }
        public String getPassword() {
                return password;
        }
        public void setPassword(String password) {
                this.password = password;
        }

}

