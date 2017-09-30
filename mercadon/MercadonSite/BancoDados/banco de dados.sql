-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Set-2017 às 02:57
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
(1, 'Alface', 'Supermercado Familia', 1.50, 'imgs/produtos/alface/alface-crespa.png'),
(2, 'Alface Devile Hidroponica', 'Supermercado Varella', 1.80, 'imgs/produtos/alface/alface-hidroponica.png'),
(3, 'Alface Natural Salads', 'Supermercado Silva', 1.85, 'imgs/produtos/alface/alface-embalada.png'),
(4, 'Acucar Uniao Naturale Organico Demerara 1kg', 'Supermercado Familia', 4.18, 'imgs\\produtos\\acucar\\Acucar Uniao Naturale Organico Demerara 1kg.png'),
(5, 'Acucar Mascavo DaColonia 500g', 'Supermercado Familia', 5.48, 'imgs\\produtos\\acucar\\Acucar Mascavo DaColonia 500g.png'),
(6, 'Acucar Caravelas 5kg', 'Supermercado Familia', 8.98, 'imgs\\produtos\\acucar\\Acucar Caravelas 5kg.png'),
(7, 'Absorvente Interno Intimus Mdio Leve 16 Pague 15', 'Supermercado Varella', 13.79, 'imgs\\produtos\\absorventes\\Absorvente Interno Intimus Mdio Leve 16 Pague 15.png'),
(8, 'Absorvente Intimus Gel com Abas Suave Leve 16 Pague 14', 'Supermercado Montanha', 4.97, 'imgs\\produtos\\absorventes\\Absorvente Intimus Gel com Abas Suave Leve 16 Pague 14.png'),
(9, 'Oleo de Soja Soya 900mL', 'Supermercado Atacadao', 2.97, 'imgs\\produtos\\azeites\\Oleo de Soja Soya 900mL.png'),
(10, 'Azeite de Oliva Italiano Oleificio del Golfo Extra Virgem 500mL', 'Supermercado Silva', 14.97, 'imgs\\produtos\\azeites\\Azeite de Oliva Italiano Oleificio del Golfo Extra Virgem 500mL.png'),
(11, 'Biscoito Isabela Leite 400g', 'Supermercado Familia', 3.59, 'imgs\\produtos\\biscoitos\\Biscoito Isabela Leite 400g.png'),
(12, 'Biscoito Isabela Maria Sabor Chocolate 400g', 'Supermercado Silva', 4.75, 'imgs\\produtos\\biscoitos\\Biscoito Isabela Maria Sabor Chocolate 400g.png'),
(13, 'Bolinho Ana Maria Com Cobertura 45g', 'Supermercado Silva', 1.39, 'imgs\\produtos\\bolos\\Bolinho Ana Maria Com Cobertura 45g.png'),
(14, 'Filezinho de Frango Sassami Agroveneto Congelado Bandeja 1kg', 'Supermercado Atacadao', 10.98, 'imgs\\produtos\\carnes\\Filezinho de Frango Sassami Agrovneto Congelado Bandeja 1kg.png'),
(15, 'File De Peito De Frango Agroveneto Congelado Bandeja 1kg', 'Supermercado Varella', 9.98, 'imgs\\produtos\\carnes\\File De Peito De Frango Agroveneto Congelado Bandeja 1kg.png'),
(16, 'Margarina Doriana c/ Sal 250g', 'Supermercado montanha', 2.49, 'imgs\\produtos\\margarinas\\Margarina Doriana com Sal 250g.png'),
(17, 'Margarina Qualy Sadia Light c/ Sal 500g', 'Supermercado Silva', 5.97, 'imgs\\produtos\\margarinas\\Margarina Qualy Sadia Light com Sal 500g.png'),
(18, 'Margarina Delicia Cremosa c/ Sal 250g', 'Supermercado Atacadao', 2.59, 'imgs\\produtos\\margarinas\\Margarina Delicia Cremosa com Sal 250g.png'),
(19, 'Composto Alimentar Leco (Margarina/Manteiga) c/ Sal Pote 200g', 'Supermercado montanha', 6.49, 'imgs\\produtos\\margarinas\\Composto Alimentar Leco (Margarina Manteiga) com Sal Pote 200g.png'),
(20, 'Margarina Delicia Mila c/ Sal 500g', 'Supermercado Galego', 5.97, 'imgs\\produtos\\margarinas\\Margarina Delicia Mila com Sal 500g.png'),
(21, 'Margarina Doriana Light c/ Sal 500g', 'Supermercado Silva', 4.77, 'imgs\\produtos\\margarinas\\Margarina Doriana Light com Sal 500g.png'),
(22, 'Refrigerante Coca-Cola 2,5 Litros', 'Supermercado Galego', 7.38, 'imgs\\produtos\\refrigerantes\\Refrigerante Coca-Cola 25 Litros.png'),
(23, 'Refrigerante Fanta Laranja 1,5 Litro', 'Supermercado Varella', 3.98, 'imgs\\produtos\\refrigerantes\\Refrigerante Fanta Laranja 15 Litro.png'),
(24, 'Laranja Pera Embalagem 500g', 'Supermercado Varella', 0.54, 'imgs\\produtos\\frutas\\Laranja Pera Embalagem 500g.png'),
(25, 'Limao Tahiti Embalagem 300g', 'Supermercado Silva', 0.98, 'imgs\\produtos\\frutas\\Limao Tahiti Embalagem 300g.png'),
(26, 'Bolo Nutrella Zero Laranja 300g', 'Supermercado Galego', 8.75, 'imgs\\produtos\\bolos\\Bolo Nutrella Zero Laranja 300g.png'),
(27, 'Cerveja Brahma Malzbier Long Neck 355mL C6', 'Supermercado Galego', 22.14, 'imgs\\produtos\\cervejas\\Cerveja Brahma Malzbier Long Neck 355mL C6.png'),
(28, 'Cerveja Budweiser Lata 350mL C12', 'Supermercado montanha', 36.96, 'imgs\\produtos\\cervejas\\Cerveja Budweiser Lata 350mL C12.png'),
(29, 'Cerveja Eisenbahn Pilsen Lata 350mL C6', 'Supermercado Familia', 19.74, 'imgs\\produtos\\cervejas\\Cerveja Eisenbahn Pilsen Lata 350mL C6.png'),
(30, 'Acucar Ducula 1kg', 'Supermercado Familia', 2.19, 'imgs\\produtos\\acucar\\Acucar Ducula 1kg.png'),
(31, 'Acucar Uniao 5kg', 'Supermercado Familia', 11.90, 'imgs\\produtos\\acucar\\Acucar Uniao 5kg.png'),
(32, 'Acucar Cristal Uniao Organico 1kg', 'Supermercado Familia', 5.47, 'imgs\\produtos\\acucar\\Acucar Cristal Uniao Organico 1kg.png'),
(33, 'Anti Mofo Traça Brilholac 35g Perfumado', 'Supermercado Familia', 3.90, 'imgs\\produtos\\paraCasa\\Anti Mofo  Traça Brilholac 35g Perfumado.png'),
(34, 'Limpador De Vidro Vidrex Bio-lcool 500mL Squeeze', 'Supermercado Familia', 7.85, 'imgs\\produtos\\paraCasa\\Limpador De Vidro Vidrex Bio-lcool 500mL Squeeze.png'),
(35, 'Presunto Perdigao Fatiado 200g', 'Supermercado Familia', 6.59, 'imgs\\produtos\\defumados\\Presunto Perdigao Fatiado 200g.png'),
(36, 'Peito De Frango Defumado Seara Fatias 170g', 'Supermercado Familia', 4.99, 'imgs\\produtos\\defumados\\Peito De Frango Defumado Seara Fatias 170g.png'),
(37, 'Pizza Sadia Lombo c Requeijao 460g', 'Supermercado Familia', 13.45, 'imgs\\produtos\\congelados\\Pizza Sadia Lombo c Requeijao 460g.png'),
(38, 'Leite Aurora Integral Longa Vida 1L', 'Supermercado Familia', 1.65, 'imgs\\produtos\\leites\\Leite Aurora Integral Longa Vida 1L.png'),
(39, 'Leite Elege Integral Longa Vida 1L', 'Supermercado Familia', 2.19, 'imgs\\produtos\\leites\\Leite Elege Integral Longa Vida 1L.png'),
(40, 'Leite Languiru Semi-Desnatado Longa Vida com Tampa 1L', 'Supermercado Familia', 1.99, 'imgs\\produtos\\leites\\Leite Languiru Semi-Desnatado Longa Vida com Tampa 1L.png'),
(41, 'Leite Ninho Integral Longa Vida 1L', 'Supermercado Familia', 3.27, 'imgs\\produtos\\leites\\Leite Ninho Integral Longa Vida 1L.png'),
(42, 'Leite Tirol Integral Longa Vida 1L', 'Supermercado Familia', 1.75, 'imgs\\produtos\\leites\\Leite Tirol Integral Longa Vida 1L.png'),
(43, 'Leite Parmalat Semi-Desnatado Longa Vida 1L', 'Supermercado Familia', 1.99, 'imgs\\produtos\\leites\\Leite Parmalat Semi-Desnatado Longa Vida 1L.png'),
(44, 'Salgadinho Elma Chips Doritos Queijo Nacho 96g', 'Supermercado Familia', 4.55, 'imgs\\produtos\\salgadinhos\\Salgadinho Elma Chips Doritos Queijo Nacho 96g.png'),
(45, 'Salgadinho Elma Chips Fandangos Presunto 164g', 'Supermercado Familia', 4.38, 'imgs\\produtos\\salgadinhos\\Salgadinho Elma Chips Fandangos Presunto 164g.png'),
(46, 'Batata Palha Ki Fritas Tradicional 80g', 'Supermercado Familia', 2.98, 'imgs\\produtos\\salgadinhos\\Batata Palha Ki Fritas Tradicional 80g.png'),
(47, 'Batata Frita Slice Ondulada 45g', 'Supermercado Familia', 1.83, 'imgs\\produtos\\salgadinhos\\Batata Frita Slice Ondulada 45g.png'),
(48, 'Batata Frita Yoki Yokitos Original com Sal 180g', 'Supermercado Familia', 6.63, 'imgs\\produtos\\salgadinhos\\Batata Frita Yoki Yokitos Original com Sal 180g.png'),
(49, 'Salgadinho Elma Chips Sensações Pesto com Parmesão 80g', 'Supermercado Familia', 5.11, 'imgs\\produtos\\salgadinhos\\Salgadinho Elma Chips Sensações Pesto com Parmesão 80g.png'),
(50, 'Beterraba em Conserva Hemmer 400g', 'Supermercado Familia', 5.97, 'imgs\\produtos\\conserva\\Beterraba em Conserva Hemmer 400g.png'),
(52, 'Palmito em Conserva Hemmer Juçara 300g', 'Supermercado Familia', 25.99, 'imgs\\produtos\\conserva\\Palmito em Conserva Hemmer Juçara 300g.png'),
(53, 'Pimenta em Conserva Hemmer Malagueta 150g', 'Supermercado Familia', 7.75, 'imgs\\produtos\\conserva\\Pimenta em Conserva Hemmer Malagueta 150g.png'),
(54, 'Pepino em Conserva Hemmer Suave Light 300g', 'Supermercado Familia', 8.97, 'imgs\\produtos\\conserva\\Pepino em Conserva Hemmer Suave Light 300g.png'),
(55, 'Cebolinha em Conserva GDM 300g', 'Supermercado Familia', 4.49, 'imgs\\produtos\\conserva\\Cebolinha em Conserva GDM 300g.png');


--
-- Indexes for dumped tables
--

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



