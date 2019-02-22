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

import com.iss.modal.RecruitBaseInfo;
import com.iss.modal.RecruitOtherInfo;
import com.iss.service.SpiderRecruitService;
import com.iss.spider.impl.RecruitSpiderImplements;
import com.iss.util.RecruitCleanCountThread;
import com.iss.util.RecruitCountThread;
import com.iss.util.RecruitDBUtil;
import com.iss.util.SpiderRecruitClean;

@Controller
@RequestMapping("/spiderRecruit")
public class SpiderRecruitController {
	@Resource
	private SpiderRecruitService spiderRecruitService;

	@RequestMapping("/insertBySpiderPage.do")
	@ResponseBody
	public int insertBySpiderPage(String urlName, String pageNumber, HttpServletRequest request,
			HttpServletResponse response) {
		String savePath = request.getSession().getServletContext().getRealPath("spider") + File.separator;
		System.out.println(savePath);
		RecruitSpiderImplements.basePath = savePath;
		RecruitCleanCountThread.basePath = savePath;
		RecruitCountThread.basePath = savePath;
		SpiderRecruitClean.basePath = savePath;
		int pageNum = Integer.valueOf(pageNumber);
		RecruitDBUtil.password = "root";
		RecruitSpiderImplements rsi = new RecruitSpiderImplements();
		int mark = rsi.spiderByPagination(pageNum, urlName);
		return mark;
	}

	@RequestMapping("/delectByIndex.do")
	@ResponseBody
	public int deleteByIndex(RecruitBaseInfo recruitBaseInfo) {
		int delId = recruitBaseInfo.getId();
		int mark = spiderRecruitService.deleteByIndex(delId);
		return mark;
	}

	@RequestMapping("/updateById.do")
	@ResponseBody
	public int updateById(RecruitBaseInfo recruitBaseInfo) {
		int mark = spiderRecruitService.updateById(recruitBaseInfo);
		return mark;
	}

	@RequestMapping("/insertData.do")
	@ResponseBody
	public int insertData(RecruitBaseInfo recruitBaseInfo, RecruitOtherInfo recruitOtherInfo) {
		recruitBaseInfo.setBatch("100批次");
		recruitBaseInfo.setPage("1");
		int mark = spiderRecruitService.insertData(recruitBaseInfo, recruitOtherInfo);
		return mark;
	}

	@RequestMapping(value = "/getAllRecruit.do", method = RequestMethod.POST)
	@ResponseBody
	public List<RecruitBaseInfo> getAllRecruit(RecruitBaseInfo recruitBaseInfo, HttpServletRequest request,
			HttpServletResponse reponse) throws Exception {
		request.setCharacterEncoding("UTF-8");
		reponse.setCharacterEncoding("UTF-8");
		return spiderRecruitService.selectAllRecruit(recruitBaseInfo.getPosition(), recruitBaseInfo.getCompany(),
				recruitBaseInfo.getWorkplace(), recruitBaseInfo.getSalary(), recruitBaseInfo.getUrlid());
	}

	@RequestMapping(value = "/getAllRecruit2.do", method = RequestMethod.POST)
	@ResponseBody
	public List<RecruitBaseInfo> getAllRecruit2(RecruitBaseInfo recruitBaseInfo, HttpServletRequest request,
			HttpServletResponse reponse) throws Exception {
		request.setCharacterEncoding("UTF-8");
		reponse.setCharacterEncoding("UTF-8");
		return spiderRecruitService.selectAllRecruit2(recruitBaseInfo.getPosition(), recruitBaseInfo.getCompany(),
				recruitBaseInfo.getWorkplace(), recruitBaseInfo.getSalary(), recruitBaseInfo.getUrlid());
	}

	@RequestMapping(value = "/deleteAllData.do", method = RequestMethod.POST)
	@ResponseBody
	public int deleteData(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String savePath = request.getSession().getServletContext().getRealPath("spider") + File.separator;
		System.out.println(savePath);
		RecruitSpiderImplements.basePath = savePath;
		RecruitCleanCountThread.basePath = savePath;
		RecruitCountThread.basePath = savePath;
		SpiderRecruitClean.basePath = savePath;
		SpiderRecruitClean.RecruitCleanZhiLianCountBatch();
		SpiderRecruitClean.RecruitCleanZhiLianLog();
		SpiderRecruitClean.RecruitCleanQianChengCountBatch();
		SpiderRecruitClean.RecruitCleanQianChengLog();
		return spiderRecruitService.deleteRecruitData();
	}

}
