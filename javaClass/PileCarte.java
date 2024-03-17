package javaClass;
import javax.persistence.*;

@Entity
@Table(name = "PileCarte")
public class PileCarte {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Partie partie;
    private Carte carte;
    private Utilisateur joueur;
    private int posTour;

    // Constructeurs
    public PileCarte() { }

    public PileCarte(Partie partie, Carte carte, Utilisateur joueur, int posTour) {
        this.partie = partie;
        this.carte = carte;
        this.joueur = joueur;
        this.posTour = posTour;
    }

    // Getters
    public long getId() { return id; }
    public Partie getPartie() { return partie; }
    public Carte getCarte() { return carte; }
    public Utilisateur getJoueur() { return joueur; }
    public int getPosTour() { return posTour; }

    // Setters
    public void setPartie(Partie partie) { this.partie = partie; }
    public void setCarte(Carte carte) { this.carte = carte; }
    public void setJoueur(Utilisateur joueur) { this.joueur = joueur; }
    public void setPosTour(int posTour) { this.posTour = posTour; }
}
