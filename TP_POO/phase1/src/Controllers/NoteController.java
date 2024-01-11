package Controllers;

import classes.Main;
import classes.Note;
import Services.ServiceEtd;
import Services.ServiceMod;
import Services.ServiceNote;
import Services.Fichiers;

public class NoteController {
    public static void showMenu(){
        System.out.println(" Notes : ");


        System.out.println("1:  Ajouter une note");
        System.out.println("2: Afficher les notes");
        System.out.println("3: Modifier une note");
        System.out.println("4: Supprimer une note");
        System.out.println("0: Retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createNote();
                break;
            case 2:
                showNote();
                break;
            case 3:
                editNote();
                break;
            case 4:
                destroyNote();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    public static void showNote(){
        for (Note note : Fichiers.notes) {
            System.out.println("Note: " + note.getNote());
            System.out.println(" | Module: " + note.getModule().getNomMod());
            System.out.println(" | Etudiant: " + note.getEtudiant().getPrenomE() + " " + note.getEtudiant().getNomE());
        }
        System.out.println("");
    }

    public static void createNote() {
        int note = Main.getIntInput("Entrez une note :");
        EtdController.showEtudiant();
        int apogee = Main.getIntInput("Sélectionnez un etudiant par apogee :");
        ModController.showModule();
        int id = Main.getIntInput("Sélectionnez un etudiant par id :");
        ServiceNote.addNote(note, ServiceEtd.getEtdByApogee(apogee), ServiceMod.getModuleById(id));
        showNote();
        showMenu();
    }
    public static void editNote(){
        showNote();
        int note = Main.getIntInput("Sélectionnez une note :");
        EtdController.showEtudiant();
        int apogee = Main.getIntInput("Sélectionnez un etudiant par apogee :");
        ModController.showModule();
        int id = Main.getIntInput("Sélectionnez un etudiant par id :");
        ServiceNote.updateNote(note, ServiceEtd.getEtdByApogee(apogee), ServiceMod.getModuleById(id));
        showNote();
        showMenu();
    }

    public static void destroyNote(){
        showNote();
        int id = Main.getIntInput("Sélectionnez une note :");
        ServiceNote.deleteNoteById(id);
        showNote();
    }
}