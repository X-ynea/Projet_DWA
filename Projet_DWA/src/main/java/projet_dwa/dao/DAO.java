package projet_dwa.dao;


// Generic and abstract DAO class for any type of data
// <D> : the class parameterizing the DAO
public abstract class DAO<D> {

    // ------- CONSTRUCTOR -------
    public void DAO() throws DAOException { }

    // Return an object from the persistence support based on its identifier
    public abstract D findById(int id) throws DAOException;

    // Return all objects from the persistence support
    public abstract D[] findAll() throws DAOException;

    // Make an object persistent that did not have a representation on the persistence support
    public abstract void create(D data) throws DAOException;

    // Update the content corresponding to the object on the persistent support
    public abstract void update(D data) throws DAOException;

    // Delete from the persistent support the content equivalent to the object
    public abstract void delete(D data) throws DAOException;
}
