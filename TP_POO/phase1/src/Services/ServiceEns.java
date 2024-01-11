package Services;
import classes.Enseignant;
import classes.Departement;
import java.util.ArrayList;

 public static Enseignant addEns(String nom, String prenom, String email, String grade, Departement... dep){
        Enseignant enseignant = new Enseignant();
        enseignant.setNom(nom);
        enseignant.setPrenom(prenom);
        enseignant.setEmail(email);
        enseignant.setGrade(grade);
        if (dep.length > 0){
            enseignant.setDepartement(dep[0]);
        }
        Fichiers.enseignants.add(enseignant);
        return  new Enseignant();
    }

    public static Enseignant updateEns(int id, String nom, String prenom, String email, String grade, Departement... dep){
        for (Enseignant enseignant : Fichiers.enseignants) {
            if (enseignant.getId() == id) {
                enseignant.setNom(nom);
                if (dep.length > 0){
                    enseignant.setDepartement(dep[0]);
                }
                return enseignant;
            }
        }

        return  new Enseignant();
    }
    public static boolean deleteEnsById(int id){
        Enseignant enseignant = getEnsById(id);
        if (enseignant != null) {
            return Fichiers.enseignants.remove(enseignant); 
        }
        return false; 

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
