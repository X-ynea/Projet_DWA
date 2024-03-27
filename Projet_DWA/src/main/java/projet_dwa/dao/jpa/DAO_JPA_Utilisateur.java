package projet_dwa.dao.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.math.BigDecimal;
import java.util.List;
import projet_dwa.dao.DAO;
import projet_dwa.dao.DAOException;
import projet_dwa.pojo.Utilisateur;
import projet_dwa.EntityManagerProvider;

public class DAO_JPA_Utilisateur extends DAO<Utilisateur> {

  // ------- ENTITYMANAGER OBJECT -------
  private final EntityManager entityManager;


  // ------- CONSTRUCTOR -------
  public DAO_JPA_Utilisateur() throws DAOException {
    this.entityManager = EntityManagerProvider.getInstance();
  }


  // ------- CRUD METHODS -------
  @Override
  public Utilisateur findById(int id) throws DAOException {
    return entityManager.find(Utilisateur.class, new BigDecimal(id));
  }

  @Override
  public Utilisateur[] findAll() throws DAOException {
    TypedQuery<Utilisateur> query = entityManager.createQuery("SELECT s FROM Utilisateur s", Utilisateur.class);
    List<Utilisateur> results = query.getResultList();
    return results.toArray(new Utilisateur[0]);
  }

  @Override
  public void create(Utilisateur data) throws DAOException {
    update(data);
  }

  @Override
  public void update(Utilisateur data) throws DAOException {
    entityManager.getTransaction().begin();
    entityManager.merge(data);
    entityManager.getTransaction().commit();
  }

  @Override
  public void delete(Utilisateur data) throws DAOException {
    entityManager.getTransaction().begin();
    entityManager.remove(data);
    entityManager.getTransaction().commit();
  }
}
