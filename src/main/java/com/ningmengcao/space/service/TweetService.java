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
        // true 说明会自动
        SqlSession session = DaoFactory.getSessionFactory().openSession(true);
        try {
            TweetDao dao = session.getMapper(TweetDao.class);
            int tweetId = dao.insert(tweet);
            logger.info("tweetId = {}", tweetId);
            session.commit();
        } catch (Exception e) {
            logger.error("tweet = {},e = {}", tweet, e.getStackTrace());
        } finally {
            session.close();
        }
    }


}
