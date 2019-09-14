package com.builder._1_SpringAnnotationEx2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Motorola getMotorola(){		
		System.out.println("Motorola---Configured");
		return new Motorola();				
	}
	@Bean
	public MobileProcessor getProcessor() {
		
		return new LollyPOP();
	}
	

}
