package javaClass;
import javax.persistence.*;

enum Difficulte {
   SIMPLE, DIFFICILE
}

@Entity
@Table(name = "Partie")
public class Partie {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codePartie;

    @ManyToOne
    @JoinColumn(name = "codeCreateur")
    private Utilisateur codeCreateur;
    private int nbrCouleur;
    private int nbrForme;
    private int timer;
    private int nbrTour;

    @Enumerated(EnumType.STRING)  // 0: "simple", 1: "difficile"
    private Difficulte difficulte;
    private int statut;
    private int totalClicReussis;
    private int totalClicReussisPlusRapides;

    // Constructeurs
    public Partie() { }

    public Partie(Utilisateur codeCreateur, int nbrCouleur, int nbrForme, int timer, int nbrTour, Difficulte difficulte, int statut,
                  int totalClicReussis, int totalClicReussisPlusRapides) {
        this.codeCreateur = codeCreateur;
        this.nbrCouleur = nbrCouleur;
        this.nbrForme = nbrForme;
        this.timer = timer;
        this.nbrTour = nbrTour;
        this.difficulte = difficulte;
        this.statut = statut;
        this.totalClicReussis = totalClicReussis;
        this.totalClicReussisPlusRapides = totalClicReussisPlusRapides;
    }

    // Getters
    public long getCodePartie() { return codePartie; }
    public Utilisateur getCodeCreateur() { return codeCreateur; }
    public int getNbrCouleur() { return nbrCouleur; }
    public int getNbrForme() { return nbrForme; }
    public int getTimer() { return timer; }
    public int getNbrTour() { return nbrTour; }
    public Difficulte getDifficulte() { return difficulte; }
    public int getStatut() { return statut; }
    public int getTotalClicReussis() { return totalClicReussis; }
    public int getTotalClicReussisPlusRapides() { return totalClicReussisPlusRapides; }

    // Setters
    public void setCodeCreateur(Utilisateur codeCreateur) { this.codeCreateur = codeCreateur; }
    public void setNbrCouleur(int nbrCouleur) { this.nbrCouleur = nbrCouleur; }
    public void setNbrForme(int nbrForme) { this.nbrForme = nbrForme; }
    public void setTimer(int timer) { this.timer = timer; }
    public void setNbrTour(int nbrTour) { this.nbrTour = nbrTour; }
    public void setDifficulte(Difficulte difficulte) { this.difficulte = difficulte; }
    public void setStatut(int statut) { this.statut = statut; }
    public void setTotalClicReussis(int totalClicReussis) { this.totalClicReussis = totalClicReussis; }
    public void setTotalClicReussisPlusRapides(int totalClicReussisPlusRapides) { this.totalClicReussisPlusRapides = totalClicReussisPlusRapides; }
}