package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.ResumeMapper;
import com.iss.modal.DegreeWrapper;
import com.iss.modal.Resume;
import com.iss.service.ResumeServie;

@Service
public class ResumeServiceImpl implements ResumeServie {

	@Autowired
	private ResumeMapper resumeMapper;

	@Override
	public Boolean save(Resume resume) {

		Boolean flag = false;

		int num = resumeMapper.insert(resume);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

	@Override
	public Boolean update(Resume resmue) {

		Boolean falg = false;

		int num = resumeMapper.updateByPrimaryKey(resmue);
		if (num > 0) {
			falg = true;
		}
		return falg;
	}

	@Override
	public Boolean delete(Integer resumeId) {
		Boolean falg = false;

		int num = resumeMapper.deleteByPrimaryKey(resumeId);
		if (num > 0) {
			falg = true;
		}
		return falg;
	}

	@Override
	public List<DegreeWrapper> getAll(DegreeWrapper degreeWrapper) {
		List<DegreeWrapper> listDegreeWrapper = resumeMapper.selectAll(degreeWrapper.getName(),
				degreeWrapper.getAddress(), degreeWrapper.getJob(), degreeWrapper.getPhone(),
				degreeWrapper.getPoliticalstatus(), degreeWrapper.getBirthdate(), degreeWrapper.getMaritalstatus(),
				degreeWrapper.getGender(), degreeWrapper.getDegreeid());
		return listDegreeWrapper;
	}

	@Override
	public Resume getResumeById(Integer basicinfoid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DegreeWrapper> selectPage(DegreeWrapper degreeWrapper) {
		return resumeMapper.selectPage();

	}

	@Override
	public Boolean updateTag(Resume tag) {
		int flag = resumeMapper.updateTag(tag);
		return flag>0?true:false;

	}

}
