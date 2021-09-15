package com.atguigu.a_singleresponsibilty.b;

// 按照这个设计，此时我们要给除法添加判断，只需要修改DivCalc即可，其他的功能不会收到影响!

public class Test4 {
	public static void main(String[] args) {
		// 从键盘输入2个数字，再输入一个运算符，然后计算结果
		double num1 = 100;
		double num2 = 0;
		String oper = "/";
		
		double r = 0;
		
		Calc c = null;

		if ("+".equals(oper)) {
			c = new AddCalc();
		} else if ("-".equals(oper)) {
			c = new SubCalc();
		} else if ("*".equals(oper)) {
			c = new MulCalc();
		} else if ("/".equals(oper)) {
			c = new DivCalc();
		}
		
		r = c.calc(num1, num2);
		
		System.out.println("����ǣ�" + r);
		
	}
}

