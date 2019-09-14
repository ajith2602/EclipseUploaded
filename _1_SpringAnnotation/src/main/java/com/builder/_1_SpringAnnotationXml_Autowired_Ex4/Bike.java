package com.builder._1_SpringAnnotationXml_Autowired_Ex4;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public void drive() {
		System.out.println("Bike is running");
	}
}
