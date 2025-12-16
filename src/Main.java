import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    Artiste artiste =new Artiste("Njakatiana", LocalDate.of(1965,02,25));
    Musique musique =new Musique("Mpankafy",200,artiste);
    Musique musique1 =new Musique("Volatiana",220,artiste);
    Playlist playlist =new Playlist("Hira taloha");
    playlist.ajouterMusique(musique);
    playlist.ajouterMusique(musique1);
    playlist.afficherPlaylist();
        musique.afficherLesDetails();
        musique.Convertion();
        artiste.calculAge();
    }
}