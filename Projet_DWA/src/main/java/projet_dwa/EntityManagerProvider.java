package projet_dwa;

import jakarta.persistence.*;

public final class EntityManagerProvider {

  private static EntityManager instance;
  private static EntityManagerFactory factory;

  // Get the entity manager
  public static EntityManager getInstance() {
    // If the factory is not created, create it
    if (factory == null) {
      factory = Persistence.createEntityManagerFactory("default");
    }

    // If the entity manager is not created, create it
    if (instance == null) {
      instance = factory.createEntityManager();
    }
    return instance;
  }

  // Close the entity manager and the factory
  public static void close() {
    if (instance.isOpen()) instance.close();
    if (factory.isOpen()) factory.close();
  }


}
