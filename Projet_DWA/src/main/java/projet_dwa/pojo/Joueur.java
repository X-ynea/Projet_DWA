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

    @OneToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateurId;

    @ManyToOne
    @JoinColumn(name = "partie_id")
    private Partie partieId;

    @Column(name = "score_partie")
    private int scorePartie;


    // Getters et Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScorePartie() {
        return scorePartie;
    }

    public void setScorePartie(int scorePartie) {
        this.scorePartie = scorePartie;
    }

    public Utilisateur getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Utilisateur utilisateur_id) {
        this.utilisateurId = utilisateur_id;
    }

    public Partie getPartieId() {
        return partieId;
    }

    public void setPartieId(Partie partie_id) {
        this.partieId = partie_id;
    }

    // Constructeurs 

    public Joueur() {
    }

    public Joueur(long id, int score_partie, Utilisateur utilisateur_id, Partie partieId) {
        this.id = id;
        this.scorePartie = score_partie;
        this.utilisateurId = utilisateur_id;
        this.partieId = partieId;
    }

    public Joueur(long id) {
        this.id = id;
    }

    // To string 
    @Override
    public String toString() {
        return "Joueur [id=" + id + ", score_partie=" + scorePartie + ", utilisateur_id=" + utilisateurId
                + ", partie_id=" + partieId + "]";
    }

    
}
