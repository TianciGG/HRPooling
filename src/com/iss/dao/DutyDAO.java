package com.iss.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iss.DBUtil.DBUtil;
import com.iss.modal.DutyInfo;

public class DutyDAO {

	private DBUtil dbUtil = null;

	public DutyDAO() {
		dbUtil = new DBUtil();
	}

	// ���ְ��
	public Boolean addDuty(DutyInfo dutyInfo) {
		String sql = "Insert into t_duty(dutyName,dutydes,deptId,superId) values(?,?,?,?)";
		int num = dbUtil.update(sql, dutyInfo.getDutyName(), dutyInfo.getDutydes(), dutyInfo.getDeptId(),
				dutyInfo.getSuperId());

		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}

	// ��ѯְ��Table������
	public List<DutyInfo> queryDuty() {

		List<DutyInfo> dutyInfoList = new ArrayList<DutyInfo>();

		String sql = "select y.dutyId,y.dutyName,y.dutydes,p.deptName,t.deptName from t_duty y left join t_dept p on y.deptId=p.deptId left join t_dept t on y.superId=t.deptId";

		ResultSet rs = dbUtil.query(sql);

		try {
			while (rs.next()) {
				DutyInfo dutyInfo = new DutyInfo();
				dutyInfo.setDutyId(rs.getInt("dutyId"));
				dutyInfo.setDutyName(rs.getString("dutyName"));
				dutyInfo.setDutydes(rs.getString("dutydes"));
				dutyInfo.setDeptName(rs.getString("deptName"));
				/* dutyInfo.setSuperDutyName(rs.getString("superDutyName")); */
				dutyInfo.setDeptName(rs.getString("deptName"));
				dutyInfoList.add(dutyInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dutyInfoList;
	}

	// �޸�ְ����Ϣ
	public Boolean updateDuty(DutyInfo dutyInfo) {
		String sql = "update t_duty set dutyName=?,dutydes=?,deptId=?,superId=? where dutyId=?";
		int numb = dbUtil.update(sql, dutyInfo.getDutyName(), dutyInfo.getDutydes(), dutyInfo.getDeptId(),
				dutyInfo.getSuperId(), dutyInfo.getDutyId());
		if (numb > 0) {
			return true;
		} else {
			return false;
		}
	}

	// ɾ��ְ����Ϣ
	public Boolean removeDuty(Integer dutyId) {
		String sql = "delete from t_duty where dutyId=?";
		int numr = dbUtil.update(sql, dutyId);
		if (numr > 0) {
			return true;
		} else {
			return false;
		}
	}

}
