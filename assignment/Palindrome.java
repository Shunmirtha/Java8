package com.te.learn.assignment;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		int r;
		int sum=0;
		int temp;
		System.out.println("Enter the number");
		n=s.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" Palindrome Numner");
		}
		else
			System.out.println(temp+" Not a Palindrome Number");
		
	}
}
