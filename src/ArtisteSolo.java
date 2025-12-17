import java.time.LocalDate;

public class ArtisteSolo extends Artiste {
    public ArtisteSolo(String nom, LocalDate date,String lieu){
        super(nom,date,lieu);
    }
    public void afficherDetails(){
        System.out.println("Artiste solo:  "+getNom());
        System.out.println("date de naissance:  "+getDate_de_naissance());
        System.out.println("Lieu de naissance:  "+getLieuNaissance());
    }
}
