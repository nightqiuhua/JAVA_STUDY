package com.atguigu.c_dependencyinversion.postive;
//����
public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void play(Instruments i) {
		i.sound();
	}
}
