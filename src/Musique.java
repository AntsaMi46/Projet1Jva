import java.sql.SQLOutput;

public class Musique {
    private String titre;
    private int Duree;
    private Artiste artiste;
    public Musique(String titre,int Duree,Artiste artiste){
        this.titre=titre;
        this.Duree=Duree;
        this.artiste=artiste;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return Duree;
    }

    public void setDuree(int duree) {
        Duree = duree;
    }

    public Artiste getArtiste() {
        return artiste;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }
    public void afficherLesDetails(){
        System.out.println("Titre:  "+getTitre()+"  Durée:"+getDuree()+ "secondes"+"  Artiste:"+getArtiste().getNom());
    }
    public void Convertion(){
        int second;
        int minute;
        minute= (int) Math.ceil(Duree/60);
        second= Duree%60;
        System.out.println(minute+"  minutes  "+ second+"  secondes ");
    }

}
