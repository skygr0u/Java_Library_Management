package biblio;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Livre {
    private int idLivre;
    private String titre;
    private int idAuteur;
    private String ISBN;
    private Date datePublication;
    private Boolean disponibilite ;
    
    public Livre(int idLivre, String titre, int idAuteur, String ISBN, Date datePublication) {
        this.idLivre = idLivre;
        this.titre = titre;
        this.idAuteur = idAuteur;
        this.ISBN = ISBN;
        this.datePublication = datePublication;
        this.disponibilite=true ;
    }
    public Livre( String titre, int idAuteur, String ISBN, Date datePublication) {
        this.titre = titre;
        this.idAuteur = idAuteur;
        this.ISBN = ISBN;
        this.datePublication = datePublication;
        this.disponibilite=true ;
    }
    
   



	public Boolean getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(Boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	public int getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(int idAuteur) {
		this.idAuteur = idAuteur;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Date getDatePublication() {
		return datePublication;
	}
	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}
	@Override
	public String toString() {
	    return "Livre{" +
	            "idLivre=" + idLivre +
	            ", titre='" + titre + '\'' +
	            ", idAuteur=" + idAuteur +
	            ", ISBN='" + ISBN + '\'' +
	            ", date de publication=" + datePublication +
	            '}';
	}

    


   
}