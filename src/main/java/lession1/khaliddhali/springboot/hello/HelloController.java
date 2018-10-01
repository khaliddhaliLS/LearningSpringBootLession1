package lession1.khaliddhali.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		//This annotation is to mark this class as as Rest Controller.
public class HelloController {
	
	@RequestMapping("/hello") //this annotation map url request to method that would execute on certain controller.
	public String sayHi(){
		return "Hi";
	}
}
