package nghia.nt.ntu.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import nghia.nt.ntu.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}