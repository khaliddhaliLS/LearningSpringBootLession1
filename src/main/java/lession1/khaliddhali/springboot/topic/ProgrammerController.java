package lession1.khaliddhali.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgrammerController {
	
	@Autowired //Autowired Automatically connect to the instance of TopicService (I'm confused, gotta clear it up)
	private ProgrammerService programmerService;
	
	@RequestMapping("/programmers") //this method automatically convert all the list element to JSON format
	public List<Programmer> geAllTopics(){
		return programmerService.getAllTopics();
	}
	
	@RequestMapping("/programmer.id/{id}")
	public Programmer getTopicById(@PathVariable int id) { //@pathVariable is to show spring where to pass that id
		  return programmerService.getTopicById(id);
	}
	
	
	@RequestMapping("/programmer.name/{name}")
	public Programmer getTopicByName(@PathVariable String name) {
		return programmerService.getTopicByName(name);
	}
	
	//Post
	@RequestMapping(method=RequestMethod.POST, value="/programmer.add")
	public void addProgrammer(@RequestBody Programmer programmer) {
		programmerService.addProgrammer(programmer);
	}
}
