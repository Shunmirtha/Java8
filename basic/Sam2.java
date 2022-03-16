package com.te.learn.basic;

import java.util.Scanner;

public class Sam2 {
	public static void main(String args[])
	{
		int a=5;
		int b=6;
		int c=2;
		int d=9;
		int e=0;
		int res=(a>b && a>c && a>d && a>e)? a : (b>c && b>d && a>e) ? b : (c>d && c>e)? c:(d>e)?d:e;
		System.out.println("Result: "+ res);
		System.out.println(10 + 20 + "Java");
		System.out.println("Java" + 20 +30);
		System.out.println(20 + "java");
		Scanner scan=new Scanner(System.in);
	}
}
