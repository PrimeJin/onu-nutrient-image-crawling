package com.ssafy.onu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OnuApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnuApplication.class, args);
	}

}
