-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 06, 2018 at 02:56 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mspace1`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`id` int(10) unsigned NOT NULL,
  `RecordNo` varchar(20) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Sex` varchar(20) DEFAULT NULL,
  `Dob` date DEFAULT NULL,
  `Course_Name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `RecordNo`, `Name`, `Age`, `Sex`, `Dob`, `Course_Name`) VALUES
(1, '1', 'Kamau', 20, 'Male', '1998-06-16', 'Computer Science'),
(2, '2', 'Meshack', 23, 'Male', '1996-03-12', 'IT'),
(3, '3', 'Simiyu', 22, 'Female', '1996-01-09', 'Businesss Adminstration'),
(4, '4', 'Sophia', 20, 'Female', '1998-01-07', 'Computer Science'),
(7, '7', 'Mwangi', 23, 'Male', '1995-01-15', 'Computer Science'),
(9, '9', 'Oliech', 21, 'Male', '1997-01-13', 'IT'),
(10, '10', 'Richard', 21, 'Male', '1997-01-07', 'Supply Chain'),
(11, '11', 'Jack', 21, 'Male', '1997-01-01', 'Law'),
(13, '13', 'Patrick', 19, 'Male', '1999-01-06', 'Agriculture'),
(14, '14', 'Amisa', 21, 'Female', '1997-01-17', 'Computer Science'),
(15, '15', 'Matanda', 22, 'Male', '1996-01-23', 'Horticulture'),
(16, '16', 'Rose', 23, 'Female', '1995-01-18', 'Engineering'),
(17, '17', 'Sally', 21, 'Female', '1996-01-24', 'IT'),
(18, '18', 'Douglas', 22, 'Male', '1996-01-24', 'Business Adminstration'),
(26, '19', 'Sabini', 20, 'Female', '1998-01-21', 'Food Science'),
(27, '27', 'Mohammed', 24, 'Male', '1994-10-19', 'Computer Science'),
(28, '28', 'Sita', 23, 'Female', '1995-02-22', 'Computer Science'),
(29, '29', 'Andrew', 23, 'Male', '1995-12-28', 'Computer Science');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=30;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
