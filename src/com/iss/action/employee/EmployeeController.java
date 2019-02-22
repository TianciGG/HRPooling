package com.iss.action.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.Employee;
import com.iss.service.EmployeeService;
import com.iss.util.BootstrapTableSource;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	/*
	 * 相当于 EmployeeService employeeService = new EmployeeServiceImpl();
	 */
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/save.do")
	// 访问路径 ： "/项目名称/employee/save.do"
	@ResponseBody
	public String save(Employee employee) {
		Boolean flag = employeeService.save(employee);
		return flag.toString();
	}

	/*
	 * 把list改造成bootstrap table需要的数据格式
	 */
	@RequestMapping("/getAll.do")
	// 访问路径 ： "/项目名称/employee/save.do"
	@ResponseBody
	public BootstrapTableSource getAll() {

		BootstrapTableSource baseTable = new BootstrapTableSource();

		List<Employee> empList = employeeService.getAll();

		baseTable.setTotal(empList.size());
		baseTable.setRows(empList);

		return baseTable;
	}

}
