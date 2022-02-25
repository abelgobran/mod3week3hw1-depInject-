package Mod3homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mod3wk3hw1DepInjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mod3wk3hw1DepInjectApplication.class, args);
		AnotherPerson bobby = new AnotherPerson();
		
		bobby.setName("Bobby");
		bobby.setAge(25);
		bobby.setAddress("555 average ave");
		
		
	}

}
