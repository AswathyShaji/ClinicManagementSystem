/*
SQLyog Ultimate v11.33 (32 bit)
MySQL - 5.1.56-community : Database - db_hms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_hms` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_hms`;

/*Table structure for table `hms_attendance` */

DROP TABLE IF EXISTS `hms_attendance`;

CREATE TABLE `hms_attendance` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) NOT NULL,
  `a_status` varchar(20) NOT NULL,
  `a_date` varchar(20) NOT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hms_attendance` */

/*Table structure for table `hms_bookingop` */

DROP TABLE IF EXISTS `hms_bookingop`;

CREATE TABLE `hms_bookingop` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `op_id` int(11) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `booking_date` varchar(20) NOT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `hms_bookingop` */

insert  into `hms_bookingop`(`booking_id`,`op_id`,`emp_id`,`booking_date`) values (1,21,2,'2018-08-21'),(2,1,3,'2018-08-31'),(3,2,3,'2018-08-01'),(4,1,3,'2018-08-17'),(5,1,3,'2018-09-13'),(6,1,4,'2018-09-04'),(7,1,3,'2018-09-04');

/*Table structure for table `hms_designation` */

DROP TABLE IF EXISTS `hms_designation`;

CREATE TABLE `hms_designation` (
  `designation_id` int(11) NOT NULL AUTO_INCREMENT,
  `designation_type` varchar(40) NOT NULL,
  `Description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`designation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `hms_designation` */

insert  into `hms_designation`(`designation_id`,`designation_type`,`Description`) values (1,'Nurse',NULL),(2,'Doctor',NULL),(3,'Physiotherapist',NULL),(4,'Receptionist',NULL);

/*Table structure for table `hms_district` */

DROP TABLE IF EXISTS `hms_district`;

CREATE TABLE `hms_district` (
  `district_id` int(11) NOT NULL AUTO_INCREMENT,
  `district_name` varchar(45) DEFAULT NULL,
  `state_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`district_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `hms_district` */

insert  into `hms_district`(`district_id`,`district_name`,`state_id`) values (1,'Others','1'),(2,'Ernakulam','2'),(3,'Idukki','2'),(4,'Kottayam','2'),(5,'Anantapur','3'),(6,'Chittoor','3'),(7,'Upper subasrii','4'),(8,'Lohit','4');

/*Table structure for table `hms_employeeregistration` */

DROP TABLE IF EXISTS `hms_employeeregistration`;

CREATE TABLE `hms_employeeregistration` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(45) NOT NULL,
  `emp_gender` varchar(45) NOT NULL,
  `emp_phone` varchar(45) NOT NULL,
  `emp_email` varchar(45) NOT NULL,
  `emp_address` varchar(45) NOT NULL,
  `place_id` int(45) NOT NULL,
  `designation_id` int(11) NOT NULL,
  `emp_wage` varchar(45) NOT NULL,
  `emp_age` varchar(45) NOT NULL,
  `emp_doj` varchar(45) NOT NULL,
  `emp_specialization` varchar(45) NOT NULL,
  `emp_username` varchar(45) NOT NULL,
  `emp_password` varchar(45) NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `hms_employeeregistration` */

insert  into `hms_employeeregistration`(`emp_id`,`emp_name`,`emp_gender`,`emp_phone`,`emp_email`,`emp_address`,`place_id`,`designation_id`,`emp_wage`,`emp_age`,`emp_doj`,`emp_specialization`,`emp_username`,`emp_password`) values (3,'Ajeesh T Alex','male','123','a','dfghj',4,2,'1000','30','2018-08-01','Needling','e','w'),(4,'Henna Ajeesh','female','9497809741','henna@gmail.com','o',3,2,'1000','25','2018-08-01','Ayurveda','henna','henna'),(5,'Sona','female','1234567890','sona@gmail.com','e',7,1,'1233','24','2018-08-15','e','sona','123'),(6,'aswathy','female','12345','dfg','sdfgb',2,1,'1234','22','2018-09-06','werg','asdfg','sdfgh'),(7,'','female','','','',0,0,'','','2018-09-07','','',''),(8,'','female','','','',0,0,'','','2018-09-07','','',''),(9,'','female','','','',0,0,'','','2018-09-07','','',''),(10,'','female','','','',0,0,'','','2018-09-07','','',''),(11,'df','female','78878','jhjjkjkj','huhu',5,1,'78','67','2018-09-13','iui','jj','iu');

/*Table structure for table `hms_health` */

DROP TABLE IF EXISTS `hms_health`;

CREATE TABLE `hms_health` (
  `health_id` int(11) NOT NULL AUTO_INCREMENT,
  `op_number` int(11) DEFAULT NULL,
  `Height` varchar(45) DEFAULT NULL,
  `Weight` varchar(45) DEFAULT NULL,
  `Bloodgroup` varchar(10) DEFAULT NULL,
  `BloodPressure` int(11) DEFAULT NULL,
  `Cholestrol` int(11) DEFAULT NULL,
  `BloodSugar` int(11) DEFAULT NULL,
  `Painmeter` int(11) DEFAULT NULL,
  PRIMARY KEY (`health_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hms_health` */

/*Table structure for table `hms_opregistration` */

DROP TABLE IF EXISTS `hms_opregistration`;

CREATE TABLE `hms_opregistration` (
  `op_id` int(11) NOT NULL AUTO_INCREMENT,
  `op_name` varchar(45) NOT NULL,
  `op_age` varchar(45) NOT NULL,
  `op_gender` varchar(45) NOT NULL,
  `op_address` varchar(45) NOT NULL,
  `op_phone` varchar(45) NOT NULL,
  `op_email` varchar(45) NOT NULL,
  `place_id` int(11) NOT NULL,
  `op_date` varchar(40) NOT NULL,
  `op_regdate` varchar(40) NOT NULL,
  PRIMARY KEY (`op_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `hms_opregistration` */

insert  into `hms_opregistration`(`op_id`,`op_name`,`op_age`,`op_gender`,`op_address`,`op_phone`,`op_email`,`place_id`,`op_date`,`op_regdate`) values (1,'Aswathy Shaji','22','female','Kallammackal House','9497809742','aswathyshaji2013@gmail.com',4,'08/30/2018','08/30/2018'),(2,'Aravind Sivasankar','23','male','Elparambil House','9496666855','aravind@gmail.com',2,'08/30/2018','08/30/2018');

/*Table structure for table `hms_place` */

DROP TABLE IF EXISTS `hms_place`;

CREATE TABLE `hms_place` (
  `place_id` int(11) NOT NULL AUTO_INCREMENT,
  `place_name` varchar(45) DEFAULT NULL,
  `district_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`place_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `hms_place` */

insert  into `hms_place`(`place_id`,`place_name`,`district_id`) values (1,'Other',1),(2,'Muvattupuzha',2),(3,'Perumbavoor',2),(4,'Thodupuzha',3),(5,'Vazhithala',3),(6,'Ettumanoor',4),(7,'Pala',4),(8,'Lepakshi',5),(9,'GootyFor',5),(10,'Nagari',6),(11,'Puttur',6),(12,'HawaCamp',7),(13,'Chetangum',7),(14,'Danglat',8),(15,'Hamatong',8);

/*Table structure for table `hms_product` */

DROP TABLE IF EXISTS `hms_product`;

CREATE TABLE `hms_product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `vendor_id` int(11) DEFAULT NULL,
  `Item` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `hms_product` */

insert  into `hms_product`(`product_id`,`vendor_id`,`Item`) values (1,1,'Ashtarishtam'),(2,2,'ass');

/*Table structure for table `hms_purchasedetails` */

DROP TABLE IF EXISTS `hms_purchasedetails`;

CREATE TABLE `hms_purchasedetails` (
  `detail_id` int(11) NOT NULL AUTO_INCREMENT,
  `purchase_id` int(11) DEFAULT NULL,
  `Item` varchar(25) DEFAULT NULL,
  `unitpice` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `Total` int(11) DEFAULT NULL,
  PRIMARY KEY (`detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `hms_purchasedetails` */

insert  into `hms_purchasedetails`(`detail_id`,`purchase_id`,`Item`,`unitpice`,`quantity`,`Total`) values (1,1,'Ashtarishtam',10,200,2000),(2,1,'ass',20,300,6000);

/*Table structure for table `hms_purchasemaster` */

DROP TABLE IF EXISTS `hms_purchasemaster`;

CREATE TABLE `hms_purchasemaster` (
  `purchase_id` int(11) NOT NULL,
  `Bill_date` date DEFAULT NULL,
  `Billno` varchar(45) DEFAULT NULL,
  `Total` int(11) DEFAULT NULL,
  `discount` int(11) DEFAULT NULL,
  `NetAmount` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`purchase_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hms_purchasemaster` */

insert  into `hms_purchasemaster`(`purchase_id`,`Bill_date`,`Billno`,`Total`,`discount`,`NetAmount`) values (1,'2018-09-10','1',8000,100,'7900');

/*Table structure for table `hms_state` */

DROP TABLE IF EXISTS `hms_state`;

CREATE TABLE `hms_state` (
  `state_id` int(11) NOT NULL AUTO_INCREMENT,
  `state_name` varchar(45) NOT NULL,
  PRIMARY KEY (`state_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `hms_state` */

insert  into `hms_state`(`state_id`,`state_name`) values (1,'Others'),(2,'Kerala'),(3,'Andra Pradesh'),(4,'Arunachal Pradesh');

/*Table structure for table `hms_treatmentcategory` */

DROP TABLE IF EXISTS `hms_treatmentcategory`;

CREATE TABLE `hms_treatmentcategory` (
  `tc_id` int(11) NOT NULL AUTO_INCREMENT,
  `tc_name` varchar(40) NOT NULL,
  PRIMARY KEY (`tc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `hms_treatmentcategory` */

insert  into `hms_treatmentcategory`(`tc_id`,`tc_name`) values (1,'Needling');

/*Table structure for table `hms_treatmentdetails` */

DROP TABLE IF EXISTS `hms_treatmentdetails`;

CREATE TABLE `hms_treatmentdetails` (
  `detail_id` int(11) NOT NULL AUTO_INCREMENT,
  `treament_id` int(11) DEFAULT NULL,
  `numberofdays` int(11) DEFAULT NULL,
  `Morning` varchar(10) DEFAULT NULL,
  `Afternoon` varchar(10) DEFAULT NULL,
  `Evening` varchar(10) DEFAULT NULL,
  `Night` varchar(10) DEFAULT NULL,
  `AfterFood` varchar(25) DEFAULT NULL,
  `BeforeFood` varchar(25) DEFAULT NULL,
  `tc_id` int(11) DEFAULT NULL,
  `tsc_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hms_treatmentdetails` */

/*Table structure for table `hms_treatmentsubcategory` */

DROP TABLE IF EXISTS `hms_treatmentsubcategory`;

CREATE TABLE `hms_treatmentsubcategory` (
  `tsc_id` int(11) NOT NULL AUTO_INCREMENT,
  `tsc_name` varchar(40) NOT NULL,
  `tc_id` int(11) NOT NULL,
  `tsc_amount` varchar(20) NOT NULL,
  PRIMARY KEY (`tsc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `hms_treatmentsubcategory` */

insert  into `hms_treatmentsubcategory`(`tsc_id`,`tsc_name`,`tc_id`,`tsc_amount`) values (1,'Abcd',1,'500');

/*Table structure for table `hms_vendorsregistration` */

DROP TABLE IF EXISTS `hms_vendorsregistration`;

CREATE TABLE `hms_vendorsregistration` (
  `vendor_id` int(11) NOT NULL AUTO_INCREMENT,
  `vendor_name` varchar(45) DEFAULT NULL,
  `vendor_address` varchar(45) DEFAULT NULL,
  `vendor_phone` varchar(45) DEFAULT NULL,
  `vendor_email` varchar(45) DEFAULT NULL,
  `place_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`vendor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `hms_vendorsregistration` */

insert  into `hms_vendorsregistration`(`vendor_id`,`vendor_name`,`vendor_address`,`vendor_phone`,`vendor_email`,`place_id`) values (1,'dhanwanthari','dhanwanthari vaidyasala','9497809742','dhanwanthari@gmail.com',4),(2,'Kottakkal','Todupuzha','989478562','kottakkal@gmail.com',4);

/*Table structure for table `tbl_treatment` */

DROP TABLE IF EXISTS `tbl_treatment`;

CREATE TABLE `tbl_treatment` (
  `treatment_id` int(11) NOT NULL AUTO_INCREMENT,
  `opnumber` int(11) DEFAULT NULL,
  `emp_id` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `prescription` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`treatment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_treatment` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
