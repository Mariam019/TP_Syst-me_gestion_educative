package Services;
import classes.Enseignant;
import classes.Filiere;
import classes.Departement;

import java.util.ArrayList;



public class ServiceFil {
    public static Filiere addFiliere(String nomFil, Enseignant responsable, Departement... dep) {
        Filiere filiere = new Filiere();
        filiere.setNomFil(nomFil);

        filiere.setResponsable(responsable);

        if (dep.length > 0){
            filiere.setDepartement(dep[0]);
        }
        Fichiers.filieres.add(filiere);
        return  new Filiere();
    }

    public static Filiere updateFiliere(int id , String nomFil, Enseignant responsable, Departement... dep){
        for (Filiere filiere: Fichiers.filieres) {
            if (filiere.getId() == id) {
                filiere.setNomFil(nomFil);
                if (dep.length > 0){
                    filiere.setDepartement(dep[0]);
                }
                return filiere;
            }
        }
        return  new Filiere();
    }
    public static boolean deleteFiliereById(int id){
        Filiere filiere = getFiliereById(id);
        if (filiere != null) {
            return Fichiers.departements.remove(filiere); 
        }
        return false;

    }

    public static Filiere getFiliereById(int id){
        for(Filiere filiere : Fichiers.filieres){
            if(filiere.getId() == id){
                return filiere;
            }
        }
        return  new Filiere();
    }

    public static ArrayList<Filiere> getAllFiliere(){
        return  Fichiers.filieres;
    }
}
