package com.iss.action.resume;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.DegreeWrapper;
import com.iss.modal.Resume;
import com.iss.service.ResumeServie;

@Controller
@RequestMapping("/resume")
public class ResumeController {

	@Autowired
	private ResumeServie resumeServie;

	@RequestMapping("/save.do")
	@ResponseBody
	public String save(Resume resume) {

		Boolean flag = resumeServie.save(resume);

		return flag.toString();
	}

	@RequestMapping("/update.do")
	@ResponseBody
	public String update(Resume resume) {

		Boolean flag = resumeServie.update(resume);

		return flag.toString();
	}

	@RequestMapping("/delete.do")
	@ResponseBody
	public String delete(Integer basicinfoid) {

		Boolean flag = resumeServie.delete(basicinfoid);

		return flag.toString();
	}

	@RequestMapping("/getAll.do")
	@ResponseBody
	public List<DegreeWrapper> getResumeList(DegreeWrapper degreeWrapper) {

		List<DegreeWrapper> resumueList = resumeServie.getAll(degreeWrapper);
		// List<DegreeWrapper> Pagelist = resumeServie.getPage(degreeWrapper);
		// BootstrapTableSource dataSource = new BootstrapTableSource();
		// dataSource.setTotal(resumueList.size());
		// dataSource.setRows(resumueList);

		return resumueList;
	}

	@RequestMapping("/saveAsIntention.do")
	@ResponseBody
	public Boolean updateTag(Resume tag) {
		System.out.println(tag.getTag());
		Boolean flag = resumeServie.updateTag(tag);
		return flag;

	}

}
