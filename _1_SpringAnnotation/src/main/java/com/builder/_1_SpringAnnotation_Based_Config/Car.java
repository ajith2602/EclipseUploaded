package com.builder._1_SpringAnnotation_Based_Config;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	public void drive() {
		
		System.out.println("Car is moving slowly");
	}
}
