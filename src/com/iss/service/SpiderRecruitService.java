package com.iss.service;

import java.util.List;

import com.iss.modal.RecruitBaseInfo;
import com.iss.modal.RecruitOtherInfo;

public interface SpiderRecruitService {

	List<RecruitBaseInfo> selectAllRecruit(String position, String company, String workplace, String salary,
			String urlid);

	int deleteRecruitData();

	int deleteByIndex(int delId);

	int updateById(RecruitBaseInfo recruitBaseInfo);

	int insertData(RecruitBaseInfo recruitBaseInfo, RecruitOtherInfo recruitOtherInfo);

	List<RecruitBaseInfo> selectAllRecruit2(String position, String company, String workplace, String salary,
			String urlid);

}
