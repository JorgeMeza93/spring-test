package com.test.test.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TargetObject {
	
	private static final Logger logger = LoggerFactory.getLogger(TargetObject.class);
	public void hello(String message) {
		logger.info(message);
	}
}
