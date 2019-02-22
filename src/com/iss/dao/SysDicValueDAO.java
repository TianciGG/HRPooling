package com.iss.dao;

import java.util.List;

import com.iss.modal.SysDicValue;

public interface SysDicValueDAO {
	int deleteByPrimaryKey(Integer id);

	int insert(SysDicValue record);

	int insertSelective(SysDicValue record);

	SysDicValue selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysDicValue record);

	int updateByPrimaryKey(SysDicValue record);

	// 查询基本信息表的学历下拉菜单
	List<SysDicValue> selectDegreeMenu();

	// List<SysDicValue> selectDegreePage(SysDicValue queryDegree);
}