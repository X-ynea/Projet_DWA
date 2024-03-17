package javaClass;
import javax.persistence.*;

@Entity
@Table(name = "Carte")
public class Carte {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String couleur;
    private String forme;

    // Constructeurs
    public Carte() { }

    public Carte(String couleur, String forme) {
        this.couleur = couleur;
        this.forme = forme;
    }

    // Getters
    public long getId() { return id; }
    public String getCouleur() { return couleur; }
    public String getForme() { return forme; }

    // Setters
    public void setCouleur(String couleur) { this.couleur = couleur; }
    public void setForme(String forme) { this.forme = forme; }
}
