package com.iss.service;

import java.util.List;

import com.iss.modal.Attendance;
import com.iss.modal.Resume;

public interface AttendanceService {
	//��ѯ����е�����
    public List<Attendance> selectALL();
    
    //���ģ̬��Ϣ
    public Boolean save(Attendance attendance);
    
    //�޸�ģ̬��Ϣ
    public Boolean update(Attendance attendance);
    
  //ɾ��ģ̬��Ϣ
    public Boolean delete(Integer attendanceid);
}
