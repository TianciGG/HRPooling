package com.iss.modal;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Notice {
    private Integer noticeid;

    private String noticetitle;

    private Integer noticetypeid;

    private Integer publishuserid;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date publishtime;

    private String content;

    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle == null ? null : noticetitle.trim();
    }

    public Integer getNoticetypeid() {
        return noticetypeid;
    }

    public void setNoticetypeid(Integer noticetypeid) {
        this.noticetypeid = noticetypeid;
    }

    public Integer getPublishuserid() {
        return publishuserid;
    }

    public void setPublishuserid(Integer publishuserid) {
        this.publishuserid = publishuserid;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}