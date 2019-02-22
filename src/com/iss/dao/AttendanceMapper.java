package com.iss.dao;

import java.util.List;

import com.iss.modal.Attendance;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer attendanceid);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer attendanceid);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);
    
    //查询表格中的数据
    public List<Attendance> selectALL();
}