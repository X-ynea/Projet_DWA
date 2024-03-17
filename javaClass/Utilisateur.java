package javaClass;
import javax.persistence.*;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
    // Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pseudo;
    private String mdp;
    private int age;
    @Enumerated(EnumType.STRING)   // 0: "masculin", 1: "feminin", 2: "autre"
    private String genre;
    private boolean connecte;
    private boolean enPartie;
    private int nbrVictoire;
    private double scoreMoy;
    private double ratioClicsReussis;
    private double ratioClicsRapides;
    private int nbrClicsPlusRapides;

    // Constructeurs
    public Utilisateur() { }

    public Utilisateur(String pseudo, String mdp, int age, String genre, boolean connecte, boolean enPartie,
                       int nbrVictoire, double scoreMoy, double ratioClicsReussis, double ratioClicsRapides,
                       int nbrClicsPlusRapides) {
        this.pseudo = pseudo;
        this.mdp = mdp;
        this.age = age;
        this.genre = genre;
        this.connecte = connecte;
        this.enPartie = enPartie;
        this.nbrVictoire = nbrVictoire;
        this.scoreMoy = scoreMoy;
        this.ratioClicsReussis = ratioClicsReussis;
        this.ratioClicsRapides = ratioClicsRapides;
        this.nbrClicsPlusRapides = nbrClicsPlusRapides;
    }

    // Getters
    public long getId() { return id; }
    public String getPseudo() { return pseudo; }
    public String getMdp() { return mdp; }
    public int getAge() { return age; }
    public String getGenre() { return genre; }
    public boolean isConnecte() { return connecte; }
    public boolean isEnPartie() { return enPartie; }
    public int getNbrVictoire() { return nbrVictoire; }
    public double getScoreMoy() { return scoreMoy; }
    public double getRatioClicsReussis() { return ratioClicsReussis; }
    public double getRatioClicsRapides() { return ratioClicsRapides; }
    public int getNbrClicsPlusRapides() { return nbrClicsPlusRapides; }

    // Setters
    public void setPseudo(String pseudo) { this.pseudo = pseudo; }
    public void setMdp(String mdp) { this.mdp = mdp; }
    public void setAge(int age) { this.age = age; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setConnecte(boolean connecte) { this.connecte = connecte; }
    public void setEnPartie(boolean enPartie) { this.enPartie = enPartie; }
    public void setNbrVictoire(int nbrVictoire) { this.nbrVictoire = nbrVictoire; }
    public void setScoreMoy(double scoreMoy) { this.scoreMoy = scoreMoy; }
    public void setRatioClicsReussis(double ratioClicsReussis) { this.ratioClicsReussis = ratioClicsReussis; }
    public void setRatioClicsRapides(double ratioClicsRapides) { this.ratioClicsRapides = ratioClicsRapides; }
    public void setNbrClicsPlusRapides(int nbrClicsPlusRapides) { this.nbrClicsPlusRapides = nbrClicsPlusRapides; }


}
