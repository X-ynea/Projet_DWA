package projet_dwa.dao;
import projet_dwa.dao.jpa.JPA_DAO_Factory;

// Factory returning a DAO factory according to the chosen persistence support
public class AbstractDAOFactory {

    public static DAOFactory getDAOFactory(PersistenceKind type) {
        if (type.equals(PersistenceKind.JPA)) return new JPA_DAO_Factory();
        return null;
    }
}
