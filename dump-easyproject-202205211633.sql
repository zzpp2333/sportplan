-- MySQL dump 10.13  Distrib 8.0.29, for macos12 (arm64)
--
-- Host: localhost    Database: easyproject
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `easyuser`
--

DROP TABLE IF EXISTS `easyuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `easyuser` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `state` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `easyuser`
--

LOCK TABLES `easyuser` WRITE;
/*!40000 ALTER TABLE `easyuser` DISABLE KEYS */;
INSERT INTO `easyuser` VALUES (1,'admin','$2a$10$40nMYPddlMUJGqqW11NHmug/QkR3sq7R89fnAFK4v00TPcDfAa3tO','123@qq.com','超级管理员',1),(2,'naughty','$2a$10$kY3ebMb7cppEwlb87swzwuthWwS6Uk8tPrdhGbgrsyLOtaxdpqY1i','456@qq.com','普通管理员',0),(3,'flysky01','$2a$10$fu3gMy.SUHA3Vn1kJ8PraOrnZwkKnWle4ylqrKpWYasy6Kfa3SVjC','qwe@qq.com','普通用户',1),(4,'anglybirds','$2a$10$Dr5NyTexV7fm8Ix1iXOcQuzcH.YLwCb3gN/fLYSjtOmnKxwhCTB2q','aaaa@163.com','普通用户',0),(7,'admin003','$2a$10$mDBLB2wC4zmxcpCYsafl8Ox0pgUtzzG5w1TXnd8PzKoayJZ.6t4Mi','c@qq.com','普通用户',1),(8,'admin005','$2a$10$YcpbZSFcBpXLWrgGKBHHsu.3JdP8ugCIMFQWPMqNcNkgrBTFmqFEm','cxz@qq.com','普通用户',0),(9,'admin007','$2a$10$T8P8fIujPHRzd3lsqWbzEe6vWgy/pSHOQTLbhmGgGlE3BH1TPmIRa','rty@qq.com','普通用户',0),(11,'newme','$2a$10$rTRNX.pnnzYp/UNaDB3IEerruxttZ/2ywgJeMa6teweK/CrWPiZuC','1132066026@qq.com','普通用户',1);
/*!40000 ALTER TABLE `easyuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food`
--

DROP TABLE IF EXISTS `food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '食物名称',
  `type_id` int DEFAULT NULL COMMENT '食物分类id',
  `type` varchar(100) DEFAULT NULL COMMENT '食物分类',
  `image_url` varchar(100) DEFAULT NULL COMMENT '图片地址',
  `nutrient` varchar(100) DEFAULT NULL COMMENT '营养元素',
  `calories` float DEFAULT NULL COMMENT '热量',
  `protein` float DEFAULT NULL COMMENT '蛋白质',
  `fat` float DEFAULT NULL COMMENT '脂肪',
  `carbohydrate` float DEFAULT NULL COMMENT '碳水化合物',
  `dietary_fiber` float DEFAULT NULL COMMENT '膳食纤维',
  `vitamin_a` float DEFAULT NULL COMMENT '维生素A',
  `vitamin_c` float DEFAULT NULL COMMENT '维生素C',
  `vitamin_e` float DEFAULT NULL COMMENT '维生素E',
  `carotene` float DEFAULT NULL COMMENT '胡萝卜素',
  `vitamin_b1` float DEFAULT NULL COMMENT '维生素B1',
  `vitamin_b2` float DEFAULT NULL COMMENT '维生素B2',
  `niacin` float DEFAULT NULL COMMENT '烟酸',
  `cholesterol` float DEFAULT NULL COMMENT '胆固醇',
  `magnesium` float DEFAULT NULL COMMENT '镁',
  `iron` float DEFAULT NULL COMMENT '铁',
  `calcium` float DEFAULT NULL COMMENT '钙',
  `zinc` float DEFAULT NULL COMMENT '锌',
  `cooper` float DEFAULT NULL COMMENT '铜',
  `manganese` float DEFAULT NULL COMMENT '锰',
  `potassium` float DEFAULT NULL COMMENT '钾',
  `phosphorus` float DEFAULT NULL COMMENT '磷',
  `sodium` float DEFAULT NULL COMMENT '钠',
  `selenium` float DEFAULT NULL COMMENT '硒',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food`
--

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` VALUES (1,'稀饭',1,'主食类','bc67301.JPG','每100g',59,1.3,0.2,13.4,0,0,0,0,0,0,0,0,0,7,0.1,7,0.12,0.01,0.01,13,20,2.8,0.74),(2,'白粥',1,'主食类','946998d.JPG','每100g',46,1.1,0.3,9.9,0.1,0,0,0,0,0,0.03,0.2,0,7,0.1,7,0.2,0.03,0.2,13,20,2.8,0.2),(3,'鲜玉米',1,'主食类','2041d80.JPG','每100g',112,4,1.2,22.8,2.9,0,16,0.46,0,0.16,0.11,1.8,0,32,1.1,0,0.9,0.09,0.22,238,117,1.1,1.63),(4,'燕麦片',1,'主食类','ad96984.JPG','每100g',338,10.1,0.2,77.4,6,0,0,0.91,0,0.46,0.07,0,0,116,2.9,58,1.75,0.21,3.91,356,342,2.1,0),(5,'煮面条',1,'主食类','cdd1c27.JPG','每100g',107,3.9,0.4,22.8,0,0,0,0,0,0.02,0.01,0.56,0,10,0.2,4,0.1,0.01,0.01,15,24,26.9,1.16),(6,'面包',1,'主食类','0d59a2f.JPG','每100g',313,8.3,5.1,58.6,0.5,NULL,NULL,1.66,NULL,0.03,0.06,1.7,NULL,31,2,49,0.75,0.27,0.37,88,107,230.4,3.15),(7,'红薯',1,'主食类','a3c47ae.JPG','每100g',86,1.57,0.1,20.12,3,709,2.4,0.26,8968,0.08,0.06,0.56,0,25,0.61,30,0.3,0.15,0.26,337,47,55,0.6),(8,'小米粥',1,'主食类','4c7f929.JPG','每100g',46,1.4,0.7,8.4,0,0,0,0.26,0,0.02,0.07,0.9,0,22,1,10,0.41,0.07,0.16,19,32,4.1,0.3),(9,'马铃薯',1,'主食类',NULL,'每100g',81,2.6,17.8,1.1,1,14,0.34,6,0.1,0.02,1.1,0,24,7,0.3,0.4,0.09,0.1,347,46,5.9,0.47,NULL),(10,'米饭',1,'主食类',NULL,'每100g',116,2.6,0.3,25.9,0.3,0,0,0,0,0.02,0.03,1.9,0,15,1.3,7,0.92,0.06,0.58,30,62,2.5,0.4),(11,'白薯',1,'主食类',NULL,'每100g',106,1.4,0.2,25.2,1,18,24,0.43,220,0.07,0.04,0.6,0,17,0.8,24,0.22,0.16,0.21,174,46,58.2,0.63),(12,'烙饼',1,'主食类',NULL,'每100g',258,7.5,2.3,52.9,1.9,0,0,1.03,0,0.02,0.04,0,0,51,2.4,20,0.94,0.15,1.15,141,146,149.3,7.5),(13,'紫薯',1,'主食类',NULL,'每100g',133,1.2,0.3,31.7,2.5,0,0.1,1.3,0,0.12,0.02,1.3,0,26,0.6,24,0.2,0.21,0.5,370,56,30,0),(14,'方便面',1,'主食类',NULL,'每100g',473,9.5,21.1,61.6,0.7,NULL,NULL,2.28,NULL,0.12,0.06,0.9,NULL,38,4.1,25,1.06,0.29,0.79,134,80,1144,10.49),(15,'山药',1,'主食类',NULL,'每100g',57,1.9,0.2,12.4,0.8,3,5,0.24,20,0.05,0.02,0.3,0,20,0.3,16,0.27,0.24,0.12,213,34,18.6,0.55),(16,'鸡蛋',2,'肉蛋类',NULL,'每100g',139,13.1,8.6,2.4,0,255,0,1.14,0,0.09,0.2,0.2,648,10,1.6,56,0.89,0.19,0.03,154,130,13.15,13.96),(17,'猪小排',2,'肉蛋类',NULL,'每100g',295,16.8,25.3,0,0,7,0,0.46,0,0.31,0.26,4.11,120,17,1.1,14,2.42,0,0,222,101,62.66,8.46),(18,'鸭肉',2,'肉蛋类',NULL,'每100g',240,15.5,19.7,0.2,NULL,52,NULL,0.27,NULL,0.08,0.22,4.2,94,14,2.2,6,1.33,0.21,0.06,191,122,69,12.25),(19,'鸡肉(公鸡)',2,'肉蛋类',NULL,'每100g',389,16.7,35.4,0.9,NULL,226,NULL,NULL,NULL,0.07,0.07,131,106,7,1.7,37,1.1,0.08,0.01,123,102,47.8,5.4),(20,'鸡肉(母鸡)',2,'肉蛋类',NULL,'每100g',256,20.3,16.8,5.8,NULL,139,NULL,1.34,NULL,0.05,0.04,8.8,166,16,1.2,2,1.46,0.09,0.04,275,120,62.2,NULL),(21,'鸡肉(土鸡)',2,'肉蛋类',NULL,'每100g',124,20.8,4.5,0,NULL,64,NULL,2.02,NULL,0.09,0.08,15.7,106,40,2.1,9,1.06,0.1,0.05,276,141,74.1,12.75),(22,'猪蹄',2,'肉蛋类',NULL,'每100g',260,22.6,18.8,0,0,3,0,0.01,0,0.05,0.1,1.5,192,5,1.1,33,1.14,0.09,0.01,54,33,101,5.85),(23,'猪肉(瘦)',2,'肉蛋类',NULL,'每100g',143,20.3,6.2,1.5,0,44,0,0.34,0,0.54,0.1,5.3,81,25,3,6,2.99,0.11,0.03,305,189,57.5,9.5),(24,'鸡蛋清',2,'肉蛋类',NULL,'每100g',60,11.6,0.1,3.1,NULL,NULL,NULL,0.01,NULL,0.04,0.31,0.2,NULL,15,1.6,9,0.02,0.05,0.02,132,18,79.4,6.97),(25,'火腿肠',2,'肉蛋类',NULL,'每100g',212,14,10.4,15.6,0,5,0,0.71,0,0.26,0.43,2.3,57,22,4.5,9,3.22,0.36,0.14,217,187,771.2,9.2),(26,'鸡胸肉',2,'肉蛋类',NULL,'每100g',118,24.6,1.9,0.6,0,3,0,0.41,0,0.07,0.06,11.96,65,28,1,1,0.26,0.01,0.01,333,170,44.8,11.75),(27,'牛肉(腑肋)',2,'肉蛋类',NULL,'每100g',123,18.6,5.4,0,NULL,7,NULL,0.37,NULL,0.06,0.13,3.1,71,14,2.7,19,4.05,0.07,0.06,217,120,66.6,2.35),(28,'猪大排',2,'肉蛋类',NULL,'每100g',264,18.3,20.4,1.7,0,12,0,0.11,0,0.8,0.15,5.3,165,17,0.8,8,1.72,0.12,0.05,274,125,44.5,10.3),(29,'猪肉(奶脯)',2,'肉蛋类',NULL,'每100g',349,7.7,35.5,0,NULL,39,NULL,0.49,NULL,0.14,0.06,2,98,5,0.8,5,0.73,0.13,NULL,53,67,36.7,2.22),(30,'草鱼',2,'肉蛋类',NULL,'每100g',113,16.6,5.2,0,0,11,0,2.03,0,0.04,0.11,2.8,86,31,0.8,38,0.87,0.05,0.05,312,203,46,6.66),(31,'鸡腿',2,'肉蛋类',NULL,'每100g',146,20.2,7.2,0,0,22,0,0,0,0.06,0.1,3.25,99,21,1.8,0,1.11,0.01,0.01,221,271,73.6,9.7),(32,'鲫鱼',2,'肉蛋类',NULL,'每100g',108,17.1,2.7,3.8,0,17,0,0.68,0,0.04,0.09,2.5,130,41,1.3,79,1.94,0.08,0.06,290,193,41.2,14.31),(33,'牛肉干',2,'肉蛋类',NULL,'每100g',550,45.6,40,1.9,0,0,0,0,0,0.06,0.26,15.2,120,107,15.6,43,7.26,0.29,0.19,510,464,412.4,9.8),(34,'鲤鱼',2,'肉蛋类',NULL,'每100g',109,17.6,4.1,0.5,0,25,0,1.27,0,0.03,0.09,2.7,84,33,1,50,2.08,0.06,0.05,334,204,53.7,15.38),(35,'明虾',2,'肉蛋类',NULL,'每100g',85,13.4,1.8,3.8,0,0,0,1.55,0,0.01,0.04,4,273,31,0.6,75,3.59,0.09,0.02,238,189,119,25.48),(36,'青鱼',2,'肉蛋类',NULL,'每100g',118,20.1,4.2,0,0,42,0,0.81,0,0.03,0.07,2.9,108,32,0.9,31,0.96,0.06,0.04,325,184,47.4,37.69),(37,'猪肝',2,'肉蛋类',NULL,'每100g',126,19.2,4.7,1.8,0,6502,20,0,0,0.22,2.02,10.11,108,24,23.2,6,3.68,0.02,0.01,235,243,68.6,26.12),(38,'黄鱼(大黄花鱼)',2,'肉蛋类',NULL,'每100g',97,17.7,2.5,0.8,0,0,0,1.13,0,0.03,0.1,1.9,86,39,0.7,53,0.58,0.04,0.02,260,174,120.3,42.57),(39,'河虾',2,'肉蛋类',NULL,'每100g',87,16.4,2.4,0,0,48,0,5.33,0,0.04,0.03,0,240,60,4,325,2.24,0.64,0.27,329,186,133.8,29.65),(40,'罗非鱼',2,'肉蛋类',NULL,'每100g',98,18.4,1.5,2.8,0,0,0,1.91,0,0.11,0.17,3.3,78,36,0.9,12,0.87,0.05,0.09,289,161,19.8,22.6),(41,'鳕鱼',2,'肉蛋类',NULL,'每100g',88,20.4,0.5,0.5,0,14,0,0,0,0.04,0.13,2.7,114,84,0.5,42,0.86,0.01,0.01,321,232,130.3,24.8),(42,'鲈鱼',2,'肉蛋类',NULL,'每100g',105,18.6,3.4,0,0,19,0,0.75,0,0.03,0.17,3.1,86,37,2,138,2.83,0.05,0.04,205,242,141.1,33.06),(43,'鳗鱼',2,'肉蛋类',NULL,'每100g',211,21.3,9.8,9.5,0,0,0,5.91,75,0.03,0.09,1.47,50,16,2.2,37,2.46,0.04,0.05,174,120,1252,24.45),(44,'豆浆',3,'大豆及制品',NULL,'每100g',31,3,1.6,1.2,0,0,0,1.06,0,0.02,0.02,0.14,0,15,0.4,5,0.28,0.16,0.16,117,42,3.7,0),(45,'豆浆(甜)',3,'大豆及制品',NULL,'每100g',34,2.4,0.5,4.9,0.1,0,0,1.27,0,0.04,0.02,0.15,0,15,0.5,27,0.27,0.08,0,54,21,0,0.1),(46,'豆腐干(白干)',3,'大豆及制品',NULL,'每100g',197,14.9,11.3,9.6,0,2,0,13,25,0.02,0.05,0.4,0,69,7.1,447,1.84,0.41,1.07,137,174,329,7.12),(47,'豆腐',3,'大豆及制品',NULL,'每100g',84,6.6,5.3,3.4,0,0,0,5.79,0,0.06,0.02,0.21,0,41,1.2,78,0.57,0.08,0.12,118,82,5.6,1.5),(48,'豆腐花',3,'大豆及制品',NULL,'每100g',15,1.9,0.8,0,0,21,0,5,250,0.02,0.03,0.4,0,60,3.3,175,0.75,0.28,0.52,339,95,0,1.7),(49,'豆奶',3,'大豆及制品',NULL,'每100g',30,2.4,1.5,1.8,0,0,0,4.5,0,0.02,0.06,0.3,0,7,0.6,23,0.24,5.57,0.11,92,35,3.2,0.73),(50,'豆腐脑',3,'大豆及制品',NULL,'每100g',48,2.6,1.8,5.4,0.2,NULL,NULL,0.87,NULL,0.01,0.4,NULL,35,301,0.45,1.7,0.06,0.18,108,46,235.6,0.5,NULL),(51,'黄豆',3,'大豆及制品',NULL,'每100g',390,35,16,34.2,15.5,18,0,18.9,220,0.41,0.2,2.1,0,199,8.2,191,3.34,1.35,2.26,1503,465,2.2,6.16),(52,'黑豆',3,'大豆及制品',NULL,'每100g',401,36,15.9,33.6,10.2,3,0,17.36,30,0.2,0.33,2,0,243,7,224,4.18,1.56,2.83,1377,500,3,6.79),(53,'腐竹(干)',3,'大豆及制品',NULL,'每100g',485,54.2,27.2,8.1,0,0,0,28.43,0,0.02,0.17,0.8,0,140,3.8,50,4.71,0.86,2.38,670,655,27.1,1.51),(54,'青豆(干)',3,'大豆及制品',NULL,'每100g',152,15.8,7.8,5.1,0.8,3,0,15.85,40,0.04,0.03,0.3,0,88,5.7,299,1.59,0.41,1.19,99,219,234.1,3.15),(55,'豆渣',3,'大豆及制品',NULL,'每100g',89,4.8,NULL,3.6,9.7,9.7,0,0,3.5,0,0.11,0.04,0.3,NULL,NULL,100,1.2,NULL,NULL,NULL,NULL,4.8,NULL),(56,'小白菜',4,'蔬菜菌藻类',NULL,'每100g',14,1.4,0.3,2.4,0,154,64,0.4,1853,0.01,0.05,0,0,30,1.3,117,0.23,0.02,0.15,116,26,132.2,0.39),(57,'大白菜',4,'蔬菜菌藻类',NULL,'每100g',20,1.6,0.2,3.4,0.9,7,37.5,0.36,80,0.05,0.04,0.65,0,12,0.8,57,0.46,0.06,0.19,134,33,68.9,0.57),(58,'番茄',4,'蔬菜菌藻类',NULL,'每100g',15,0.9,0.2,3.3,1,31,14,0.42,375,0.02,0.01,0.49,0,12,0.2,4,0.12,0.04,0.06,179,24,9.7,0),(59,'黄瓜',4,'蔬菜菌藻类',NULL,'每100g',16,0.8,0.2,2.9,0.5,8,9,0.49,90,0.02,0.03,0.2,0,15,0.5,24,0.18,0.05,0.06,102,24,4.9,0.38),(60,'上海青',4,'蔬菜菌藻类',NULL,'每100g',18,1.7,0.2,3.2,1.6,200,10,NULL,1200,NULL,0.03,0.5,NULL,91,1.8,59,0.54,0.06,0.19,245,36,56.9,3.4),(61,'西兰花',4,'蔬菜菌藻类',NULL,'每100g',27,3.5,0.6,3.7,2.6,13,56,0.76,151,0.06,0.08,0.73,0,22,0.9,50,0.46,0.03,0.16,179,61,46.7,0.43),(62,'白萝卜',4,'蔬菜菌藻类',NULL,'每100g',16,0.7,0.1,4,1.1,0,19,0,0,0.02,0.01,0.14,0,12,0.2,47,0.14,0.01,0.01,0.05,167,16,0.12),(63,'花菜',4,'蔬菜菌藻类',NULL,'每100g',20,1.7,0.2,4.2,2.1,1,32,0,11,0.04,0.04,0.32,0,18,0.4,31,0.17,0.02,0.09,206,32,39.2,2.86),(64,'南瓜',4,'蔬菜菌藻类',NULL,'每100g',23,0.7,0.1,5.3,0.8,74,8,0.36,890,0.03,0.04,0.4,0,8,0.4,16,0.14,0.03,0.08,145,24,0.8,0.46),(65,'胡萝卜',4,'蔬菜菌藻类',NULL,'每100g',39,1,0.2,8.8,1.1,688,13,0.41,4130,0.44,0.03,0.6,0,14,1,32,0.23,0.08,190,27,71.4,0.63,0),(66,'生菜',4,'蔬菜菌藻类',NULL,'每100g',16,1.4,0.4,2.1,0.6,60,20,0,360,0,0.1,0.2,0,29,1.2,70,0.43,0.08,0.15,100,31,80,1.55),(67,'圣女果',4,'蔬菜菌藻类',NULL,'每100g',25,1,0.2,5.8,1.5,28,33,0.98,332,0.03,0.02,0.92,0,12,0.3,6,0.2,0.04,0.06,262,26,10,0.2),(68,'冬瓜',4,'蔬菜菌藻类',NULL,'每100g',10,0.3,0.2,2.4,1.1,0,16,0.04,0,0,0,0.22,0,10,0.1,12,0.1,0.1,0.02,57,11,2.8,0.02),(69,'竹笋(嫩)',4,'蔬菜菌藻类',NULL,'每100g',23,2.6,0.2,3.6,1.8,0,5,0.05,0,0.08,0.08,0.6,1,9,0.33,0.5,0.09,1.14,389,64,0.4,0.04,NULL),(70,'卷心菜',4,'蔬菜菌藻类',NULL,'每100g',24,1.5,0.2,4.6,1,6,40,0.5,70,0.03,0.03,0.4,12,49,0.6,0.6,0.25,0.04,0.18,124,26,27.2,0.96),(71,'木耳',4,'蔬菜菌藻类',NULL,'每100g',27,1.5,0.2,2.6,2,1,0,20,20,0.01,0.05,0.2,0,57,5.5,34,0.53,0.04,0.97,52,12,8.5,0.46),(72,'菠菜',4,'蔬菜菌藻类',NULL,'每100g',28,2.6,0.3,4.5,1.7,243,32,1.74,2920,0.04,0.11,0.6,0,58,2.9,66,0.85,0.1,0.66,311,47,85.2,0.97),(73,'豆芽(黄豆芽)',4,'蔬菜菌藻类',NULL,'每100g',16,1.7,0.1,2.6,1.2,1,1,4,0,11,0.02,0.02,0.35,0,14,18,0.3,0.2,0.05,32,19,25.8,0.27),(74,'香菇(鲜)',4,'蔬菜菌藻类',NULL,'每100g',26,2.2,0.3,5.2,3.3,0,1,0,0,0,0.08,2,0,11,0.3,2,0.66,0.12,0.25,20,53,1.4,2.58),(75,'茄子',4,'蔬菜菌藻类',NULL,'每100g',23,1.1,0.2,4.9,1.3,4,5,1.13,50,0.02,0.04,0.6,0,13,0.5,24,0.23,0.1,0.13,142,23,5.4,0.48),(76,'海带(浸)',4,'蔬菜菌藻类',NULL,'每100g',16,1.1,0.1,3,0.9,26,0,0.08,310,0.02,0.01,0.9,0,61,3.3,241,0.66,0.03,1.47,222,29,107.6,4.9),(77,'鱼腥草(叶)',4,'蔬菜菌藻类',NULL,'每100g',32,2.1,0.1,10.7,0,0,1.6,1.28,0,0.03,1.2,1.04,0,145,2.3,57,0.4,0.09,1,494,31,21.6,1.25),(78,'空心菜',4,'蔬菜菌藻类',NULL,'每100g',19,2.2,0.2,4,1.9,143,5,0.1,1714,0.03,0.05,0.22,0,46,1,115,0.27,0.05,0.52,304,37,107.6,0),(79,'豌豆尖',4,'蔬菜菌藻类',NULL,'每100g',32,4.8,0.8,2.6,0,28,8,0.1,333,0.11,0.16,0.49,0,14,0.5,15,0.42,0.07,0.08,145,60,20.9,0.56),(80,'小葱',4,'蔬菜菌藻类',NULL,'每100g',27,1.6,0.4,4.9,1.4,70,21,0.49,840,0.05,0.06,0.4,0,18,1.3,72,0.35,0.06,0.16,143,26,10.4,1.06),(81,'青椒',4,'蔬菜菌藻类',NULL,'每100g',22,0.8,0.8,0.3,5.2,2.2,8,59,0.38,98,0.02,0.62,0,15,0.3,11,0.21,0.05,0.05,154,20,7,0.02),(82,'洋葱',4,'蔬菜菌藻类',NULL,'每100g',40,1.1,0.2,9,0.9,2,8,0.14,20,0.03,0.03,0.3,0,15,0.6,24,0.23,0.05,0.14,147,39,4.4,0.92),(83,'金针菇',4,'蔬菜菌藻类',NULL,'每100g',32,2.4,0.4,6,2.7,3,2,1.14,30,0.15,0.19,4.1,0,17,1.4,0,0.39,0.14,0.1,195,97,4.3,0.28),(84,'苦瓜',4,'蔬菜菌藻类',NULL,'每100g',22,1,0.1,4.9,1.4,8,56,0.85,100,0.03,0.03,0.4,0,18,0.7,14,0.36,0.06,0.16,256,35,2.5,0.36),(85,'丝瓜',4,'蔬菜菌藻类',NULL,'每100g',20,1.3,0.2,4,0,13,4,0.08,155,0.02,0.04,32,0,19,0.3,37,0.22,0.05,0.07,121,33,3.7,0.2),(86,'莴笋',4,'蔬菜菌藻类',NULL,'每100g',15,1,0.1,2.8,0.6,13,4,0.19,150,0.02,0.02,0.5,0,19,0.9,23,0.33,0.07,0.19,212,48,36.5,0.54),(87,'芹菜',4,'蔬菜菌藻类',NULL,'每100g',13,1.4,0.2,1.8,0.9,32,5,0.32,380,0.01,0.19,1,0,16,6.9,38,0.38,0.1,0.79,212,32,40.9,0.81),(88,'韭菜',4,'蔬菜菌藻类',NULL,'每100g',25,2.4,0.4,0.4,4.5,2.4,133,2,0.57,1596,0.04,0.05,0.86,0,44,24,0.7,0.25,0.05,0.21,241,45,5.8),(89,'娃娃菜',4,'蔬菜菌藻类',NULL,'每100g',13,1.9,0.2,0.2,2.4,1,4,12,0,48,0.04,0.03,0.61,0,17,78,0.4,0.35,0.03,0.13,278,58,0.16),(90,'红萝卜',4,'蔬菜菌藻类',NULL,'每100g',22,1,0.1,0.1,4.6,0.8,0,3,1.2,0,0.05,0.02,0,16,11,2.8,0.69,0,0.06,110,26,62.7,0),(91,'苹果',5,'水果类',NULL,'每100g',53,0.4,0.2,13.7,1.7,4,3,0.43,50,0.02,0.02,0.2,0,4,0.3,4,0.04,0.07,0.03,83,7,1.3,0.1),(92,'香蕉',5,'水果类',NULL,'每100g',93,1.4,0.2,22,1.2,5,8,0.24,60,0.02,0.04,0.7,0,43,0.4,7,0.18,0.14,0.65,256,28,0.8,0.87),(93,'西瓜',5,'水果类',NULL,'每100g',31,0.5,0.3,6.8,0.2,14,5.7,0.11,173,0.02,0.04,0.3,0,14,0.4,7,0.09,0.03,0.03,97,12,3.3,0.09),(94,'桃子',5,'水果类',NULL,'每100g',42,0.6,0.1,10.1,1,2,10,0.71,20,0.01,0.02,0.3,0,8,0.3,6,0.14,0.06,0.07,127,11,1.7,0.47),(95,'橙子',5,'水果类',NULL,'每100g',48,0.8,0.2,11.1,0.6,13,33,0.56,160,0.05,0.04,0.3,0,14,0.4,20,0.14,0.03,0.05,159,22,1.2,0.31),(96,'柚子',5,'水果类',NULL,'每100g',42,0.8,0.2,9.5,0.4,1,23,0,10,0,0.03,0.3,0,4,0.3,4,0.4,0.18,0.08,119,24,3,0.7),(97,'梨',5,'水果类',NULL,'每100g',51,0.3,0.1,13.1,2.6,2,5,0.46,20,0.03,0.03,0.2,0,8,0.4,7,0.1,0.1,0.06,85,14,1.7,0.29),(98,'猕猴桃',5,'水果类',NULL,'每100g',61,0.8,0.6,14.5,2.6,11,62,2.43,130,0.05,0.02,0.3,0,12,1.2,27,0.57,1.87,0.73,144,26,10,0.28),(99,'橘子',5,'水果类',NULL,'每100g',44,0.8,0.1,10.2,0.5,41,35,1.22,490,0.04,0.03,0.2,0,14,0.2,24,0.13,0.11,0.03,128,18,0.8,0.7),(100,'火龙果',5,'水果类',NULL,'每100g',55,1.1,0.2,13.3,1.6,0,3,0.14,0,0.03,0.02,0.22,0,30,0.3,7,0.29,0.04,0.19,20,35,2.7,0.03),(101,'菠萝',5,'水果类',NULL,'每100g',44,0.5,0.1,10.8,1.3,2,18,0,20,0.04,0.02,0.2,0,8,0.6,12,0.14,0.07,1.04,113,9,0.8,0.24),(102,'芒果',5,'水果类',NULL,'每100g',35,0.6,0.2,8.3,1.3,75,23,1.21,897,0.01,0.04,0.3,0,14,0.2,0,0.09,0.06,0.2,138,11,2.8,1.44),(103,'荔枝',5,'水果类',NULL,'每100g',71,0.9,0.2,16.6,0.5,1,41,0,10,0.1,0.04,1.1,0,12,0.4,2,0.17,0.16,0.09,151,24,1.7,0.14),(104,'西柚',5,'水果类',NULL,'每100g',33,0.7,0.3,7.8,0,24,38,0,282,0.05,0.01,0.2,0,9,0.1,21,0.1,0,0,60,17,7,0),(105,'酸奶',6,'奶类',NULL,'每100g',70,3.2,1.9,10,0,19,1,0.13,0,0.03,0.14,0.1,15,11,0.2,140,0.54,0.01,0.02,135,90,32.5,1.19),(106,'牛奶',6,'奶类',NULL,'每100g',65,3.3,3.6,4.9,0,54,1,0.13,0,0.03,0.12,0.1,15,11,0.3,107,0.28,0.02,0.03,109,73,37.2,1.94),(107,'奶酪',6,'奶类',NULL,'每100g',328,25.7,23.5,3.5,NULL,152,NULL,0.6,NULL,0.06,0.91,0.6,11,57,2.4,799,6.97,0.13,0.16,75,326,584.6,1.5),(108,'酸奶（中脂）',6,'奶类',NULL,'每100g',64,2.7,1.9,9,NULL,32,1,0.13,0,0.02,0.13,0.1,12,10,0.4,81,0.68,0.01,0.01,130,59,13,0.74),(109,'脱脂奶粉',6,'奶类',NULL,'每100g',360.7,36.2,0.91,51.16,0,2.4,7.81,0,0,0.21,3.44,0.74,23,114,0.17,1406,4,0,0,1758,1039,337,0),(110,'酸奶（果料）',6,'奶类',NULL,'每100g',67,3.1,1.4,10.4,0,19,2,0.69,0,0.03,0.19,0.1,15,11,0.4,140,0.56,0.04,0.03,111,90,32.5,0.98),(111,'早餐奶',6,'奶类',NULL,'每100g',68,2.3,3.1,7.7,NULL,24,1,0.21,0,0.03,0.14,0.1,NULL,11,0.3,120,0.3,0,0,109,73,NULL,1.9),(112,'芝麻油',7,'油脂类',NULL,'每100g',898,0,99.7,0.2,0,0,0,68.53,0,0,0,0,0,3,2.2,9,0.17,0.05,0.76,0,4,1.1,0),(113,'色拉油',7,'油脂类',NULL,'每100g',898,0,99.8,0,0,0,0,24.01,0,0,0,0,64,1,1.7,18,0.23,0.05,0.01,3,1,5.1,0),(114,'花生油',7,'油脂类',NULL,'每100g',899,0,99.9,0,0,0,0,42.06,0,0,0,0,0,2,2.9,12,0.48,0.15,0.33,1,15,3.5,0),(115,'豆油',7,'油脂类',NULL,'每100g',899,0,99.9,0,0,0,0,93.08,0,0,0,0,0,3,2,13,1.09,0.16,0.43,3,6,4.9,0),(116,'葵花籽油',7,'油脂类',NULL,'每100g',899,0,99.9,0,NULL,NULL,NULL,54.6,NULL,NULL,NULL,NULL,NULL,4,1,2,0.11,NULL,0.02,1,4,2.8,NULL),(117,'橄榄油',7,'油脂类',NULL,'每100g',899,0,99.9,0,0,0,0,0,0,0,0,0,0,0,0.56,0.1,0,0,0,1,0,2,0),(118,'瓜子仁',8,'坚果类',NULL,'每100g',615,19.1,53.4,16.7,4.5,NULL,0,79.06,0,1.89,0.16,0.5,0,287,2.9,115,0.5,0.56,0.07,547,604,5,5.78),(119,'黑芝麻',8,'坚果类',NULL,'每100g',559,19.1,46.1,24,14,0,0,50.4,0,0.66,0.25,0.59,0,290,22.7,780,6.13,1.77,17.85,358,516,8.3,4.7),(120,'核桃（干）',8,'坚果类',NULL,'每100g',646,14.9,58.8,19.1,58.8,19.1,9.5,3,1,43.21,30,0.15,0.14,0.9,131,0,56,2.7,2.17,1.17,3.44,385,4.62),(121,'炒花生',8,'坚果类',NULL,'每100g',601,21.7,48,23.8,6.305,0,12.9,60,0.13,0.12,18.9,0,171.1,47,2.03,1.5,0.68,1.44,563,326,34.8,1.44,3.9),(122,'花生米',8,'坚果类',NULL,'每100g',589,23.9,44.4,25.7,4.3,0,0,14.97,0,0.12,0.1,18.9,0,176,6.9,284,2.82,0.89,1.7,674,315,445.1,7.1),(123,'杏仁',8,'坚果类',NULL,'每100g',578,22.5,45.5,23.9,8,0,26,18.53,0,0.08,0.56,0,0,178,2.2,97,4.3,0.8,0.77,106,27,8.3,15.65),(124,'蜂蜜',9,'调味品',NULL,'每100g',321,0.4,1.9,75.6,0,0,3,0,0,0,0.05,0.1,0,2,1,4,0.37,0.03,0.07,28,3,0.3,0.15),(125,'白砂糖',9,'调味品',NULL,'每100g',400,0,0,99.9,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,3,0.6,20,0.6,0.04,0.09,5,8,0.4,NULL),(126,'红糖',9,'调味品',NULL,'每100g',389,0.7,0,96.6,NULL,NULL,NULL,NULL,NULL,0.01,NULL,0.3,NULL,54,2.2,157,0.35,0.15,0.27,240,11,18.3,4.2),(127,'榨菜',9,'调味品',NULL,'每100g',33,2.2,0.3,6.5,2.1,82,2,NULL,190,0.03,0.06,0.5,NULL,54,3.9,155,0.63,0.14,0.35,363,41,4252.6,1.93),(128,'酱油',9,'调味品',NULL,'每100g',63,5.6,0.1,10.1,0.2,NULL,NULL,NULL,NULL,0.05,0.13,1.7,NULL,156,1.17,8.6,0.06,1.11,337,204,5757,1.39,NULL),(129,'醋',9,'调味品',NULL,'每100g',31,2.1,0.3,4.9,NULL,NULL,NULL,NULL,NULL,0.03,0.05,1.4,NULL,13,6,17,1.25,0.04,2.97,351,96,262.1,2.43),(130,'饮用水',10,'饮料类',NULL,'每100g',0,0,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(131,'咖啡粉',10,'饮料类',NULL,'每100g',218,12.2,0.5,41.1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(132,'无糖美式咖啡',10,'饮料类',NULL,'每100g',1,0,0,0.3,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(133,'矿泉水',10,'饮料类',NULL,'每100g',0,0,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(134,'啤酒',10,'饮料类',NULL,'每100g',32,0.4,0,0,0,NULL,NULL,NULL,NULL,0.15,0.04,1.1,0,6,0.4,13,0.3,0.01,47,12,11.4,0.64,0.64),(135,'柠檬汁',10,'饮料类',NULL,'每100g',27,0.9,0.2,5.5,0,NULL,11,NULL,NULL,0.01,0.02,0.1,NULL,12,0.1,24,0.09,0.04,0.06,120,NULL,1.2,4.15),(136,'枸杞',12,'其他',NULL,'每100g',258,13.9,1.5,64.1,16.9,1625,48,1.86,9750,0.35,0.46,4,NULL,96,5.4,60,1.48,0.98,0.87,434,209,252.1,13.25),(137,'葛根',12,'其他',NULL,'每100g',181,1.5,0.2,45.6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(138,'花粉（松油）',12,'其他',NULL,'每100g',379.7,9.6,7.7,72.5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(139,'花粉（荞麦）',12,'其他',NULL,'每100g',353,14.9,4.2,67.3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(140,'冬虫夏草',12,'其他',NULL,'每100g',292,20.9,4.7,61.6,20.1,NULL,2,NULL,NULL,0.37,0.7,3.3,84,197,4.87,66.5,1.54,0.86,595,95,264,1.4,0.56);
/*!40000 ALTER TABLE `food` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_type`
--

DROP TABLE IF EXISTS `food_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food_type` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(100) NOT NULL COMMENT '食物分类',
  `icon` varchar(100) DEFAULT NULL COMMENT '图标',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_type`
--

LOCK TABLES `food_type` WRITE;
/*!40000 ALTER TABLE `food_type` DISABLE KEYS */;
INSERT INTO `food_type` VALUES (1,'主食类','iconfont icon-zhushi'),(2,'肉蛋类','iconfont  icon-a-50-62_fuzhi-08'),(3,'大豆及制品','iconfont  icon-dadou'),(4,'蔬菜菌藻类','iconfont icon-shucai'),(5,'水果类','iconfont icon-shuiguo'),(6,'奶类','iconfont icon-niunai'),(7,'油脂类','iconfont icon-youzhi'),(8,'坚果类','iconfont icon-jianguo'),(9,'调味品','iconfont icon-tiaoweipin'),(10,'饮料类','iconfont icon-yinliao'),(11,'零食点心冷饮','iconfont icon-lingshi'),(12,'其他','iconfont icon-qita');
/*!40000 ALTER TABLE `food_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goods`
--

DROP TABLE IF EXISTS `goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goods` (
  `id` int NOT NULL AUTO_INCREMENT,
  `goodName` varchar(30) NOT NULL,
  `price` float NOT NULL,
  `inStock` int DEFAULT '0',
  `createUserId` int NOT NULL DEFAULT '1',
  `imgUrl` varchar(100) DEFAULT NULL COMMENT '图片地址',
  `modelType` varchar(50) DEFAULT NULL COMMENT '适配机型',
  `controlMode` varchar(50) DEFAULT NULL COMMENT '控制方式',
  `mainFunction` varchar(255) DEFAULT NULL COMMENT '主要功能',
  `wifiFunction` varchar(50) DEFAULT NULL COMMENT '无线功能',
  `battery` varchar(50) DEFAULT NULL COMMENT '电池规格',
  `characteristic` varchar(150) DEFAULT NULL COMMENT '特色功能',
  `size` varchar(100) DEFAULT NULL COMMENT '外观尺寸',
  `other` varchar(255) DEFAULT NULL COMMENT '其他功能',
  `remark` text COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goods`
--

LOCK TABLES `goods` WRITE;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
INSERT INTO `goods` VALUES (1,'华为运动手环',19,30,1,NULL,'安卓Android,苹果iOS,Android 4.4及以上 iOS 8.0及以上','触控 ','来电信息提醒,运动监测,心率监测,数据记录,记步,睡眠监测,时间闹钟','蓝牙,蓝牙4.2','待机:45天,工作时长:21天,充电:约1.5小时(25℃环境下),2PIN充电接口','防水,电话短信功能','44×19.7×10.3mm','传感器:3轴加速度传感器,分离式PPG心率计,红外光佩戴检测传感器按钮:一个电容触摸按键','2021-04-20 17:24:22将华为运动手环商品加入库存'),(2,'电动跑步机',1999,2,1,NULL,'无','按钮控制','健身跑步','无','充电式','配有嵌入式糖当量、脂肪当量计算模块，能够通过外置液晶屏随时显示燃糖当量、燃脂当量;','占地面积:长2100*宽870*高1570mm；\n跑带规格:525*3200mm；','时间、距离、心跳、卡路里、电动扬升、体脂','null； 管理员：admin于2021-04-21 11:46:08 --> 更新了商品:电动跑步机'),(3,'深蹲架',299,3,1,NULL,'无','无','深蹲健跨，让你在女性面前狠抬头！','无','无','采用超强耐用钢丝绳，直径达5.5mm','采用50*100mm优质平椭圆管钢材和50*80mm的方管结合而成\n主体管材厚度达3mm','无','null； 管理员：admin于2021-04-21 11:46:17 --> 更新了商品:深蹲架'),(4,'FDR-X100V（准4K运动摄像机）',500,5,1,NULL,'无','按钮+触控','将自己运动时的英姿保留下来，留作永久纪念','蓝牙','待机:100天,工作时长:45天,充电:约1.5小时(25℃环境下),2PIN充电接口','像素高达3840x2160、降噪、定点摄像、防抖、防水防潮等','48×15×10.3mm','无','null； 管理员：admin于2021-04-21 11:46:20 --> 更新了商品:FDR-X100V（准4K运动摄像机）'),(5,'体感操控的运动耳机',150,10,1,NULL,'安卓Android,苹果iOS,Windows','滚轮','在运动的同时欣赏一下音乐是很多人的最爱，但有时例如跑步正在兴头上，一个电话打来，就不得不停下来手忙脚乱的去摸索耳机的线控开关，颇觉得扫兴','USB线+蓝牙','待机:20天,工作时长:2天,充电:约1小时(25℃环境下),2PIN充电接口','内置的传感器可让聆听者通过手势播放、暂停音乐、甚至接听电话','看图','JBL介绍称，这两款产品分别名为 Reflect Response BT 和 Synchros S210BT，前者为入耳式，后者为头戴式，均内置有体感检测和蓝牙连接模块','null； 管理员：admin于2021-04-21 11:46:23 --> 更新了商品:体感操控的运动耳机'),(6,'智能滑雪板',400,5,1,NULL,'安卓Android,苹果iOS','按钮','如今已入深冬，正是叫上小伙伴一起到山上滑雪的季节，那么您试过智能滑雪板吗?没有的话，可以尝试一下日本Cerevo公司的XON Snow-1智能滑雪板，它能记录用户使用中的运动情况，及滑行时的重量分布状况。','蓝牙','充电：约5.5小时','　该产品不仅功能强大，而且“逼格感”十足。其在捆绑带上配备LED灯，随着重量分布发生变化时亮起，虽然只是装饰作用，但运动者不就是要的这个范儿吗?','产品尺寸（折叠前）约1080×430×1140mm, 产品尺寸（折叠后）约1080×430×490mm','　该产品不仅功能强大，而且“逼格感”十足。其在捆绑带上配备LED灯，随着重量分布发生变化时亮起，虽然只是装饰作用，但运动者不就是要的这个范儿吗?','null； 管理员：admin于2021-04-21 11:46:26 --> 更新了商品:智能滑雪板'),(7,'瑜伽垫',20.45,25,1,'','',NULL,'','','','','','',''),(9,'无绳跳绳',45,100,1,'','',NULL,'','','','','','',''),(11,'华强北蓝牙耳机',26,500,1,'','',NULL,'','','','','','','');
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mainmenu`
--

DROP TABLE IF EXISTS `mainmenu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mainmenu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `state` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mainmenu`
--

LOCK TABLES `mainmenu` WRITE;
/*!40000 ALTER TABLE `mainmenu` DISABLE KEYS */;
INSERT INTO `mainmenu` VALUES (100,'权限管理','/admin','iconfont icon-guanliyuan',1),(200,'运动平台','/sport','iconfont icon-shouye',1);
/*!40000 ALTER TABLE `mainmenu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `id` bigint NOT NULL COMMENT '订单编号(雪花算法生成)',
  `goodsId` int NOT NULL COMMENT '商品ID',
  `userId` int NOT NULL COMMENT '下单人ID',
  `state` tinyint NOT NULL DEFAULT '0' COMMENT '订单状态 0待支付、1已支付、2已取消',
  `remark` varchar(120) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permission`
--

DROP TABLE IF EXISTS `permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `permission` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT '权限名称',
  `permission` varchar(20) NOT NULL COMMENT '权限标识',
  `state` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission`
--

LOCK TABLES `permission` WRITE;
/*!40000 ALTER TABLE `permission` DISABLE KEYS */;
INSERT INTO `permission` VALUES (1,'添加用户','USER_ADD',1),(2,'修改用户','USER_UPDATE',1),(3,'删除用户','USER_DELETE',1),(4,'查询用户','USER_QUERY',1),(5,'添加商品','GOODS_ADD',1),(6,'修改商品','GOODS_UPDATE',1),(7,'删除商品','GOODS_DELETE',1),(8,'查询商品','GOODS_QUERY',1),(9,'添加运动项目','SPORT_ADD',1),(10,'修改运动项目','SPORT_UPDATE',1),(11,'删除运动项目','SPORT_DELETE',1),(12,'查询运动项目','SPORT_QUERY',1),(13,'添加菜品','FOOD_ADD',1),(14,'修改菜品','FOOD_UPDATE',1),(15,'删除菜品','FOOD_DELETE',1),(16,'查询菜品','FOOD_QUERY',1);
/*!40000 ALTER TABLE `permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '角色名称',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_SUPERADMIN','超级管理员'),(2,'ROLE_ADMIN','普通管理员'),(3,'ROLE_USER','普通用户');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles_menus`
--

DROP TABLE IF EXISTS `roles_menus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles_menus` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role_id` int NOT NULL COMMENT '角色编号',
  `menu_id` int NOT NULL COMMENT '菜单编号',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `role_id` (`role_id`) USING BTREE,
  KEY `menu_id` (`menu_id`) USING BTREE,
  CONSTRAINT `roles_menus_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `roles_menus_ibfk_2` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles_menus`
--

LOCK TABLES `roles_menus` WRITE;
/*!40000 ALTER TABLE `roles_menus` DISABLE KEYS */;
INSERT INTO `roles_menus` VALUES (1,1,100),(2,1,200),(3,1,101),(4,1,102),(5,1,103),(6,1,104),(7,1,201),(8,1,202),(9,1,203),(10,2,100),(11,2,200),(12,2,101),(13,2,103),(14,2,104),(15,2,201),(16,2,202),(17,2,203),(18,3,200),(19,3,201),(20,3,202),(21,3,203);
/*!40000 ALTER TABLE `roles_menus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles_permissions`
--

DROP TABLE IF EXISTS `roles_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles_permissions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role_id` int NOT NULL COMMENT '角色编号',
  `permission_id` int NOT NULL COMMENT '权限编号',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `role_id` (`role_id`) USING BTREE,
  KEY `permission_id` (`permission_id`) USING BTREE,
  CONSTRAINT `roles_permissions_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `roles_permissions_ibfk_2` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles_permissions`
--

LOCK TABLES `roles_permissions` WRITE;
/*!40000 ALTER TABLE `roles_permissions` DISABLE KEYS */;
INSERT INTO `roles_permissions` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,1,8),(9,1,9),(10,1,10),(11,1,11),(12,1,12),(13,1,13),(14,1,14),(15,1,15),(16,1,16),(17,2,1),(18,2,4),(19,2,5),(20,2,6),(21,2,8),(22,2,10),(23,2,11),(24,2,13),(25,2,14),(26,2,16);
/*!40000 ALTER TABLE `roles_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sport`
--

DROP TABLE IF EXISTS `sport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sport` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '运动名称',
  `applicableAge` varchar(20) DEFAULT NULL COMMENT '使用年龄',
  `beneficialPosition` varchar(255) DEFAULT NULL COMMENT '收益部位(身体)',
  `introduction` text COMMENT '简介(对该运动的描述)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='运动表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sport`
--

LOCK TABLES `sport` WRITE;
/*!40000 ALTER TABLE `sport` DISABLE KEYS */;
INSERT INTO `sport` VALUES (1,'跆拳道','5-60',NULL,NULL),(2,'田径','6-80岁','大腿，肺活量',NULL),(3,'赛艇','6-80岁','大腿、肺活量',NULL),(4,'羽毛球',NULL,NULL,NULL),(6,'篮球',NULL,NULL,NULL),(7,'足球',NULL,NULL,NULL),(8,'拳击',NULL,NULL,NULL),(9,'柔道',NULL,NULL,'123'),(10,'乒乓球',NULL,NULL,NULL),(11,'放风筝','5-60','舒展筋骨，吐故纳新，促进人体新陈代谢，改善血液循环','放风筝在中国有悠久的历史。“纸花如雪满天飞，娇女秋千打四围。五色罗裙风摆动，好将蝴蝶斗春归。”郑板桥的诗歌，形象地描述了江苏扬州春季放风筝的景象。\n\n放风筝要讲究天时地利。4月初，中国大部分地区气温适宜，有比较稳定的上升气流，风筝很容易升空。据专家研究，一般风力在2—5 级时，比较适宜风筝放飞。当然如果遇到雾霾或是沙尘天气，就最好不要逞能了。春天的风向、风速多变，要根据风速和风向变化决定是否放线、调整拉线的方向。此外，在地点的选择上，最好在公园等视野比较开阔、没有障碍物的空旷地带。\n\n放风筝时，手牵引线，来回奔跑，有张有弛，手臂、腰部及腿部的肌肉可以得到锻炼。古人认为，放风筝的最高境界是“放中相牵，一线相连”。放飞后，要精神抖擞，把线看作缰绳，如同驯马一般，然后望天入静，随风筝飘移而前后奔走。\n\n![放风筝.jpg](http://qrn83ytxn.hn-bkt.clouddn.com/ae9ab6f6-d306-49f9-a398-916293ee016ejpg)'),(12,'写代码','8-50','大脑，手指','### 1、逻辑思维能力\n因为程序就是对现实事物的抽象，而且，按照写好的逻辑运行。所以，编程能够锻炼我们的抽象思维能力和逻辑思维能力。\n![9c16fdfaaf51f3deff77bb309beef01f3b297998.jpg](http://qrn83ytxn.hn-bkt.clouddn.com/765daa60-1eda-4d66-9aab-1524134202d0jpg)\n### 2、提高效率\n通过编程，我们能够很容易的处理大量重复性、低效率的工作，从而节省时间。而工作中很多地方都用到了编程来提高生产力，比如 Excel 中的宏，很多 Adobe 的产品都能使用 JavaScrpt 来自动化工作。\n![574e9258d109b3defd85e73cc3bf6c81800a4caf.jpg](http://qrn83ytxn.hn-bkt.clouddn.com/77df30df-392d-4ad3-9e76-d4fe0ba17c31jpg)\n### 3、 改变粗心的毛病\n在编程的世界里，你多输入一个标点符号，都会造成程序大乱，无法运行，更别说在逻辑分析上出现问题。\n### 4、避免被人工智能时代所淘汰，知道未来需要什么样的能力\n前面已经说过了，编程是通向未来的语言，通过学会编程和智能机器沟通。不得不承认，现代社会已经步入信息化科技时代，传统行业正在被科技革新。\n![b3119313b07eca8044c03bb39e2397dda0448398.jpg](http://qrn83ytxn.hn-bkt.clouddn.com/a68fefe2-f2e9-47c1-a276-de4e6cd35a70jpg)\n```java\n	//来一段大家最喜欢的代码\n        async findPage() {\n            this.$ajax.post(\'/sport/findPage\', this.queryInfo).then((res) => {\n                if (!res.data.flag) return this.$message.error(res.data.message);\n                //给列表赋值\n                this.tableData = res.data.data.rows;\n                this.total = res.data.data.total;\n                //console.log(this.tableData);\n                for (let i=0; i<this.tableData.length; i++) {\n                    this.tableData[i].introduction = marked(this.tableData[i].introduction);\n                }\n            }).catch((err) => {\n                console.log(err.message);\n                if (err.request.status == 400) return this.$message.warning(\'请求错误！\');\n                if (err.request.status == 500) return this.$message.warning(\'数据请求失败，请稍后再试！\');\n            });\n        }\n\n```\n');
/*!40000 ALTER TABLE `sport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `submenu`
--

DROP TABLE IF EXISTS `submenu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `submenu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  `component` varchar(255) NOT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `mid` int NOT NULL,
  `state` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `mid` (`mid`),
  CONSTRAINT `submenu_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `mainmenu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `submenu`
--

LOCK TABLES `submenu` WRITE;
/*!40000 ALTER TABLE `submenu` DISABLE KEYS */;
INSERT INTO `submenu` VALUES (101,'用户列表','/user','admin/UserList','iconfont icon-denglu',100,1),(102,'修改权限','/rights','admin/UserRight','iconfont icon-mima',100,1),(103,' 运动模块','/sport','admin/Sport','iconfont icon-shouye',100,1),(104,'商品模块','/goods','admin/GoodList','iconfont icon-shangpin',100,1),(201,'运动科普','/Introduction','sport/Introduction','iconfont icon-shu',200,1),(202,'卡路里','/calories','food/FoodCalories','iconfont icon-qialuli',200,1),(203,'营养配餐','/food','food/Food','iconfont icon-shiwu',200,1);
/*!40000 ALTER TABLE `submenu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'easyproject'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-21 16:33:05
