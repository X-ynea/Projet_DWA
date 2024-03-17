package javaClass;
import javax.persistence.*;

@Entity
@Table(name = "JoueurPartie")
public class JoueurPartie {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Utilisateur joueur;
    private Partie partie;
    private int score;

    // Constructeurs
    public JoueurPartie() { }

    public JoueurPartie(Utilisateur joueur, Partie partie, int score) {
        this.joueur = joueur;
        this.partie = partie;
        this.score = score;
    }

    // Getters
    public long getId() { return id; }
    public Utilisateur getJoueur() { return joueur; }
    public Partie getPartie() { return partie; }
    public int getScore() { return score; }

    // Setters
    public void setJoueur(Utilisateur joueur) { this.joueur = joueur; }
    public void setPartie(Partie partie) { this.partie = partie; }
    public void setScore(int score) { this.score = score; }
}
