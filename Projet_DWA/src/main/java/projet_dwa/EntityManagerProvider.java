package project_name;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class EntityManagerProvider {

  private static EntityManager instance;
  private static EntityManagerFactory factory;
  private final static String PERSISTANCE_UNIT_NAME = "default";

  // Get the entity manager
  public static EntityManager getInstance() {
    // If the factory is not created, create it
    if (factory == null) {
      factory = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
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