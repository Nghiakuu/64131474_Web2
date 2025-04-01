package thiGK.ntu64131474;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AppController {
	 @GetMapping("/")
	    public String home(ModelMap model) {
	        return "frontEnd";
	    }

}
