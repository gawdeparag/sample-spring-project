package com.parag.sample_spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	private Tyre tyre;
	
	public void drive() {
		System.out.println("It runs on 4 wheels of " + tyre);
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
}
