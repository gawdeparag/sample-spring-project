package com.parag.sample_spring_project;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	public void drive() {
		System.out.println("It runs on 2 wheels!");
	}
}
