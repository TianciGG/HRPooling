package com.iss.service;

import java.util.List;

import com.iss.modal.ResumeInfo;

public interface SpiderResumeService {

	List<ResumeInfo> selectAllResume(String name, String sex, String edu, String age, String experience, String urlid);

	int deleteResumeData();

	int insertData(ResumeInfo resumeInfo);

	int updateById1(ResumeInfo resumeInfo);

	int updateById2(ResumeInfo resumeInfo);

	int deleteById(int delId);

}
