package com.learning.springapi;

import com.learning.springapi.run.Location;
import com.learning.springapi.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringapiApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringapiApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringapiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
	 	return args -> {
			 Run run = new Run(1,"parvez",4, Location.INDOOR);
			 log.info("Run " + run);
		};
	}

}
