package Services;
import classes.Etudiant;
import classes.Module;
import classes.Note;

import java.util.ArrayList;

public class ServiceNote {
    public static Note addNote(float note, Etudiant etudiant, Module module){
        return new Note();
    }
    public static Note updateNote(float note, Etudiant etudiant, Module module){
        return new Note();
    }
    public static ArrayList<Note> deleteNoteById(int id){
        return  Fichiers.notes;
    }
    public static Note getNoteById(int id){
        return  new Note();
    }

    public static ArrayList<Note> getAllNote(){
        return  Fichiers.notes;
    }

    public static void addNote(int note, Etudiant etdByApogee, Module moduleById) {
    }
}
