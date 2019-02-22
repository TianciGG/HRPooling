package com.iss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.iss.modal.ResumeBaseInfo;
import com.iss.modal.ResumeInfo;

@Repository
public interface ResumeBaseInfoDAO {
	int deleteByPrimaryKey(Integer id);

	int insert(ResumeBaseInfo record);

	int insertSelective(ResumeBaseInfo record);

	ResumeBaseInfo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(ResumeBaseInfo record);

	int updateByPrimaryKey(ResumeBaseInfo record);

	// 自定义
	List<ResumeInfo> selectAllRessume(@Param("name") String name, @Param("sex") String sex, @Param("edu") String edu,
			@Param("age") String age, @Param("experience") String experience, @Param("urlid") String urlid);

	int truncateTableData();
}