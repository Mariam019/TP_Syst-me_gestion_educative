package classes;
import java.util.ArrayList;

public class Etudiant{
    private String nomE;
    private String prenomE;
    private String emailE;
    private  Integer apogee;
    private Filiere filiere;
    ArrayList<Note> notes = new ArrayList<Note>();

    public Etudiant() {
    }
    public Etudiant(String nomE,String prenomE, String emailE,Integer apogee, Filiere filiere){
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.emailE = emailE;
        this.apogee = apogee;
        this.filiere = filiere;
    }
    public String getNomE(){
        return nomE;
    }
    public void setNomE(String nomE) {
        this.nomE = nomE;
    }
    public String getPrenomE(){
        return prenomE;
    }
    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getEmailE(){
        return emailE;
    }
    public void setEmailE(String emailE){
        this.emailE = emailE;
    }
    public Integer getApogee(){
        return apogee;
    }
    public void setApogee(Integer apogee){
        this.apogee = apogee;
    }
    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

   /* public void outputstuff(){
        System.out.println("Nom et Prenom : " + getNomE() +" "   +getPrenomE());
        System.out.println("Email : " +getEmailE());
        System.out.println("Code apoge : " +getApogee());
        System.out.println("Filiere :" +filiere.getnomFil());
    }*/
}
