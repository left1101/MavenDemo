package com.wjdh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("index")
	public ModelAndView indexPage() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

}