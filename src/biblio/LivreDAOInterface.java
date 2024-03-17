package biblio;
import java.util.Scanner;
import java.util.Vector;

public interface LivreDAOInterface {
    Livre getLivre(int id);
    Vector<Livre> getAllLivres();
    boolean insertLivre(Livre livre,Scanner scanner);
    boolean updateLivre();
    boolean deleteLivre(int id);
}
