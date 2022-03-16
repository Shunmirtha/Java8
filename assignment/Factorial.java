package com.te.learn.assignment;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int fact=1;
		int number;
		System.out.println("Enter the number");
		number=s.nextInt();
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial value is "+fact);
	}
}
