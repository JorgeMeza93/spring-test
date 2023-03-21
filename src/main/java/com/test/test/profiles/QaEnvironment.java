package com.test.test.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QaEnvironment implements EnviromentService{

	@Override
	public String getEnvironment() {
		return "QA";
	}

}
