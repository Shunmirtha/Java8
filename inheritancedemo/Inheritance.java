package com.te.learn.inheritancedemo;

import com.te.learn.basic.A;
import com.te.learn.basic.B;

public class Inheritance {
	public static void main(String[] args) {
		C x=new C();
		System.out.println(x.getC());
		System.out.println(x.getB());
		System.out.println(x.getA());
		B y=new B();
		//System.out.println(y.getC());
		System.out.println(y.getB());
		System.out.println(y.getA());
		A a=new B();
		//C c=(C) a;
		
		

	}
}
