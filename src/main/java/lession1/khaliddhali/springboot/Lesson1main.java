package lession1.khaliddhali.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //This is a annotation to tell that this is a spring application.
public class Lesson1main {

	public static void main(String[] args) {
		/*Following is most crucial method for spring boot
		 * SpringApplication is static class, this class annotate following things for spring application when instantiate.
		 * 1. Sets up default configuration
		 * 2. Start Spring Application Context. 
		 * 3. Performs class path scan.
		 * 4. Starts Tomcat server.
		 */
		SpringApplication.run(Lesson1main.class, args);
	}
}
 