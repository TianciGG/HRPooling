package com.iss.action.noticeType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.NoticeType;
import com.iss.service.NoticeTypeService;

@Controller
@RequestMapping("/noticeType")
public class NoticeTypeController {

	@Autowired
	private NoticeTypeService noticeTypeService;

	@RequestMapping("/getAllNoticeType.do")
	@ResponseBody
	/*
	 * public BootstrapTableSource selectAll() { List<NoticeType> noticeTypeList
	 * = noticeTypeService.selectAll(); BootstrapTableSource dataSource = new
	 * BootstrapTableSource(); dataSource.setRows(noticeTypeList);
	 * dataSource.setTotal(noticeTypeList.size()); return dataSource; }
	 */

	public List<NoticeType> selectAll() {

		List<NoticeType> noticeTypeList = noticeTypeService.selectAll();
		return noticeTypeList;
	}

	@RequestMapping("/addNoticeType.do")
	@ResponseBody
	public String save(NoticeType noticeType) {

		Boolean flag = noticeTypeService.save(noticeType);

		return flag.toString();
	}

	@RequestMapping("/editNoticeType.do")
	@ResponseBody
	public String update(NoticeType noticeType) {

		Boolean flag = noticeTypeService.update(noticeType);

		return flag.toString();
	}

	@RequestMapping("/deleteNoticeType.do")
	@ResponseBody
	public String delete(Integer noticetypeid) {

		Boolean flag = noticeTypeService.delete(noticetypeid);

		return flag.toString();
	}

}
