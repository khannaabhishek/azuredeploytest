package com.thymeleaf.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@Value("${app.location}")
	String appLocation;
	
	@RequestMapping({"","/","/index"})
	public String getIndexPage(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		System.out.println("Recevied GET request....");
		model.addAttribute("name", name);
		model.addAttribute("applocation",appLocation);
		return "index";
	}
}
