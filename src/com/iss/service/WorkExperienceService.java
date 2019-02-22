package com.iss.service;

import java.util.List;

import com.iss.modal.WorkExperience;
import com.iss.modal.WorkQueryParam;

public interface WorkExperienceService {

	public Boolean save(WorkExperience workExperience);

	public Boolean delete(Integer workExperienceid);

	public Boolean update(WorkExperience workExperience);

	// 查询所有
	public List<WorkExperience> getAll();

	// 分页模糊查询
	public List<WorkExperience> getPage(WorkQueryParam queryParam);
}
