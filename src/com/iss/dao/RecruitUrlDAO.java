package com.iss.dao;

import com.iss.modal.RecruitUrl;

public interface RecruitUrlDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(RecruitUrl record);

    int insertSelective(RecruitUrl record);

    RecruitUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecruitUrl record);

    int updateByPrimaryKey(RecruitUrl record);
}