package com.iss.action.resume;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.WorkExperience;
import com.iss.modal.WorkQueryParam;
import com.iss.service.WorkExperienceService;
import com.iss.util.BootstrapTableSource;

@Controller
@RequestMapping("/workExperience")
public class WorkExperienceController {

	@Autowired
	private WorkExperienceService workExperienceService;

	@RequestMapping("/save.do")
	@ResponseBody
	public String save(WorkExperience workExperience) {

		Boolean flag = workExperienceService.save(workExperience);

		return flag.toString();
	}

	@RequestMapping("/update.do")
	@ResponseBody
	public String update(WorkExperience workExperience) {

		Boolean flag = workExperienceService.update(workExperience);

		return flag.toString();
	}

	@RequestMapping("/delete.do")
	@ResponseBody
	public String delete(Integer workexperienceid) {

		Boolean flag = workExperienceService.delete(workexperienceid);

		return flag.toString();
	}

	@RequestMapping("/getAll.do")
	@ResponseBody
	public BootstrapTableSource getWorkExperienceList(WorkQueryParam queryParam) {
		List workExperienceList = workExperienceService.getAll();

		List<WorkExperience> workPageList = workExperienceService.getPage(queryParam);

		BootstrapTableSource dataSource = new BootstrapTableSource();

		dataSource.setRows(workPageList);
		dataSource.setTotal(workExperienceList.size());

		return dataSource;
	}

}
