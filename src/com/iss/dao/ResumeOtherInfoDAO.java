package com.iss.dao;

import org.springframework.stereotype.Repository;

import com.iss.modal.ResumeOtherInfo;

@Repository
public interface ResumeOtherInfoDAO {
	int deleteByPrimaryKey(Integer id);

	int insert(ResumeOtherInfo record);

	int insertSelective(ResumeOtherInfo record);

	ResumeOtherInfo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(ResumeOtherInfo record);

	int updateByPrimaryKey(ResumeOtherInfo record);

	int truncateTableData();
}