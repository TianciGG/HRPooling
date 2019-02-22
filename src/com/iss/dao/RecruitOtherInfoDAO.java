package com.iss.dao;

import org.springframework.stereotype.Repository;

import com.iss.modal.RecruitOtherInfo;

@Repository
public interface RecruitOtherInfoDAO {
	int deleteByPrimaryKey(Integer id);

	int insert(RecruitOtherInfo record);

	int insertSelective(RecruitOtherInfo record);

	RecruitOtherInfo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(RecruitOtherInfo record);

	int updateByPrimaryKey(RecruitOtherInfo record);

	// 自定义
	int truncateTableData();
}