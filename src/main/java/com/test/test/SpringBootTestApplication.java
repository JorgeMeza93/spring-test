package com.test.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.test.profiles.EnviromentService;

@SpringBootApplication
public class SpringBootTestApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringBootTestApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootTestApplication.class, args);
		EnviromentService enviroment = context.getBean(EnviromentService.class);
		log.info("Ambiente activo {}", enviroment.getEnvironment());
	}

}
