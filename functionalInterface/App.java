package com.te.learn.functionalInterface;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stuArray= {new Student(13,101,"Studen1"),
								new Student(12,104,"Studen2"), new Student(14,103,"Studen4")};
		Arrays.sort(stuArray);
		for (Student student : stuArray) {
			System.out.println(student);
		}
		
	}

}
