package com.iss.dao;

import java.util.List;

import com.iss.modal.WorkExperience;
import com.iss.modal.WorkQueryParam;

public interface WorkExperienceMapper {
	int deleteByPrimaryKey(Integer workexperienceid);

	int insert(WorkExperience record);

	int insertSelective(WorkExperience record);

	WorkExperience selectByPrimaryKey(Integer workexperienceid);

	int updateByPrimaryKeySelective(WorkExperience record);

	int updateByPrimaryKey(WorkExperience record);

	// 查询所有
	List<WorkExperience> selectAll();

	// 分页模糊查询
	List<WorkExperience> selectPage(WorkQueryParam queryParam);

}