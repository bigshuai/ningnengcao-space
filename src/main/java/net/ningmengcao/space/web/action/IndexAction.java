package net.ningmengcao.space.web.action;

import net.ningmengcao.space.core.AppUtil;
import net.ningmengcao.space.core.collection.PageSplit;
import net.ningmengcao.space.domain.Tweet;
import net.ningmengcao.space.service.TweetService;
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


    private Logger logger = LoggerFactory.getLogger(IndexAction.class);

    @Autowired
    private TweetService tweetService;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        int pageIndex = 1;
        int maxLength = 10;
        logger.debug("============= welcome to index page =============");
        PageSplit<Tweet> split = tweetService.getTweetList(pageIndex, maxLength);
        model.addAttribute("split", split);
        return AppUtil.PAGE_INDEX;
    }

}
