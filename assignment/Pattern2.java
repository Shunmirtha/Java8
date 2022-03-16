package com.te.learn.assignment;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter odd number of rows");
		int row = scan.nextInt();
		//Loop for rows
		for(int i = 0; i < (row/2)+1 ; i++)
		{
			//Loop for column 
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = row/2 ; i > 0 ;i--)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
