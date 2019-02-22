package com.iss.dao;

import java.util.List;

import com.iss.modal.Duty;

public interface DutyMapper {
	int deleteByPrimaryKey(Integer dutyid);

	int insert(Duty record);

	int insertSelective(Duty record);

	Duty selectByPrimaryKey(Integer dutyid);

	int updateByPrimaryKeySelective(Duty record);

	int updateByPrimaryKey(Duty record);

	List<Duty> selectAll();

}