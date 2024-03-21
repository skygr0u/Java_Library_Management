package biblio;

import java.util.Scanner;

public class Auteur {
    private int idAuteur;
    private String nom;
    private String prenom;
    private String username;
    private String password;
    private String email;

    public Auteur(String nom, String prenom, String username, String password, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public Auteur( String nom, String prenom, String username, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
    }
    public Auteur( int id ,String nom, String prenom, String username, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
        this.idAuteur=id;
    }
    public Auteur() {
  Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom de l'auteur :");
        scanner.nextLine(); 
        this.nom = scanner.nextLine();

        System.out.println("Entrez le prénom de l'auteur :");
        this.prenom = scanner.nextLine();

        System.out.println("Entrez le nom d'utilisateur :");
        this.username = scanner.nextLine();

        System.out.println("Entrez le mot de passe :");
        this.password = scanner.nextLine();

        scanner.close();
    }

	public int getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(int idAuteur) {
		this.idAuteur = idAuteur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	@Override
	public String toString() {
	    return "Auteur{" +
	            "idAuteur=" + idAuteur +
	            ", nom='" + nom + '\'' +
	            ", prénom='" + prenom + '\'' +
	            ", nom d'utilisateur='" + username + '\'' +
	            ", mot de passe='" + password + '\'' +
	            '}';
	}

}
