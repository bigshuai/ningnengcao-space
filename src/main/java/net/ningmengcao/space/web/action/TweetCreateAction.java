package net.ningmengcao.space.web.action;

import net.ningmengcao.space.core.AppUtil;
import net.ningmengcao.space.domain.Category;
import net.ningmengcao.space.domain.Tweet;
import net.ningmengcao.space.domain.TweetSource;
import net.ningmengcao.space.service.TweetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by chenyuan on 4/28/14.
 */
@Controller
@RequestMapping(value = "/tweet")
public class TweetCreateAction {

    Logger logger = LoggerFactory.getLogger(IndexAction.class);

    @Autowired
    private TweetService tweetService;


    @RequestMapping(value = "/add")
    public String add(@RequestParam(value = "content", required = true) String content,
                      @RequestParam(value = "images", required = false) String images,
                      Model model) {
        Tweet tweet = new Tweet();
        tweet.setContent(content);
        tweet.setImages(images);
        tweet.setUserId(11241);
        tweet.setCategory(Category.NORMAL.ordinal());
        tweet.setCreateTime(new Date());
        tweet.setSource(TweetSource.WEB.ordinal());
        tweetService.save(tweet);
        return AppUtil.PAGE_INDEX;
    }
}
