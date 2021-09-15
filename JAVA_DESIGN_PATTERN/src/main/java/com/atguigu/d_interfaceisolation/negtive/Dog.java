package com.atguigu.d_interfaceisolation.negtive;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("���Թ�ͷ");
	}

	@Override
	public void run() {
		System.out.println("����");
	}

	@Override
	public void fly() {
		throw new UnsupportedOperationException("���ҿ�!");
	}

	@Override
	public void siwm() {
		System.out.println("����");
	}

}
