-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-11-2023 a las 08:30:18
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `torneodefutbol`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gestionar_calificaciones`
--

CREATE TABLE `gestionar_calificaciones` (
  `Documento` int(10) NOT NULL,
  `puntaje_promedio` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gestionar_equipos`
--

CREATE TABLE `gestionar_equipos` (
  `Nombre` varchar(70) NOT NULL,
  `Documento` int(10) NOT NULL,
  `Modo` varchar(70) NOT NULL,
  `Suscripcion` varchar(70) NOT NULL,
  `Id_partido` int(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gestionar_infraccion`
--

CREATE TABLE `gestionar_infraccion` (
  `Documento` int(10) NOT NULL,
  `Motivo` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gestionar_partidos`
--

CREATE TABLE `gestionar_partidos` (
  `Id` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Estado` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugadores_selcolombia`
--

CREATE TABLE `jugadores_selcolombia` (
  `Nombre` varchar(70) NOT NULL,
  `Apellido` varchar(70) NOT NULL,
  `Documento` int(10) NOT NULL,
  `Telefono` varchar(70) NOT NULL,
  `Correo` varchar(70) NOT NULL,
  `Posicion` varchar(70) NOT NULL,
  `Modo` varchar(70) NOT NULL,
  `Suscripcion` varchar(70) NOT NULL,
  `Usuario` varchar(40) NOT NULL,
  `Contraseña` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `jugadores_selcolombia`
--

INSERT INTO `jugadores_selcolombia` (`Nombre`, `Apellido`, `Documento`, `Telefono`, `Correo`, `Posicion`, `Modo`, `Suscripcion`, `Usuario`, `Contraseña`) VALUES
('Luis', 'Diaz', 1001, '322401', 'luisdiaz01@selcolombia.com', 'Volante', 'ESTANDAR', 'FRECUENTE', '', ''),
('Wilmar', 'Barrios', 1002, '322402', 'wilmarbarrios02@selcolombia.com', 'Volante', 'ESTANDAR', 'FRECUENTE', '', ''),
('Davinson ', 'Sanchez', 1003, '322403', 'davinsonsanchez03@selcolombia.com', 'Defensa', 'ESTANDAR', 'FRECUENTE', '', ''),
('Yerry', 'Mina', 1004, '322404', 'yerrymina04@selcolombia.com', 'Defensa', 'ESTANDAR', 'FRECUENTE', '', ''),
('David ', 'Ospina', 1005, '322405', 'davidospina05@selcolombia.com', 'Arquero', 'ESTANDAR', 'FRECUENTE', '', ''),
('Camilo', 'Vargas', 1006, '322406', 'camilovargas06@selcolombia.com', 'Arquero', 'ESTANDAR', 'FRECUENTE', '', ''),
('Stefan', 'Medina', 1007, '322407', 'stefanmedina07@selcolombia.com', 'Lateral', 'ESTANDAR', 'FRECUENTE', '', ''),
('Frank', 'Fabra', 1008, '322408', 'frankfabra08@selcolombia.com', 'Lateral', 'ESTANDAR', 'FRECUENTE', '', ''),
('Juan', 'Quintero', 1009, '322409', 'juanquintero09@selcolombia.com', 'Volante', 'ESTANDAR', 'FRECUENTE', '', ''),
('James', 'Rodriguez', 1010, '322410', 'jamesrodriguez10@selcolombia.com', 'Volante', 'ESTANDAR', 'FRECUENTE', '', ''),
('Matheus', 'Uribe', 1011, '322411', 'matheusuribe11@selcolombia.com', 'Volante', 'SOLIDARIO', 'OCASIONAL', '', ''),
('Radamel', 'Falcao', 1012, '322412', 'radamelfalcao12@selcolombia.com', 'Delantero', 'SOLIDARIO', 'OCASIONAL', '', ''),
('Rafael', 'Borre', 1013, '322413', 'rafaelborre13@selcolombia.com', 'Delantero', 'SOLIDARIO', 'OCASIONAL', '', ''),
('Luis', 'Muriel', 1014, '322414', 'luismuriel14@selcolombia.com', 'Delantero', 'SOLIDARIO', 'OCASIONAL', '', ''),
('Miguel', 'Borja', 1015, '322415', 'miguelborja15@selcolombia.com', 'Delantero', 'SOLIDARIO', 'OCASIONAL', '', ''),
('Duvan', 'Zapata', 1016, '322416', 'duvanzapata16@selcolombia.com', 'Delantero', 'SOLIDARIO', 'OCASIONAL', '', ''),
('Edwin ', 'Cardona', 1017, '322417', 'edwincardona17@selcolombia.com', 'Volante', 'SOLIDARIO', 'OCASIONAL', '', ''),
('Yimmi', 'Chara', 1018, '322418', 'yimmichara18@selcolombia.com', 'Volante', 'SOLIDARIO', 'OCASIONAL', '', ''),
('Santiago', 'Arias', 1019, '322419', 'santiagoarias19@selcolombia.com', 'Lateral', 'SOLIDARIO', 'OCASIONAL', '', ''),
('Abel', 'Aguilar', 1020, '322420', 'abelaguilar20@selcolombia.com', 'Volante', 'SOLIDARIO', 'OCASIONAL', '', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `gestionar_partidos`
--
ALTER TABLE `gestionar_partidos`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `gestionar_partidos`
--
ALTER TABLE `gestionar_partidos`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
