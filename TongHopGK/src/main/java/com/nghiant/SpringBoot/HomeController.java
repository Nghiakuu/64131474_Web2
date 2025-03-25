package com.nghiant.SpringBoot;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class HomeController {
	ArrayList<SinhVien> list = new ArrayList<SinhVien>();
	@GetMapping("/home")
	public String getMethod(ModelMap map) {
		return "home";
	}
	@GetMapping("/about")
	public String aboutMethod(ModelMap map) {
		return "about";
	}
	@GetMapping("/List")
	public String listMethod(ModelMap map) {
	
		list.add(new SinhVien("001", "Nguyen Van A", 8.5));
		list.add(new SinhVien("002", "Nguyen Van B", 7.5));
		list.add(new SinhVien("003", "Nguyen Van C", 9.5));
		map.addAttribute("list", list);
		return "list";
	}
	@GetMapping("/Addnew")
	public String addNewMethod(ModelMap map) {
		map.addAttribute("listSV", list);
		return "Addnew";
	}
	@PostMapping("/Addnew")
	public String addNewPostMethod(ModelMap map, String mssv, String hoten, double dtb) {
		list.add(new SinhVien(mssv, hoten, dtb));
		map.addAttribute("listSV", list);
		return "Addnew";
	}
	
}
