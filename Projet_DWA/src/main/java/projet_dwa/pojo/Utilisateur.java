package projet_dwa.pojo;

import jakarta.persistence.*;

enum Genre {
    MASCULIN, FEMININ, AUTRE
}



@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
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

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isConnecte() {
        return connecte;
    }

    public void setConnecte(boolean connecte) {
        this.connecte = connecte;
    }

    public boolean isEnPartie() {
        return enPartie;
    }

    public void setEnPartie(boolean enPartie) {
        this.enPartie = enPartie;
    }

    public int getNbrPartieJouee() {
        return nbrPartieJouee;
    }

    public void setNbrPartieJouee(int nbrPartieJouee) {
        this.nbrPartieJouee = nbrPartieJouee;
    }

    public int getNbrVictoire() {
        return nbrVictoire;
    }

    public void setNbrVictoire(int nbrVictoire) {
        this.nbrVictoire = nbrVictoire;
    }

    public int getSommeScore() {
        return sommeScore;
    }

    public void setSommeScore(int sommeScore) {
        this.sommeScore = sommeScore;
    }

    public double getScoreMoyen() {
        return scoreMoyen;
    }

    public void setScoreMoyen(double scoreMoyen) {
        this.scoreMoyen = scoreMoyen;
    }

    public int getNbrClicsTotal() {
        return nbrClicsTotal;
    }

    public void setNbrClicsTotal(int nbrClicsTotal) {
        this.nbrClicsTotal = nbrClicsTotal;
    }

    public int getNbrClicsReussis() {
        return nbrClicsReussis;
    }

    public void setNbrClicsReussis(int nbrClicsReussis) {
        this.nbrClicsReussis = nbrClicsReussis;
    }

    public int getNbrClicsRapides() {
        return nbrClicsRapides;
    }

    public void setNbrClicsRapides(int nbrClicsRapides) {
        this.nbrClicsRapides = nbrClicsRapides;
    }

    public double getRatioClicsReussis() {
        return ratioClicsReussis;
    }

    public void setRatioClicsReussis(double ratioClicsReussis) {
        this.ratioClicsReussis = ratioClicsReussis;
    }

    public double getRatioClicsRapides() {
        return ratioClicsRapides;
    }

    public void setRatioClicsRapides(double ratioClicsRapides) {
        this.ratioClicsRapides = ratioClicsRapides;
    }

    // Constructeurs 

    public Utilisateur() {
    }

    public Utilisateur(Long id, String pseudo, String mdp, int age, Genre genre, boolean connecte, boolean enPartie,
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

    public Utilisateur(Long id, String pseudo, String mdp) {
        this.id = id;
        this.pseudo = pseudo;
        this.mdp = mdp;
    }


}
