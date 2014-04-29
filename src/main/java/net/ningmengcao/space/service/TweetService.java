package net.ningmengcao.space.service;

import net.ningmengcao.space.core.collection.PageSplit;
import net.ningmengcao.space.core.db.DaoFactory;
import net.ningmengcao.space.dao.TweetDao;
import net.ningmengcao.space.domain.Tweet;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by chenyuan on 4/24/14.
 */
@Service
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

    public PageSplit<Tweet> getTweetList(int pageIndex, int maxLength) {
        PageSplit<Tweet> split = null;
        SqlSession session = DaoFactory.getSessionFactory().openSession();
        try {
            TweetDao dao = session.getMapper(TweetDao.class);
            int totalResult = dao.queryCount();
            if (totalResult == 0) {
                return null;
            }
            split = new PageSplit<Tweet>(totalResult, pageIndex, maxLength);
            split.setList(dao.query(split.getFromIndex(), split.getMaxLength()));
        } catch (Exception e) {
            logger.error("pageIndex = {},maxLength = {}, e = {}", pageIndex, maxLength, e.getStackTrace());
        } finally {
            session.close();
        }
        return split;
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
