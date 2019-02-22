package com.iss.service;

import java.util.List;

import com.iss.modal.WorkExperience;
import com.iss.modal.WorkQueryParam;

public interface WorkExperienceService {

	public Boolean save(WorkExperience workExperience);

	public Boolean delete(Integer workExperienceid);

	public Boolean update(WorkExperience workExperience);

	// ��ѯ����
	public List<WorkExperience> getAll();

	// ��ҳģ����ѯ
	public List<WorkExperience> getPage(WorkQueryParam queryParam);
}
