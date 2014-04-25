package com.ningmengcao.space.web.action;

import com.ningmengcao.space.core.AppUtil;
import com.ningmengcao.space.domain.Tweet;
import com.ningmengcao.space.service.TweetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenyuan on 4/24/14.
 */
@Controller
public class IndexAction {

    Logger logger = LoggerFactory.getLogger(IndexAction.class);

    @Autowired
    private TweetService tweetService;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        logger.debug("============= welcome to index page =============");
        Tweet tweet = tweetService.getTweetById(1);
        logger.debug("tweet = {}", tweet);
        model.addAttribute("tweet", tweet);
        return AppUtil.PAGE_INDEX + ".jsp";
    }

}
