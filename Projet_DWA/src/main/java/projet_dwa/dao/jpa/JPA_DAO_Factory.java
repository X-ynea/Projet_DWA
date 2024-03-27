package projet_dwa.dao.jpa;

import projet_dwa.dao.*;
import projet_dwa.pojo.*;


public class JPA_DAO_Factory extends DAOFactory {

    // -------appel des DAO spécifiques -------
    private DAO_JPA_Utilisateur daoUtilisateur = null;
    private DAO_JPA_Joueur daoJoueur = null;
    private DAO_JPA_Partie daoPartie = null;


    // -------Getters des DAO spécifiques -------
    @Override
    public DAO<Utilisateur> getDAOUtilisateur() throws DAOException {
        if (daoUtilisateur == null) daoUtilisateur = new DAO_JPA_Utilisateur();
        return daoUtilisateur;
    }

    @Override
    public DAO<Joueur> getDAOJoueur() throws DAOException {
        if (daoJoueur == null) daoJoueur = new DAO_JPA_Joueur();
        return daoJoueur;
    }

    @Override
    public DAO<Partie> getDAOPartie() throws DAOException {
        if (daoPartie == null) daoPartie = new DAO_JPA_Partie();
        return daoPartie;
    }
}
