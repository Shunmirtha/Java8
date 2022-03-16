package com.te.learn.basic;

public class NonStaticDemo {
	int a=10;//1st
	
	{
		System.out.println("Non static multline initializer got executed");
	}
	public void demoNonStaticMethod()
	{
		System.out.println("demoNonStaticMethod() non static method executed");
	}
	public static void main(String[] args) {
		System.out.println("String[] args method got executed");//2nd
		System.out.println("Now I am creating the object");
		NonStaticDemo obj = new NonStaticDemo();
		System.out.println("end");
	}
}
