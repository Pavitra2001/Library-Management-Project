
# Library-Management-System by Group 49

Group Members : 
Pavitra Ganeson
Amisha Nadhira
Rifaa Fauziah
Nabihah Asiah

This is Library Management System which uses JAVA (GUI and Backend) and MYSQL (Database).

Softwares Needed to run the project :

NetBeans
Xampp and phoMyAdmin
MYSQL Database

MYSQL has been used for database in this project. It contains 4 tables :

account : USERNAME, PASSWORD, NAME, QUESTION, ANSWER
book : B_ID, B_NAME, B_AUTHOR, B_PUBLISHER, B_PRICE, B_STOCK
student : S_ID, S_NAME, S_EMAIL, S_SCHOOL, S_YEAR, S_SEM
issuebook : ISSUEBOOK_ID B_ID, B_NAME, S_ID, S_NAME, ISSUE_DATE, STATUS

Steps to access the project :
1. Create database using the SQL Query given below.
2. Open NetBeans 
3. Clone the project your folder, run the project.

MYSQL setup : 

Creating Database

    CREATE DATABASE library_management_system;

    USE library_management_system;

Account Table :

CREATE TABLE `account` (
  `USERNAME` varchar(15) NOT NULL,
  `PASSWORD` varchar(12) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `QUESTION` varchar(45) NOT NULL,
  `ANSWER` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

Book Table :

CREATE TABLE `book` (
  `B_ID` int(10) NOT NULL,
  `B_NAME` varchar(130) NOT NULL,
  `B_AUTHOR` varchar(100) NOT NULL,
  `B_PUBLISHER` varchar(100) NOT NULL,
  `B_PRICE` decimal(6,2) UNSIGNED NOT NULL,
  `B_STOCK` int(5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

Student Table :

CREATE TABLE `student` (
  `S_ID` int(10) UNSIGNED NOT NULL,
  `S_NAME` varchar(120) NOT NULL,
  `S_EMAIL` varchar(100) NOT NULL,
  `S_SCHOOL` varchar(100) NOT NULL,
  `S_YEAR` varchar(25) NOT NULL,
  `S_SEM` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

Issuebook Table :

CREATE TABLE `issuebook` (
  `ISSUEBOOK_ID` int(10) NOT NULL,
  `B_ID` int(11) NOT NULL,
  `B_NAME` varchar(130) NOT NULL,
  `S_ID` int(10) NOT NULL,
  `S_NAME` varchar(120) NOT NULL,
  `ISSUE_DATE` date NOT NULL,
  `STATUS` varchar(10) NOT NULL DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

Thank You
