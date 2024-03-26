package M1TI.GroupeF.Projet_DWA.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

enum Difficulte {
   SIMPLE, DIFFICILE
}
enum Statut {
    EN_ATTENTE, EN_COURS, TERMINEE
}

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Partie")
public class Partie {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codePartie;

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

    
    public Partie(long codePartie, Utilisateur createur, List<Joueur> joueurs, int nbrCouleur, int nbrNombre, int timer,
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