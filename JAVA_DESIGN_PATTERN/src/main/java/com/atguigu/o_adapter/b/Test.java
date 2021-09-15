package com.atguigu.o_adapter.b;

import java.util.Arrays;

interface Proccessor {
	String name();
	// 为了当子类向上转型以后，还能调用这个proccess方法，所以才在父类这里定义出这个proccess方法
	Object proccess(Object input) ;
}

abstract class StringProccessor implements Proccessor {
	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}

}

class Upcase extends StringProccessor {
	public String proccess(Object obj) {
		return ((String)obj).toUpperCase();
	}
}

class Downcase extends StringProccessor {
	public String proccess(Object obj) {
		return ((String)obj).toLowerCase();
	}
}

class Splitter extends StringProccessor {
	public String proccess(Object obj) {
		return Arrays.toString(((String)obj).split(" "));
	}
}


class Apply {
	public static void proccess(Proccessor p, Object s) {
		System.out.println(p.name());
		System.out.println(p.proccess(s));
	}
}


class FilterAdapter implements Proccessor {

	private Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.name();
	}

	@Override
	public Object proccess(Object input) {
		return filter.proccess((WaveForm)input);
	}

}

public class Test {
	public static void main(String[] args) {
		String str = "How are you! What's this? This is a desk!";

		Apply.proccess(new Upcase(), str);
		Apply.proccess(new Downcase(), str);
		Apply.proccess(new Splitter(), str);

		WaveForm wf = new WaveForm();

		Apply.proccess(new FilterAdapter(new LowPass(10)), wf);
		Apply.proccess(new FilterAdapter(new HighPass(10)), wf);
		Apply.proccess(new FilterAdapter(new BandPass(10,20)), wf);



//		Proccessor p = new Upcase();
//		System.out.println(p.name());
//		System.out.println(p.proccess(str));
//
//		Proccessor p2 = new Downcase();
//		System.out.println(p2.name());
//		System.out.println(p2.proccess(str));
//
//		Proccessor p3 = new Splitter();
//		System.out.println(p3.name());
//		System.out.println(p3.proccess(str));

	}

}



// 在计算机编程中，适配器模式（有时候也称包装样式或者包装）将一个类的接口适配成用户所期待的。一个适配允许通常因为接口不兼容而不能在一起工作的类工作在一起，做法是将类自己的接口包裹在一个已存在的类中。
//