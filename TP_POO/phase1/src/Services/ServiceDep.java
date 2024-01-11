package Services;

import classes.Departement;
import classes.Enseignant;

import java.util.ArrayList;


public class ServiceDep {
    public static Departement addDep(Integer id, String nomDep, Enseignant... gerant) {
        Departement departement = new Departement();
        departement.setId(id);
        departement.setNomDep(nomDep);
        departement.setId(Fichiers.getDepId);
if (gerant.length > 0){
    departement.setGerant(gerant[0]);
}
Fichiers.departements.add(departement);
return departement;

    }
    public static Departement updateDep(Integer id , String nomDep, Enseignant... gerant){
        for (Departement departement : Fichiers.departements) {
            if (departement.getId() == id) {
                departement.setNomDep(nomDep);
                if (gerant.length > 0){
                    departement.setGerant(gerant[0]);
                }
                return departement;
            }
        }

        return  new Departement();
    }

    public static boolean deleteDepById(int id) {
        Departement department = getDepById(id);
        if (department != null) {
            return Fichiers.departements.remove(department); // Remove the department
        }
        return false; // Return false if the department is not found
    }

    public static Departement getDepById(int id) {
        for (Departement departement : Fichiers.departements) {
            if (departement.getId() == id) {
                return departement;
            }
        }
        return  null; // Return null if department not found
    }

    public static ArrayList<Departement> getAllDept(){

        return  Fichiers.departements;
    }
}


