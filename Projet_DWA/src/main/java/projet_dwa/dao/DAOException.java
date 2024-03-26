package projet_dwa.dao;

// Specific exception for data access problems via a DAO
public class DAOException extends Exception {

    public DAOException() {
    super();
    }

    public DAOException(String message) {
    super(message);
    }
}
