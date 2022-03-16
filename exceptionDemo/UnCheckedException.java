package com.te.learn.exceptionDemo;

import java.util.Scanner;

public class UnCheckedException {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age;
		System.out.println("Enter age");
		age = scanner.nextInt();
		if(age<0) {
			throw new AgeNotCorrectException("Age entered is not correct");
		}
		System.out.println("Age is "+age);
		
	}

}
