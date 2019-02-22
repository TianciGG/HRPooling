package com.iss.action.resume;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.EduQueryParam;
import com.iss.modal.EducationInfo;
import com.iss.modal.EducationInfoWrapper;
import com.iss.service.EducationService;
import com.iss.util.BootstrapTableSource;

@Controller
@RequestMapping("/education")
public class EducationController {

	@Autowired
	private EducationService educationService;

	@RequestMapping("/save.do")
	@ResponseBody
	public String save(EducationInfo educationInfo) {

		System.out.println(educationInfo.toString());

		Boolean flag = educationService.save(educationInfo);

		return flag.toString();
	}

	@RequestMapping("/update.do")
	@ResponseBody
	public String update(EducationInfo educationInfo) {

		Boolean flag = educationService.update(educationInfo);

		return flag.toString();
	}

	@RequestMapping("/delete.do")
	@ResponseBody
	public String delete(Integer eduId) {

		Boolean flag = educationService.delete(eduId);

		return flag.toString();
	}

	@RequestMapping("/getAll.do")
	@ResponseBody
	public BootstrapTableSource getEducationInfoList(EduQueryParam queryParam) {
		List educationInfoList = educationService.getAll();

		List<EducationInfoWrapper> educationPageList = educationService.getPage(queryParam);// ·ÖÒ³
		/* System.out.println(queryParam.getSchoolName()); */

		BootstrapTableSource dataSource = new BootstrapTableSource();

		dataSource.setRows(educationPageList);
		dataSource.setTotal(educationInfoList.size());

		return dataSource;
	}
}
