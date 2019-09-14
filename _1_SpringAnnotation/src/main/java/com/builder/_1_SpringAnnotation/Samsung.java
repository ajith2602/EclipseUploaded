package com.builder._1_SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	
	@Autowired
	MobileProcessor cpu;	
	public void config() {
		System.out.println("Octa core, 4GB RAM, 12MP camera");
		cpu.process();	
	}
	

	public MobileProcessor getCpu() {
	
		if(cpu!=null) {
			return cpu;
		}		
		return new SnapDragon();
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}



}
