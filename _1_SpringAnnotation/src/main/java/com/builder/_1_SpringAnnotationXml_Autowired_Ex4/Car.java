package com.builder._1_SpringAnnotationXml_Autowired_Ex4;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	private Tyre tyre;
	
	public void drive() {
		
		System.out.println("Car looks good");
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
}
