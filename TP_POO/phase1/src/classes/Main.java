package classes;

import Controllers.*;
import Services.Fichiers;

import java.util.Scanner;
import classes.Enseignant;

public class Main {

    public static boolean isNull(Object ob) {
        return ob == null ;
    }
    public static int getIntInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un nombre entier : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);


        // This method reads the number provided using keyboard
        int num = scan.nextInt();

       
        return num;
    }

    public static String getStringInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un texte : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);

       
        String str = scan.nextLine();

        
        return str;
    }

    public static void showPrincipalMenu(){
        System.out.println(" Bienvenue ");


        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");

       
        int option = getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                DepController.showMenu();
                break;
            case 2:
                FilController.showMenu();
                break;
            case 3:
                EnsController.showMenu();
                break;
            case 4:
                ModController.showMenu();
                break;
            case 5:
                EtdController.showMenu();
                break;
            default:
                
                showPrincipalMenu();
        }
        switch(option) {
            case 1:

                DepController.showMenu();
                break;
            case 2:
                DepController.displayDepartements();
                break;
            case 3:
                DepController.editDepartement();
                break;
            case 4:
                DepController.createDepartement();
                break;
            case 5:
                EtdController.showMenu();
                break;
            default:
                 showPrincipalMenu();
        }


    }
    public static void main(String[] args) {

        Enseignant enseignant = new Enseignant();
        enseignant.setNom("Ahmedi");
        enseignant.setPrenom("Mohamed");
        enseignant.setEmail("m.ahmedi@gmail.com");
        enseignant.setGrade("PES");
        enseignant.setId(Fichiers.getEnsId());
        Fichiers.enseignants.add(enseignant);
        showPrincipalMenu();
    }
}
