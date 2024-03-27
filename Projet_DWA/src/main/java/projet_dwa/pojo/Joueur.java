package projet_dwa.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "joueur")
public class Joueur{

    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "score_partie")
    private int score_partie;

    @OneToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur_id;

    @ManyToOne
    @JoinColumn(name = "partie_id")
    private Partie partie_id;

    // Getters et Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScorePartie() {
        return score_partie;
    }

    public void setScorePartie(int scorePartie) {
        this.score_partie = scorePartie;
    }

    public Utilisateur getUtilisateur_id() {
        return utilisateur_id;
    }

    public void setUtilisateur_id(Utilisateur utilisateur_id) {
        this.utilisateur_id = utilisateur_id;
    }

    public Partie getPartie_id() {
        return partie_id;
    }

    public void setPartie_id(Partie partie_id) {
        this.partie_id = partie_id;
    }

    // Constructeurs 

    public Joueur() {
    }

    public Joueur(long id, int score_partie, Utilisateur utilisateur_id, Partie partie_id) {
        this.id = id;
        this.score_partie = score_partie;
        this.utilisateur_id = utilisateur_id;
        this.partie_id = partie_id;
    }

    public Joueur(long id) {
        this.id = id;
    }

    // To string 
    @Override
    public String toString() {
        return "Joueur [id=" + id + ", score_partie=" + score_partie + ", utilisateur_id=" + utilisateur_id
                + ", partie_id=" + partie_id + "]";
    }

    
}
