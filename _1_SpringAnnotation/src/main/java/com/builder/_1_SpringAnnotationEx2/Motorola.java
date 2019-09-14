package com.builder._1_SpringAnnotationEx2;

import org.springframework.beans.factory.annotation.Autowired;

public class Motorola {
	
	@Autowired
	MobileProcessor cpu;
	

	public void config() {		
		System.out.println("Lollypop 4GB RAM, 12 MP Camera"); 
		cpu.process();
	}


	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


}
