package com.atguigu.b_openclose.postive;

// 作者
class DiscountJavaCourse extends JavaCourse {

	public DiscountJavaCourse(String name, double price, int hours) {
		super(name, price, hours);
	}

	@Override
	public double getPrice() {
		return super.getPrice() * 0.8;
	}
}
