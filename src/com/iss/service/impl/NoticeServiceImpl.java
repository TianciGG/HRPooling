package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.NoticeDAO;
import com.iss.modal.Notice;
import com.iss.modal.NoticeWrapper;
import com.iss.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeDAO noticeDao;
	@Override
	public List<NoticeWrapper> selectAllNotice() {
		List<NoticeWrapper> noticeList = noticeDao.selectAllNotice();
		return noticeList;
	
	}
	@Override
	public Boolean save(Notice notice) {
		Boolean flag = false;

		int num = noticeDao.insert(notice);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}
	@Override
	public Boolean update(Notice notice) {
		Boolean flag = false;

		int num = noticeDao.updateByPrimaryKeySelective(notice);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}
	@Override
	public Boolean delete(Integer noticeid) {
		Boolean flag = false;

		int num = noticeDao.deleteByPrimaryKey(noticeid);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}


}
