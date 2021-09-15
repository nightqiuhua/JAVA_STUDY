package com.atguigu.c_dependencyinversion.postive;

// �û�

class Harp implements Instruments {
	public void sound() {
		System.out.println("ʥ��ʿ!!!");
	}
}

class Gitar implements Instruments {

	@Override
	public void sound() {
		System.out.println("we will rock you !");
	}
	
}

public class Test {

	public static void main(String[] args) {
		Piano p = new Piano();
		Harp h = new Harp();
		Gitar g = new Gitar();
		Person person = new Person("��ҩʦ");
		person.play(p);
		person.play(h);
		person.play(g);
	}

}
