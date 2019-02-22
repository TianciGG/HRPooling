package com.iss.service;

import java.util.List;

import com.iss.modal.Attendance;
import com.iss.modal.Resume;

public interface AttendanceService {
	//查询表格中的数据
    public List<Attendance> selectALL();
    
    //添加模态信息
    public Boolean save(Attendance attendance);
    
    //修改模态信息
    public Boolean update(Attendance attendance);
    
  //删除模态信息
    public Boolean delete(Integer attendanceid);
}
