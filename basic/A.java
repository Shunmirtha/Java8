package com.te.learn.basic;

import com.te.learn.assignment.SuperDemo;

public class A {
	private int a=10;
	private int b=20;
	int k=10;
	public A()
	{
		super();
	}
	public A(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void ss() {
		
		System.out.println("SSSSS");
		
	}
	public int getA() {
		//super.k;
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
