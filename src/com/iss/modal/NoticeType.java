package com.iss.modal;

public class NoticeType {
    private Integer noticetypeid;

    private String noticetypename;

    private String noticetyperemark;

    public Integer getNoticetypeid() {
        return noticetypeid;
    }

    public void setNoticetypeid(Integer noticetypeid) {
        this.noticetypeid = noticetypeid;
    }

    public String getNoticetypename() {
        return noticetypename;
    }

    public void setNoticetypename(String noticetypename) {
        this.noticetypename = noticetypename == null ? null : noticetypename.trim();
    }

    public String getNoticetyperemark() {
        return noticetyperemark;
    }

    public void setNoticetyperemark(String noticetyperemark) {
        this.noticetyperemark = noticetyperemark == null ? null : noticetyperemark.trim();
    }
}