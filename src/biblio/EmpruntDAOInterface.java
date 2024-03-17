package biblio;
import java.util.Scanner;
import java.util.Vector;

public interface EmpruntDAOInterface {
    Emprunt getEmprunt(int id);
    Vector<Emprunt> getAllEmprunts();
    boolean insertEmprunt(Emprunt emprunt,Scanner scanner);
    boolean updateEmprunt();
    boolean deleteEmprunt(int id);
    boolean retournerLivre(int idEmprunt);
    Vector<Emprunt> afficherRetards();
    Vector<Emprunt> rechercherEmpruntsEnCours();
}
