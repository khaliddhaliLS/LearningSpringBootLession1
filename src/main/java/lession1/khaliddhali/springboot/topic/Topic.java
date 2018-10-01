package lession1.khaliddhali.springboot.topic;

public class Topic {
	private String name;
	private int id;
	
	//Constructors
	public Topic() {
		//Empty constructor
	}
	public Topic(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	//Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
