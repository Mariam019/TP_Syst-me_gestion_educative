package Services;
import classes.Etudiant;
import classes.Filiere;
import java.util.ArrayList;

public class ServiceEtd {
    public static Etudiant addEtd(String nomE, String prenomE, String emailE, int apogee, Filiere filiere){
        return  new Etudiant();
    }

    public static Etudiant updateEtd(String nomE, String prenomE, String emailE, int apogee, Filiere filiere){
        return  new Etudiant();
    }
    public static ArrayList<Etudiant> deleteEtdByApogee(int apogee){
        return  Fichiers.etudiants;
    }

    public static Etudiant getEtdByApogee(int apogee){
        return  new Etudiant();
    }

    public static ArrayList<Etudiant> getAllEtd(){
        return  Fichiers.etudiants;
    }
}
