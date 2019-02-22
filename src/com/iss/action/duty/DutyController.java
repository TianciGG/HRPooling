/*
 * package com.iss.action.duty;
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
 * @RequestMapping("/duty") public class DutyController {
 * 
 * @Autowired private DutyServiceInterface dutyServiceInterface;
 * 
 * 
 * @RequestMapping("/getAll.do")
 * 
 * @ResponseBody public List<Duty> getDutylist() { return
 * dutyServiceInterface.getAll(); }
 * 
 * // 改造后的BootstrapTable
 * 
 * @RequestMapping("/getAll.do")
 * 
 * @ResponseBody public BootstrapTableSource getDutyList() { List dutyList =
 * dutyServiceInterface.getAll(); BootstrapTableSource dataSource = new
 * BootstrapTableSource(); dataSource.setRows(dutyList);
 * dataSource.setTotal(dutyList.size()); return dataSource;
 * 
 * } }
 */