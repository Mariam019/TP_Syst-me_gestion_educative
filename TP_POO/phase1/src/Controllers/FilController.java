package Controllers;

import Services.Fichiers;
import Services.ServiceDep;
import Services.ServiceEns;
import Services.ServiceFil;
import classes.Filiere;
import classes.Main;
import classes.Module;

public class FilController {
    public static void showMenu(){
        System.out.println("Filieres : ");


        System.out.println("1: Pour ajouter un filiere");
        System.out.println("2: Pour afficher les filieres");
        System.out.println("3: Pour modifier un filiere");
        System.out.println("4: Pour supprimer un filiere");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createFiliere();
                break;
            case 2:
                showFiliere();
                break;
            case 3:
                editFiliere();
                break;
            case 4:
                destroyFiliere();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    public static void showFiliere(){
        for (Filiere filiere : Fichiers.filieres) {
            System.out.println("Id :" + filiere.getId());
            System.out.println(" | Nom :" + filiere.getNomFil());
            System.out.println(" | Responsable :" + filiere.getResponsable().getPrenom() + " " + filiere.getResponsable().getNom());
            System.out.println(" | Departement :" + filiere.getDepartement().getNomDep());
            for (Module module : filiere.getModules()) {
                System.out.println(" | module :" + module.getNomMod());
            }
        }
    }

    public static void createFiliere() {
        String nom = Main.getStringInput("Entrez le nom du filiere :");
        EnsController.showEnseignants();
        int idResp = Main.getIntInput("Sélectionnez un filiere par id :");
        DepController.displayDepartements();
        int idDep = Main.getIntInput("Sélectionnez un filiere par id :");
        ServiceFil.addFiliere(nom, ServiceEns.getEnsById(idResp), ServiceDep.getDepById(idDep));
        showFiliere();
        showMenu();
    }

    public static void editFiliere(){
        showFiliere();
        int id = Main.getIntInput("Sélectionnez un module :");
        String nom = Main.getStringInput("Entrez le nom du filiere :");
        EnsController.showEnseignants();
        int idResp = Main.getIntInput("Sélectionnez un filiere par id :");
        DepController.displayDepartements();
        int idDep = Main.getIntInput("Sélectionnez un filiere par id :");
        ServiceFil.updateFiliere(id, nom, ServiceEns.getEnsById(idResp), ServiceDep.getDepById(idDep));
        showFiliere();
        showMenu();
    }

    public static void destroyFiliere(){
        showFiliere();
        int id = Main.getIntInput("Sélectionnez un filiere :");
        ServiceFil.deleteFiliereById(id);
        showFiliere();
    }
}