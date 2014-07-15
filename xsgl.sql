adminidSET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'luo', '123');
INSERT INTO `admin` VALUES ('2', 'admin', 'admin');
INSERT INTO `admin` VALUES ('3', 'l', 'l');

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` varchar(20) DEFAULT NULL,
  `cname` varchar(20) DEFAULT NULL,
  `kkxq` varchar(20) DEFAULT NULL,
  `xs` varchar(20) DEFAULT NULL,
  `xf` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cid` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '101', 'C语言程序设计', '1', '72', '2');
INSERT INTO `course` VALUES ('2', '102', '高等数学', '1', '72', '4');
INSERT INTO `course` VALUES ('3', '301', '数据库原理', '3', '80', '5');
INSERT INTO `course` VALUES ('4', '302', '计算机组成原理', '5', '80', '5');
INSERT INTO `course` VALUES ('5', '303', '计算机网络', '5', '72', '5');
INSERT INTO `course` VALUES ('6', '501', 'Java EE框架程序设计', '6', '72', '4');
INSERT INTO `course` VALUES ('7', '502', 'Ajax程序设计', '6', '36', '2');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` varchar(20) DEFAULT NULL,
  `sname` varchar(20) DEFAULT NULL,
  `subject` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sid` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '091714227', '罗歌', '计算机科学与技术');
INSERT INTO `student` VALUES ('2', '091714242', '肖二', '计算机科学与技术');
INSERT INTO `student` VALUES ('3', '091714265', '张三', '计算机科学与技术');
INSERT INTO `student` VALUES ('4', '091714266', '李四', '计算机科学与技术');
INSERT INTO `student` VALUES ('5', '091714267', '王五', '计算机科学与技术');
INSERT INTO `student` VALUES ('6', '091714268', '赵六', '计算机科学与技术');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tid` varchar(20) DEFAULT NULL,
  `tname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '17001', '郑老师');
INSERT INTO `teacher` VALUES ('2', '17002', '卢老师');
INSERT INTO `teacher` VALUES ('3', '17003', '李老师');
INSERT INTO `teacher` VALUES ('4', '17004', '陈老师');
INSERT INTO `teacher` VALUES ('5', '17005', '熊老师');
INSERT INTO `teacher` VALUES ('6', '17006', '朱老师');
INSERT INTO `teacher` VALUES ('7', '17007', '焦老师');
INSERT INTO `teacher` VALUES ('8', '17008', '魏老师');
INSERT INTO `teacher` VALUES ('9', '17009', '陈老师');
