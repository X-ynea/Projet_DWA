-- MariaDB dump 10.19  Distrib 10.4.25-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: projet_dwa
-- ------------------------------------------------------
-- Server version	10.4.25-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `joueur`
--

DROP TABLE IF EXISTS `joueur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `joueur` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `score_partie` int(11) DEFAULT NULL,
  `partie_id` bigint(20) DEFAULT NULL,
  `utilisateur_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_joueur_utilisateur_id` (`utilisateur_id`),
  KEY `FK_joueur_partie_id` (`partie_id`),
  CONSTRAINT `FK_joueur_partie_id` FOREIGN KEY (`partie_id`) REFERENCES `partie` (`CODEPARTIE`),
  CONSTRAINT `FK_joueur_utilisateur_id` FOREIGN KEY (`utilisateur_id`) REFERENCES `utilisateur` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `joueur`
--

LOCK TABLES `joueur` WRITE;
/*!40000 ALTER TABLE `joueur` DISABLE KEYS */;
/*!40000 ALTER TABLE `joueur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partie`
--

DROP TABLE IF EXISTS `partie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partie` (
  `CODEPARTIE` bigint(20) NOT NULL AUTO_INCREMENT,
  `DIFFICULTE` varchar(255) DEFAULT NULL,
  `nbrCouleur` int(11) DEFAULT NULL,
  `nbrNombre` int(11) DEFAULT NULL,
  `nbrTour` int(11) DEFAULT NULL,
  `STATUT` varchar(255) DEFAULT NULL,
  `timer` int(11) DEFAULT NULL,
  `total_clics_rapide` int(11) DEFAULT NULL,
  `total_clics_reussis` int(11) DEFAULT NULL,
  `createur` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CODEPARTIE`),
  KEY `FK_partie_createur` (`createur`),
  CONSTRAINT `FK_partie_createur` FOREIGN KEY (`createur`) REFERENCES `utilisateur` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partie`
--

LOCK TABLES `partie` WRITE;
/*!40000 ALTER TABLE `partie` DISABLE KEYS */;
/*!40000 ALTER TABLE `partie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `utilisateur` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `AGE` int(11) NOT NULL,
  `connecte` tinyint(1) DEFAULT 0,
  `en_partie` tinyint(1) DEFAULT 0,
  `GENRE` varchar(255) NOT NULL,
  `MDP` varchar(255) NOT NULL,
  `nbr_clics_rapides` int(11) DEFAULT NULL,
  `nbr_clics_reussis` int(11) DEFAULT NULL,
  `nbr_clics_total` int(11) DEFAULT NULL,
  `nbr_partie_jouee` int(11) DEFAULT NULL,
  `nbr_victoire` int(11) DEFAULT NULL,
  `PSEUDO` varchar(255) NOT NULL,
  `score_moyen` double DEFAULT NULL,
  `somme_score` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utilisateur`
--

LOCK TABLES `utilisateur` WRITE;
/*!40000 ALTER TABLE `utilisateur` DISABLE KEYS */;
/*!40000 ALTER TABLE `utilisateur` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-27 17:31:06
