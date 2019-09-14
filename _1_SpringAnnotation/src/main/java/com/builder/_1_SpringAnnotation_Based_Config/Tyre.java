package com.builder._1_SpringAnnotation_Based_Config;

public class Tyre {

	private String tyre;

	public Tyre(String tyre) {
		super();
		this.tyre = tyre;
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	@Override
	public String toString() {
		return "Tyre [tyre=" + tyre + "]";
	}
	 	
}
