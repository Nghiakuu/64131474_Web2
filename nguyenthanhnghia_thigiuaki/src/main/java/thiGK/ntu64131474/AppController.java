package thiGK.ntu64131474;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import thiGK.ntu64131474.model.Topic;
@Controller
public class AppController {
	public ArrayList<Topic> topics = new ArrayList<>();
	public AppController() {
		topics.add(new Topic("1", "Topic 1", "Description 1", 1L, "Type 1"));
		topics.add(new Topic("2", "Topic 2", "Description 2", 2L, "Type 2")); 
		topics.add(new Topic("3", "Topic 3", "Description 3", 3L, "Type 3"));
	}
	@GetMapping("/")
	    public String home(ModelMap model) {
	        return "frontEnd";
	    }
	@GetMapping("/topic/all")
	public String topic(ModelMap model) {
		model.addAttribute("topics", topics);
		return "topic";
	}
	@PostMapping("/topic/new")
	public String newTopic(ModelMap model,String id,String topicName,String topicDescription,Long supervisorId,String topicType) {
		topics.add(new Topic(id,topicName, topicDescription, supervisorId, topicType));
		model.addAttribute("topics",topics );
		return "topic";
	}
	@GetMapping("/topic/view/id")
	public String editTopic(ModelMap model,String viewId) {
		
		Topic topic = null;
		for(Topic t : topics) {
			if(t.id.equals(viewId)) {
				topic = t;
				break;
			}
		}
		model.addAttribute("topics", topic);
		return "topic";
	}
	@GetMapping("/topic/delete/id")
	public String deleteTopic(ModelMap model,String deleteId) {
		topics.removeIf(t -> t.id.equals(deleteId));
		model.addAttribute("topics", topics);
		return "topic";
	}



}
