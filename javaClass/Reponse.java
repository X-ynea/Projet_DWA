package javaClass;
import javax.persistence.*;

@Entity
@Table(name = "Reponse")
public class Reponse {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private JoueurPartie joueurPartie;
    private int tour;
    @Enumerated(EnumType.STRING)   // 0: "forme", 1: "couleur", 2: "forme et couleur", 3: "aucun"
    private int reponse;
    private int ptsGagnes;
    private long tpsReponse;

    // Constructeurs
    public Reponse() { }

    public Reponse(JoueurPartie joueurPartie, int tour, int reponse, int ptsGagnes, long tpsReponse) {
        this.joueurPartie = joueurPartie;
        this.tour = tour;
        this.reponse = reponse;
        this.ptsGagnes = ptsGagnes;
        this.tpsReponse = tpsReponse;
    }

    // Getters
    public long getId() { return id; }
    public JoueurPartie getJoueurPartie() { return joueurPartie; }
    public int getTour() { return tour; }
    public int getReponse() { return reponse; }
    public int getPtsGagnes() { return ptsGagnes; }
    public long getTpsReponse() { return tpsReponse; }

    // Setters
    public void setJoueurPartie(JoueurPartie joueurPartie) { this.joueurPartie = joueurPartie; }
    public void setTour(int tour) { this.tour = tour; }
    public void setReponse(int reponse) { this.reponse = reponse; }
    public void setPtsGagnes(int ptsGagnes) { this.ptsGagnes = ptsGagnes; }
    public void setTpsReponse(long tpsReponse) { this.tpsReponse = tpsReponse; }

}
