package Controllers;

import Services.Fichiers;
import Services.ServiceEns;
import Services.ServiceFil;
import Services.ServiceMod;
import classes.Main;
import classes.Module;

public class ModController {
    public static void showMenu(){
        System.out.println(" Modules : ");


        System.out.println("1:  Ajouter un module");
        System.out.println("2: Afficher les modules");
        System.out.println("3: Modifier un module");
        System.out.println("4: Supprimer un module");
        System.out.println("0: Retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createModule();
                break;
            case 2:
                showModule();
                break;
            case 3:
                editModule();
                break;
            case 4:
                destroyModule();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    public static void showModule() {
        for (Module module : Fichiers.modules) {
            System.out.println("Id :" + module.getId());
            System.out.println(" | nom :" + module.getNomMod());
            System.out.println(" | professeur :" + module.getProfesseur().getPrenom() + " " + module.getProfesseur().getNom());
            System.out.println(" | filiere :" + module.getFiliere().getNomFil());
        }
        System.out.println("");
    }

    public static void createModule() {
        int id = Main.getIntInput("Entrez l'id du module :");
        String nom = Main.getStringInput("Entrez le nom du module :");
        EnsController.showEnseignants();
        int idEns = Main.getIntInput("Sélectionnez un professeur par id :");
        FilController.showFiliere();
        int idFil = Main.getIntInput("Sélectionnez un filiere par id :");
        ServiceMod.addModule(id, nom, ServiceEns.getEnsById(idEns), ServiceFil.getFiliereById(idFil));
        showModule();
        showMenu();
    }

    public static void editModule(){
        showModule();
        int id = Main.getIntInput("Sélectionnez un module :");
        String nom = Main.getStringInput("Entrez le nom :");
        EnsController.showEnseignants();
        int idEns = Main.getIntInput("Sélectionnez un professeur par id :");
        FilController.showFiliere();
        int idFil = Main.getIntInput("Sélectionnez un filiere par id :");
        ServiceMod.updateModule(id, nom, ServiceEns.getEnsById(idEns), ServiceFil.getFiliereById(idFil));
        showModule();
        showMenu();
    }

    public static void destroyModule(){
        showModule();
        int id = Main.getIntInput("Sélectionnez un module :");
        ServiceMod.deleteModuleById(id);
        showModule();
    }
}
