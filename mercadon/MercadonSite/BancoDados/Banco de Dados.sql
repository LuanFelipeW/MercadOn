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
(13, 'Bolo Bolinho Ana Maria Com Cobertura 45g', 'Supermercado Silva', 1.39, 'imgs\\produtos\\bolos\\Bolinho Ana Maria Com Cobertura 45g.png'),
(14, 'Carne Filezinho de Frango Sassami Agroveneto Congelado Bandeja 1kg', 'Supermercado Atacadao', 10.98, 'imgs\\produtos\\carnes\\Filezinho de Frango Sassami Agroveneto Congelado Bandeja 1kg.png'),
(15, 'Carne File De Peito De Frango Agroveneto Congelado Bandeja 1kg', 'Supermercado Varella', 9.98, 'imgs\\produtos\\carnes\\File De Peito De Frango Agroveneto Congelado Bandeja 1kg.png'),
(16, 'Margarina Doriana c/ Sal            250g', 'Supermercado montanha', 2.49, 'imgs\\produtos\\margarinas\\Margarina Doriana com Sal 250g.png'),
(17, 'Margarina Qualy Sadia Light c/ Sal 500g', 'Supermercado Silva', 5.97, 'imgs\\produtos\\margarinas\\Margarina Qualy Sadia Light com Sal 500g.png'),
(18, 'Margarina Delicia Cremosa c/ Sal 250g', 'Supermercado Atacadao', 2.59, 'imgs\\produtos\\margarinas\\Margarina Delicia Cremosa com Sal 250g.png'),
(19, 'Margarina Manteiga Leco c/ Sal Pote 200g', 'Supermercado montanha', 6.49, 'imgs\\produtos\\margarinas\\Composto Alimentar Leco (Margarina Manteiga) com Sal Pote 200g.png'),
(20, 'Margarina Delicia Mila c/ Sal      500g', 'Supermercado Galego', 5.97, 'imgs\\produtos\\margarinas\\Margarina Delicia Mila com Sal 500g.png'),
(21, 'Margarina Doriana Light c/ Sal 500g', 'Supermercado Silva', 4.77, 'imgs\\produtos\\margarinas\\Margarina Doriana Light com Sal 500g.png'),
(22, 'Refrigerante Coca-Cola 2,5 Litros', 'Supermercado Galego', 7.38, 'imgs\\produtos\\refrigerantes\\Refrigerante Coca-Cola 25 Litros.png'),
(23, 'Refrigerante Fanta Laranja 1,5 Litro', 'Supermercado Varella', 3.98, 'imgs\\produtos\\refrigerantes\\Refrigerante Fanta Laranja 15 Litro.png'),
(24, 'Laranja Pera Fruta Embalagem 500g', 'Supermercado Varella', 0.54, 'imgs\\produtos\\frutas\\Laranja Pera Embalagem 500g.png'),
(25, 'Limao Tahiti Fruta Embalagem 300g', 'Supermercado Silva', 0.98, 'imgs\\produtos\\frutas\\Limao Tahiti Embalagem 300g.png'),
(26, 'Bolo Nutrella Zero Laranja 300g', 'Supermercado Galego', 8.75, 'imgs\\produtos\\bolos\\Bolo Nutrella Zero Laranja 300g.png'),
(27, 'Cerveja Brahma Malzbier Long Neck 355mL C6', 'Supermercado Galego', 22.14, 'imgs\\produtos\\cervejas\\Cerveja Brahma Malzbier Long Neck 355mL C6.png'),
(28, 'Cerveja Budweiser Lata 350mL C12', 'Supermercado montanha', 36.96, 'imgs\\produtos\\cervejas\\Cerveja Budweiser Lata 350mL C12.png'),
(29, 'Cerveja Eisenbahn Pilsen Lata 350mL C6', 'Supermercado Montanha', 19.74, 'imgs\\produtos\\cervejas\\Cerveja Eisenbahn Pilsen Lata 350mL C6.png'),
(30, 'Acucar Ducula 1kg', 'Supermercado Silva', 2.19, 'imgs\\produtos\\acucar\\Acucar Ducula 1kg.png'),
(31, 'Acucar Uniao 5kg', 'Supermercado Montanha', 11.90, 'imgs\\produtos\\acucar\\Acucar Uniao 5kg.png'),
(32, 'Acucar Cristal Uniao Organico 1kg', 'Supermercado Familia', 5.47, 'imgs\\produtos\\acucar\\Acucar Cristal Uniao Organico 1kg.png'),
(33, 'Anti Mofo Traca Brilholac 35g Perfumado', 'Supermercado Familia', 3.90, 'imgs\\produtos\\paraCasa\\Anti Mofo Traca Brilholac 35g Perfumado.png'),
(34, 'Limpador De Vidro Vidrex Bio-lcool 500mL Squeeze', 'Supermercado Familia', 7.85, 'imgs\\produtos\\paraCasa\\Limpador De Vidro Vidrex Bio-lcool 500mL Squeeze.png'),
(35, 'Presunto Perdigao Fatiado 200g', 'Supermercado Familia', 6.59, 'imgs\\produtos\\defumados\\Presunto Perdigao Fatiado 200g.png'),
(36, 'Peito De Frango Defumado Seara Fatias 170g', 'Supermercado Familia', 4.99, 'imgs\\produtos\\defumados\\Peito De Frango Defumado Seara Fatias 170g.png'),
(37, 'Pizza Sadia Lombo c Requeijao 460g', 'Supermercado Silva', 13.45, 'imgs\\produtos\\congelados\\Pizza Sadia Lombo c Requeijao 460g.png'),
(38, 'Leite Aurora Integral Longa Vida 1L', 'Supermercado Atacadao', 1.65, 'imgs\\produtos\\leites\\Leite Aurora Integral Longa Vida 1L.png'),
(39, 'Leite Elege Integral Longa Vida 1L', 'Supermercado Varella', 2.19, 'imgs\\produtos\\leites\\Leite Elege Integral Longa Vida 1L.png'),
(40, 'Leite Languiru Semi-Desnatado Longa Vida com Tampa 1L', 'Supermercado Familia', 1.99, 'imgs\\produtos\\leites\\Leite Languiru Semi-Desnatado Longa Vida com Tampa 1L.png'),
(41, 'Leite Ninho Integral Longa Vida 1L', 'Supermercado Familia', 3.27, 'imgs\\produtos\\leites\\Leite Ninho Integral Longa Vida 1L.png'),
(42, 'Leite Tirol Integral Longa Vida 1L', 'Supermercado Familia', 1.75, 'imgs\\produtos\\leites\\Leite Tirol Integral Longa Vida 1L.png'),
(43, 'Leite Parmalat Semi-Desnatado Longa Vida 1L', 'Supermercado Silva', 1.99, 'imgs\\produtos\\leites\\Leite Parmalat Semi-Desnatado Longa Vida 1L.png'),
(44, 'Salgadinho Elma Chips Doritos Queijo Nacho 96g', 'Supermercado Galego', 4.55, 'imgs\\produtos\\salgadinhos\\Salgadinho Elma Chips Doritos Queijo Nacho 96g.png'),
(45, 'Salgadinho Elma Chips Fandangos Presunto 164g', 'Supermercado Galego', 4.38, 'imgs\\produtos\\salgadinhos\\Salgadinho Elma Chips Fandangos Presunto 164g.png'),
(46, 'Batata Palha Ki Fritas Tradicional 80g', 'Supermercado Familia', 2.98, 'imgs\\produtos\\salgadinhos\\Batata Palha Ki Fritas Tradicional 80g.png'),
(47, 'Batata Frita Slice Ondulada 45g', 'Supermercado Familia', 1.83, 'imgs\\produtos\\salgadinhos\\Batata Frita Slice Ondulada 45g.png'),
(48, 'Batata Frita Yoki Yokitos Original com Sal 180g', 'Supermercado Galego', 6.63, 'imgs\\produtos\\salgadinhos\\Batata Frita Yoki Yokitos Original com Sal 180g.png'),
(49, 'Salgadinho Elma Chips Sensacoes Pesto com Parmesao 80g', 'Supermercado Silva', 5.11, 'imgs\\produtos\\salgadinhos\\Salgadinho Elma Chips Sensacoes Pesto com Parmesao 80g.png'),
(50, 'Beterraba em Conserva Hemmer 400g', 'Supermercado Familia', 5.97, 'imgs\\produtos\\conserva\\Beterraba em Conserva Hemmer 400g.png'),
(52, 'Palmito em Conserva Hemmer Jucara 300g', 'Supermercado Varella', 25.99, 'imgs\\produtos\\conserva\\Palmito em Conserva Hemmer Jucara 300g.png'),
(53, 'Pimenta em Conserva Hemmer Malagueta 150g', 'Supermercado Familia', 7.75, 'imgs\\produtos\\conserva\\Pimenta em Conserva Hemmer Malagueta 150g.png'),
(54, 'Pepino em Conserva Hemmer Suave Light 300g', 'Supermercado Atacadao', 8.97, 'imgs\\produtos\\conserva\\Pepino em Conserva Hemmer Suave Light 300g.png'),
(55, 'Cebolinha em Conserva GDM 300g', 'Supermercado Familia', 4.49, 'imgs\\produtos\\conserva\\Cebolinha em Conserva GDM 300g.png'),
(56, 'Milho Verde em Conserva Bonare 200g', 'Supermercado Varella', 3.30, 'imgs\\produtos\\conserva\\Milho Verde em Conserva Bonare 200g.png'),
(57, 'Absorvente Always Noturno Seca Leve 8 Pague 7', 'Supermercado Varella', 7.89, 'imgs\\produtos\\absorventes\\Absorvente Always Noturno Seca Leve 8 Pague 7.png'),
(58, 'Absorvente Sempre Livre Adapt Com Abas Agentes Naturais Com 8', 'Supermercado Varella', 4.69, 'imgs\\produtos\\absorventes\\Absorvente Sempre Livre Adapt Com Abas Agentes Naturais Com 8.png'),
(59, 'Absorvente Sempre Livre Especial Suave Leve 16 Pague 14', 'Supermercado Galego', 4.89, 'imgs\\produtos\\absorventes\\Absorvente Sempre Livre Especial Suave Leve 16 Pague 14.png'),
(60, 'Absorvente Sym Girl Com Abas Com 8', 'Supermercado Varella', 2.89, 'imgs\\produtos\\absorventes\\Absorvente Sym Girl Com Abas Com 8.png'),
(61, 'Gel Hidratante Pos Sol Sundown Aloe Vera 130g', 'Supermercado Varella', 29.49, 'imgs\\produtos\\protetorSolar\\Gel Hidratante Pos Sol Sundown Aloe Vera 130g.png'),
(62, 'Locao Doura Pelos 130 G', 'Supermercado Varella', 7.59, 'imgs\\produtos\\protetorSolar\\Locao Doura Pelos 130 G.png'),
(63, 'Protetor Solar Cenoura Bronze FPS 15 200mL', 'Supermercado Silva', 30.97, 'imgs\\produtos\\protetorSolar\\Protetor Solar Cenoura Bronze FPS 15 200mL.png'),
(64, 'Protetor Solar Nivea FPS 15 Protect Bronze 125mL', 'Supermercado Varella', 49.60, 'imgs\\produtos\\protetorSolar\\Protetor Solar Nivea FPS 15 Protect Bronze 125mL.png'),
(65, 'Protetor Solar Sundown Kids FPS 30 Cheirinho de Uva 120mL', 'Supermercado Familia', 44.97, 'imgs\\produtos\\protetorSolar\\Protetor Solar Sundown Kids FPS 30 Cheirinho de Uva 120mL.png'),
(66, 'Protetor Solar Sundown SunBalance FPS 50 120ml', 'Supermercado Varella', 46.99, 'imgs\\produtos\\protetorSolar\\Protetor Solar Sundown SunBalance FPS 50 120ml.png'),
(67, 'Xampu (Shampoo) Clear Limpeza Profunda 200mL', 'Supermercado Galego', 13.45, 'imgs\\produtos\\xampu\\Xampu (Shampoo) Clear Limpeza Profunda 200mL.png'),
(68, 'Xampu (Shampoo) Head Shoulders Anti-Coceira 200mL', 'Supermercado Familia', 15.97, 'imgs\\produtos\\xampu\\Xampu (Shampoo) Head Shoulders Anti-Coceira 200mL.png'),
(69, 'Xampu (Shampoo) Monange Hidratacao Intensa 350mL', 'Supermercado Silva', 5.49, 'imgs\\produtos\\xampu\\Xampu (Shampoo) Monange Hidratacao Intensa 350mL.png'),
(70, 'Xampu (Shampoo) Palmolive Neutro 350mL', 'Supermercado Varella', 5.35, 'imgs\\produtos\\xampu\\Xampu (Shampoo) Palmolive Neutro 350mL.png'),
(71, 'Xampu (Shampoo) Pantene Anti-Residuos 400mL', 'Supermercado Montanha', 18.49, 'imgs\\produtos\\xampu\\Xampu (Shampoo) Pantene Anti-Residuos 400mL.png'),
(72, 'Xampu (Shampoo) Seda Pureza Refrescante 325mL', 'Supermercado Varella', 8.97, 'imgs\\produtos\\xampu\\Xampu (Shampoo) Seda Pureza Refrescante 325mL.png'),
(73, 'Desodorante Axe Aerossol Body Apollo 96g', 'Supermercado Montanha', 13.58, 'imgs\\produtos\\desodorante\\Desodorante Axe Aerossol Body Apollo 96g.png'),
(74, 'Desodorante Dove Aerossol Beauty Finish 100g', 'Supermercado Familia', 15.84, 'imgs\\produtos\\desodorante\\Desodorante Dove Aerossol Beauty Finish 100g.png'),
(75, 'Desodorante Nivea Aerossol Pearl Beauty 150mL', 'Supermercado Familia', 13.15, 'imgs\\produtos\\desodorante\\Desodorante Nivea Aerossol Pearl Beauty 150mL.png'),
(76, 'Desodorante Nivea Roll-On Invisible Black White 50mL', 'Supermercado Montanha', 8.56, 'imgs\\produtos\\desodorante\\Desodorante Nivea Roll-On Invisible Black White 50mL.png'),
(78, 'Desodorante Rexona Aerossol 24 h Active 90g', 'Supermercado Familia', 14.50, 'imgs\\produtos\\desodorante\\Desodorante Rexona Aerossol 24 h Active 90g.png'),
(79, 'Desodorante Rexona Aerossol V8 90g', 'Supermercado Familia', 14.50, 'imgs\\produtos\\desodorante\\Desodorante Rexona Aerossol V8 90g.png'),
(80, 'Amaciante Comfort Concentrado Puro Cuidado 1L', 'Supermercado Familia', 8.97, 'imgs\\produtos\\amaciante\\Amaciante Comfort Concentrado Puro Cuidado 1L.png'),
(81, 'Amaciante Ype Aconchego (Azul) Leve 2000mL Pague 1800mL', 'Supermercado Familia', 4.87, 'imgs\\produtos\\amaciante\\Amaciante Ype Aconchego (Azul) Leve 2000mL Pague 1800mL.png'),
(82, 'Lava Roupa em Po Omo Multiacao 1kg', 'Supermercado Familia', 14.39, 'imgs\\produtos\\amaciante\\Lava Roupa em Po Omo Multiacao 1kg.png'),
(83, 'Lava Roupa em Po Tixan Ype Primavera (Azul Escuro) Caixa 1kg', 'Supermercado Montanha', 5.89, 'imgs\\produtos\\amaciante\\Lava Roupa em Po Tixan Ype Primavera (Azul Escuro) Caixa 1kg.png'),
(84, 'Lava Roupa Liquido Brilhante 3L', 'Supermercado Familia', 16.97, 'imgs\\produtos\\amaciante\\Lava Roupa Liquido Brilhante 3L.png'),
(85, 'Tira Manchas Vanish Pre-Lavagem Resolv 500mL', 'Supermercado Familia', 7.97, 'imgs\\produtos\\amaciante\\Tira Manchas Vanish Pre-Lavagem Resolv 500mL.png'),
(86, 'Algodao Cottonbaby Bola 50g', 'Supermercado Familia', 3.89, 'imgs\\produtos\\algodao\\Algodao Cottonbaby Bola 50g.png'),
(87, 'Hastes Flexiveis Cotonetes Johnson Johnson Com 75', 'Supermercado Familia', 3.57, 'imgs\\produtos\\algodao\\Hastes Flexiveis Cotonetes Johnson Johnson Com 75.png'),
(88, 'Hastes Flexiveis Cottonbaby Com 75', 'Supermercado Familia', 1.59, 'imgs\\produtos\\algodao\\Hastes Flexiveis Cottonbaby Com 75.png'),
(89, 'La De Aco Assolan 60g', 'Supermercado Familia', 1.65, 'imgs\\produtos\\limpezaDeCozinha\\La De Aco Assolan 60g.png'),
(90, 'La de Aco Bombril 60g', 'Supermercado Familia', 2.18, 'imgs\\produtos\\limpezaDeCozinha\\La de Aco Bombril 60g.png'),
(91, 'Lava Louca (Detergente) Ype Neutro 500mL', 'Supermercado Familia', 1.89, 'imgs\\produtos\\limpezaDeCozinha\\Lava Louca (Detergente) Ype Neutro 500mL.png'),
(92, 'Limpador Desengordurante Cif Cozinha 500mL', 'Supermercado Familia', 8.65, 'imgs\\produtos\\limpezaDeCozinha\\Limpador Desengordurante Cif Cozinha 500mL.png'),
(93, 'Limpador Desengordurante Qboa Cozinha 500mL', 'Supermercado Silva', 5.29, 'imgs\\produtos\\limpezaDeCozinha\\Limpador Desengordurante Qboa Cozinha 500mL.png'),
(94, 'Limpador Veja Desengordurante com Pulverizador 500mL', 'Supermercado Galego', 7.75, 'imgs\\produtos\\limpezaDeCozinha\\Limpador Veja Desengordurante com Pulverizador 500mL.png'),
(95, 'Inseticida Aerossol Raid Mata Barata e Formigas 300mL', 'Supermercado Atacadao', 13.67, 'imgs\\produtos\\inseticida\\Inseticida Aerossol Raid Mata Barata e Formigas 300mL.png'),
(96, 'Inseticida Aerossol SBP 300mL + Gratis 150mL', 'Supermercado Familia', 9.97, 'imgs\\produtos\\inseticida\\Inseticida Aerossol SBP 300mL + Gratis 150mL.png'),
(97, 'Pastilha Para Repelente Eletrico Raid Eucalipto Leve 12 Pague 10', 'Supermercado Varella', 3.97, 'imgs\\produtos\\inseticida\\Pastilha Para Repelente Eletrico Raid Eucalipto Leve 12 Pague 10.png'),
(98, 'Repelente Aerossol Off! Family 165mL', 'Supermercado Varella', 21.45, 'imgs\\produtos\\inseticida\\Repelente Aerossol Off! Family 165mL.png'),
(99, 'Repelente Locao Off! Aloe Vera 100mL', 'Supermercado Atacadao', 16.45, 'imgs\\produtos\\inseticida\\Repelente Locao Off! Aloe Vera 100mL.png'),
(100, 'Repelente Spray Off! Family 200mL', 'Supermercado Atacadao', 27.45, 'imgs\\produtos\\inseticida\\Repelente Spray Off! Family 200mL.png'),
(101, 'Alface Americana Verd Facil Pra mim Embalagem 100g', 'Supermercado Silva', 3.48, 'imgs\\produtos\\alface\\Alface Americana Verd Facil Pra mim Embalagem 100g.png'),
(102, 'Alface Americana Verde Vale Embalagem 150g', 'Supermercado Galego', 3.49, 'imgs\\produtos\\alface\\Alface Americana Verde Vale Embalagem 150g.png'),
(103, 'Alface Crespa Beija Flor Organica Embalagem', 'Supermercado Varella', 2.58, 'imgs\\produtos\\alface\\Alface Crespa Beija Flor Organica Embalagem.png'),
(104, 'Arroz Branco Kiarroz 1kg', 'Supermercado Silva', 4.50, 'imgs\\produtos\\arroz\\Arroz Branco Kiarroz 1kg.png'),
(105, 'Arroz Branco Tio Joao 1kg', 'Supermercado atacadao', 2.39, 'imgs\\produtos\\arroz\\Arroz Branco Tio Joao 1kg.png'),
(106, 'Arroz Parbolizado Kiarroz 1kg', 'Supermercado Familia', 3.15, 'imgs\\produtos\\arroz\\Arroz Parbolizado Kiarroz 1kg.png'),
(107, 'Arroz Parbolizado Kiarroz 5kg', 'Supermercado Varella', 15.25, 'imgs\\produtos\\arroz\\Arroz Parbolizado Kiarroz 5kg.png'),
(108, 'Arroz Parbolizado Urbano 1kg', 'Supermercado Familia', 3.09, 'imgs\\produtos\\arroz\\Arroz Parbolizado Urbano 1kg.png'),
(109, 'Oleo de Canola Salada 900mL', 'Supermercado Varella', 6.75, 'imgs\\produtos\\azeites\\Oleo de Canola Salada 900mL.png'),
(110, 'Oleo de Girassol Liza 900mL', 'Supermercado atacadao', 6.59, 'imgs\\produtos\\azeites\\Oleo de Girassol Liza 900mL.png'),
(111, 'Oleo de Girassol Salada 900mL', 'Supermercado Familia', 7.99, 'imgs\\produtos\\azeites\\Oleo de Girassol Salada 900mL.png'),
(112, 'Oleo de Soja Primor 900mL', 'Supermercado Familia', 5.98, 'imgs\\produtos\\azeites\\Oleo de Soja Primor 900mL.png'),
(113, 'Biscoito Bauducco Cookies Chocco 105g', 'Supermercado atacadao', 3.37, 'imgs\\produtos\\biscoitos\\Biscoito Bauducco Cookies Chocco 105g.png'),
(114, 'Biscoito Isabela Tortinhas Chocolate 160g', 'Supermercado Familia', 1.97, 'imgs\\produtos\\biscoitos\\Biscoito Isabela Tortinhas Chocolate 160g.png'),
(115, 'Biscoito Nestle Recheado Negresco 140g', 'Supermercado Familia', 2.27, 'imgs\\produtos\\biscoitos\\Biscoito Nestle Recheado Negresco 140g.png'),
(116, 'Biscoito Nestle Recheado Passatempo Chocolate 130g', 'Supermercado Varella', 1.39, 'imgs\\produtos\\biscoitos\\Biscoito Nestle Recheado Passatempo Chocolate 130g.png'),
(117, 'Cerveja Antarctica Original Garrafa Descartavel 600mL', 'Supermercado Varella', 6.89, 'imgs\\produtos\\cervejas\\Cerveja Antarctica Original Garrafa Descartavel 600mL.png'),
(118, 'Cerveja Eisenbahn Strong Golden 355mL', 'Supermercado atacadao', 9.89, 'imgs\\produtos\\cervejas\\Cerveja Eisenbahn Strong Golden 355mL.png'),
(119, 'Cerveja Heineken Garrafa Descartavel 600mL', 'Supermercado Familia', 8.25, 'imgs\\produtos\\cervejas\\Cerveja Heineken Garrafa Descartavel 600mL.png'),
(120, 'Carne Alcatra Medalhao Embalagem 0.75kg', 'Supermercado atacadao', 24.44, 'imgs\\produtos\\carnes\\Alcatra Medalhao Embalagem 0.75kg.png'),
(121, 'Carne Moida De Coxao Mole Embalagem 0.6kg', 'Supermercado Montanha', 18.62, 'imgs\\produtos\\carnes\\Carne Moida De Coxao Mole Embalagem 0.6kg.png'),
(122, 'Carne File Mignon Medalhao Embalagem 0.7kg', 'Supermercado Montanha', 34.63, 'imgs\\produtos\\carnes\\File Mignon Medalhao Embalagem 0.7kg.png'),
(123, 'Carne Pernil Suino D Italia Sem Tempero Embalagem Resfriado 1.2kg', 'Supermercado Familia', 13.17, 'imgs\\produtos\\carnes\\Pernil Suino D Italia Sem Tempero Embalagem Resfriado 1.2kg.png'),
(124, 'Mistura para Bolo Dona Benta Chocolate 450g', 'Supermercado atacadao', 5.19, 'imgs\\produtos\\bolos\\Mistura para Bolo Dona Benta Chocolate 450g.png'),
(125, 'Mistura para Bolo Dr. Oetker Bolo de Caneca Chocolate 70g', 'Supermercado Silva', 6.50, 'imgs\\produtos\\bolos\\Mistura para Bolo Dr. Oetker Bolo de Caneca Chocolate 70g.png'),
(126, 'Mistura para Bolo Orquidea Chocolate 400g', 'Supermercado Varella', 2.58, 'imgs\\produtos\\bolos\\Mistura para Bolo Orquidea Chocolate 400g.png'),
(127, 'Mistura para Bolo Orquidea Laranja 400g', 'Supermercado Galego', 2.58, 'imgs\\produtos\\bolos\\Mistura para Bolo Orquidea Laranja 400g.png'),
(128, 'Agua Mineral com Gas Crystal 1,5L', 'Supermercado Familia', 1.99, 'imgs\\produtos\\agua\\Agua Mineral com Gas Crystal 1,5L.png'),
(129, 'Agua Mineral com Gas Imperatriz 1,5L', 'Supermercado Familia', 2.99, 'imgs\\produtos\\agua\\Agua Mineral com Gas Imperatriz 1,5L.png'),
(130, 'Agua Mineral com Gas Schin 1,5L', 'Supermercado Silva', 2.99, 'imgs\\produtos\\agua\\Agua Mineral com Gas Schin 1,5L.png'),
(131, 'Agua Mineral sem Gas Crystal 1,5L', 'Supermercado Galego', 1.99, 'imgs\\produtos\\agua\\Agua Mineral sem Gas Crystal 1,5L.png'),
(132, 'Agua Mineral sem Gas Crystal 500mL', 'Supermercado Atacadao', 1.37, 'imgs\\produtos\\agua\\Agua Mineral sem Gas Crystal 500mL.png'),
(133, 'Agua Mineral sem Gas Imperatriz 5 Litros', 'Supermercado Varella', 5.79, 'imgs\\produtos\\agua\\Agua Mineral sem Gas Imperatriz 5 Litros.png');


/*(126, 'Leiteoraegralong', 'Supermercado Familia', 99999995, 'imgs\\produtos\\bolos\\Leitekdsmkfkjsdnfjda.png'),
(127, 'Leiteoraegralong', 'Supermercado Familia', 99999995, 'imgs\\produtos\\bolos\\Leitekdsmkfkjsdnfjda.png'),
(124, 'Leiteoraegralong', 'Supermercado Familia', 99999995, 'imgs\\produtos\\bolos\\Leitekdsmkfkjsdnfjda.png'),
(125, 'Leiteoraegralong', 'Supermercado Familia', 99999995, 'imgs\\produtos\\bolos\\Leitekdsmkfkjsdnfjda.png'),
(126, 'Leiteoraegralong', 'Supermercado Familia', 99999995, 'imgs\\produtos\\bolos\\Leitekdsmkfkjsdnfjda.png'),
(127, 'Leiteoraegralong', 'Supermercado Familia', 99999995, 'imgs\\produtos\\bolos\\Leitekdsmkfkjsdnfjda.png'),*/


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





