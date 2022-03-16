package com.te.learn.stringDemo;

public class StringDemoo {
	public static void main(String[] args) {
		String a = "Hello";
		String b;
		String c =new String("Hi");
		StringBuffer d = new StringBuffer("Good");
		StringBuilder e = new StringBuilder("Welcome");
		d.append(" Morning");
		a.concat("World");
		e.append(" Everyone");
		b = a.concat(" World");
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
	}
}
