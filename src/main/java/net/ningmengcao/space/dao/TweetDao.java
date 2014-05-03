package net.ningmengcao.space.dao;

import net.ningmengcao.space.domain.Tweet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenyuan on 4/24/14.
 */
public interface TweetDao {

    Tweet getTweetById(int tweetId);

    int insert(Tweet tweet);

    int updateById(Tweet tweet);

    List<Tweet> query(@Param("fromIndex") int fromIndex, @Param("maxLength") int maxLength);

    int queryCount();

}
