package com.te.learn.basic;

public class StaticAndNonStatic {
	static int a=10;
	int b=10;
	static
	{
		System.out.println("static multiline intializer executed");
	}
	public static void staticmethod()
	{
		System.out.println("Static method executed");
	}
	{
		System.out.println("non static multiline initializer");
	}
	public static void main(String[] args) {
		System.out.println("String args[] executed");
		StaticAndNonStatic obj =new StaticAndNonStatic();
		staticmethod();
	}
}
