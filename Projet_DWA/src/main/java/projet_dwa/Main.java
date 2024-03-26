package projet_dwa;

import projet_dwa.dao.*;
import projet_dwa.pojo.*;

public class Main {

    public static void main(String[] args) {
        try {
          JPA_DAO_Factory jpaDaoFactory = new JPA_DAO_Factory();

          // DAO for the class/table
          DAO<Utilisateur> daoJpaUtilisateur = jpaDaoFactory.getDAOUtilisateur();
          DAO<Joueur> daoJpaJoueur = jpaDaoFactory.getDAOJoueur();
            DAO<Partie> daoJpaPartie = jpaDaoFactory.getDAOPartie();

          // Database content at the beginning
          Utilisateur[] Utilisateurs = daoJpaUtilisateur.findAll();
          for (Utilisateur s : Utilisateurs) {
            System.out.println("code: " + s.getCodeUtilisateur() + "intitule:" + s.getIntitule());
          }

          // Add a new Utilisateur
          Utilisateur basket = daoJpaUtilisateur.findById(2);
          // Print the Utilisateur
          System.out.println(basket.toString() + "\n");
          // Delete the Utilisateur
          daoJpaUtilisateur.delete(basket);

          // Close the connection
          EntityManagerProvider.close();
        } catch (DAOException e) {
          e.printStackTrace();
        }
    }
}
