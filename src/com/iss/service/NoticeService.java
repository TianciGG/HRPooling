package com.iss.service;

import java.util.List;

import com.iss.modal.Notice;
import com.iss.modal.NoticeWrapper;

public interface NoticeService {
	List<NoticeWrapper> selectAllNotice();

	public Boolean save(Notice notice);

	public Boolean update(Notice notice);

	public Boolean delete(Integer noticeid);

}
