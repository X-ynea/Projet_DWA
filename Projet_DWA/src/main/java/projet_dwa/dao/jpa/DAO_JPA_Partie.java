package projet_dwa.dao.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.math.BigDecimal;
import java.util.List;
import projet_dwa.dao.DAO;
import projet_dwa.dao.DAOException;
import projet_dwa.EntityManagerProvider;
import projet_dwa.pojo.Partie;

public class DAO_JPA_Partie extends DAO<Partie> {

  // ------- ENTITYMANAGER OBJECT -------
  private final EntityManager entityManager;


  // ------- CONSTRUCTOR -------
  public DAO_JPA_Partie() throws DAOException {
    this.entityManager = EntityManagerProvider.getInstance();
  }


  // ------- CRUD METHODS -------
  @Override
  public Partie findById(int id) throws DAOException {
    return entityManager.find(Partie.class, new BigDecimal(id));
  }

  @Override
  public Partie[] findAll() throws DAOException {
    TypedQuery<Partie> query = entityManager.createQuery("SELECT s FROM Partie s", Partie.class);
    List<Partie> results = query.getResultList();
    return results.toArray(new Partie[0]);
  }

  @Override
  public void create(Partie data) throws DAOException {
    update(data);
  }

  @Override
  public void update(Partie data) throws DAOException {
    entityManager.getTransaction().begin();
    entityManager.merge(data);
    entityManager.getTransaction().commit();
  }

  @Override
  public void delete(Partie data) throws DAOException {
    entityManager.getTransaction().begin();
    entityManager.remove(data);
    entityManager.getTransaction().commit();
  }
}
