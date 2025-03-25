package com.nghiant.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	@GetMapping("/home")
	public String getMethod(ModelMap map) {
		return "home";
	}
	
	
}