package net.ningmengcao.space.dao;

import net.ningmengcao.space.domain.Tweet;

public interface TweetMapper {
    int deleteByPrimaryKey(Integer tweetId);

    int insert(Tweet record);

    int insertSelective(Tweet record);

    Tweet selectByPrimaryKey(Integer tweetId);

    int updateByPrimaryKeySelective(Tweet record);

    int updateByPrimaryKey(Tweet record);
}