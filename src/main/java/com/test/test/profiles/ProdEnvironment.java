package com.test.test.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEnvironment implements EnviromentService {

	@Override
	public String getEnvironment() {
		return "PROD";
	}

}
