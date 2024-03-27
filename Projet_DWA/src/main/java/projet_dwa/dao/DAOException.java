package projet_dwa.dao;

// Classe qui gère les exeptions
public class DAOException extends Exception {

    public DAOException() {
    super();
    }

    public DAOException(String message) {
    super(message);
    }
}
