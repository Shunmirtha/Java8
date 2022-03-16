package com.te.learn.assignment;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		int temp;
		int r;
		int result=0;
		System.out.println("Enter the number");
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			r=temp%10;
			result+=r*r*r;
			temp/=10;
		}
		if(result==n)
			System.out.println("Amstrong number");
		else
			System.out.println("Not a Amstrong number");
	}

}
