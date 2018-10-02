package lession1.khaliddhali.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //Make the concept clear about it.
public class ProgrammerService {
	
	private List<Programmer> topics = new ArrayList<>(Arrays.asList(
			new Programmer("Tajul ", 1),
			new Programmer("Saidur", 2),
			new Programmer("Roy", 3),
			new Programmer("Ali", 4),
			new Programmer("Khalid", 5),
			new Programmer("Ashik", 6)
		)); //This is mutable array list
	
	public List<Programmer> getAllTopics(){
		return topics;
	}
	
	public Programmer getTopicById(int id) {
		return  topics.stream().filter(l -> l.getId() == id).findFirst().get();
	}
	
	public Programmer getTopicByName(String name) {
		return topics.stream().filter(l -> l.getName().equals(name)).findFirst().get();
	}
	
	public void addProgrammer(Programmer programmer) {
		topics.add(programmer);
	}
}
