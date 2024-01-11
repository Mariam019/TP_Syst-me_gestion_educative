package classes;

import java.util.ArrayList;

public class Enseignant {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String grade ;
    private Departement departement;
    ArrayList<Module> modules = new ArrayList<Module>();

    public Enseignant() {
    }

    public Enseignant(Integer id,String nom,String prenom, String email,String grade, Departement departement ){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.grade = grade;
        this.departement = departement;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getgrade(){
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Departement getDepartement() {
        return departement;
    }
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {

            return false;
        }
        Enseignant other = (Enseignant) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    public int hash;
   /* public void outputstuff(){
        System.out.println("Nom et Prenom : " + getNom() +" "   +getPrenom());
        System.out.println("Email : " +getemail());
        System.out.println("Grade : " +getgrade());
        System.out.println("Departement : " +departement.getNomDep());
    }*/
}