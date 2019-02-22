package com.iss.dao;

import java.util.List;

import com.iss.modal.Notice;
import com.iss.modal.NoticeWrapper;

public interface NoticeDAO {
    int deleteByPrimaryKey(Integer noticeid);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer noticeid);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
    
  /*  查询表格数据*/
    List<NoticeWrapper> selectAllNotice();
}