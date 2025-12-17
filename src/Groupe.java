import java.time.LocalDate;

public class Groupe extends Artiste{
    private int nombreMembre;
    private LocalDate dateCreation;
    public Groupe(String nom,LocalDate dateCreation,int nombreMembre){
        super(nom,null,null);
        this.dateCreation=dateCreation;
        this.nombreMembre=nombreMembre;
    }
    public void afficherDetails(){
        System.out.println("Groupe: "+getNom());
        System.out.println("Date de création: "+dateCreation);
        System.out.println("Nombre de membre: "+nombreMembre);
    }
}
