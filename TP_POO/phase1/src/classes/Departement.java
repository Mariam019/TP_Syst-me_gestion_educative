

package classes;
import java.util.List;
import  java.util.ArrayList;

 public class Departement {

     private Integer id;
    private String  nomDep;
    private Enseignant gerant ;
    private List<Filiere> filiere;


    public Departement(Integer id, String nomDep, Enseignant gerant, Filiere filiere){
        this.id = id;
        this.nomDep = nomDep;
        this.gerant = gerant;
        this.filiere = new ArrayList<Filiere>();
    }

     public Departement() {

     }

     public ArrayList<Filiere> getFilieres() {
         return (ArrayList<Filiere>) filiere;
     }

     public void setFilieres(ArrayList<Filiere> filiere) {
         this.filiere = filiere;
     }
    public String getNomDep(){
        return nomDep;
    }
    public void setNomDep(String nomDep){
        this.nomDep= nomDep;
    }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public Enseignant getGerant(){
        return gerant;
     }
public void setGerant(Enseignant gerant){
        this.gerant = gerant;
}
  /*  public void outputstuff() {
        System.out.println("id  :" +getId());
        System.out.println("Departement : " +getNomDep());
        System.out.println("Gerant du departement : " +gerant.getNom() +" " +gerant.getPrenom());

        for (Filiere filiere : filiere) {
            System.out.println("Nom de la filiere : "  +filiere.getnomFil());
        }
    }*/



 }

