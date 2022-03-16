package com.te.learn.abstraction;

public class B extends A{//concrete class
	static {
		System.out.println("B class static initializer");
	}
	{
		System.out.println("B class non static intializer ");
	}
	B(){
		super(90);
		
		System.out.println("B class constructor");
		
	}
	B(int a)
	{
		this();
		System.out.println("B class argumented constructor "+ a);
	}
}
