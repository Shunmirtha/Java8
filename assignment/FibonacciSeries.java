package com.te.learn.assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int count;
		int n3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of numbers to be printed");
		count=s.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=0;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
