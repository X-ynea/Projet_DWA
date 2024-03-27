package projet_dwa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class EntityManagerProvider {

  private static EntityManager instance;
  private static EntityManagerFactory factory;

  // Get entity manager
  public static EntityManager getInstance() {
    // Création de la factory
    if (factory == null) {
      factory = Persistence.createEntityManagerFactory("default");
    }

    // Création de l'entity manager
    if (instance == null) {
      instance = factory.createEntityManager();
    }
    return instance;
  }

  // Fermer entity manager et factory
  public static void close() {
    if (instance.isOpen()) instance.close();
    if (factory.isOpen()) factory.close();
  }


}
