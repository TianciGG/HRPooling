package com.iss.action.spider;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JumpController {

	// @RequestMapping(value = "goToMyLoginPage.do", method = RequestMethod.GET)
	// public String toIndex() {
	// return "mylogin";
	// }

	@RequestMapping(value = "goToMainPage.do", method = RequestMethod.GET)
	public String goToMainPage() {
		return "main";
	}

	@RequestMapping(value = "goToSpiderResumePage.do", method = RequestMethod.GET)
	public String goToSpiderResumePage() {
		return "spiderResume";
	}

	@RequestMapping(value = "goToSpiderRecruitPage.do", method = RequestMethod.GET)
	public String goToSpiderRecruitPage() {
		return "spiderRecruit";
	}

}
