package com.iss.dao;

import java.util.List;

import com.iss.modal.DictValue;

public interface DictValueMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(DictValue record);

	int insertSelective(DictValue record);

	DictValue selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(DictValue record);

	int updateByPrimaryKey(DictValue record);

	List<DictValue> selectByTypeId(Integer id);
}