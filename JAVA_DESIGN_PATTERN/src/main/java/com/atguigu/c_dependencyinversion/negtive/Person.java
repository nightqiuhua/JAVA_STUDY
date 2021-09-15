package com.atguigu.c_dependencyinversion.negtive;
// ����
class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public void play(Piano p) {
		System.out.println(name+"��ʼ����");
		p.sound();
	}
	public void play(Gitar g) {
		System.out.println(name+"��ʼ����");
		g.sound();
	}
	public void play(Harp h) {
		System.out.println(name+"��ʼ����");
		h.sound();
	}
}
