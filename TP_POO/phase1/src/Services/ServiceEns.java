package Services;
import classes.Enseignant;
import classes.Departement;
import java.util.ArrayList;

public class ServiceEns {
    public static Enseignant addEns(String nom, String prenom, String email, String grade, Departement dep){
        return  new Enseignant();
    }

    public static Enseignant updateEns(int id, String nom, String prenom, String email, String grade, Departement dep){
        return  new Enseignant();
    }
    public static ArrayList<Enseignant> deleteEnsById(int id){
        return  Fichiers.enseignants;
    }

    public static Enseignant getEnsById(int id){
        for (Enseignant enseignant : Fichiers.enseignants) {
            if (enseignant.getId() == id) return  enseignant;
        }
        return  new Enseignant();
    }

    public static ArrayList<Enseignant> getAllEns(){
        return  Fichiers.enseignants;
    }
}
