package com.te.learn.exceptionDemo;

public class ChecckedException {
	
	public static void m4() throws InterruptedException {
		//Checked exception
		Thread.sleep(10000);
	}
	public static void m3() throws InterruptedException  {
		m4();
	}
	public static void m2() throws InterruptedException  {
		m3();
	}
	public static void m1() throws InterruptedException  {
		m2();
	}
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			int res=10/0;
			m1();
			
		} 
		catch(ArithmeticException e) {
			
		}
		catch (Exception e) {
			
			System.out.println("Sleep can't be accessed");
		}
		System.out.println("Main ends");
	}
}
