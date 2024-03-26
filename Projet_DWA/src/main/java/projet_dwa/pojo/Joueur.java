package M1TI.GroupeF.Projet_DWA.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Joueur")
public class Joueur extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "score_partie")
    private int scorePartie;

    @ManyToOne
    @JoinColumn(name = "partie_id")
    private Partie partie;

    public Joueur(long id, String pseudo, String mdp, int age, Genre genre, boolean connecte, boolean enPartie,
            int nbrPartieJouee, int nbrVictoire, int sommeScore, double scoreMoyen, int nbrClicsTotal,
            int nbrClicsReussis, int nbrClicsRapides, double ratioClicsReussis, double ratioClicsRapides, long id2,
            int scorePartie, Partie partie) {
        super(id, pseudo, mdp, age, genre, connecte, enPartie, nbrPartieJouee, nbrVictoire, sommeScore, scoreMoyen,
                nbrClicsTotal, nbrClicsReussis, nbrClicsRapides, ratioClicsReussis, ratioClicsRapides);
        id = id2;
        this.scorePartie = scorePartie;
        this.partie = partie;
    }
    
}
