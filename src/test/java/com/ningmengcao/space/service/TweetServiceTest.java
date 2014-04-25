package com.ningmengcao.space.service;

import com.ningmengcao.space.domain.Category;
import com.ningmengcao.space.domain.Tweet;
import com.ningmengcao.space.domain.TweetSource;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

/**
 * Created by chenyuan on 4/24/14.
 */
public class TweetServiceTest extends TestCase {

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
}
