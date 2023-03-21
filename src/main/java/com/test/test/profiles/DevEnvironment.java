package com.test.test.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevEnvironment implements EnviromentService{

	@Override
	public String getEnvironment() {
		return "DEV";
	}

}
