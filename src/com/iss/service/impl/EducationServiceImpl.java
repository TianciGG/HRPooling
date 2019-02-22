package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.EducationInfoMapper;
import com.iss.modal.EduQueryParam;
import com.iss.modal.EducationInfo;
import com.iss.modal.EducationInfoWrapper;
import com.iss.service.EducationService;

@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	private EducationInfoMapper educationInfoMapper;

	@Override
	public Boolean save(EducationInfo educationInfo) {

		Boolean flag = false;

		int num = educationInfoMapper.insert(educationInfo);
		if (num > 0) {
			flag = true;
		}

		return flag;

	}

	@Override
	public Boolean delete(Integer eduid) {

		Boolean flag = false;

		int num = educationInfoMapper.deleteByPrimaryKey(eduid);
		if (num > 0) {
			flag = true;
		}

		return flag;

	}

	@Override
	public Boolean update(EducationInfo educationInfo) {
		Boolean flag = false;

		int num = educationInfoMapper.updateByPrimaryKey(educationInfo);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

	@Override
	public EducationInfoWrapper getEducationInfoById(Integer educationInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EducationInfoWrapper> getAll() {

		List<EducationInfoWrapper> educationInfoList = educationInfoMapper.selectAll();
		return educationInfoList;
	}

	@Override
	public List<EducationInfoWrapper> getPage(EduQueryParam queryParam) {

		return educationInfoMapper.selectPage(queryParam);
	}

}
