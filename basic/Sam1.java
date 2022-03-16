package com.te.learn.basic;

public class Sam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10,j=20;
		float f = 10.123f;
		double d = 12.123d;
		long l = 12345l;
		double res = i+f+d+l;
		System.out.println("Result: "+ res);
		byte a = 1;
		byte b = 1;
		int res1 = a + b;
		System.out.println("Result: "+ res1);
		char x = 'a';
		char res2 =(char)( x + x);
		System.out.println("Result: "+ res2);
		String s = "a";
		res = ++i+j++;
		System.out.println("Result: "+ res);
		res = i++ + ++j;
		System.out.println("Result: "+ res);
		boolean r=(i<=10)?true:false;
		if(r) {
			System.out.println("It is lesser than 10");
		}
		else {
			System.out.println("It is greater");
		}
	}
}
