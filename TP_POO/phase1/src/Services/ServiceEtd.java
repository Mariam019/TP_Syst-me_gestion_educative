package Services;
import classes.Etudiant;
import classes.Filiere;
import java.util.ArrayList;

public class ServiceEtd {
        public static Etudiant addEtd(String nomE, String prenomE, String emailE, int apogee, Filiere... filiere){
        Etudiant etudiant = new Etudiant();
        etudiant.setNomE(nomE);
        etudiant.setPrenomE(prenomE);
        etudiant.setEmailE(emailE);
        etudiant.setApogee(apogee);
        if (filiere.length > 0){
            etudiant.setFiliere(filiere[0]);
        }
        Fichiers.etudiants.add(etudiant);
        return  new Etudiant();
    }

    public static Etudiant updateEtd(String nomE, String prenomE, String emailE, int apogee, Filiere... filiere){
        for (Etudiant etudiant : Fichiers.etudiants) {
            if (etudiant.getApogee() == apogee) {
                etudiant.setNomE(nomE);
                if (filiere.length > 0){
                    etudiant.setFiliere(filiere[0]);
                }
                return etudiant;
            }
        }

        return  new Etudiant();
    }
    public static boolean deleteEtdByApogee(int apogee){
        Etudiant etudiant = getEtdByApogee(apogee);
        if (etudiant != null) {
            return Fichiers.etudiants.remove(etudiant); 
        }
        return false; 


    }

   public static Etudiant getEtdByApogee(int apogee){
        for(Etudiant etudiant : Fichiers.etudiants){
            if(etudiant.getApogee() == apogee){
                return etudiant;
            }
        }
        return  new Etudiant();
    }

    public static ArrayList<Etudiant> getAllEtd(){
        return  Fichiers.etudiants;
    }
}
