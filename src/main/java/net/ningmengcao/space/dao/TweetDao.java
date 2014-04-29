package net.ningmengcao.space.dao;

import net.ningmengcao.space.domain.Tweet;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenyuan on 4/24/14.
 */
public interface TweetDao {

    public Tweet getTweetById(int tweetId);

    public int insert(Tweet tweet);

    public int updateById(Tweet tweet);

    public List<Tweet> query(@Param("fromIndex") int fromIndex, @Param("maxLength") int maxLength);
    //public List<Tweet> query(int fromIndex, int maxLength);

    public int queryCount();

}
