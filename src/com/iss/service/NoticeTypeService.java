package com.iss.service;

import java.util.List;

import com.iss.modal.NoticeType;

public interface NoticeTypeService {

	List<NoticeType> selectAll();

	public Boolean save(NoticeType noticeType);

	public Boolean update(NoticeType noticeType);

	public Boolean delete(Integer noticetypeid);

}
