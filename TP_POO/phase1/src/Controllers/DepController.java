package Controllers;
import Services.ServiceEns;
import classes.Main;
import classes.Departement;
import Services.ServiceDep;
import Services.Fichiers;

public class DepController {
    public static void showMenu(){
        System.out.println("Départements : ");


        System.out.println("1: Pour ajouter un département");
        System.out.println("2: Pour afficher les départements");
        System.out.println("3: Pour modifier un département");
        System.out.println("4: Pour supprimer un département");
        System.out.println("0: Pour retourner au menu principal");

        //"Veuillez sélectionner une option : ")
        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                createDepartement();
                break;
            case 2:
                displayDepartements();
                break;
            case 3:
                editDepartement();
                break;
            case 4:
                destroyDepartement();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }
    public static void displayDepartements(){
        for (Departement departement : Fichiers.departements) {
            System.out.print("Id : " + departement.getId());
            System.out.print(" | Nom Departement : " + departement.getNomDep());
            if (! Main.isNull(departement.getGerant())) {
                System.out.print(" | Gerant : " + departement.getGerant().getNom() + " " + departement.getGerant().getPrenom());
            }
            System.out.println("");
        }

    }
    public static void createDepartement(){
        String nomDep = Main.getStringInput("Entrez le nom du departement :");
        EnsController.showEnseignants();
        int id = Main.getIntInput("Sélecionnez un enseignant par id :");
        ServiceDep.addDep(id,nomDep, ServiceEns.getEnsById(id));

        displayDepartements();
        showMenu();


    }
    public static void editDepartement(){
        displayDepartements();
        int id = Main.getIntInput("Sélecionnez un departement par id :");
        String gerant= Main.getStringInput("Entrez le gerant :");
        EnsController.showEnseignants();
        int idEns = Main.getIntInput("Sélecionnez un enseignant par id :");

        ServiceDep.updateDep(id, gerant, ServiceEns.getEnsById(idEns));

        displayDepartements();
        showMenu();
    }
    public static void destroyDepartement(){
        displayDepartements();
        int id = Main.getIntInput("Sélecionnez un departement par id :");
        ServiceDep.deleteDepById(id);
        displayDepartements();

    }
}
