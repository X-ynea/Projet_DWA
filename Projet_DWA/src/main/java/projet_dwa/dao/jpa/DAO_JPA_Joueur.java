package projet_dwa.dao.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.math.BigDecimal;
import java.util.List;
import projet_dwa.EntityManagerProvider;
import projet_dwa.dao.DAO;
import projet_dwa.dao.DAOException;
import projet_dwa.pojo.Joueur;

public class DAO_JPA_Joueur extends DAO<Joueur> {

  // ------- ENTITYMANAGER OBJECT -------
  private final EntityManager entityManager;


  // ------- CONSTRUCTOR -------
  public DAO_JPA_Joueur() throws DAOException {
    this.entityManager = EntityManagerProvider.getInstance();
  }


  // ------- CRUD METHODS -------
  @Override
  public Joueur findById(int id) throws DAOException {
    return entityManager.find(Joueur.class, new BigDecimal(id));
  }

  @Override
  public Joueur[] findAll() throws DAOException {
    TypedQuery<Joueur> query = entityManager.createQuery("SELECT s FROM Joueur s", Joueur.class);
    List<Joueur> results = query.getResultList();
    return results.toArray(new Joueur[0]);
  }

  @Override
  public void create(Joueur data) throws DAOException {
    update(data);
  }

  @Override
  public void update(Joueur data) throws DAOException {
    entityManager.getTransaction().begin();
    entityManager.merge(data);
    entityManager.getTransaction().commit();
  }

  @Override
  public void delete(Joueur data) throws DAOException {
    entityManager.getTransaction().begin();
    entityManager.remove(data);
    entityManager.getTransaction().commit();
  }
}
