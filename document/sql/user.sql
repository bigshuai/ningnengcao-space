/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50613
 Source Host           : localhost
 Source Database       : user

 Target Server Type    : MySQL
 Target Server Version : 50613
 File Encoding         : utf-8

 Date: 04/25/2014 09:02:31 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(10) NOT NULL COMMENT '用户主键',
  `user_name` varchar(100) NOT NULL COMMENT '用户姓名',
  `avatar` varchar(100) DEFAULT NULL COMMENT '头像',
  `signature` varchar(255) DEFAULT NULL COMMENT '签名',
  `level` tinyint(3) NOT NULL COMMENT '等级',
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `user_login`
-- ----------------------------
DROP TABLE IF EXISTS `user_login`;
CREATE TABLE `user_login` (
  `user_id` int(10) NOT NULL COMMENT '主键',
  `email` varchar(50) DEFAULT NULL COMMENT '帐号',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '状态',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
