package org.gruzdeva.wakey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WakeyApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(WakeyApplication.class, args);
	}

}
