package lession1.khaliddhali.springboot.topic;

public class Programmer {
	private String name;
	private int id;
	
	//Constructors
	public Programmer() {
		//Empty constructor
	}
	public Programmer(String name, int id) {
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
