package com.nghiant.SpringBoot;

import java.util.ArrayList;
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
	@GetMapping("/truyenObject")
	public String getStudent(ModelMap model) {
		ArrayList<SinhVien> dsSinhViens=new ArrayList<SinhVien>();
		dsSinhViens.add(new SinhVien(64130554,"Nguyễn Than Nghĩa",21));
		dsSinhViens.add(new SinhVien(64130854,"Trần Quang",21));
		dsSinhViens.add(new SinhVien(64130854,"Lê Diên Hiếu",21));
	
		model.addAttribute("students",dsSinhViens);
		return "sinhviens";
	}

}
