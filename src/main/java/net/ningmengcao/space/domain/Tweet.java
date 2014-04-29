package net.ningmengcao.space.domain;

import java.util.Date;

/**
 * Created by chenyuan on 4/24/14.
 */
public class Tweet {

    private Integer tweetId; // 推文主键
    private String content; // 推文内容
    private String images;// 图片名称
    private Integer userId;// 创建人主键
    private Integer category;// 推文种类
    private Date createTime;// 创建时间
    private Integer source;// 来源

    public Integer getTweetId() {
        return tweetId;
    }

    public void setTweetId(Integer tweetId) {
        this.tweetId = tweetId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "tweetId=" + tweetId +
                ", content='" + content + '\'' +
                ", images='" + images + '\'' +
                ", userId=" + userId +
                ", category=" + category +
                ", createTime=" + createTime +
                ", source=" + source +
                '}';
    }
}
