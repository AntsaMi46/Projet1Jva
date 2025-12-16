import java.util.ArrayList;

public class Playlist {
    private String nomPlaylist;
    private ArrayList<Musique> musiques;

    public Playlist(String nomPlaylist){
        this.nomPlaylist=nomPlaylist;
        this.musiques=new ArrayList<>();
    }

    public String getNom() {
        return nomPlaylist;
    }

    public void setNom(String nom) {
        this.nomPlaylist = nomPlaylist;
    }

    public ArrayList<Musique> getMusiques() {
        return musiques;
    }

    public void ajouterMusique(Musique musique){
        musiques.add(musique);
        System.out.println("Musique ajouté dans la playlist "+nomPlaylist);
    }
    public void afficherPlaylist(){
        for (Musique m : musiques){
            m.afficherLesDetails();
        }

    }

}
