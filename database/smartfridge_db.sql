/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50550
Source Host           : localhost:3306
Source Database       : smartfridge_db

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2017-04-03 18:50:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rel_user_family
-- ----------------------------
DROP TABLE IF EXISTS `rel_user_family`;
CREATE TABLE `rel_user_family` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `family_id` bigint(20) DEFAULT NULL COMMENT '家庭Id',
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_user_family` (`user_id`,`family_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户与家庭的关联表';

-- ----------------------------
-- Records of rel_user_family
-- ----------------------------
INSERT INTO `rel_user_family` VALUES ('1', '1', '1', '1');
INSERT INTO `rel_user_family` VALUES ('2', '2', '1', '1');
INSERT INTO `rel_user_family` VALUES ('3', '3', '2', '1');
INSERT INTO `rel_user_family` VALUES ('4', '3', '3', '1');

-- ----------------------------
-- Table structure for sys_dic_key
-- ----------------------------
DROP TABLE IF EXISTS `sys_dic_key`;
CREATE TABLE `sys_dic_key` (
  `key_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '字典Id',
  `key_name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '字典名称',
  `create_user` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_user` bigint(20) DEFAULT NULL COMMENT '更改人',
  `update_time` datetime DEFAULT NULL COMMENT '更改时间',
  `status` tinyint(1) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`key_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='字典key表\r\n';

-- ----------------------------
-- Records of sys_dic_key
-- ----------------------------

-- ----------------------------
-- Table structure for sys_dic_value
-- ----------------------------
DROP TABLE IF EXISTS `sys_dic_value`;
CREATE TABLE `sys_dic_value` (
  `value_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '字典数据id',
  `key_id` bigint(20) DEFAULT NULL COMMENT '字典Id',
  `dic_value` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '字典值',
  `is_fixed` tinyint(1) DEFAULT NULL COMMENT '是否固定不变',
  `create_user` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_user` bigint(20) DEFAULT NULL COMMENT '更改人',
  `update_time` datetime DEFAULT NULL COMMENT '更改时间',
  `status` tinyint(1) DEFAULT NULL COMMENT '是否启用',
  PRIMARY KEY (`value_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='字典值表';

-- ----------------------------
-- Records of sys_dic_value
-- ----------------------------

-- ----------------------------
-- Table structure for tab_family
-- ----------------------------
DROP TABLE IF EXISTS `tab_family`;
CREATE TABLE `tab_family` (
  `family_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '家庭Id',
  `family_name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '家庭昵称',
  `family_addr` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '家庭地址',
  `create_user` bigint(20) DEFAULT NULL COMMENT '创建用户',
  `create_time` datetime DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL COMMENT '是否启用',
  PRIMARY KEY (`family_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='家庭表';

-- ----------------------------
-- Records of tab_family
-- ----------------------------
INSERT INTO `tab_family` VALUES ('1', '家庭1', '天津理工大学', '1', '2017-04-03 15:57:35', '1');
INSERT INTO `tab_family` VALUES ('2', '家庭2', '天津大学', '1', '2017-04-03 15:57:38', '1');
INSERT INTO `tab_family` VALUES ('3', '家庭3', '天津师范大学', '3', '2017-04-03 15:57:42', '1');
INSERT INTO `tab_family` VALUES ('9', '家庭4', '天津城建大学', '3', '2017-04-03 17:59:21', '1');

-- ----------------------------
-- Table structure for tab_food
-- ----------------------------
DROP TABLE IF EXISTS `tab_food`;
CREATE TABLE `tab_food` (
  `food_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '食物表',
  `tag_id` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '电子标签id',
  `fridge_id` bigint(20) DEFAULT NULL COMMENT '冰箱id',
  `food_name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '食物名称',
  `food_type` int(11) DEFAULT NULL COMMENT '食物类型',
  `storage_method` int(11) DEFAULT NULL COMMENT '储存方式',
  `manufacturer` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '生产厂家',
  `manufacture_time` datetime DEFAULT NULL COMMENT '生产日期',
  `quality_time` bigint(20) DEFAULT NULL COMMENT '保质期',
  `bind_time` datetime DEFAULT NULL COMMENT '与冰箱绑定的时间',
  `status` tinyint(1) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='食物表';

-- ----------------------------
-- Records of tab_food
-- ----------------------------
INSERT INTO `tab_food` VALUES ('1', '1AFFFFFFE4BFFFFFFAD', null, '西红柿', '0', '0', null, '2017-03-31 23:03:37', '2000', '2017-04-02 23:06:26', '1');
INSERT INTO `tab_food` VALUES ('2', '2A12CFFFFFFAD', null, '西瓜', '1', '0', null, '2017-03-29 23:03:51', '5000', '2017-04-02 23:06:30', '1');
INSERT INTO `tab_food` VALUES ('3', '2A13CFFFFFFAD', null, '马铃薯', '0', '0', null, '2017-03-31 23:04:42', '100000', '2017-04-02 23:06:40', '1');
INSERT INTO `tab_food` VALUES ('4', '2AFFFFFFE3DFFFFFFAD', null, '黄瓜', '0', '0', null, '2017-03-29 23:04:49', '200000', '2017-04-02 23:06:42', '1');
INSERT INTO `tab_food` VALUES ('5', '3A23EFFFFFFAD', '1', '青椒', '0', '0', null, '2017-03-31 23:04:53', '30000', '2017-04-03 00:13:10', '1');
INSERT INTO `tab_food` VALUES ('6', '3A28AFFFFFFAD', null, '西瓜', '1', '0', null, '2017-03-30 23:04:58', '19999', '2017-04-02 23:06:47', '1');
INSERT INTO `tab_food` VALUES ('7', '3AFFFFFFE4DFFFFFFAD', null, '西红柿', '0', '0', null, '2017-04-01 23:05:02', '18907981789', '2017-04-02 23:06:49', '1');
INSERT INTO `tab_food` VALUES ('8', '3AFFFFFFE5BFFFFFFAD', null, '圆白菜', '0', '0', null, '2017-04-02 23:05:07', '8917', '2017-04-02 23:06:50', '1');
INSERT INTO `tab_food` VALUES ('9', '5AFFFFFFE4BFFFFFFAD', null, '鸡蛋', '4', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('10', '6A12CFFFFFFAD', null, '排骨', '3', '1', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('11', '6A13CFFFFFFAD', null, '牛排', '3', '1', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('12', '6AFFFFFFE3DFFFFFFAD', null, '西红柿', '0', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('13', '7A22EFFFFFFAD', null, '排骨', '3', '1', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('14', '7AFFFFFFE5BFFFFFFAD', null, '牛排', '3', '1', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('15', 'A28AFFFFFFAD', null, '草莓', '1', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('16', 'FFFFFF9A12CFFFFFFAD', null, '羊肉', '3', '1', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('17', 'FFFFFF9AFFFFFFE3BFFFFFFAD', null, '黄瓜', '0', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('18', 'FFFFFF9AFFFFFFE3DFFFFFFAD', null, '生菜', '0', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('19', 'FFFFFFBA11CFFFFFFAD', null, '鸡蛋', '4', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('20', 'FFFFFFBA22EFFFFFFAD', '1', '青椒', '0', '0', null, null, null, '2017-04-02 23:21:39', '1');
INSERT INTO `tab_food` VALUES ('21', 'FFFFFFBAFFFFFFE4BFFFFFFAD', null, '西红柿', '0', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('22', 'FFFFFFBAFFFFFFE4DFFFFFFAD', null, '茄子', '0', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('23', 'FFFFFFDA12CFFFFFFAD', null, '圆白菜', '0', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('24', 'FFFFFFDAFFFFFFE3BFFFFFFAD', null, '生菜', '0', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('25', 'FFFFFFDAFFFFFFE3DFFFFFFAD', null, '圆白菜', '0', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('26', 'FFFFFFFA10CFFFFFFAD', null, '草莓', '1', '0', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('27', 'FFFFFFFA22EFFFFFFAD', '1', '马铃薯', '0', '0', null, null, null, '2017-04-02 23:21:39', '1');
INSERT INTO `tab_food` VALUES ('28', 'FFFFFFFA28AFFFFFFAD', null, '牛排', '3', '1', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('29', 'FFFFFFFAFFFFFFE4BFFFFFFAD', null, '羊肉', '3', '1', null, null, null, null, '1');
INSERT INTO `tab_food` VALUES ('30', 'FFFFFFFAFFFFFFE4DFFFFFFAD', null, '西瓜', '1', '0', null, null, null, null, '1');

-- ----------------------------
-- Table structure for tab_food_track
-- ----------------------------
DROP TABLE IF EXISTS `tab_food_track`;
CREATE TABLE `tab_food_track` (
  `track_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '跟踪信息id',
  `food_id` bigint(20) DEFAULT NULL COMMENT '食物表',
  `process_method` bigint(20) DEFAULT NULL COMMENT '处理方式',
  `process_time` datetime DEFAULT NULL COMMENT '处理时间',
  `process_unit` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '处理单位',
  PRIMARY KEY (`track_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='食物生产跟踪';

-- ----------------------------
-- Records of tab_food_track
-- ----------------------------

-- ----------------------------
-- Table structure for tab_fridge
-- ----------------------------
DROP TABLE IF EXISTS `tab_fridge`;
CREATE TABLE `tab_fridge` (
  `fridge_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '冰箱id',
  `family_id` bigint(20) DEFAULT NULL COMMENT '家庭Id',
  `fridge_name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '冰箱名称',
  `fridge_sn` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '冰箱序列号',
  `fridge_spec` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '冰箱型号',
  `status` tinyint(1) DEFAULT NULL COMMENT '是否启用',
  PRIMARY KEY (`fridge_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='冰箱列表';

-- ----------------------------
-- Records of tab_fridge
-- ----------------------------
INSERT INTO `tab_fridge` VALUES ('1', '1', '爱的冰箱', '0B94D3DB-7195-4819-B3FB-9A38BD2BEAC8', '西门子1200', '1');

-- ----------------------------
-- Table structure for tab_session
-- ----------------------------
DROP TABLE IF EXISTS `tab_session`;
CREATE TABLE `tab_session` (
  `client_id` varchar(32) CHARACTER SET utf8 NOT NULL COMMENT '客户端唯一标识',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `token` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '访问token',
  `login_time` datetime DEFAULT NULL COMMENT '登录时间',
  `last_active_time` datetime DEFAULT NULL COMMENT '最后一次活跃时间',
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tab_session
-- ----------------------------
INSERT INTO `tab_session` VALUES ('123', '1', 'ff31df530693aeca849c617632bfe461', '2017-04-02 23:10:47', '2017-04-03 18:50:31');

-- ----------------------------
-- Table structure for tab_user
-- ----------------------------
DROP TABLE IF EXISTS `tab_user`;
CREATE TABLE `tab_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '密码',
  `salt` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '加密盐',
  `name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '姓名',
  `gender` int(11) DEFAULT NULL COMMENT '性别',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `phone` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机号码',
  `email` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'email地址',
  `status` tinyint(1) DEFAULT NULL COMMENT '是否启用',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `index_username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户表';

-- ----------------------------
-- Records of tab_user
-- ----------------------------
INSERT INTO `tab_user` VALUES ('1', 'Jayce', 'cede3881aaa7d0c8afec0f67e37dbdb9', '38276e1207ee9fb75951b2146d90a9fc', '贾俊博', '1', '1994-08-31 00:00:00', '18636913591', 'jaycejia@gmail.com', '1');
INSERT INTO `tab_user` VALUES ('2', 'Lucy', '245fe54d9154a516a2b95079a7dc8daf', '7493235055b439683873f8547e855d50', '刘坤媛', '0', '1994-11-28 00:00:00', '18526549130', '', '1');
INSERT INTO `tab_user` VALUES ('3', 'Congxiaoyao', '8edda86b24562c7aeff63e2fcdf514d5', '9e7536ddddc037a3186bbca15a8dccf9', '丛圣杰', '1', '1994-06-04 16:46:25', null, null, '1');
