package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iss.dao.AttendanceMapper;
import com.iss.modal.Attendance;
import com.iss.modal.Resume;
import com.iss.service.AttendanceService;
@Service
public class AttendanceServiceImpl implements AttendanceService {
	
	@Autowired
	private AttendanceMapper attendanceMapper;
	
	//查询表格中的数据
	@Override
	public List<Attendance> selectALL() {
		List<Attendance> attendanceList = attendanceMapper.selectALL();
		return attendanceList;
	}

	@Override
	public Boolean save(Attendance attendance) {

		Boolean flag = false;

		int num = attendanceMapper.insert(attendance);
		if (num > 0) {
			flag = true;
		}

		return flag;
	}

	@Override
	public Boolean update(Attendance attendance) {
		Boolean falg = false;
		int num = attendanceMapper.updateByPrimaryKeySelective(attendance);
		if(num>0){
			falg=true;
		}
		return falg;
	}

	@Override
	public Boolean delete(Integer attendanceid) {
		Boolean falg = false;
		int num = attendanceMapper.deleteByPrimaryKey(attendanceid);
		if(num>0){
			falg=true;
		}
		return falg;
	}

}
