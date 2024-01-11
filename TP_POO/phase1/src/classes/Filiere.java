package classes;
import java.util.ArrayList;

public class Filiere {
    private Integer id;
    private String nomFil;
    private Enseignant responsable;
    private Departement departement;

    ArrayList<Module> modules = new ArrayList<Module>();
    public Filiere(){

    }
    public Filiere(Integer id,String nomFil,Enseignant responsable, Departement departement){
        this.id = id;
        this.nomFil = nomFil;
        this.responsable = responsable;
        this.departement = departement;
    }
    public String getNomFil(){
        return nomFil;
    }
    public void setNomFil(String nomFil){
        this.nomFil = nomFil;
    }
    public Enseignant getResponsable(){
        return responsable;
    }
    public void setResponsable(Enseignant responsable){
        this.responsable = responsable;
    }
    public Departement getDepartement(){
        return departement;
    }
    public void setDepartement(Departement departement){
        this.departement = departement;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


   /* public void outputstuff(){
        System.out.println("Nom de filiere : " +getnomFil());
        System.out.println("Responsable :" +responsable.getNom() +" " +responsable.getPrenom());

        System.out.println("Departement :" +departement.getNomDep());
    }*/


}
