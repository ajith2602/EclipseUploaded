package com.builder._1_SpringAnnotation_Based_Config;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public void drive() {
		System.out.println("Bike is running");
	}
}
