package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.WorkExperienceMapper;
import com.iss.modal.WorkExperience;
import com.iss.modal.WorkQueryParam;
import com.iss.service.WorkExperienceService;

@Service
public class WorkExperienceServiceImpl implements WorkExperienceService {

	@Autowired
	private WorkExperienceMapper workExperienceMapper;

	@Override
	public Boolean save(WorkExperience workExperience) {

		Boolean flag = false;
		int num = workExperienceMapper.insert(workExperience);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

	@Override
	public Boolean delete(Integer workExperienceid) {
		Boolean flag = false;
		int num = workExperienceMapper.deleteByPrimaryKey(workExperienceid);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

	@Override
	public Boolean update(WorkExperience workExperience) {
		Boolean flag = false;
		int num = workExperienceMapper.updateByPrimaryKey(workExperience);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

	// 查询所有
	@Override
	public List<WorkExperience> getAll() {
		List<WorkExperience> workExperienceList = workExperienceMapper.selectAll();
		return workExperienceList;
	}

	// 分页模糊查询
	@Override
	public List<WorkExperience> getPage(WorkQueryParam queryParam) {

		return workExperienceMapper.selectPage(queryParam);
	}

}
