package biblio;
import java.util.Vector;

public interface UserDAOInterface {
    Auteur getAuteur(int id);
    Vector<Auteur> getAllAuteurs();
    abonnes getAbonne(int id);
    Vector<abonnes> getAllAbonnes();
    boolean insertAuteur(Auteur auteur);
    boolean insertAbonne(abonnes abonne);
    boolean deleteAuteur(int id);
    boolean deleteAbonne(int id);
    boolean updateAbonne();
    boolean updateAuteur();

}
