package com.iss.dao;

import com.iss.modal.EmpNotice;

public interface EmpNoticeDAO {
    int deleteByPrimaryKey(Integer empnoticeid);

    int insert(EmpNotice record);

    int insertSelective(EmpNotice record);

    EmpNotice selectByPrimaryKey(Integer empnoticeid);

    int updateByPrimaryKeySelective(EmpNotice record);

    int updateByPrimaryKey(EmpNotice record);
}