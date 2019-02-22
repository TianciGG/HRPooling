package com.iss.action.resume;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.DictValue;
import com.iss.service.DictValueService;

@Controller
@RequestMapping("/dictValue")
public class DictValueController {

	@Autowired
	private DictValueService dictValueService;

	@RequestMapping("/getDegreeList.do")
	@ResponseBody
	public List<DictValue> getDegreeList() {

		Integer typeId = 5;

		return dictValueService.DictTypeId(typeId);
	}

}
