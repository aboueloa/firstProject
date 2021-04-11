package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	//id
	private int id;
	@Autowired
	private Laptop lap;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String show() {
		System.out.println("oki this is working");
		lap.compile();
		return "oki oki";
	}
}
