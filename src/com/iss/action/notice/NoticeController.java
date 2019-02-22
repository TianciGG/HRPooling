package com.iss.action.notice;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iss.modal.Notice;
import com.iss.modal.NoticeWrapper;
import com.iss.service.NoticeService;
import com.iss.util.BootstrapTableSource;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;

	@RequestMapping("/getNoticeList.do")
	@ResponseBody
	public BootstrapTableSource getNoticeList() {

		List<NoticeWrapper> noticeList = noticeService.selectAllNotice();

		BootstrapTableSource dataSource = new BootstrapTableSource();

		dataSource.setRows(noticeList);
		dataSource.setTotal(noticeList.size());

		return dataSource;
	}

	@RequestMapping("/add.do")
	@ResponseBody
	public String save(Notice notice) {
		// 获取系统发布时间
		Date date = new Date();
		notice.setPublishtime(date);
		Boolean flag = noticeService.save(notice);

		return flag.toString();
	}

	@RequestMapping("/edit.do")
	@ResponseBody
	public String update(Notice notice) {
		Date date = new Date();
		notice.setPublishtime(date);

		Boolean flag = noticeService.update(notice);

		return flag.toString();
	}

	@RequestMapping("/delete.do")
	@ResponseBody
	public String delete(Integer noticeid) {

		Boolean flag = noticeService.delete(noticeid);

		return flag.toString();
	}
}
