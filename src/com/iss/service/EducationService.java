package com.iss.service;

import java.util.List;

import com.iss.modal.EduQueryParam;
import com.iss.modal.EducationInfo;
import com.iss.modal.EducationInfoWrapper;

public interface EducationService {

	public Boolean save(EducationInfo educationInfo);

	public Boolean delete(Integer eduId);

	public Boolean update(EducationInfo educationInfo);

	public EducationInfoWrapper getEducationInfoById(Integer educationInfo);

	// ��ѯ����
	public List<EducationInfoWrapper> getAll();

	// ��ҳ
	public List<EducationInfoWrapper> getPage(EduQueryParam queryParam);
}
