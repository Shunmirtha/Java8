package com.te.learn.basic;

public class Inheritance {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.getA());
		System.out.println(b.getB());
		System.out.println(b.getC());
		System.out.println(b.getD());
		
		A a=new B();//Upcasting
		System.out.println(a.getA());
		System.out.println(a.getB());
		//Class B value cannot be accesed 
		//System.out.println(a.getC());
		//System.out.println(a.getD());
		//B bb=(b) new A();//Downcasting//ClassCastException
		
		A aa = new B();//Upcasting 
		B bbb=(B) aa;//Downcating
		System.out.println(bbb.getA());
		System.out.println(bbb.getB());
		System.out.println(bbb.getC());
		System.out.println(bbb.getD());		
	}
}
