-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 26-Set-2017 às 21:52
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mercadon`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carrinho`
--

CREATE TABLE `carrinho` (
  `ID` int(11) NOT NULL,
  `PRODUTO_CAR` varchar(250) NOT NULL,
  `SUPERMERCADO_CAR` varchar(250) NOT NULL,
  `PRECO_CAR` double(8,2) NOT NULL,
  `IMAGEM_CAR` varchar(250) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `ID` int(11) NOT NULL,
  `PRODUTO` varchar(250) NOT NULL,
  `SUPERMERCADO` varchar(250) NOT NULL,
  `PRECO` double(8,2) NOT NULL,
  `imagem` varchar(250) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`ID`, `PRODUTO`, `SUPERMERCADO`, `PRECO`, `imagem`) VALUES
(1, 'Alface', 'Supermercado Familia', 1.50, '../imgs/produtos/alface/alface-crespa.png'),
(2, 'Alface Devile Hidroponica', 'Supermercado Varella', 1.80, '../imgs/produtos/alface/alface-hidroponica.png'),
(3, 'Alface Natural Salads', 'Supermercado Silva', 1.85, '../imgs/produtos/alface/alface-embalada.png'),
(4, 'Acucar refinado festa', 'Supermercado Galego', 1.70, '..\\imgs\\produtos\\acucar\\acucar-refinado-festa.png'),
(5, 'Acucar especial', 'Supermercado Atacadao', 1.75, '..\\imgs\\produtos\\acucar\\acucar-refinado-especial.png'),
(6, 'Acucar refinado', 'Supermercado montanha', 2.28, '..\\imgs\\produtos\\acucar\\acucar-refinado.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carrinho`
--
ALTER TABLE `carrinho`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carrinho`
--
ALTER TABLE `carrinho`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
