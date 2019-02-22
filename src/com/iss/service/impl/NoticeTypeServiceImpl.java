package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.NoticeTypeDAO;
import com.iss.modal.NoticeType;
import com.iss.service.NoticeTypeService;

@Service
public class NoticeTypeServiceImpl implements NoticeTypeService {

	@Autowired
	private NoticeTypeDAO noticeTypeDAO;

	@Override
	public List<NoticeType> selectAll() {
		List<NoticeType> noticeTypeList = noticeTypeDAO.selectAll();

		return noticeTypeList;
	}

	@Override
	public Boolean save(NoticeType NoticeType) {
		Boolean flag = false;
		int num = noticeTypeDAO.insert(NoticeType);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

	@Override
	public Boolean update(NoticeType NoticeType) {
		Boolean flag = false;

		int num = noticeTypeDAO.updateByPrimaryKeySelective(NoticeType);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

	@Override
	public Boolean delete(Integer noticetypeid) {
		Boolean flag = false;

		int num = noticeTypeDAO.deleteByPrimaryKey(noticetypeid);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

}
