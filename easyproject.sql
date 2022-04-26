-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.37-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- 导出 easyproject 的数据库结构
CREATE DATABASE IF NOT EXISTS `easyproject` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `easyproject`;

-- 导出  表 easyproject.easyuser 结构
CREATE TABLE IF NOT EXISTS `easyuser` (
  `id` int(24) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `state` tinyint(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- 正在导出表  easyproject.easyuser 的数据：~8 rows (大约)
DELETE FROM `easyuser`;
/*!40000 ALTER TABLE `easyuser` DISABLE KEYS */;
INSERT INTO `easyuser` (`id`, `username`, `password`, `email`, `role`, `state`) VALUES
	(1, 'admin', '123456', '123@qq.com', '超级管理员', 1),
	(2, 'naughty', '888888', '456@qq.com', '普通管理员', 0),
	(3, 'flysky01', '987654', 'qwe@qq.com', '普通用户', 1),
	(4, 'anglybirds', '321654', 'aaaa@163.com', '普通用户', 0),
	(7, 'admin003', 'q123456', 'c@qq.com', '普通用户', 1),
	(8, 'admin005', '123456', 'cxz@qq.com', '普通用户', 0),
	(9, 'admin007', '123456', 'rty@qq.com', '普通用户', 0),
	(11, 'newme', '123123', '1132066026@qq.com', '普通用户', 0);
/*!40000 ALTER TABLE `easyuser` ENABLE KEYS */;

-- 导出  表 easyproject.goods 结构
CREATE TABLE IF NOT EXISTS `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goodName` varchar(30) NOT NULL,
  `price` float NOT NULL,
  `inStock` int(11) DEFAULT '0',
  `createUserId` int(11) NOT NULL DEFAULT '1',
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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- 正在导出表  easyproject.goods 的数据：~10 rows (大约)
DELETE FROM `goods`;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
INSERT INTO `goods` (`id`, `goodName`, `price`, `inStock`, `createUserId`, `imgUrl`, `modelType`, `controlMode`, `mainFunction`, `wifiFunction`, `battery`, `characteristic`, `size`, `other`, `remark`) VALUES
	(1, '华为运动手环', 19, 30, 1, NULL, '安卓Android,苹果iOS,Android 4.4及以上 iOS 8.0及以上', '触控 ', '来电信息提醒,运动监测,心率监测,数据记录,记步,睡眠监测,时间闹钟', '蓝牙,蓝牙4.2', '待机:45天,工作时长:21天,充电:约1.5小时(25℃环境下),2PIN充电接口', '防水,电话短信功能', '44×19.7×10.3mm', '传感器:3轴加速度传感器,分离式PPG心率计,红外光佩戴检测传感器按钮:一个电容触摸按键', '2021-04-20 17:24:22将华为运动手环商品加入库存'),
	(2, '电动跑步机', 1999, 2, 1, NULL, '无', '按钮控制', '健身跑步', '无', '充电式', '配有嵌入式糖当量、脂肪当量计算模块，能够通过外置液晶屏随时显示燃糖当量、燃脂当量;', '占地面积:长2100*宽870*高1570mm；\n跑带规格:525*3200mm；', '时间、距离、心跳、卡路里、电动扬升、体脂', 'null； 管理员：阿杰于2021-04-21 11:46:08 --> 更新了商品:电动跑步机'),
	(3, '深蹲架', 299, 3, 1, NULL, '无', '无', '深蹲健跨，让你在女性面前狠抬头！', '无', '无', '采用超强耐用钢丝绳，直径达5.5mm', '采用50*100mm优质平椭圆管钢材和50*80mm的方管结合而成\n主体管材厚度达3mm', '无', 'null； 管理员：阿杰于2021-04-21 11:46:17 --> 更新了商品:深蹲架'),
	(4, 'FDR-X100V（准4K运动摄像机）', 500, 5, 1, NULL, '无', '按钮+触控', '将自己运动时的英姿保留下来，留作永久纪念', '蓝牙', '待机:100天,工作时长:45天,充电:约1.5小时(25℃环境下),2PIN充电接口', '像素高达3840x2160、降噪、定点摄像、防抖、防水防潮等', '48×15×10.3mm', '无', 'null； 管理员：阿杰于2021-04-21 11:46:20 --> 更新了商品:FDR-X100V（准4K运动摄像机）'),
	(5, '体感操控的运动耳机', 150, 10, 1, NULL, '安卓Android,苹果iOS,Windows', '滚轮', '在运动的同时欣赏一下音乐是很多人的最爱，但有时例如跑步正在兴头上，一个电话打来，就不得不停下来手忙脚乱的去摸索耳机的线控开关，颇觉得扫兴', 'USB线+蓝牙', '待机:20天,工作时长:2天,充电:约1小时(25℃环境下),2PIN充电接口', '内置的传感器可让聆听者通过手势播放、暂停音乐、甚至接听电话', '看图', 'JBL介绍称，这两款产品分别名为 Reflect Response BT 和 Synchros S210BT，前者为入耳式，后者为头戴式，均内置有体感检测和蓝牙连接模块', 'null； 管理员：阿杰于2021-04-21 11:46:23 --> 更新了商品:体感操控的运动耳机'),
	(6, '智能滑雪板', 400, 5, 1, NULL, '安卓Android,苹果iOS', '按钮', '如今已入深冬，正是叫上小伙伴一起到山上滑雪的季节，那么您试过智能滑雪板吗?没有的话，可以尝试一下日本Cerevo公司的XON Snow-1智能滑雪板，它能记录用户使用中的运动情况，及滑行时的重量分布状况。', '蓝牙', '充电：约5.5小时', '　该产品不仅功能强大，而且“逼格感”十足。其在捆绑带上配备LED灯，随着重量分布发生变化时亮起，虽然只是装饰作用，但运动者不就是要的这个范儿吗?', '产品尺寸（折叠前）约1080×430×1140mm, 产品尺寸（折叠后）约1080×430×490mm', '　该产品不仅功能强大，而且“逼格感”十足。其在捆绑带上配备LED灯，随着重量分布发生变化时亮起，虽然只是装饰作用，但运动者不就是要的这个范儿吗?', 'null； 管理员：阿杰于2021-04-21 11:46:26 --> 更新了商品:智能滑雪板'),
	(7, '瑜伽垫', 20.45, 25, 1, '', '', NULL, '', '', '', '', '', '', ''),
	(9, '无绳跳绳', 45, 100, 1, '', '', NULL, '', '', '', '', '', '', ''),
	(11, '华强北蓝牙耳机', 20, 500, 1, '', '', NULL, '', '', '', '', '', '', '');
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;

-- 导出  表 easyproject.mainmenu 结构
CREATE TABLE IF NOT EXISTS `mainmenu` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8;

-- 正在导出表  easyproject.mainmenu 的数据：~2 rows (大约)
DELETE FROM `mainmenu`;
/*!40000 ALTER TABLE `mainmenu` DISABLE KEYS */;
INSERT INTO `mainmenu` (`id`, `title`, `path`) VALUES
	(100, '权限管理', '/admin'),
	(200, '运动平台', '/use');
/*!40000 ALTER TABLE `mainmenu` ENABLE KEYS */;

-- 导出  表 easyproject.order 结构
CREATE TABLE IF NOT EXISTS `order` (
  `id` bigint(20) NOT NULL COMMENT '订单编号(雪花算法生成)',
  `goodsId` int(11) NOT NULL COMMENT '商品ID',
  `userId` int(11) NOT NULL COMMENT '下单人ID',
  `state` tinyint(4) NOT NULL DEFAULT '0' COMMENT '订单状态 0待支付、1已支付、2已取消',
  `remark` varchar(120) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- 正在导出表  easyproject.order 的数据：~0 rows (大约)
DELETE FROM `order`;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;

-- 导出  表 easyproject.permission 结构
CREATE TABLE IF NOT EXISTS `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT '权限名称',
  `permission` varchar(20) NOT NULL COMMENT '权限标识',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- 正在导出表  easyproject.permission 的数据：~16 rows (大约)
DELETE FROM `permission`;
/*!40000 ALTER TABLE `permission` DISABLE KEYS */;
INSERT INTO `permission` (`id`, `name`, `permission`) VALUES
	(1, '添加用户', 'USER_ADD'),
	(2, '修改用户', 'USER_UPDATE'),
	(3, '删除用户', 'USER_DELETE'),
	(4, '查询用户', 'USER_QUERY'),
	(5, '添加商品', 'GOODS_ADD'),
	(6, '修改商品', 'GOODS_UPDATE'),
	(7, '删除商品', 'GOODS_DELETE'),
	(8, '查询商品', 'GOODS_QUERY'),
	(9, '添加运动项目', 'SPORT_ADD'),
	(10, '修改运动项目', 'SPORT_UPDATE'),
	(11, '删除运动项目', 'SPORT_DELETE'),
	(12, '查询运动项目', 'SPORT_QUERY'),
	(13, '添加菜品', 'FOOD_ADD'),
	(14, '修改菜品', 'FOOD_UPDATE'),
	(15, '删除菜品', 'FOOD_DELETE'),
	(16, '查询菜品', 'FOOD_QUERY');
/*!40000 ALTER TABLE `permission` ENABLE KEYS */;

-- 导出  表 easyproject.role 结构
CREATE TABLE IF NOT EXISTS `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '角色名称',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- 正在导出表  easyproject.role 的数据：~3 rows (大约)
DELETE FROM `role`;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`id`, `name`, `remark`) VALUES
	(1, 'ROLE_SUPERADMIN', '超级管理员'),
	(2, 'ROLE_ADMIN', '普通管理员'),
	(3, 'ROLE_USER', '普通用户');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

-- 导出  表 easyproject.roles_menus 结构
CREATE TABLE IF NOT EXISTS `roles_menus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL COMMENT '角色编号',
  `menu_id` int(11) NOT NULL COMMENT '菜单编号',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `role_id` (`role_id`) USING BTREE,
  KEY `menu_id` (`menu_id`) USING BTREE,
  CONSTRAINT `roles_menus_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `roles_menus_ibfk_2` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- 正在导出表  easyproject.roles_menus 的数据：~21 rows (大约)
DELETE FROM `roles_menus`;
/*!40000 ALTER TABLE `roles_menus` DISABLE KEYS */;
INSERT INTO `roles_menus` (`id`, `role_id`, `menu_id`) VALUES
	(1, 1, 100),
	(2, 1, 200),
	(3, 1, 101),
	(4, 1, 102),
	(5, 1, 103),
	(6, 1, 104),
	(7, 1, 201),
	(8, 1, 202),
	(9, 1, 203),
	(10, 2, 100),
	(11, 2, 200),
	(12, 2, 101),
	(13, 2, 103),
	(14, 2, 104),
	(15, 2, 201),
	(16, 2, 202),
	(17, 2, 203),
	(18, 3, 200),
	(19, 3, 201),
	(20, 3, 202),
	(21, 3, 203);
/*!40000 ALTER TABLE `roles_menus` ENABLE KEYS */;

-- 导出  表 easyproject.sport 结构
CREATE TABLE IF NOT EXISTS `sport` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '运动名称',
  `applicableAge` varchar(20) DEFAULT NULL COMMENT '使用年龄',
  `beneficialPosition` varchar(255) DEFAULT NULL COMMENT '收益部位(身体)',
  `introduction` text COMMENT '简介(对该运动的描述)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='运动表';

-- 正在导出表  easyproject.sport 的数据：~11 rows (大约)
DELETE FROM `sport`;
/*!40000 ALTER TABLE `sport` DISABLE KEYS */;
INSERT INTO `sport` (`id`, `name`, `applicableAge`, `beneficialPosition`, `introduction`) VALUES
	(1, '跆拳道', '5-60', NULL, NULL),
	(2, '田径', '6-80岁', '大腿，肺活量', NULL),
	(3, '赛艇', '6-80岁', '大腿、肺活量', NULL),
	(4, '羽毛球', NULL, NULL, NULL),
	(6, '篮球', NULL, NULL, NULL),
	(7, '足球', NULL, NULL, NULL),
	(8, '拳击', NULL, NULL, NULL),
	(9, '柔道', NULL, NULL, '123'),
	(10, '乒乓球', NULL, NULL, NULL),
	(11, '放风筝', '5-60', '舒展筋骨，吐故纳新，促进人体新陈代谢，改善血液循环', '放风筝在中国有悠久的历史。“纸花如雪满天飞，娇女秋千打四围。五色罗裙风摆动，好将蝴蝶斗春归。”郑板桥的诗歌，形象地描述了江苏扬州春季放风筝的景象。\n\n放风筝要讲究天时地利。4月初，中国大部分地区气温适宜，有比较稳定的上升气流，风筝很容易升空。据专家研究，一般风力在2—5 级时，比较适宜风筝放飞。当然如果遇到雾霾或是沙尘天气，就最好不要逞能了。春天的风向、风速多变，要根据风速和风向变化决定是否放线、调整拉线的方向。此外，在地点的选择上，最好在公园等视野比较开阔、没有障碍物的空旷地带。\n\n放风筝时，手牵引线，来回奔跑，有张有弛，手臂、腰部及腿部的肌肉可以得到锻炼。古人认为，放风筝的最高境界是“放中相牵，一线相连”。放飞后，要精神抖擞，把线看作缰绳，如同驯马一般，然后望天入静，随风筝飘移而前后奔走。\n\n![放风筝.jpg](http://qrn83ytxn.hn-bkt.clouddn.com/ae9ab6f6-d306-49f9-a398-916293ee016ejpg)'),
	(12, '写代码', '8-50', '大脑，手指', '### 1、逻辑思维能力\n因为程序就是对现实事物的抽象，而且，按照写好的逻辑运行。所以，编程能够锻炼我们的抽象思维能力和逻辑思维能力。\n![9c16fdfaaf51f3deff77bb309beef01f3b297998.jpg](http://qrn83ytxn.hn-bkt.clouddn.com/765daa60-1eda-4d66-9aab-1524134202d0jpg)\n### 2、提高效率\n通过编程，我们能够很容易的处理大量重复性、低效率的工作，从而节省时间。而工作中很多地方都用到了编程来提高生产力，比如 Excel 中的宏，很多 Adobe 的产品都能使用 JavaScrpt 来自动化工作。\n![574e9258d109b3defd85e73cc3bf6c81800a4caf.jpg](http://qrn83ytxn.hn-bkt.clouddn.com/77df30df-392d-4ad3-9e76-d4fe0ba17c31jpg)\n### 3、 改变粗心的毛病\n在编程的世界里，你多输入一个标点符号，都会造成程序大乱，无法运行，更别说在逻辑分析上出现问题。\n### 4、避免被人工智能时代所淘汰，知道未来需要什么样的能力\n前面已经说过了，编程是通向未来的语言，通过学会编程和智能机器沟通。不得不承认，现代社会已经步入信息化科技时代，传统行业正在被科技革新。\n![b3119313b07eca8044c03bb39e2397dda0448398.jpg](http://qrn83ytxn.hn-bkt.clouddn.com/a68fefe2-f2e9-47c1-a276-de4e6cd35a70jpg)\n```java\n	//来一段大家最喜欢的代码\n        async findPage() {\n            this.$ajax.post(\'/sport/findPage\', this.queryInfo).then((res) => {\n                if (!res.data.flag) return this.$message.error(res.data.message);\n                //给列表赋值\n                this.tableData = res.data.data.rows;\n                this.total = res.data.data.total;\n                //console.log(this.tableData);\n                for (let i=0; i<this.tableData.length; i++) {\n                    this.tableData[i].introduction = marked(this.tableData[i].introduction);\n                }\n            }).catch((err) => {\n                console.log(err.message);\n                if (err.request.status == 400) return this.$message.warning(\'请求错误！\');\n                if (err.request.status == 500) return this.$message.warning(\'数据请求失败，请稍后再试！\');\n            });\n        }\n\n```\n');
/*!40000 ALTER TABLE `sport` ENABLE KEYS */;

-- 导出  表 easyproject.submenu 结构
CREATE TABLE IF NOT EXISTS `submenu` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  `mid` int(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `mid` (`mid`),
  CONSTRAINT `submenu_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `mainmenu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8;

-- 正在导出表  easyproject.submenu 的数据：~7 rows (大约)
DELETE FROM `submenu`;
/*!40000 ALTER TABLE `submenu` DISABLE KEYS */;
INSERT INTO `submenu` (`id`, `title`, `path`, `mid`) VALUES
	(101, '用户列表', '/user', 100),
	(102, '修改权限', '/rights', 100),
	(103, ' 运动模块', '/sport', 100),
	(104, '商品模块', '/goods', 100),
	(201, '运动科普', '/Introduction', 200),
	(202, '卡路里', '/calories', 200),
	(203, '营养配餐', '/food', 200);
/*!40000 ALTER TABLE `submenu` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
