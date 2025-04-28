package nghia.nt.ntu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import nghia.nt.ntu.entities.Customer;
import nghia.nt.ntu.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository myCustomerRepository;
	public List<Customer> allKH()
		{
			return myCustomerRepository.findAll();
		}
}