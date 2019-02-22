package com.iss.dao;

import com.iss.modal.ResumeUrl;

public interface ResumeUrlDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeUrl record);

    int insertSelective(ResumeUrl record);

    ResumeUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeUrl record);

    int updateByPrimaryKey(ResumeUrl record);
}