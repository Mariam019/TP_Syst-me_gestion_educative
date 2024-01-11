package Services;
import classes.Departement;
import classes.Enseignant;
import classes.Filiere;
import classes.Module;
import classes.Note;
import classes.Etudiant;

import java.util.ArrayList;

public class Fichiers {
    public static int DEP_ID = 0;
    public static int ENS_ID = 0;
    public static int ETD_APOGE = 0;
    public static int FIL_ID = 0;
    public static int MOD_ID = 0;
    public static ArrayList<Departement> departements = new ArrayList<Departement>();
    public static ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
    public static ArrayList<Filiere> filieres = new ArrayList<Filiere>();
    public static ArrayList<Module> modules = new ArrayList<classes.Module>();
    public static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    public static ArrayList<Note> notes = new ArrayList<Note>();
    public static int getDepId;

    public  static int getDepId(){
        DEP_ID++;
        return DEP_ID;
    }
    public  static int getEnsId(){
        ENS_ID++;
        return ENS_ID;
    }
    public  static int getModId(){
        MOD_ID++;
        return MOD_ID;
    }

}