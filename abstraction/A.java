package com.te.learn.abstraction;

public abstract class A {
	static int a=10;
	static {
		System.out.println("A class Static initializer");
	}
	{
		System.out.println("A class Non static");
	}
	A(){
		System.out.println("Abstract class constructor " + a);
	}
	A(int a){
		this();
		System.out.println("Abstract class argumented constructor "+ a);
	}
}
