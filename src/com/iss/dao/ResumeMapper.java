package com.iss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.iss.modal.DegreeWrapper;
import com.iss.modal.Resume;

public interface ResumeMapper {
	int deleteByPrimaryKey(Integer basicinfoid);

	int insert(Resume record);

	int insertSelective(Resume record);

	Resume selectByPrimaryKey(Integer basicinfoid);

	int updateByPrimaryKeySelective(Resume record);

	int updateByPrimaryKey(Resume record);

	// �Լ�д

	List<DegreeWrapper> selectPage();

	List<DegreeWrapper> selectAll(@Param("name") String name, @Param("address") String address,
			@Param("job") String job, @Param("phone") String phone, @Param("politicalstatus") String politicalstatus,
			@Param("birthdate") String birthdate, @Param("maritalstatus") Boolean maritalstatus,
			@Param("gender") Boolean gender, @Param("degreeid") Integer degreeid);

	  int updateTag(Resume tag);

}