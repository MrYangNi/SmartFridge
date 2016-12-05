/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : smartfridge

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2016-12-05 08:05:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rel_user_family
-- ----------------------------
DROP TABLE IF EXISTS `rel_user_family`;
CREATE TABLE `rel_user_family` (
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `family_id` bigint(20) DEFAULT NULL COMMENT '家庭Id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户与家庭的关联表';

-- ----------------------------
-- Records of rel_user_family
-- ----------------------------

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
  `status` tinyint(1) DEFAULT NULL COMMENT '是否启用',
  PRIMARY KEY (`family_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='家庭表';

-- ----------------------------
-- Records of tab_family
-- ----------------------------

-- ----------------------------
-- Table structure for tab_food
-- ----------------------------
DROP TABLE IF EXISTS `tab_food`;
CREATE TABLE `tab_food` (
  `food_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '食物表',
  `tag_id` bigint(20) DEFAULT NULL COMMENT '电子标签id',
  `fridge_id` bigint(20) DEFAULT NULL COMMENT '冰箱id',
  `food_name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '食物名称',
  `food_type` bigint(20) DEFAULT NULL COMMENT '食物类型',
  `storage_method` bigint(20) DEFAULT NULL COMMENT '储存方式',
  `manufacturer` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '生产厂家',
  `manufacture_time` datetime DEFAULT NULL COMMENT '生产日期',
  `quality_time` bigint(20) DEFAULT NULL COMMENT '保质期',
  `status` bigint(20) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='食物表';

-- ----------------------------
-- Records of tab_food
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='冰箱列表';

-- ----------------------------
-- Records of tab_fridge
-- ----------------------------

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

-- ----------------------------
-- Table structure for tab_tag
-- ----------------------------
DROP TABLE IF EXISTS `tab_tag`;
CREATE TABLE `tab_tag` (
  `tag_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '电子标签id',
  `tag_uid` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '电子标签的sn',
  `status` tinyint(1) DEFAULT NULL COMMENT '是否启用',
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='电子标签表';

-- ----------------------------
-- Records of tab_tag
-- ----------------------------

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
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户表';

-- ----------------------------
-- Records of tab_user
-- ----------------------------

-- ----------------------------
-- Table structure for test_table
-- ----------------------------
DROP TABLE IF EXISTS `test_table`;
CREATE TABLE `test_table` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `message` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of test_table
-- ----------------------------
INSERT INTO `test_table` VALUES ('1', '哈哈哈');
