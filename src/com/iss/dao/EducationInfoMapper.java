package com.iss.dao;

import java.util.List;

import com.iss.modal.EduQueryParam;
import com.iss.modal.EducationInfo;
import com.iss.modal.EducationInfoWrapper;

public interface EducationInfoMapper {
	int deleteByPrimaryKey(Integer eduid);

	int insert(EducationInfo record);

	int insertSelective(EducationInfo record);

	EducationInfoWrapper selectByPrimaryKey(Integer eduid);

	int updateByPrimaryKeySelective(EducationInfo record);

	int updateByPrimaryKey(EducationInfo record);

	// ��ѯ����
	List<EducationInfoWrapper> selectAll();

	// ��ҳ
	List<EducationInfoWrapper> selectPage(EduQueryParam queryParam);
}