package net.ningmengcao.space.service;

import net.ningmengcao.space.core.collection.PageSplit;
import net.ningmengcao.space.domain.Category;
import net.ningmengcao.space.domain.Tweet;
import net.ningmengcao.space.domain.TweetSource;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by chenyuan on 4/24/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TweetServiceTest{

    private Logger logger = LoggerFactory.getLogger(TweetServiceTest.class);

    @Autowired
    private TweetService tweetService;

    @Test
    public void testSave(){
        Tweet tweet = new Tweet();
        tweet.setContent("今天天气不错");
        tweet.setUserId(10000);
        tweet.setImages("abcd.jpg");
        tweet.setCategory(Category.NORMAL.ordinal());
        tweet.setCreateTime(new Date());
        tweet.setSource(TweetSource.WEB.ordinal());
        for (int i = 0; i < 100; i ++) {
            tweetService.save(tweet);
        }
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

    @Test
    public void testGetTweetList(){
        int pageIndex = 1;
        int maxLength = 10;
        PageSplit<Tweet> split = tweetService.getTweetList(pageIndex, maxLength);
        if (split != null && split.getList() != null) {
            for(Tweet t : split.getList()) {
                logger.info("tweet = {}", t);
            }
        }
    }
}
