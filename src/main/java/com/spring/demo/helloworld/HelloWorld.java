package com.spring.demo.helloworld;

public class HelloWorld {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Spring:" + this.name);
	}
}
