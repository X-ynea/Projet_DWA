package projet_dwa.dao;


// Classe DAO générique et abstraite pour tout type de données
// <D> : la classe paramétrant le DAO
public abstract class DAO<D> {

    // Constructeur
    public void DAO() throws DAOException { };

    public abstract D findById(int id) throws DAOException;

    public abstract D[] findAll() throws DAOException;

    public abstract void create(D data) throws DAOException;

    public abstract void update(D data) throws DAOException;

    public abstract void delete(D data) throws DAOException;
}
