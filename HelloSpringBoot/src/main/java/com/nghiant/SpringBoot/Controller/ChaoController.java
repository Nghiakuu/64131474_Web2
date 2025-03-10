package com.nghiant.SpringBoot.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;

@Controller
public class ChaoController {

		@GetMapping("/chao")
		public String chao( ModelMap m ) {
			m.addAttribute("msg", "Chào");
			return "Hello";
		}	
}
