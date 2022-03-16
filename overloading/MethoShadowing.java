package com.te.learn.overloading;
class A{
	int a=10;
	public static void test() {
		System.out.println("Parent class method");
	}
}
class B extends A{
	int a=20;
	public static void test() {
		System.out.println("Child class method");
	}
}

public class MethoShadowing {
	/*
	 * 
	 */
	public static void main(String[] args) {
		A parent=new B();
		parent.test();
		B child=(B) parent;
		child.test();
		
	}
}
