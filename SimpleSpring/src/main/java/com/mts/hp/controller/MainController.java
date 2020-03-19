package com.mts.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/main")
public class MainController {

	@RequestMapping(value="")
	public String mainView() {
		return "main";
	}
	
	@RequestMapping(value="/showMessage")
	public String SampleView() {
		return "showMessage";
	}
	
}
