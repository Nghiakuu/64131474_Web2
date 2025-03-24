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
		map.addAttribute("hoTen", "");
		return "home";
	}
	
	@PostMapping("/home")
	public String submitName(@RequestParam(required = false) String hoTen, ModelMap model) {
	    if (hoTen == null || hoTen.isEmpty()) {
	        model.addAttribute("message", "Vui lòng nhập tên của bạn.");
	    } else {
	        model.addAttribute("hoTen", hoTen);
	    }
	    return "home";
	}

	
}