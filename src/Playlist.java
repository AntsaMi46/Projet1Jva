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
    public void SupprimerMusique(String titre){
        for(int i=0; i < musiques.size();i++){
            if(musiques.get(i).getTitre()==titre){
                musiques.remove(i);
                System.out.println("Musique supprimé!");

            }
            else{
                System.out.println("musique non trouvée");
            }
        }
    }
    public int NombreMusique(){
        return musiques.size();
    }
    public int dureeTotal(){
        int total=0;
        for(Musique m : musiques){
            total = total+m.getDuree();
        }
        return total;
    }
    public void rechercherMusique(String titre){
        for(Musique m : musiques){
            if(m.getTitre()== titre){
                System.out.println("recherche par titre:   ");m.afficherLesDetails();
            }
        }
    }
    public void afficherAlphabetique(){
        ArrayList<Musique> copieMusique = new ArrayList<>(musiques);
        for(int i=0; i<copieMusique.size();i++){
            for(int j=i+1;j<copieMusique.size();j++){
                if(copieMusique.get(i).getTitre().compareTo(copieMusique.get(j).getTitre())>0){
                    Musique change = copieMusique.get(i);
                    copieMusique.set(i,copieMusique.get(i));
                    copieMusique.set(j,change);
                }
            }
        }
        System.out.println("Ordre alphabetique:   ");
        for (Musique m : copieMusique){
         ; m.afficherLesDetails();
        }
    }


}
