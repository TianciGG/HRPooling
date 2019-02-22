package com.iss.action.attendance;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.Attendance;
import com.iss.service.AttendanceService;
import com.iss.util.BootstrapTableSource;

@Controller
@RequestMapping("/attendance")
public class AttendanceController {
	@Autowired
	private AttendanceService attendanceService;

	// ��ѯTable������
	@RequestMapping("/getAll.do")
	@ResponseBody
	public BootstrapTableSource getAttendanceList() {
		List attendanceList = attendanceService.selectALL();
		BootstrapTableSource dataSource = new BootstrapTableSource();
		dataSource.setRows(attendanceList);
		dataSource.setTotal(attendanceList.size());
		return dataSource;
	}

	// �������
	@RequestMapping("/save.do")
	@ResponseBody
	public String save(Attendance attendance) {
		Date date = new Date();
		attendance.setAttendaceTime(date);

		attendance.setCloseingTime(date);

		Boolean falg = attendanceService.save(attendance);
		return falg.toString();
	}

	// �޸�����
	@RequestMapping("/update.do")
	@ResponseBody
	public String update(Attendance attendance) {
		Date date = new Date();
		attendance.setAttendaceTime(date);

		attendance.setCloseingTime(date);
		Boolean falg = attendanceService.update(attendance);
		return falg.toString();
	}

	// ɾ������
	@RequestMapping("/delete.do")
	@ResponseBody
	public String delete(Integer attendanceid) {
		Boolean falg = attendanceService.delete(attendanceid);
		return falg.toString();
	}

}
