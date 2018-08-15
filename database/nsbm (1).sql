-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 15, 2018 at 09:10 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nsbm`
--

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusiness`
--

CREATE TABLE `schoolofbusiness` (
  `regid` int(4) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `age` int(2) NOT NULL,
  `nic` varchar(25) NOT NULL,
  `address` varchar(30) NOT NULL,
  `email` varchar(25) DEFAULT NULL,
  `tel` int(15) DEFAULT NULL,
  `gender` varchar(10) NOT NULL,
  `intakeyear` int(4) DEFAULT NULL,
  `intakemonth` varchar(10) NOT NULL,
  `A/Lindex` int(12) NOT NULL,
  `zscore` double NOT NULL,
  `accounting` varchar(2) NOT NULL,
  `econ` varchar(2) NOT NULL,
  `businessstudies` varchar(2) NOT NULL,
  `english` varchar(2) NOT NULL,
  `qualificationlevel` varchar(20) NOT NULL,
  `qualificationtype` varchar(50) DEFAULT NULL,
  `institute` varchar(50) DEFAULT NULL,
  `yearofcomplete` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schoolofbusiness`
--

INSERT INTO `schoolofbusiness` (`regid`, `firstname`, `lastname`, `age`, `nic`, `address`, `email`, `tel`, `gender`, `intakeyear`, `intakemonth`, `A/Lindex`, `zscore`, `accounting`, `econ`, `businessstudies`, `english`, `qualificationlevel`, `qualificationtype`, `institute`, `yearofcomplete`) VALUES
(4, 'manoj', 'maushanka', 23, '950851694v', 'kankanamge watte dodampe talpe', 'abc@123', 715147270, 'Male', 2018, 'February', 27549375, 2.3, 'A', 'A', 'A', 'A', 'Undergraduate', 'no', 'no', 2020),
(5, 'manoj', 'madushanka', 22, '950851694v', 'gvfbviurewbv', 'rntrhnryunhdf', 715147270, 'Male', 2018, 'February', 7356876, 2.1, 'A', 'A', 'A', 'A', 'Undergraduate', 'no', 'no', 2020),
(6, 'Kasun', 'Wathsala', 22, '957641634v', 'elathota,galle', 'rgrtgjvjrt', 716253157, 'Male', 2018, 'February', 3456457, 1.6, 'A', 'A', 'A', 'A', 'Undergraduate', 'no', 'no', 2022),
(7, 'htntr', 'ejrj', 34, '5646667', 'rgnfmfjgm', 'dyumytm', 6475757, 'Male', 2345, 'February', 465767, 3.2, 'A', 'A', 'A', 'A', 'Undergraduate', 'nhn', 'hn', 24444),
(8, 'trhsrth', 'srh', 45, 'dnh', 'lyil', 'ltlyu', 6867, 'Male', 2019, 'February', 45765, 5.3, 'A', 'A', 'A', 'A', 'Undergraduate', 'n', 'n', 2565),
(9, 'test', 'test', 21, '245534', 'test', 'test', 35464, 'Male', 2017, 'February', 435, 2.1, 'A', 'A', 'A', 'A', 'Undergraduate', 'n', 'n', 2021),
(10, 'test1', 'test1', 33, '5', 'test1', 'test1', 4554, 'Male', 2017, 'February', 43333, 2.1, 'A', 'A', 'A', 'A', 'Undergraduate', 'n', 'n', 2021),
(11, 'tj', 'yt', 34, '565r', 'jy', 'mty', 46768, 'Male', 2016, 'February', 5678578, 4.5, 'A', 'A', 'A', 'A', 'Undergraduate', 'no', 'no', 2020),
(12, 'rtgrt', 'thrthret', 44, '34t', 'ehety', 'hrh', 4765, 'Male', 2018, 'February', 545, 2.3, 'A', 'A', 'A', 'A', 'Undergraduate', 'n', 'n', 2019);

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesslecturers`
--

CREATE TABLE `schoolofbusinesslecturers` (
  `lecid` int(3) NOT NULL,
  `fullname` varchar(250) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `NIC` varchar(15) DEFAULT NULL,
  `subject` varchar(400) NOT NULL,
  `teachingyear` varchar(100) DEFAULT NULL,
  `degree` varchar(100) NOT NULL,
  `university` varchar(150) NOT NULL,
  `experiance` varchar(250) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schoolofbusinesslecturers`
--

INSERT INTO `schoolofbusinesslecturers` (`lecid`, `fullname`, `name`, `NIC`, `subject`, `teachingyear`, `degree`, `university`, `experiance`, `phone`, `email`, `address`) VALUES
(1, 'wge', 'gg', 'dger', 'dbtghd', 'herg', 'rege', 'hdfg', 'dger', 'aeea', 'eah', 're');

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinessresults`
--

CREATE TABLE `schoolofbusinessresults` (
  `resultid` int(3) NOT NULL,
  `regid` int(3) NOT NULL,
  `stname` varchar(150) NOT NULL,
  `semester` int(2) NOT NULL,
  `year` int(2) NOT NULL,
  `sub1` varchar(150) NOT NULL,
  `sub1mark` int(3) NOT NULL,
  `sub1result` varchar(2) NOT NULL,
  `sub2` varchar(150) NOT NULL,
  `sub2mark` int(3) NOT NULL,
  `sub2result` varchar(2) NOT NULL,
  `sub3` varchar(150) NOT NULL,
  `sub3mark` int(3) NOT NULL,
  `sub3result` varchar(2) NOT NULL,
  `sub4` varchar(150) NOT NULL,
  `sub4mark` int(3) NOT NULL,
  `sub4result` varchar(2) NOT NULL,
  `sub5` varchar(150) NOT NULL,
  `sub5mark` int(3) NOT NULL,
  `sub5result` varchar(2) NOT NULL,
  `sub6` varchar(150) NOT NULL,
  `sub6mark` int(3) NOT NULL,
  `sub6result` varchar(2) NOT NULL,
  `sub7` varchar(150) NOT NULL,
  `sub7mark` int(3) NOT NULL,
  `sub7result` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schoolofbusinessresults`
--

INSERT INTO `schoolofbusinessresults` (`resultid`, `regid`, `stname`, `semester`, `year`, `sub1`, `sub1mark`, `sub1result`, `sub2`, `sub2mark`, `sub2result`, `sub3`, `sub3mark`, `sub3result`, `sub4`, `sub4mark`, `sub4result`, `sub5`, `sub5mark`, `sub5result`, `sub6`, `sub6mark`, `sub6result`, `sub7`, `sub7mark`, `sub7result`) VALUES
(1, 4, 'manoj madushanka', 1, 1, 'Management Process', 55, 'B-', 'Business Communication', 55, 'B-', 'Financial Accounting', 55, 'B-', 'Economics for Managers', 55, 'B-', 'Item1', 66, 'B-', 'Item1', 66, 'B+', 'Item1', 66, 'B+');

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesssem1year1`
--

CREATE TABLE `schoolofbusinesssem1year1` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schoolofbusinesssem1year1`
--

INSERT INTO `schoolofbusinesssem1year1` (`stid`, `stname`, `sub1`, `sub1lec`, `sub1credit`, `sub1amount`, `sub2`, `sub2lec`, `sub2credit`, `sub2amount`, `sub3`, `sub3lec`, `sub3credit`, `sub3amount`, `sub4`, `sub4lec`, `sub4credit`, `sub4amount`, `sub5`, `sub5lec`, `sub5credit`, `sub5amount`, `sub6`, `sub6lec`, `sub6credit`, `sub6amount`, `sub7`, `sub7lec`, `sub7credit`, `sub7amount`, `regid`, `totalcredit`, `paymentvalue`, `sub1result`, `sub2result`, `sub3result`, `sub4result`, `sub5result`, `sub6result`, `sub7result`) VALUES
(1, 'manoj madushanka', 'Management Process', 'Dr.Jayantha Silva', 7, 2500, 'Business Communication', 'Dr. Sarath Fonseka', 7, 2500, 'Financial Accounting', 'Dr. Saman Randunu', 7, 3000, 'Economics for Managers', 'Dr.Duminda Samarakoon', 3, 2500, 'Item1', 'Dr.Test', 3, 2500, 'Item1', 'Dr.Test', 2, 2500, 'Item1', 'Dr.Text', 3, 2500, 4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, 'ertgtr', 'Management Process', 'Dr. Jayantha Silva', 3, 3000, 'Business Comunication', 'Dr. Sarath Fonseka', 3, 3000, 'Financial Accounting', 'Dr. Saman Randunu', 3, 3000, 'BY1S1Item1', 'Dr. Warnakulasooriya', 2, 2500, 'BY1S1Item1', 'Dr. Premadasa', 2, 2500, 'BY1S1Item1', 'Dr. Tissera', 2, 2500, 'BY1S1Item1', 'Dr. Arumapperuma', 2, 2500, 12, 17, 19000, 'pending', 'pending', 'pending', 'pending', 'pending', 'pending', 'pending');

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesssem1year2`
--

CREATE TABLE `schoolofbusinesssem1year2` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesssem1year3`
--

CREATE TABLE `schoolofbusinesssem1year3` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesssem1year4`
--

CREATE TABLE `schoolofbusinesssem1year4` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesssem2year1`
--

CREATE TABLE `schoolofbusinesssem2year1` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesssem2year2`
--

CREATE TABLE `schoolofbusinesssem2year2` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesssem2year3`
--

CREATE TABLE `schoolofbusinesssem2year3` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesssem2year4`
--

CREATE TABLE `schoolofbusinesssem2year4` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofbusinesstimetable`
--

CREATE TABLE `schoolofbusinesstimetable` (
  `subjectid` int(3) NOT NULL,
  `subjectname` varchar(150) NOT NULL,
  `location` varchar(100) NOT NULL,
  `time` varchar(15) NOT NULL,
  `year` int(4) NOT NULL,
  `sem` int(2) NOT NULL,
  `day` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schoolofbusinesstimetable`
--

INSERT INTO `schoolofbusinesstimetable` (`subjectid`, `subjectname`, `location`, `time`, `year`, `sem`, `day`) VALUES
(3, 'ff', 'ff', '8.00-10.00', 1, 1, 'Wednesday'),
(4, 'gf', 'fg', '8.00-10.00', 1, 1, 'Friday'),
(5, 'k', 'uk', '8.00-10.00', 1, 1, 'Thursday'),
(7, 'e', 'e', '8.00-10.00', 1, 2, 'Monday'),
(8, 'fh', 'dfg', '8.00-10.00', 3, 1, 'Monday');

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputing`
--

CREATE TABLE `schoolofcomputing` (
  `regid` int(4) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `age` int(2) NOT NULL,
  `nic` varchar(25) NOT NULL,
  `address` varchar(30) NOT NULL,
  `email` varchar(25) DEFAULT NULL,
  `tel` int(15) DEFAULT NULL,
  `gender` varchar(10) NOT NULL,
  `intakeyear` int(4) DEFAULT NULL,
  `intakemonth` varchar(10) NOT NULL,
  `A/Lindex` int(12) NOT NULL,
  `zscore` double NOT NULL,
  `mathematics` varchar(2) NOT NULL,
  `physics` varchar(2) NOT NULL,
  `chemistry` varchar(2) NOT NULL,
  `english` varchar(2) NOT NULL,
  `qualificationlevel` varchar(20) NOT NULL,
  `qualificationtype` varchar(50) DEFAULT NULL,
  `institute` varchar(50) DEFAULT NULL,
  `yearofcomplete` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schoolofcomputing`
--

INSERT INTO `schoolofcomputing` (`regid`, `firstname`, `lastname`, `age`, `nic`, `address`, `email`, `tel`, `gender`, `intakeyear`, `intakemonth`, `A/Lindex`, `zscore`, `mathematics`, `physics`, `chemistry`, `english`, `qualificationlevel`, `qualificationtype`, `institute`, `yearofcomplete`) VALUES
(4, 'manoj', 'maushanka', 23, '950851694v', 'kankanamge watte dodampe talpe', 'abc@123', 715147270, 'Male', 2018, 'February', 27549375, 2.3, 'A', 'A', 'A', 'A', 'Undergraduate', 'no', 'no', 2020);

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputinglecturers`
--

CREATE TABLE `schoolofcomputinglecturers` (
  `lecid` int(3) NOT NULL,
  `fullname` varchar(250) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `NIC` varchar(15) DEFAULT NULL,
  `subject` varchar(400) NOT NULL,
  `teachingyear` varchar(100) DEFAULT NULL,
  `degree` varchar(100) NOT NULL,
  `university` varchar(150) NOT NULL,
  `experiance` varchar(250) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schoolofcomputinglecturers`
--

INSERT INTO `schoolofcomputinglecturers` (`lecid`, `fullname`, `name`, `NIC`, `subject`, `teachingyear`, `degree`, `university`, `experiance`, `phone`, `email`, `address`) VALUES
(0, 'hser', 'shsrth', '456', 'gfn', '1', 'hrs', 'sth', 'fgh', '64563', 'hsdh', 'shs');

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingresults`
--

CREATE TABLE `schoolofcomputingresults` (
  `resultid` int(3) NOT NULL,
  `regid` int(3) NOT NULL,
  `stname` varchar(150) NOT NULL,
  `semester` int(2) NOT NULL,
  `year` int(2) NOT NULL,
  `sub1` varchar(150) NOT NULL,
  `sub1mark` int(3) NOT NULL,
  `sub1result` varchar(2) NOT NULL,
  `sub2` varchar(150) NOT NULL,
  `sub2mark` int(3) NOT NULL,
  `sub2result` varchar(2) NOT NULL,
  `sub3` varchar(150) NOT NULL,
  `sub3mark` int(3) NOT NULL,
  `sub3result` varchar(2) NOT NULL,
  `sub4` varchar(150) NOT NULL,
  `sub4mark` int(3) NOT NULL,
  `sub4result` varchar(2) NOT NULL,
  `sub5` varchar(150) NOT NULL,
  `sub5mark` int(3) NOT NULL,
  `sub5result` varchar(2) NOT NULL,
  `sub6` varchar(150) NOT NULL,
  `sub6mark` int(3) NOT NULL,
  `sub6result` varchar(2) NOT NULL,
  `sub7` varchar(150) NOT NULL,
  `sub7mark` int(3) NOT NULL,
  `sub7result` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingsem1year1`
--

CREATE TABLE `schoolofcomputingsem1year1` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingsem1year2`
--

CREATE TABLE `schoolofcomputingsem1year2` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingsem1year3`
--

CREATE TABLE `schoolofcomputingsem1year3` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingsem1year4`
--

CREATE TABLE `schoolofcomputingsem1year4` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingsem2year1`
--

CREATE TABLE `schoolofcomputingsem2year1` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingsem2year2`
--

CREATE TABLE `schoolofcomputingsem2year2` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingsem2year3`
--

CREATE TABLE `schoolofcomputingsem2year3` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingsem2year4`
--

CREATE TABLE `schoolofcomputingsem2year4` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofcomputingtimetable`
--

CREATE TABLE `schoolofcomputingtimetable` (
  `subjectid` int(3) NOT NULL,
  `subjectname` varchar(150) NOT NULL,
  `location` varchar(150) NOT NULL,
  `time` varchar(10) NOT NULL,
  `year` int(2) NOT NULL,
  `sem` int(2) NOT NULL,
  `day` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineering`
--

CREATE TABLE `schoolofengineering` (
  `regid` int(4) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `age` int(2) NOT NULL,
  `nic` varchar(25) NOT NULL,
  `address` varchar(30) NOT NULL,
  `email` varchar(25) DEFAULT NULL,
  `tel` int(15) DEFAULT NULL,
  `gender` varchar(10) NOT NULL,
  `intakeyear` int(4) DEFAULT NULL,
  `intakemonth` varchar(10) NOT NULL,
  `A/Lindex` int(12) NOT NULL,
  `zscore` double NOT NULL,
  `mathematics` varchar(2) NOT NULL,
  `physics` varchar(2) NOT NULL,
  `chemistry` varchar(2) NOT NULL,
  `english` varchar(2) NOT NULL,
  `qualificationlevel` varchar(20) NOT NULL,
  `qualificationtype` varchar(50) DEFAULT NULL,
  `institute` varchar(50) DEFAULT NULL,
  `yearofcomplete` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringlecturers`
--

CREATE TABLE `schoolofengineeringlecturers` (
  `lecid` int(3) NOT NULL,
  `fullname` varchar(250) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `NIC` varchar(15) DEFAULT NULL,
  `subject` varchar(400) NOT NULL,
  `teachingyear` varchar(100) DEFAULT NULL,
  `degree` varchar(100) NOT NULL,
  `university` varchar(150) NOT NULL,
  `experiance` varchar(250) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringresults`
--

CREATE TABLE `schoolofengineeringresults` (
  `resultid` int(3) NOT NULL,
  `regid` int(3) NOT NULL,
  `stname` varchar(150) NOT NULL,
  `semester` int(2) NOT NULL,
  `year` int(2) NOT NULL,
  `sub1` varchar(150) NOT NULL,
  `sub1mark` int(3) NOT NULL,
  `sub1result` varchar(2) NOT NULL,
  `sub2` varchar(150) NOT NULL,
  `sub2mark` int(3) NOT NULL,
  `sub2result` varchar(2) NOT NULL,
  `sub3` varchar(150) NOT NULL,
  `sub3mark` int(3) NOT NULL,
  `sub3result` varchar(2) NOT NULL,
  `sub4` varchar(150) NOT NULL,
  `sub4mark` int(3) NOT NULL,
  `sub4result` varchar(2) NOT NULL,
  `sub5` varchar(150) NOT NULL,
  `sub5mark` int(3) NOT NULL,
  `sub5result` varchar(2) NOT NULL,
  `sub6` varchar(150) NOT NULL,
  `sub6mark` int(3) NOT NULL,
  `sub6result` varchar(2) NOT NULL,
  `sub7` varchar(150) NOT NULL,
  `sub7mark` int(3) NOT NULL,
  `sub7result` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringsem1year1`
--

CREATE TABLE `schoolofengineeringsem1year1` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringsem1year2`
--

CREATE TABLE `schoolofengineeringsem1year2` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringsem1year3`
--

CREATE TABLE `schoolofengineeringsem1year3` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringsem1year4`
--

CREATE TABLE `schoolofengineeringsem1year4` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringsem2year1`
--

CREATE TABLE `schoolofengineeringsem2year1` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringsem2year2`
--

CREATE TABLE `schoolofengineeringsem2year2` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringsem2year3`
--

CREATE TABLE `schoolofengineeringsem2year3` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringsem2year4`
--

CREATE TABLE `schoolofengineeringsem2year4` (
  `stid` int(3) NOT NULL,
  `stname` varchar(100) NOT NULL,
  `sub1` varchar(60) NOT NULL,
  `sub1lec` varchar(60) NOT NULL,
  `sub1credit` int(2) NOT NULL,
  `sub1amount` int(4) NOT NULL,
  `sub2` varchar(60) NOT NULL,
  `sub2lec` varchar(60) NOT NULL,
  `sub2credit` int(2) NOT NULL,
  `sub2amount` int(4) NOT NULL,
  `sub3` varchar(60) NOT NULL,
  `sub3lec` varchar(60) NOT NULL,
  `sub3credit` int(2) NOT NULL,
  `sub3amount` int(4) NOT NULL,
  `sub4` varchar(60) NOT NULL,
  `sub4lec` varchar(60) NOT NULL,
  `sub4credit` int(2) NOT NULL,
  `sub4amount` int(4) NOT NULL,
  `sub5` varchar(60) NOT NULL,
  `sub5lec` varchar(60) NOT NULL,
  `sub5credit` int(2) NOT NULL,
  `sub5amount` int(4) NOT NULL,
  `sub6` varchar(60) NOT NULL,
  `sub6lec` varchar(60) NOT NULL,
  `sub6credit` int(2) NOT NULL,
  `sub6amount` int(4) NOT NULL,
  `sub7` varchar(60) NOT NULL,
  `sub7lec` varchar(60) NOT NULL,
  `sub7credit` int(2) NOT NULL,
  `sub7amount` int(4) NOT NULL,
  `regid` int(3) NOT NULL,
  `totalcredit` int(3) DEFAULT NULL,
  `paymentvalue` int(6) DEFAULT NULL,
  `sub1result` varchar(10) DEFAULT NULL,
  `sub2result` varchar(10) DEFAULT NULL,
  `sub3result` varchar(10) DEFAULT NULL,
  `sub4result` varchar(10) DEFAULT NULL,
  `sub5result` varchar(10) DEFAULT NULL,
  `sub6result` varchar(10) DEFAULT NULL,
  `sub7result` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schoolofengineeringtimetable`
--

CREATE TABLE `schoolofengineeringtimetable` (
  `subjectid` int(3) NOT NULL,
  `subjectname` varchar(150) NOT NULL,
  `location` varchar(100) NOT NULL,
  `time` varchar(15) NOT NULL,
  `year` int(4) NOT NULL,
  `sem` int(2) NOT NULL,
  `day` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `schoolofbusiness`
--
ALTER TABLE `schoolofbusiness`
  ADD PRIMARY KEY (`regid`);

--
-- Indexes for table `schoolofbusinesslecturers`
--
ALTER TABLE `schoolofbusinesslecturers`
  ADD PRIMARY KEY (`lecid`);

--
-- Indexes for table `schoolofbusinessresults`
--
ALTER TABLE `schoolofbusinessresults`
  ADD PRIMARY KEY (`resultid`);

--
-- Indexes for table `schoolofbusinesssem1year1`
--
ALTER TABLE `schoolofbusinesssem1year1`
  ADD PRIMARY KEY (`stid`);

--
-- Indexes for table `schoolofbusinesstimetable`
--
ALTER TABLE `schoolofbusinesstimetable`
  ADD PRIMARY KEY (`subjectid`);

--
-- Indexes for table `schoolofcomputingresults`
--
ALTER TABLE `schoolofcomputingresults`
  ADD PRIMARY KEY (`resultid`);

--
-- Indexes for table `schoolofcomputingtimetable`
--
ALTER TABLE `schoolofcomputingtimetable`
  ADD PRIMARY KEY (`subjectid`);

--
-- Indexes for table `schoolofengineeringresults`
--
ALTER TABLE `schoolofengineeringresults`
  ADD PRIMARY KEY (`resultid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `schoolofbusiness`
--
ALTER TABLE `schoolofbusiness`
  MODIFY `regid` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `schoolofbusinesslecturers`
--
ALTER TABLE `schoolofbusinesslecturers`
  MODIFY `lecid` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `schoolofbusinessresults`
--
ALTER TABLE `schoolofbusinessresults`
  MODIFY `resultid` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `schoolofbusinesssem1year1`
--
ALTER TABLE `schoolofbusinesssem1year1`
  MODIFY `stid` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `schoolofbusinesstimetable`
--
ALTER TABLE `schoolofbusinesstimetable`
  MODIFY `subjectid` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `schoolofcomputingresults`
--
ALTER TABLE `schoolofcomputingresults`
  MODIFY `resultid` int(3) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `schoolofcomputingtimetable`
--
ALTER TABLE `schoolofcomputingtimetable`
  MODIFY `subjectid` int(3) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `schoolofengineeringresults`
--
ALTER TABLE `schoolofengineeringresults`
  MODIFY `resultid` int(3) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
