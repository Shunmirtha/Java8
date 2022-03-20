package com.te.learn.basic;

public class StaticDemo {
	//static multiline initializer
	//1st executed
	static {
		System.out.println("Static Multiline");
		StaticDemo s=new StaticDemo();
		//2nd executed
		int a=s.returnMeInt();
		System.out.println(a);
	}
	//static single line initializer
	static int a=10;
	//static method
	public static void demoStaticMethod()
	{
		System.out.println("Static demo");
	}
	public int returnMeInt() {
		return 0;
	}
	//non static method
	public void demoNonStatic()
	{
		System.out.println("Non Static");
	}
	public static void main(String args[])
	{
		System.out.println("String args[] executed");
		demoStaticMethod();
		StaticDemo s=new StaticDemo();
		s.demoNonStatic();
		//StaticDemo s=new StaticDemo();
	}
}
