/*
 * package com.iss.action.dept;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.ResponseBody;
 * 
 * import com.iss.service.DutyServiceInterface; import
 * com.iss.util.BootstrapTableSource;
 * 
 * @Controller
 * 
 * @RequestMapping("/dept") public class DeptController { // 自动装载
 * 对应得Service接口或者service实现类
 * 
 * @Autowired private DutyServiceInterface DeptServiceInterface;
 * 
 * @RequestMapping("/getAll.do")
 * 
 * @ResponseBody public BootstrapTableSource getDeptList() { List deptList =
 * DeptServiceInterface.getAll(); BootstrapTableSource dataSource = new
 * BootstrapTableSource(); dataSource.setRows(deptList);
 * dataSource.setTotal(deptList.size()); return dataSource; } }
 */