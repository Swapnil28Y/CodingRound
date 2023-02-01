package com.prospecta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProspectaProblem1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProspectaProblem1Application.class, args);
	}

	@Bean
    RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
