package com.ningmengcao.space.dao;

import com.ningmengcao.space.domain.Tweet;

/**
 * Created by chenyuan on 4/24/14.
 */
public interface TweetDao {

    public Tweet getTweetById(int tweetId);

    public int insert(Tweet tweet);
}
