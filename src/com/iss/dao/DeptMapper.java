package com.iss.dao;

import java.util.List;

import com.iss.modal.Dept;

public interface DeptMapper {
	int deleteByPrimaryKey(Integer deptid);

	int insert(Dept record);

	int insertSelective(Dept record);

	Dept selectByPrimaryKey(Integer deptid);

	int updateByPrimaryKeySelective(Dept record);

	int updateByPrimaryKey(Dept record);

	List<Dept> selectAll();

}