package com.test;
import com.test.Person;

public class Student extends Person {
	String school;
	
	public Student() {
		super("����", 25);
		
		System.out.println("Public Student");
	}
}
