-- Création de la table Utilisateur
CREATE TABLE IF NOT EXISTS `utilisateur` (
                               `codeUser` BIGINT NOT NULL AUTO_INCREMENT,
                               `pseudo` VARCHAR(255) NOT NULL,
                               `mdp` VARCHAR(255) NOT NULL,
                               `age` INT NOT NULL,
                               `genre` ENUM('MASCULIN', 'FEMININ', 'AUTRE') NOT NULL,
                               `connecte` BOOLEAN NOT NULL,
                               PRIMARY KEY (`codeUser`)
);

-- Création de la table Partie
CREATE TABLE IF NOT EXISTS `partie` (
                          `codePartie` BIGINT NOT NULL AUTO_INCREMENT,
                          `codeCreateur` BIGINT NOT NULL,
                          `nbrCouleur` INT NOT NULL,
                          `nbrForme` INT NOT NULL,
                          `timer` INT NOT NULL,
                          `nbrTour` INT NOT NULL,
                          `difficulte` ENUM('SIMPLE', 'DIFFICILE') NOT NULL,
                          `statut` VARCHAR(255) NOT NULL,
                          `totalClicsReussis` INT NOT NULL,
                          `totalClicsReussisPlusRapides` INT NOT NULL,
                          PRIMARY KEY (`codePartie`),
                          CONSTRAINT `fk_partie_createur`
                              FOREIGN KEY (`codeCreateur`)
                                  REFERENCES `utilisateur` (`codeUser`)
                                  ON DELETE CASCADE
);

-- Création de la table JoueurPartie
CREATE TABLE IF NOT EXISTS `joueur` (
                                `codeJoueur` BIGINT NOT NULL AUTO_INCREMENT,
                                `codeUser` BIGINT NOT NULL,
                                `codePartie` BIGINT NOT NULL,
                                `score` INT NOT NULL,
                                `enPartie` BOOLEAN NOT NULL,
                                `nbrVictoire` INT NOT NULL,
                                `scoreMoy` DOUBLE NOT NULL,
                                `ratioClicsReussis` DOUBLE NOT NULL,
                                `ratioClicsRapides` DOUBLE NOT NULL,
                                `nbrClicsPlusRapides` INT NOT NULL,
                                PRIMARY KEY (`codeJoueur`),
                                CONSTRAINT `fk_joueur_user`
                                    FOREIGN KEY (`codeUser`)
                                        REFERENCES `utilisateur` (`codeUser`)
                                        ON DELETE CASCADE,
                                CONSTRAINT `fk_joueur_partie`
                                    FOREIGN KEY (`codePartie`)
                                        REFERENCES `partie` (`codePartie`)
                                        ON DELETE CASCADE
);

