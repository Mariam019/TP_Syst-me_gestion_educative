package Services;
import classes.Etudiant;
import classes.Module;
import classes.Note;

import java.util.ArrayList;

public class ServiceNote {
  public static Note addNote(float note, Etudiant etudiant, Module module){
        Note note1  = new Note();
        note1.setNote(note);
        note1.setEtudiant(etudiant);
        note1.setModule(module);

        Fichiers.notes.add(note1);

        return new Note();
    }
    public static Note updateNote(float note, Etudiant etudiant, Module module){
        for(Note note1 : Fichiers.notes){
            if(note1.getNote() == note){
                note1.setEtudiant(etudiant);
                note1.setModule(module);

                return note1;
            }
        }
        return new Note();
    }
    public static ArrayList<Note> deleteNoteById(int id){
        ArrayList<Note> notesToRemove = new ArrayList<>();
        for(Note note1 : Fichiers.notes){
            if(note1.getNote() == note1.getNote()){
                notesToRemove.add(note1);
            }
        }
        Fichiers.modules.removeAll(notesToRemove);
        return notesToRemove;

    }

    public static Note getNoteByNote(float note){
        for(Note note1 : Fichiers.notes){
            if (note1.getNote() == note) {
                return note1;
            }
        }
        return  new Note();
    }

    public static ArrayList<Note> getAllNote(){
        return  Fichiers.notes;
    }

    public static void addNote(int note, Etudiant etdByApogee, Module moduleById) {
    }
}
