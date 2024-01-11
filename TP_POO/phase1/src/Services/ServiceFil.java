package Services;
import classes.Enseignant;
import classes.Filiere;
import classes.Departement;

import java.util.ArrayList;



public class ServiceFil {
    public static Filiere addFiliere(String nomFil, Enseignant responsable, Departement dep) {
        return  new Filiere();
    }

    public static Filiere updateFiliere(int id , String nomFil, Enseignant responsable, Departement dep){
        return  new Filiere();
    }
    public static ArrayList<Filiere> deleteFiliereById(int id){
        return  Fichiers.filieres;
    }

    public static Filiere getFiliereById(int id){
        return  new Filiere();
    }

    public static ArrayList<Filiere> getAllFiliere(){
        return  Fichiers.filieres;
    }
}
