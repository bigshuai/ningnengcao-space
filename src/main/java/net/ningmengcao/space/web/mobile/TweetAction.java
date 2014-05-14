package net.ningmengcao.space.web.mobile;

import net.ningmengcao.space.core.AppUtil;
import net.ningmengcao.space.core.collection.PageSplit;
import net.ningmengcao.space.domain.Tweet;
import net.ningmengcao.space.service.TweetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: chenyuan
 * Date: 5/14/14
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */
@RequestMapping(value = "/m/tweet")
@Controller
public class TweetAction {

    private Logger logger = LoggerFactory.getLogger(TweetAction.class);

    @Autowired
    private TweetService tweetService;


    @RequestMapping(value = "/list/{pageIndex}")
    @ResponseBody
    public Object list(@PathVariable("pageIndex") int pageIndex) {
        logger.debug("pageIndex = {}", pageIndex);
        return tweetService.getTweetList(pageIndex, AppUtil.MAXLENGTH);
    }
}
