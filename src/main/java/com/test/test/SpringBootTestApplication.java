package com.test.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.test.aop.TargetObject;
import com.test.test.inyeccionMultiple.AreaCalculatorService;
import com.test.test.profiles.EnviromentService;

import lifecicle.LifeCicleBean;

@SpringBootApplication
public class SpringBootTestApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringBootTestApplication.class);
	
	public static void main(String[] args) {
		//ConfigurableApplicationContext context = SpringApplication.run(SpringBootTestApplication.class, args);
		//EnviromentService enviroment = context.getBean(EnviromentService.class);
		//log.info("Ambiente activo {}", enviroment.getEnvironment());
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootTestApplication.class, args);
		
		//AreaCalculatorService calculador = context.getBean(AreaCalculatorService.class);
		//log.info("Área total es de {}", calculador.calcAreasFiguras());
		//LifeCicleBean bean = context.getBean(LifeCicleBean.class);
		TargetObject targetObject = context.getBean(TargetObject.class);
		targetObject.hello("Hola, amigos.");
		
	}

}
