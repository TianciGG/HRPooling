package com.iss.action.attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.Salary;
import com.iss.service.SalaryService;
import com.iss.util.BootstrapTableSource;

@Controller
@RequestMapping("/salary")
public class SalaryController {
	@Autowired
	private SalaryService salaryService;

	// 实例化一个service对象，并自动转载
	@RequestMapping("/save.do")
	@ResponseBody
	public String save(Salary salary) {
		Boolean flag = salaryService.save(salary);

		return flag.toString();
	}

	@RequestMapping("/getAll.do")
	@ResponseBody
	public BootstrapTableSource getSalaryList() {

		List salaryList = salaryService.getAll();
		BootstrapTableSource dataSource = new BootstrapTableSource();
		dataSource.setRows(salaryList);
		dataSource.setTotal(salaryList.size());

		return dataSource;
	}

	@RequestMapping("/delete.do")
	@ResponseBody
	public String delete(Integer salaryid) {
		Boolean flag = salaryService.delete(salaryid);
		return flag.toString();

	}

	@RequestMapping("/update.do")
	@ResponseBody
	public String update(Salary salary) {
		Boolean flag = salaryService.update(salary);

		return flag.toString();

	}
}
