package projet_dwa.pojo;

import java.util.List;
import jakarta.persistence.*;

enum Difficulte {
    SIMPLE, DIFFICILE
 }
 enum Statut {
     EN_ATTENTE, EN_COURS, TERMINEE
 }
 
@Entity
@Table(name = "partie")
public class Partie {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codePartie;

    @OneToOne
    @JoinColumn(name = "createur")
    private Utilisateur createur;

    @OneToMany(mappedBy = "partie", cascade = CascadeType.ALL)
    private List<Joueur> joueurs;
    
    // Paramètres de création de la partie

    private int nbrCouleur;
    private int nbrNombre;
    private int timer;
    private int nbrTour;

    @Enumerated(EnumType.STRING)  // 0: "simple", 1: "difficile"
    private Difficulte difficulte;

    @Enumerated(EnumType.STRING)  // 0: "en_attente", 1: "en_cours", 2: "terminee"
    private Statut statut;

    private int totalClicsReussis;
    private int totalClicsRapides;

    
    // Getters et Setters
    public Long getCodePartie() {
        return codePartie;
    }
    public void setCodePartie(Long codePartie) {
        this.codePartie = codePartie;
    }
    public Utilisateur getCreateur() {
        return createur;
    }
    public void setCreateur(Utilisateur createur) {
        this.createur = createur;
    }
    public List<Joueur> getJoueurs() {
        return joueurs;
    }
    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    public int getNbrCouleur() {
        return nbrCouleur;
    }
    public void setNbrCouleur(int nbrCouleur) {
        this.nbrCouleur = nbrCouleur;
    }
    public int getNbrNombre() {
        return nbrNombre;
    }
    public void setNbrNombre(int nbrNombre) {
        this.nbrNombre = nbrNombre;
    }
    public int getTimer() {
        return timer;
    }
    public void setTimer(int timer) {
        this.timer = timer;
    }
    public int getNbrTour() {
        return nbrTour;
    }
    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }
    public Difficulte getDifficulte() {
        return difficulte;
    }
    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }
    public Statut getStatut() {
        return statut;
    }
    public void setStatut(Statut statut) {
        this.statut = statut;
    }
    public int getTotalClicsReussis() {
        return totalClicsReussis;
    }
    public void setTotalClicsReussis(int totalClicsReussis) {
        this.totalClicsReussis = totalClicsReussis;
    }
    public int getTotalClicsRapides() {
        return totalClicsRapides;
    }
    public void setTotalClicsRapides(int totalClicsRapides) {
        this.totalClicsRapides = totalClicsRapides;
    }

    // Constructeurs 

    public Partie() {
    }
    public Partie(Long codePartie, Utilisateur createur, List<Joueur> joueurs) {
        this.codePartie = codePartie;
        this.createur = createur;
        this.joueurs = joueurs;
    }
    public Partie(Long codePartie, Utilisateur createur, List<Joueur> joueurs, int nbrCouleur, int nbrNombre, int timer,
            int nbrTour, Difficulte difficulte, Statut statut, int totalClicsReussis, int totalClicsRapides) {
        this.codePartie = codePartie;
        this.createur = createur;
        this.joueurs = joueurs;
        this.nbrCouleur = nbrCouleur;
        this.nbrNombre = nbrNombre;
        this.timer = timer;
        this.nbrTour = nbrTour;
        this.difficulte = difficulte;
        this.statut = statut;
        this.totalClicsReussis = totalClicsReussis;
        this.totalClicsRapides = totalClicsRapides;
    }


}
