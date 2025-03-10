package com.nghiant.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
@Controller
public class AppController {
	@GetMapping("/profile")
	public String thongtinSV(ModelMap m) {
		m.addAttribute("mssv", "64131474");
		m.addAttribute("name", "Nguyễn Thanh Nghĩa");
		m.addAttribute("age", 20);
		m.addAttribute("sex", "Nam");
		return "profile";
	}

}
