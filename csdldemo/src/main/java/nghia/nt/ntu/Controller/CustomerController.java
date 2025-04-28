package nghia.nt.ntu.Controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import nghia.nt.ntu.Service.CustomerService;
import nghia.nt.ntu.entities.Customer;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("customer/all")
	public String getAll(ModelMap m) {
		List<Customer> dsKHs= new ArrayList<Customer>();
		dsKHs = customerService.allKH();
		m.addAttribute("dsKH",dsKHs);
		return "dskh";
	}
}