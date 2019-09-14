package com.builder._1_SpringAnnotationXml_Autowired_Ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotate_xml_mixed.xml");
	
	
		Vehicle obj=(Vehicle)context.getBean("car");
		Vehicle obj1=(Vehicle)context.getBean("bike");
		obj.drive();
		obj1.drive();
		
		Tyre tyre =(Tyre)context.getBean("tyre");
		System.out.println(tyre);
		
		
	}

}
