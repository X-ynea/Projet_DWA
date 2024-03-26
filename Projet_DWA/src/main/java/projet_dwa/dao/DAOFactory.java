package projet_dwa.dao;

import projet_dwa.pojo.*;

// Abstract factory of DAO for the schema
public abstract class DAOFactory {

    // Return the DAO for the classes/tables
    public abstract DAO<Utilisateur> getDAOUtilisateur() throws DAOException;
    public abstract DAO<Joueur> getDAOJoueur() throws DAOException;
    public abstract DAO<Partie> getDAOPartie() throws DAOException;
}
