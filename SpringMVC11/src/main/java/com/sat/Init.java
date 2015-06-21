package com.sat;

import org.springframework.boot.context.web.SpringBootServletInitializer;

public class Init extends SpringBootServletInitializer{

	protected Class<?> getConfigClass(){



		return SpringMvc10Application.class;
	}

}
