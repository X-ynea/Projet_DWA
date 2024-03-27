package projet_dwa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import projet_dwa.pojo.Utilisateur;

public class Main {
    public static void main(String[] args) {
         // Créer une instance de l'EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        try {
            // Tester la connexion en récupérant un enregistrement de la base de données
            Utilisateur utilisateur = entityManager.find(Utilisateur.class, 1L); // Supposons que 1L est l'ID de l'utilisateur que vous voulez récupérer
            if (utilisateur != null) {
                System.out.println("Connexion à la base de données réussie !");
                System.out.println("Utilisateur trouvé : " + utilisateur);
            } else {
                System.out.println("Aucun utilisateur trouvé dans la base de données !");
            }
        } catch (Exception e) {
            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        } finally {
            // Fermer l'EntityManager
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}