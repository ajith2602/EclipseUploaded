package com.builder._1_SpringXml_Ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
		/*Car car =(Car) context.getBean("car");
		car.drive();
		
		Bike bike =(Bike) context.getBean("bike");
		bike.drive();
		*/
		
		Vehicle obj=(Vehicle)context.getBean("vehicle");
		obj.drive();
		
		
	}

}
