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

	// ��ѯ����
	List<WorkExperience> selectAll();

	// ��ҳģ����ѯ
	List<WorkExperience> selectPage(WorkQueryParam queryParam);

}