package com.ningmengcao.space.service;

import com.ningmengcao.space.base.DaoFactory;
import com.ningmengcao.space.dao.TweetDao;
import com.ningmengcao.space.domain.Tweet;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chenyuan on 4/24/14.
 */
public class TweetService {

    public static Logger logger = LoggerFactory.getLogger(TweetService.class);

    public void save(Tweet tweet) {
        // true 说明会自动, 这里与MySQL表的引擎有关系, 如果是MyISAM, 就不需要, 如果是InnoDB(支持食物), 需要加true
        SqlSession session = DaoFactory.getSessionFactory().openSession();
        try {
            TweetDao dao = session.getMapper(TweetDao.class);
            int rows = dao.insert(tweet);
            logger.info("rows = {}, tweetId = {}", rows, tweet.getTweetId());
        } catch (Exception e) {
            logger.error("tweet = {},e = {}", tweet, e.getStackTrace());
        } finally {
            session.close();
        }
    }

    public Tweet getTweetById(int tweetId) {
        SqlSession session = DaoFactory.getSessionFactory().openSession();
        Tweet tweet = null;
        try {
            TweetDao dao = session.getMapper(TweetDao.class);
            tweet = dao.getTweetById(tweetId);
        } catch (Exception e) {
            logger.error("tweetId = {},e = {}", tweetId, e.getStackTrace());
        } finally {
            session.close();
        }
        return tweet;
    }

    public int update(Tweet tweet) {
        SqlSession session = DaoFactory.getSessionFactory().openSession();
        try {
            TweetDao dao = session.getMapper(TweetDao.class);
            int rows = dao.updateById(tweet);
            if (rows == 0) {
                logger.info("未找到对应的 Tweet, tweetId = {}", tweet.getTweetId());
                return 0;
            }
            logger.info("rows = {}, tweetId = {}", rows, tweet.getTweetId());
            return rows;
        } catch (Exception e) {
            logger.error("tweet = {},e = {}", tweet, e.getStackTrace());
        } finally {
            session.close();
        }
        return 0;
    }
}
