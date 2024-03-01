-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.27-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para usuariossa
CREATE DATABASE IF NOT EXISTS `usuariossa` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `usuariossa`;

-- Copiando estrutura para tabela usuariossa.agendamentos
CREATE TABLE IF NOT EXISTS `agendamentos` (
  `idAgendamentos` int(11) NOT NULL AUTO_INCREMENT,
  `Cliente` varchar(45) NOT NULL,
  `Servico` varchar(45) NOT NULL,
  `Valor` varchar(45) NOT NULL,
  `Data` varchar(45) NOT NULL,
  `OBS` varchar(45) NOT NULL,
  PRIMARY KEY (`idAgendamentos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando dados para a tabela usuariossa.agendamentos: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela usuariossa.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  `Sexo` varchar(45) NOT NULL,
  `DataDeNascimento` int(11) NOT NULL,
  `Telefone` varchar(45) NOT NULL,
  `CPF` varchar(45) NOT NULL,
  `Endereço` varchar(145) NOT NULL,
  `CEP` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando dados para a tabela usuariossa.cliente: ~1 rows (aproximadamente)
INSERT INTO `cliente` (`idCliente`, `Nome`, `Sexo`, `DataDeNascimento`, `Telefone`, `CPF`, `Endereço`, `CEP`, `Email`) VALUES
	(1, 'Otávio Marques', 'Masculino', 24112005, '47 98824-1863', '161.857.767-07', 'Rua amazonas 3495', '89022-002', 'otaviolourenco24@gmail.com');

-- Copiando estrutura para tabela usuariossa.funcionarios
CREATE TABLE IF NOT EXISTS `funcionarios` (
  `idFuncionarios` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  `Sexo` varchar(45) NOT NULL,
  `DataDeNascimento` datetime NOT NULL,
  `Telefone` varchar(45) NOT NULL,
  `CPF` varchar(45) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `NivelDeAcesso` int(11) NOT NULL,
  `Senha` varchar(90) NOT NULL,
  PRIMARY KEY (`idFuncionarios`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando dados para a tabela usuariossa.funcionarios: ~2 rows (aproximadamente)
INSERT INTO `funcionarios` (`idFuncionarios`, `Nome`, `Sexo`, `DataDeNascimento`, `Telefone`, `CPF`, `Email`, `NivelDeAcesso`, `Senha`) VALUES
	(1, 'Tavin', 'Masculino', '0000-00-00 00:00:00', '47 98824-1863', '161.857.767-07', 'inho.marques312@gmail.com', 3, '1234'),
	(2, 'Admin', 'Masculino', '2001-01-01 00:00:00', '47 0101-0101', '010.101.010-10', 'admin@gmail.com', 3, 'admin');

-- Copiando estrutura para tabela usuariossa.servico
CREATE TABLE IF NOT EXISTS `servico` (
  `idServico` int(11) NOT NULL AUTO_INCREMENT,
  `Descrição` varchar(150) NOT NULL,
  `Valor` int(11) NOT NULL,
  `Nome` varchar(45) NOT NULL,
  PRIMARY KEY (`idServico`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando dados para a tabela usuariossa.servico: ~3 rows (aproximadamente)
INSERT INTO `servico` (`idServico`, `Descrição`, `Valor`, `Nome`) VALUES
	(1, 'Limpeza dentro do carro', 100, 'LIMPEZA INTERNA'),
	(2, 'Limpeza do lado de fora do carro', 70, 'LIMPEZA EXTERNA'),
	(3, 'Limpeza dentro e fora do Carro', 200, 'LIMPEZA GERAL');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
