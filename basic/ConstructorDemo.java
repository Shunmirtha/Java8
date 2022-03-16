package com.te.learn.basic;

public class ConstructorDemo {
	// non static member=non static single line initializer
	int a=10;
	int b=10;
	//non static multiline initializer
	{
		System.out.println("Non static method executed");
	}
	//chaining constructor
	public ConstructorDemo() {
		//1. non static member gets loaded
		//2. non static initializer executed
		//3. programmer written instruction executed
		System.out.println("Constructor executed");
	}
	public ConstructorDemo(int aa){
		this();
		this.a=aa;
		System.out.println("ConstructorDemo(int aa) executed");
	}
	public ConstructorDemo(int aa,int bb) {
		this(aa);
		this.b=b;
		System.out.println("ConstructorDemo(int aa,int bb) executed");
	}
	public static void main(String[] args) {
		System.out.println("String args[] executed");
		//ConstructorDemo constructorDemo=new ConstructorDemo();
		ConstructorDemo constructorDemo2=new ConstructorDemo(10,20);
		System.out.println(constructorDemo2.a);
		System.out.println(constructorDemo2.b);
	}
}
