package lession1.khaliddhali.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics") //this method automatically convert all the list element to JSON format
	public List<Topic> getAllTopics(){
		return Arrays.asList(
					new Topic("Tajul ", 01),
					new Topic("Saidur", 2),
					new Topic("Roy", 3),
					new Topic("Ali", 4),
					new Topic("Khalid", 5),
					new Topic("Ashik", 6)
				);
	}

}
