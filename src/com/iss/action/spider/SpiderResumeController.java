package com.iss.action.spider;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.ResumeInfo;
import com.iss.service.SpiderResumeService;
import com.iss.spider.impl.ResumeSpiderImplements;
import com.iss.util.ResumeCleanCountThread;
import com.iss.util.ResumeCountThread;
import com.iss.util.ResumeDBUtil;
import com.iss.util.SpiderResumeClean;

@Controller
@RequestMapping("/spiderResume")
public class SpiderResumeController {
	@Resource
	private SpiderResumeService siperResumeService;

	@RequestMapping(value = "/getAllResume.do", method = RequestMethod.POST)
	@ResponseBody
	public List<ResumeInfo> getAllResume(ResumeInfo resumeInfo, HttpServletRequest request, HttpServletResponse reponse)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		reponse.setCharacterEncoding("UTF-8");
		return siperResumeService.selectAllResume(resumeInfo.getName(), resumeInfo.getSex(), resumeInfo.getEdu(),
				resumeInfo.getAge(), resumeInfo.getExperience(), resumeInfo.getUrlid());
	}

	@RequestMapping(value = "/insertData.do", method = RequestMethod.POST)
	@ResponseBody
	public int insertData(ResumeInfo resumeInfo) {
		resumeInfo.setBatch("100批次");
		resumeInfo.setPage("1");
		int mark = siperResumeService.insertData(resumeInfo);
		return mark;
	}

	@RequestMapping("/updateById1.do")
	@ResponseBody
	public int updateById1(ResumeInfo resumeInfo) {
		int mark = siperResumeService.updateById1(resumeInfo);
		return mark;
	}

	@RequestMapping("/updateById2.do")
	@ResponseBody
	public int updateById2(ResumeInfo resumeInfo) {
		int mark = siperResumeService.updateById2(resumeInfo);
		return mark;
	}

	@RequestMapping(value = "/insertBySpiderPage.do", method = RequestMethod.POST)
	@ResponseBody
	public int insertBySpiderPage(String urlName, String pageNumber, HttpServletRequest request,
			HttpServletResponse response) {
		String savePath = request.getSession().getServletContext().getRealPath("spider") + File.separator;
		System.out.println(savePath);
		ResumeSpiderImplements.basePath = savePath;
		ResumeCleanCountThread.basePath = savePath;
		ResumeCountThread.basePath = savePath;
		SpiderResumeClean.basePath = savePath;
		ResumeSpiderImplements si = new ResumeSpiderImplements();
		int pageNum = Integer.valueOf(pageNumber);
		ResumeDBUtil.password = "root";
	

		int mark = si.spiderByPagination(pageNum, urlName);
		return mark;
	}

	@RequestMapping(value = "/deleteAllData.do", method = RequestMethod.POST)
	@ResponseBody
	public int deleteData(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String savePath = request.getSession().getServletContext().getRealPath("spider") + File.separator;
		System.out.println(savePath);
		ResumeSpiderImplements.basePath = savePath;
		ResumeCleanCountThread.basePath = savePath;
		ResumeCountThread.basePath = savePath;
		SpiderResumeClean.basePath = savePath;
		SpiderResumeClean.ResumeCleanTJPeopleCountBatch();
		SpiderResumeClean.ResumeCleanTJPeopleLog();
		SpiderResumeClean.ResumeCleanGanJiCountBatch();
		SpiderResumeClean.ResumeCleanGanJiLog();
		return siperResumeService.deleteResumeData();
	}

	@RequestMapping("/deleteById.do")
	@ResponseBody
	public int deleteByIndex(ResumeInfo resumeInfo) {
		int delId = resumeInfo.getId();
		int mark = siperResumeService.deleteById(delId);
		return mark;
	}

}
