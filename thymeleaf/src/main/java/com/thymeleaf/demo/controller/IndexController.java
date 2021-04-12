package com.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"","/","/index"})
	public String getIndexPage() {
		System.out.println("Recevied GET request....");
		return "index";
	}
}
