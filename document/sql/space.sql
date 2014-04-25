/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50613
 Source Host           : localhost
 Source Database       : space

 Target Server Type    : MySQL
 Target Server Version : 50613
 File Encoding         : utf-8

 Date: 04/24/2014 14:39:51 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tweet`
-- ----------------------------
DROP TABLE IF EXISTS `tweet`;
CREATE TABLE `tweet` (
  `tweet_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '推文主键',
  `content` varchar(255) NOT NULL COMMENT '推文内容',
  `images` varchar(255) DEFAULT NULL COMMENT '图片名称',
  `user_id` int(10) NOT NULL COMMENT '创建人主键',
  `category` tinyint(4) NOT NULL COMMENT '推文种类',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `source` int(2) NOT NULL COMMENT '来源',
  PRIMARY KEY (`tweet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
