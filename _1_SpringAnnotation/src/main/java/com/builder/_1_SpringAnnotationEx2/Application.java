package com.builder._1_SpringAnnotationEx2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Motorola motox =factory.getBean(Motorola.class);
		motox.config();
		
	}

}
