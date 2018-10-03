package lession1.khaliddhali.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service //Make the concept clear about it.
public class ProgrammerService {
	
	private List<Programmer> programmers = new ArrayList<>(Arrays.asList(
			new Programmer("Tajul ", 1),
			new Programmer("Saidur", 2),
			new Programmer("Roy", 3),
			new Programmer("Ali", 4),
			new Programmer("Khalid", 5),
			new Programmer("Ashik", 6)
		)); //This is mutable array list
	
	public List<Programmer> getAllTopics(){
		return programmers;
	}
	
	public Programmer getTopicById(int id) {
		return  programmers.stream().filter(l -> l.getId() == id).findFirst().get();
	}
	
	public Programmer getTopicByName(String name) {
		return programmers.stream().filter(l -> l.getName().equals(name)).findFirst().get();
	}
	
	public void addProgrammer(Programmer programmer) {
		programmers.add(programmer);
	}

	public void updateProgrammer(int id, Programmer programmer) {
		// TODO Auto-generated method stub
		for(int i = 0; i<programmers.size(); i++) {
			Programmer p = programmers.get(i);
			if(p.getId() == id) {
				programmers.set(id, programmer);
			}
		}
	}
}
