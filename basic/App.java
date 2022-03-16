package com.te.learn.basic;

import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		boolean exit = true;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("CALCULATOR");
			System.out.println("1. Addition");
			System.out.println("2. Subtracton");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			System.out.println("Enter the option to perform the function");
			int option = scan.nextInt();
			switch(option)
			{
				case 1:{
					System.out.println("Enter the first number");
					int a=scan.nextInt();
					System.out.println("Enter the second number");
					int b=scan.nextInt();
					System.out.println(a+" - "+b+" = "+ Calculator.add(a,b));
					break;
				}
				case 2:{
					System.out.println("Enter the first number");
					int a=scan.nextInt();
					System.out.println("Enter the second number");
					int b=scan.nextInt();
					System.out.println(a+" + "+b+" = " +Calculator.sub(a,b));
					break;
				}
				case 3:{
					System.out.println("Enter the first number");
					int a=scan.nextInt();
					System.out.println("Enter the second number");
					int b=scan.nextInt();
					System.out.println(a+" * "+b+" = "+Calculator.mul(a,b));
					break;
				}
				case 4:{
					System.out.println("Enter the first number");
					float a=scan.nextInt();
					System.out.println("Enter the second number");
					float b=scan.nextInt();
					if(b == 0)
					{
						System.out.println("Denominator can't be zero");
						break;
					}
					else{
						System.out.println(a+" / "+b+" = "+Calculator.div(a,b));
						break;										
						}
				}
				case 5:{
					System.out.println("************");
					exit=false;
					break;
				}
				default:
				{
					System.out.println("Invalid option");
				}
			}
		}while(exit);
	}

}
