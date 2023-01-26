 -- phpMyAdmin SQL Dump
 -- version 5.0.3
 -- https://www.phpmyadmin.net/
 --
 -- Host: localhost
 -- Generation Time: Jan 20, 2023 at 03:13 PM
 -- Server version: 10.4.14-MariaDB
 -- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--
CREATE DATABASE IF NOT EXISTS `library` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `library`;

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
`id` int(11) NOT NULL,
`bookid` int(11) NOT NULL,
`costumerid` int(11) NOT NULL,
`loaned` date NOT NULL,
`returned` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`id`, `bookid`, `costumerid`, `loaned`, `returned`) VALUES
(2, 2, 1, '2023-01-01', '2023-01-07'),
(3, 2, 1, '2023-01-01', '2023-01-07'),
(4, 2, 1, '2023-01-01', '2023-01-07');

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
 `id` int(11) NOT NULL,
 `name` varchar(50) NOT NULL,
 `author` varchar(50) NOT NULL,
 `description` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `name`, `author`, `description`) VALUES
(2, 'Lorem', 'Flakron Ademi', 'Lorem ipsum dolor sit amet,'),
(3, 'Ipsum', 'Flakron Ademi', 'consectetur adipiscing elit'),
(4, 'Dolor', 'Driton Adili', 'ed do eiusmod tempor incididun'),
(5, 'Sit', 'Driton Adili', 'Ut enim ad minim'),
(6, 'Elit', 'Flakron Driton', 'quis nostrud exercitation ullamco labori');

-- --------------------------------------------------------

--
-- Table structure for table `costumer`
--

CREATE TABLE `costumer` (
                            `id` int(11) NOT NULL,
                            `name` varchar(50) NOT NULL,
                            `surname` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `costumer`
--

INSERT INTO `costumer` (`id`, `name`, `surname`) VALUES
(1, 'Flakron', 'Ademi'),
(2, 'Driton', 'Ademi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
    ADD PRIMARY KEY (`id`),
    ADD KEY `bookid` (`bookid`),
    ADD KEY `costumerid` (`costumerid`);

--
-- Indexes for table `books`
--
ALTER TABLE `books`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `costumer`
--
ALTER TABLE `costumer`
    ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `costumer`
--
ALTER TABLE `costumer`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
    ADD CONSTRAINT `booking_ibfk_1` FOREIGN KEY (`bookid`) REFERENCES `books` (`id`),
    ADD CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`costumerid`) REFERENCES `costumer` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
