package com.test.test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(MyAspect.class);
	
	@Before("execution(* com.test.test.aop.TargetObject.*(..))")
	public void beafore() {
		logger.info("Antes advice, misión interceptar a hello");
	}
}
