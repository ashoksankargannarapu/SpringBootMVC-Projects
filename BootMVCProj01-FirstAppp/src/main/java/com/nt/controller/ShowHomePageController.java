package com.nt.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ShowHomePageController {
	
	/*@RequestMapping("/home")
	public String showHome() {
		//return LVN
		return "welcome";
	}*/
	@RequestMapping("/")
	public String showHome() {
		//return LVN
		return "welcome";
	}
	
	/*@RequestMapping("/process")
	public String process(Map<String,Object> map) {
		System.out.println("ShowHomePageController.process()::Share memory Object Class name::"+map.getClass());
		//add model attribute to share memory
		map.put("attr1", "val1");
		map.put("sysDt", LocalDateTime.now());
		
		//return LVN
		return "show_results";
	}*/
	/*@RequestMapping("/process")
	public String process(Model model) {
		System.out.println("ShowHomePageController.process()::Share memory Object Class name::"+model.getClass());
		//add model attribute to share memory
		model.addAttribute("attr1", "val1");
		model.addAttribute("sysDt", LocalDateTime.now());
		
		//return LVN
		return "show_results";
	}*/
	
	@RequestMapping("/process")
	public String process(ModelMap map) {
		System.out.println("ShowHomePageController.process()::Share memory Object Class name::"+map.getClass());
		//add model attribute to share memory
		map.addAttribute("attr1", "val1");
		map.addAttribute("sysDt", LocalDateTime.now());
		
		//return LVN
		return "show_results";
	}
	

}
