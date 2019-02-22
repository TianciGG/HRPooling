package com.iss.dao;

import com.iss.modal.SysDicType;

public interface SysDicTypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDicType record);

    int insertSelective(SysDicType record);

    SysDicType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDicType record);

    int updateByPrimaryKey(SysDicType record);
}