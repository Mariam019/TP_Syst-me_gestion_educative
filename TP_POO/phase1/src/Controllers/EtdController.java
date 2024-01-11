package Controllers;
import Services.Fichiers;
import classes.Etudiant;
import classes.Main;
import Services.ServiceEtd;
import Services.ServiceFil;
import classes.Note;

public class EtdController {
    public static void showMenu(){
        System.out.println("Etudiants : ");


        System.out.println("1: Pour ajouter un etudiant");
        System.out.println("2: Pour afficher les etudiants");
        System.out.println("3: Pour modifier un etudiant");
        System.out.println("4: Pour supprimer un etudiant");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createEtudiant();
                break;
            case 2:
                showEtudiant();
                break;
            case 3:
                editEtudiant();
                break;
            case 4:
                destroyEtudiant();
                break;
            default:
                Main.showPrincipalMenu();
    }
}
    public static void showEtudiant(){
        for (Etudiant etudiant : Fichiers.etudiants) {
            System.out.println("Nom: " + etudiant.getPrenomE() + " " + etudiant.getNomE());
            System.out.println(" | Apogee: " + etudiant.getApogee());
            System.out.println(" | Email: " + etudiant.getEmailE());
            System.out.println(" | Filière: " + etudiant.getFiliere().getNomFil());
            for (Note note : etudiant.getNotes()) {
                System.out.println(" | note: " + note.getModule().getNomMod() + ": " + note.getNote());
            }
            System.out.println("");
        }
    }

    public static void createEtudiant() {
        String nom = Main.getStringInput("Entrez le nom de l'étudiant :");
        String prenom = Main.getStringInput("Entrez le prénom de l'étudiant :");
        String email = Main.getStringInput("Entrez l'email de l'étudiant :");
        int apogee = Main.getIntInput("Entrez le code apogee de l'étudiant :");
        FilController.showFiliere();
        int id = Main.getIntInput("Sélecionnez un filiere par id :");
        Etudiant etudiant = new Etudiant(nom, prenom, email, apogee, ServiceFil.getFiliereById(id));
        ServiceEtd.addEtd(nom,prenom,email,apogee,ServiceFil.getFiliereById(id));
        showEtudiant();
        showMenu();

    }
    public static void editEtudiant(){
        showEtudiant();
        int apogee = Main.getIntInput("Sélecionnez un étudiant par apogee :");
        String nom = Main.getStringInput("Entrez le nom de l'étudiant :");
        String prenom = Main.getStringInput("Entrez le prénom de l'étudiant :");
        String email = Main.getStringInput("Entrez l'email de l'étudiant :");
        FilController.showFiliere();
        int idFil = Main.getIntInput("Selectionnez un filière : ");
        ServiceEtd.updateEtd(nom, prenom, email, apogee, ServiceFil.getFiliereById(idFil));
        showEtudiant();
        showMenu();
    }
    public static void destroyEtudiant(){
        showEtudiant();
        int apogee = Main.getIntInput("Sélecionnez un étudiant par apogee :");
        ServiceEtd.deleteEtdByApogee(apogee);
        showEtudiant();
    }
}