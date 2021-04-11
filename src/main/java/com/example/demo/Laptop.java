package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void compile() {
		System.out.println("it s compiling");
	}
}
