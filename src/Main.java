import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    Artiste artiste =new Artiste("Njakatiana", LocalDate.of(1965,02,25),"Mananjary");
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
    ArtisteSolo artisteSolo=new ArtisteSolo("Piso",LocalDate.of(2010,04,30),"Andavamamba");
    artisteSolo.afficherDetails();
    Groupe groupe=new Groupe("Mahaleo",LocalDate.of(1995,05,12),5);
    groupe.afficherDetails();
    }
}