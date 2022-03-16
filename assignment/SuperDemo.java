package com.te.learn.assignment;

public class SuperDemo {
	public static void main(String[] args) {
		B b=new B();
		A a=new A();
		b.child();
		boolean c=b instanceof A;
		boolean d=a instanceof B;
		System.out.println("b instanceof "+ c);
		System.out.println("b instanceof "+ d);
	}
}
