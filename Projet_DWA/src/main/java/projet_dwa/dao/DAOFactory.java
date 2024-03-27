package projet_dwa.dao;

import projet_dwa.pojo.*;

// factory pour le shéma
public abstract class DAOFactory {

    public abstract DAO<Utilisateur> getDAOUtilisateur() throws DAOException;
    public abstract DAO<Joueur> getDAOJoueur() throws DAOException;
    public abstract DAO<Partie> getDAOPartie() throws DAOException;
}
