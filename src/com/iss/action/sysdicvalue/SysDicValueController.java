package com.iss.action.sysdicvalue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.SysDicValue;
import com.iss.service.SysDicValueService;

@Controller
@RequestMapping("/sysdicvalue")
public class SysDicValueController {
	@Autowired
	private SysDicValueService sysDicValueService;

	@RequestMapping("/getAllDegree.do")
	@ResponseBody
	public List<SysDicValue> getDegreeList() {

		List<SysDicValue> listDicValue = sysDicValueService.selectDegreeMenu();
		return listDicValue;
	}

}
