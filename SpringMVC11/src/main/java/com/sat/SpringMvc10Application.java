package com.sat;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({ "com.sat", "com.sat.controller" })
@Configuration

@EnableWebMvc
// @Import({ WebInitializer.class, DispatcherConfig.class})
public class SpringMvc10Application extends SpringBootServletInitializer {

	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { return
	 * application.sources(SpringMvc10Application.class); }
	 */

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(
				SpringMvc10Application.class);
		application.setShowBanner(false);
		;
		application.run(args);

		System.out.println("Let's inspect the beans provided by Spring Boot:");

	}

	/*
	 * @Bean public InternalResourceViewResolver setupViewResolver() {
	 * InternalResourceViewResolver resolver = new
	 * InternalResourceViewResolver(); resolver.setPrefix("/WEB-INF/views/");
	 * resolver.setSuffix(".jsp");
	 *
	 * return resolver; }
	 */

	@Bean(name = "dataSource")
	public DataSource dm() {

		DriverManagerDataSource dbs = new DriverManagerDataSource();

		dbs.setDriverClassName("jdbc.driverClassName");
		dbs.setUrl("jdbc:mysql://localhost:3306/student");
		dbs.setUsername("root");
		dbs.setPassword("root");
		// dbs.max-active=100;

		return dm();

	}

}
