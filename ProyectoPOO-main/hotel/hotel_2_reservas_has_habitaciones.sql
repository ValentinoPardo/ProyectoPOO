-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: hotel_2
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reservas_has_habitaciones`
--

DROP TABLE IF EXISTS `reservas_has_habitaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas_has_habitaciones` (
  `reservas_idreservas` int NOT NULL,
  `Habitaciones_idHabitaciones` int NOT NULL,
  PRIMARY KEY (`reservas_idreservas`,`Habitaciones_idHabitaciones`),
  KEY `fk_reservas_has_Habitaciones_Habitaciones1_idx` (`Habitaciones_idHabitaciones`),
  KEY `fk_reservas_has_Habitaciones_reservas1_idx` (`reservas_idreservas`),
  CONSTRAINT `fk_reservas_has_Habitaciones_Habitaciones1` FOREIGN KEY (`Habitaciones_idHabitaciones`) REFERENCES `habitaciones` (`idHabitaciones`),
  CONSTRAINT `fk_reservas_has_Habitaciones_reservas1` FOREIGN KEY (`reservas_idreservas`) REFERENCES `reservas` (`idreservas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas_has_habitaciones`
--

LOCK TABLES `reservas_has_habitaciones` WRITE;
/*!40000 ALTER TABLE `reservas_has_habitaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservas_has_habitaciones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-28 23:05:39
