import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    Artiste artiste =new Artiste("Njakatiana", LocalDate.of(1965,02,25));
    Musique musique =new Musique("Mpankafy",200,artiste);
    Musique musique1 =new Musique("Volatiana",220,artiste);
        musique.afficherLesDetails();
        musique.Convertion();
        artiste.calculAge();
    Playlist playlist =new Playlist("Hira taloha");
    playlist.ajouterMusique(musique);
    playlist.ajouterMusique(musique1);
    playlist.afficherPlaylist();
    System.out.println("nombre de musique dan s la playliste:" + playlist.NombreMusique());
    System.out.println("Durée totale de la playliste:"+ playlist.dureeTotal()+"second");
    playlist.rechercherMusique("Mpankafy");
    playlist.afficherAlphabetique();
    }
}