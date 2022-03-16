package com.te.learn.overloading;

class Parent{
	int a =10;
	public void test() {
		System.out.println("Parent method");
	}
}
class Child extends Parent{
	int a =20;// variable shadowing
	public void test() {
		System.out.println("Child method");// overriding
	}
}
public class VariableShadow {
	public static void main(String[] args) {
		Child child=new Child();
		System.out.println(child.a);
		child.test();
	}
	
}
