package com.ningmengcao.space.domain;

import java.util.Date;

/**
 * Created by chenyuan on 4/24/14.
 */
public class Tweet {

    private int tweetId; // 推文主键
    private String content; // 推文内容
    private String images;// 图片名称
    private int userId;// 创建人主键
    private int category;// 推文种类
    private Date createTime;// 创建时间
    private int source;// 来源

    public int getTweetId() {
        return tweetId;
    }

    public void setTweetId(int tweetId) {
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
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
