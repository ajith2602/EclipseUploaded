package com.builder._1_SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Samsung getPhone() {

		return new Samsung();
	}

	@Bean
	public MobileProcessor getMobileProcessor() {

		return new SnapDragon();

	}

}
