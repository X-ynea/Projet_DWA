package projet_dwa.pojo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

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
    private Long id;

    @OneToOne
    @JoinColumn(name = "createur")
    private Utilisateur createur;

    @OneToMany(mappedBy = "partieId", cascade = CascadeType.ALL)
    private List<Joueur> joueurs;
    
    // Paramètres de création de la partie

    @Column(name="nbrCouleur")
    private int nbrCouleur;
    @Column(name="nbrNombre")
    private int nbrNombre;
    @Column(name="timer")
    private int timer;
    @Column(name="nbrTour")
    private int nbrTour;

    @Enumerated(EnumType.STRING)  // 0: "simple", 1: "difficile"
    private Difficulte difficulte;

    @Enumerated(EnumType.STRING)  // 0: "en_attente", 1: "en_cours", 2: "terminee"
    private Statut statut;

    // Statistiques d'une partie

    @Column(name="total_clics_reussis")
    private int totalClicsReussis;
    @Column(name="total_clics_rapide")
    private int totalClicsRapides;

    
    // Getters et Setters
    public Long getId() {
        return id;
    }
    public void setId(Long codePartie) {
        this.id = codePartie;
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
    public Partie(Long id, Utilisateur createur, List<Joueur> joueurs) {
        this.id = id;
        this.createur = createur;
        this.joueurs = joueurs;
    }
    public Partie(Long id, Utilisateur createur, List<Joueur> joueurs, int nbrCouleur, int nbrNombre, int timer,
                  int nbrTour, Difficulte difficulte, Statut statut, int totalClicsReussis, int totalClicsRapides) {
        this.id = id;
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

    // To string

    @Override
    public String toString() {
        return "Partie [codePartie=" + id + ", createur=" + createur + ", joueurs=" + joueurs + ", nbrCouleur="
                + nbrCouleur + ", nbrNombre=" + nbrNombre + ", timer=" + timer + ", nbrTour=" + nbrTour
                + ", difficulte=" + difficulte + ", statut=" + statut + ", totalClicsReussis=" + totalClicsReussis
                + ", totalClicsRapides=" + totalClicsRapides + "]";
    }


}
