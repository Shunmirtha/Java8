package com.te.learn.assignment;


public class B extends A {
	int a=20;
	public B()
	{
		super();
		System.out.println("Child class Constructor printed");
	}
	public void aa() {
		System.out.println("Child class method printed");
	}

	public void child()
	{
		this.aa();
		System.out.println(super.a);
		super.aa();
	}
}


