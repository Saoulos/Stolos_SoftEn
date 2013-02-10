/*
Navicat MySQL Data Transfer

Source Server         : Server2012
Source Server Version : 50529
Source Host           : localhost:3306
Source Database       : soften

Target Server Type    : MYSQL
Target Server Version : 50529
File Encoding         : 65001

Date: 2013-02-10 20:09:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `buss`
-- ----------------------------
DROP TABLE IF EXISTS `buss`;
CREATE TABLE `buss` (
  `Plate` varchar(40) DEFAULT NULL,
  `Model` varchar(40) DEFAULT NULL,
  `Driver_ID` int(11) DEFAULT NULL,
  `Buss_ID` int(11) DEFAULT NULL,
  `Functional` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of buss
-- ----------------------------
INSERT INTO `buss` VALUES ('IBR2719', 'Volvo', '333', '123', '1');

-- ----------------------------
-- Table structure for `employees`
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `Name` varchar(40) DEFAULT NULL,
  `Surname` varchar(40) DEFAULT NULL,
  `Rights` varchar(40) DEFAULT NULL,
  `Phone` bigint(20) DEFAULT NULL,
  `ID` int(11) DEFAULT NULL,
  `Username` varchar(40) DEFAULT NULL,
  `Password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('Nick', 'Greek', 'Admin', '6947800111', '111', 'Nick111', '111111');
INSERT INTO `employees` VALUES ('John', 'Papas', 'Ypal', '6947800222', '222', 'John222', '222222');
INSERT INTO `employees` VALUES ('Bill', 'Smith', 'Driver', '6947800333', '333', 'Bill333', '333333');

-- ----------------------------
-- Table structure for `routes`
-- ----------------------------
DROP TABLE IF EXISTS `routes`;
CREATE TABLE `routes` (
  `Driver_ID` int(11) DEFAULT NULL,
  `Buss_ID` int(11) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Dromologio` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of routes
-- ----------------------------
INSERT INTO `routes` VALUES ('333', '123', '2013-02-11', 'Teipir');
