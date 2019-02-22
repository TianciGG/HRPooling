package com.iss.service;

import java.util.List;

import com.iss.modal.DegreeWrapper;
import com.iss.modal.Resume;

public interface ResumeServie {

	public Boolean save(Resume resume);

	public Boolean update(Resume resume);

	public Boolean delete(Integer basicinfoid);

	public Resume getResumeById(Integer basicinfoid);

	// ��ѯ����selectAll
	public List<DegreeWrapper> getAll(DegreeWrapper degreeWrapper);

	public List<DegreeWrapper> selectPage(DegreeWrapper degreeWrapper);

	//修改档案记录上的标签（tag=意向/）
	public Boolean updateTag(Resume tag);
}
