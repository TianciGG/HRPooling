package com.iss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.iss.modal.RecruitBaseInfo;

@Repository
public interface RecruitBaseInfoDAO {
	int deleteByPrimaryKey(Integer id);

	int insert(RecruitBaseInfo record);

	int insertSelective(RecruitBaseInfo record);

	RecruitBaseInfo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(RecruitBaseInfo record);

	int updateByPrimaryKey(RecruitBaseInfo record);

	// 自定义
	List<RecruitBaseInfo> selectAllRecruit(@Param("position") String position, @Param("company") String company,
			@Param("workplace") String workplace, @Param("salary") String salary, @Param("urlid") String urlid);

	int truncateTableData();

	List<RecruitBaseInfo> selectAllRecruit2(@Param("position") String position, @Param("company") String company,
			@Param("workplace") String workplace, @Param("salary") String salary, @Param("urlid") String urlid);
}