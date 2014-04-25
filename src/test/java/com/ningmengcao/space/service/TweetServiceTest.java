package com.ningmengcao.space.service;

import com.ningmengcao.space.domain.Category;
import com.ningmengcao.space.domain.Tweet;
import com.ningmengcao.space.domain.TweetSource;
import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by chenyuan on 4/24/14.
 */
public class TweetServiceTest extends TestCase {

    private Logger logger = LoggerFactory.getLogger(TweetServiceTest.class);
    TweetService tweetService = new TweetService();

    @Test
    public void testSave(){
        Tweet tweet = new Tweet();
        tweet.setContent("今天天气不错");
        tweet.setUserId(10000);
        tweet.setImages("abcd.jpg");
        tweet.setCategory(Category.NORMAL.ordinal());
        tweet.setCreateTime(new Date());
        tweet.setSource(TweetSource.WEB.ordinal());
        tweetService.save(tweet);
    }

    @Test
    public void testGetTweetById(){
        int tweetId = 1;
        Tweet tweet = tweetService.getTweetById(tweetId);
        logger.info("tweet = {}", tweet);
    }

    @Test
    public void testUpdate() {
        Tweet tweet = new Tweet();
        tweet.setTweetId(2);
        tweet.setContent("今天天气不错111111");
        tweet.setUserId(11111);
        tweet.setImages("22222.jpg");
        tweet.setCategory(Category.NORMAL.ordinal());
        tweet.setCreateTime(new Date());
        tweet.setSource(TweetSource.MOBILE.ordinal());
        tweetService.update(tweet);
    }
}
