package classes;

public class Module {
    private Integer id;
    private String nomMod;
    private Filiere filiere;
    private Enseignant professeur;
    public Module() {
    }

    public Module(Integer id,String nomMod,Filiere filiere,Enseignant professeur){
        this.id = id;
        this.nomMod = nomMod;
        this.filiere = filiere;
        this.professeur = professeur;
    }
    public String getNomMod(){
        return nomMod;
    }
    public void setNomMod(String nomMod){
        this.nomMod = nomMod;
    }
    public Enseignant getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }
    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   /* public void outputstuff(){
        System.out.println("Module : " +getnomMod());
        System.out.println("Filiere : " +filiere.getNomFil());
        System.out.println("Prof : "  +professeur.getNom() +" " +professeur.getPrenom());


    }*/
}