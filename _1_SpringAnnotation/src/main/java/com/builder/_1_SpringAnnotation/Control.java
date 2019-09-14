package com.builder._1_SpringAnnotation;

public class Control {
	
	Testing t;	
	public void add() {	
		System.out.println(t.getStr());
	}
	public static void main(String[] args) {
		Control c = new Control();
		c.add();
	}
	public Testing getT() {
		return t;
	}
	public void setT(Testing t) {
		this.t = t;
	}
	
}
class Testing{
	String str;
	public String getStr() {
		return str; // did't initialize the values here
				    // how to resolve this null pointer exception
	}				// using getter and setter method 
					// is there any ways ?

	public void setStr(String str) {
		this.str = str;
	}
}