package projet_dwa.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

enum Genre {
    MASCULIN, FEMININ, AUTRE
}


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Utilisateur")
@Inheritance(strategy=InheritanceType.JOINED)
abstract class Utilisateur {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable=false)
    private String pseudo;
    @Column(nullable=false)
    private String mdp;
    @Column(nullable=false)
    private int age;

    @Enumerated(EnumType.STRING)   // 0: "masculin", 1: "feminin", 2: "autre"
    @Column(nullable=false)
    private Genre genre;
    @Column(name="connecte")
    private boolean connecte;
    @Column(name="en_partie")
    private boolean enPartie;

    @Column(name="nbr_partie_jouee")
    private int nbrPartieJouee;
    @Column(name="nbr_victoire")
    private int nbrVictoire;
    @Column(name="somme_score")
    private int sommeScore;
    @Column(name="score_moyen")
    private double scoreMoyen; // Somme de tous les scores/nbrPartieJouee

    @Column(name="nbr_clics_total")
    private int nbrClicsTotal; // nombre de clic total sur toutes les parties
    @Column(name="nbr_clics_reussis")
    private int nbrClicsReussis; /*pourcentage du nbrCliccReussis/nbrClicTotal */ 
    @Column(name="nbr_clics_rapides")
    private int nbrClicsRapides; // nombre de clic reussis et rapides sur toutes les parties
    @Transient
    private double ratioClicsReussis; /*pourcentage du nbrCliccReussis/nbrClicTotal */ 
    @Transient
    private double ratioClicsRapides; /*pourcentage du nbrClicRapides/nbrClicTotal */
    
    public Utilisateur(long id, String pseudo, String mdp, int age, Genre genre, boolean connecte, boolean enPartie,
            int nbrPartieJouee, int nbrVictoire, int sommeScore, double scoreMoyen, int nbrClicsTotal,
            int nbrClicsReussis, int nbrClicsRapides, double ratioClicsReussis, double ratioClicsRapides) {
        this.id = id;
        this.pseudo = pseudo;
        this.mdp = mdp;
        this.age = age;
        this.genre = genre;
        this.connecte = connecte;
        this.enPartie = enPartie;
        this.nbrPartieJouee = nbrPartieJouee;
        this.nbrVictoire = nbrVictoire;
        this.sommeScore = sommeScore;
        this.scoreMoyen = scoreMoyen;
        this.nbrClicsTotal = nbrClicsTotal;
        this.nbrClicsReussis = nbrClicsReussis;
        this.nbrClicsRapides = nbrClicsRapides;
        this.ratioClicsReussis = ratioClicsReussis;
        this.ratioClicsRapides = ratioClicsRapides;
    }

    @Override
    public String toString() {
        return "Utilisateur [id=" + id + ", pseudo=" + pseudo + ", mdp=" + mdp + ", age=" + age + ", genre=" + genre
                + ", connecte=" + connecte + ", enPartie=" + enPartie + ", nbrPartieJouee=" + nbrPartieJouee
                + ", nbrVictoire=" + nbrVictoire + ", sommeScore=" + sommeScore + ", scoreMoyen=" + scoreMoyen
                + ", nbrClicsTotal=" + nbrClicsTotal + ", nbrClicsReussis=" + nbrClicsReussis + ", nbrClicsRapides="
                + nbrClicsRapides + ", ratioClicsReussis=" + ratioClicsReussis + ", ratioClicsRapides="
                + ratioClicsRapides + "]";
    }


}
