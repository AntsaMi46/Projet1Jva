import java.time.LocalDate;
import java.util.ArrayList;

public class Artiste {
    private String nom;
    private LocalDate date_de_naissance;
    private String lieuNaissance;

    public Artiste(String nom,LocalDate date_de_naissance, String lieuNaissance){
        this.nom=nom;
        this.date_de_naissance=date_de_naissance;
        this.lieuNaissance=lieuNaissance;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public LocalDate getDate_de_naissance() {
        return date_de_naissance;
    }
    public void setDate_de_naissance(LocalDate date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void calculAge() {
        int ages = date_de_naissance.getYear();
        int anneeAct = LocalDate.now().getYear();
        int age = anneeAct - ages;
        System.out.println(age + "  ans");
    }
}
