package com.hsbc.springboottrainingdatafromtodb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView getWelcomePage() {
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}

}
