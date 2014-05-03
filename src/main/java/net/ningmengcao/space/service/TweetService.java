package net.ningmengcao.space.service;

import net.ningmengcao.space.core.collection.PageSplit;
import net.ningmengcao.space.dao.TweetDao;
import net.ningmengcao.space.domain.Tweet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenyuan on 4/24/14.
 */
@Service
public class TweetService {

    public static Logger logger = LoggerFactory.getLogger(TweetService.class);

    @Autowired
    private TweetDao tweetDao;

    public void save(Tweet tweet) {
        int rows = tweetDao.insert(tweet);
        logger.info("rows = {}, tweetId = {}", rows, tweet.getTweetId());
    }

    public Tweet getTweetById(int tweetId) {
        return tweetDao.getTweetById(tweetId);
    }

    public PageSplit<Tweet> getTweetList(int pageIndex, int maxLength) {
        int totalResult = tweetDao.queryCount();
        if (totalResult == 0) {
            return null;
        }
        PageSplit<Tweet> split = new PageSplit<Tweet>(totalResult, pageIndex, maxLength);
        split.setList(tweetDao.query(split.getFromIndex(), split.getMaxLength()));
        return split;
    }

    public int update(Tweet tweet) {
        int rows = tweetDao.updateById(tweet);
        if (rows == 0) {
            logger.info("未找到对应的 Tweet, tweetId = {}", tweet.getTweetId());
            return 0;
        }
        logger.info("rows = {}, tweetId = {}", rows, tweet.getTweetId());
        return rows;
    }

}
