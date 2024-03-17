package biblio;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Emprunt {
    private int idEmprunt;
    private int idLivre;
    private int idAbonne;
    private Date dateEmprunt;
    private Date retour;
    
    public Emprunt(int idEmprunt, int idLivre, int idAbonne, Date dateEmprunt, Date retour) {
        this.idEmprunt = idEmprunt;
        this.idLivre = idLivre;
        this.idAbonne = idAbonne;
        this.dateEmprunt = dateEmprunt;
        this.retour = retour;
    }
    public Emprunt( int idLivre, int idAbonne, Date dateEmprunt, Date retour) {
        this.idLivre = idLivre;
        this.idAbonne = idAbonne;
        this.dateEmprunt = dateEmprunt;
        this.retour = retour;
    }

   
    
	public int getIdEmprunt() {
		return idEmprunt;
	}
	public void setIdEmprunt(int idEmprunt) {
		this.idEmprunt = idEmprunt;
	}
	public int getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}
	public int getIdAbonne() {
		return idAbonne;
	}
	public void setIdAbonne(int idAbonne) {
		this.idAbonne = idAbonne;
	}
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	public Date getRetour() {
		return retour;
	}
	public void setRetour(Date retour) {
		this.retour = retour;
	}
	@Override
	public String toString() {
	    return "Emprunt{" +
	            "idEmprunt=" + idEmprunt +
	            ", idLivre=" + idLivre +
	            ", idAbonné=" + idAbonne +
	            ", date d'emprunt=" + dateEmprunt +
	            ", retour=" + retour +
	            '}';
	}

	


}
