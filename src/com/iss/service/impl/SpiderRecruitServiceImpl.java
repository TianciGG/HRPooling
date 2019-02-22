package com.iss.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iss.dao.RecruitBaseInfoDAO;
import com.iss.dao.RecruitOtherInfoDAO;
import com.iss.modal.RecruitBaseInfo;
import com.iss.modal.RecruitOtherInfo;
import com.iss.service.SpiderRecruitService;

@Service
public class SpiderRecruitServiceImpl implements SpiderRecruitService {
	@Resource
	private RecruitBaseInfoDAO recruitBaseInfoDao;
	@Resource
	private RecruitOtherInfoDAO recruitOtherInfoDao;

	@Override
	public List<RecruitBaseInfo> selectAllRecruit(String position, String company, String workplace, String salary,
			String urlid) {
		return recruitBaseInfoDao.selectAllRecruit(position, company, workplace, salary, urlid);
	}

	@Override
	public int deleteRecruitData() {
		int mark = 0;
		int m1 = recruitBaseInfoDao.truncateTableData();
		int m2 = recruitOtherInfoDao.truncateTableData();
		if (m1 == 0 && m2 == 0) {
			mark = 1;
		}
		return mark;
	}

	@Override
	public int deleteByIndex(int delId) {
		int mark = recruitBaseInfoDao.deleteByPrimaryKey(delId);
		recruitOtherInfoDao.deleteByPrimaryKey(delId);
		return mark;
	}

	@Override
	public int updateById(RecruitBaseInfo recruitBaseInfo) {
		return recruitBaseInfoDao.updateByPrimaryKeySelective(recruitBaseInfo);
	}

	@Override
	public int insertData(RecruitBaseInfo recruitBaseInfo, RecruitOtherInfo recruitOtherInfo) {
		int mark = 1;
		int m1 = recruitBaseInfoDao.insertSelective(recruitBaseInfo);
		int m2 = 0;
		if (recruitOtherInfo.getCompanynature() != null && recruitOtherInfo.getCompanyscale() != null) {
			m2 = recruitOtherInfoDao.insert(recruitOtherInfo);
			if (m2 == 0) {
				mark = 0;
			}
		}
		if (m1 == 0) {
			mark = 0;
		}
		return mark;
	}

	@Override
	public List<RecruitBaseInfo> selectAllRecruit2(String position, String company, String workplace, String salary,
			String urlid) {
		return recruitBaseInfoDao.selectAllRecruit2(position, company, workplace, salary, urlid);
	}

}
