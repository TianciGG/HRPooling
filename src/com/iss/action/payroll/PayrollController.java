package com.iss.action.payroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.Payroll;
import com.iss.service.PayrollSevice;
import com.iss.util.BootstrapTableSource;

@Controller
@RequestMapping("/payroll")
public class PayrollController {
	@Autowired
	private PayrollSevice payrollSevice;

	@RequestMapping("/save.do")
	@ResponseBody
	public String save(Payroll payroll) {
		Boolean flag = payrollSevice.save(payroll);

		return flag.toString();

	}

	@RequestMapping("/update.do")
	@ResponseBody
	public String update(Payroll payroll) {
		Boolean flag = payrollSevice.update(payroll);
		return flag.toString();
	}

	@RequestMapping("/delete.do")
	@ResponseBody
	public String delete(Integer payrollid) {
		Boolean flag = payrollSevice.delete(payrollid);
		return flag.toString();

	}

	@RequestMapping("/getAll.do")
	@ResponseBody
	public BootstrapTableSource getAllPayroll() {
		List payrollList = payrollSevice.getAll();
		BootstrapTableSource dataSource = new BootstrapTableSource();
		dataSource.setRows(payrollList);
		dataSource.setTotal(payrollList.size());
		return dataSource;

	}
}
