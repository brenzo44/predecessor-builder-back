package com.pred.build;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@EntityScan("com.pred.build")
@EnableJpaRepositories("com.pred.build")
public class BuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildApplication.class, args);
	}

}
