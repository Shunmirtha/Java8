package com.te.learn.assignment;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = scan.nextInt();
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}