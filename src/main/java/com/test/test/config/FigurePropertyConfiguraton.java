package com.test.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:areas.properties")
public class FigurePropertyConfiguraton {
	@Bean
	public PropertySourcesPlaceholderConfigurer getPropertiesConfig(){
		return new PropertySourcesPlaceholderConfigurer();
	}

}
