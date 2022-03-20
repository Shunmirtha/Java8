package com.te.learn.basic;

public class B extends A{
	private int c=30;
	private int d=40;
	//static int k=3;
	public B() {
		super();
		System.out.println("lll");
	}
	void dd() {
		System.out.println("dddd");
	}
	public B(int c, int d) {
		super();
		System.out.println("Aaa"+super.k);
		this.dd();
		this.c = c;
		this.d = d;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
}
