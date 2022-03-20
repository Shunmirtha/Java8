package com.te.learn.java8feature;

import java.util.function.Predicate;

public class ApplicationPredicate {
	public static void main(String[] args) {		
		//Predicate<Integer> predicate = (Integer i) ->{
		Predicate<Integer> predicate = i ->{
			if( i % 2 == 0 )
				return true;
			return false;
		};
		// anonymous class
		Predicate<Integer> predicate2 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer i) {
				if( i % 2 == 0 )
					return true;
				return false;
			}
		};
		//Using Lambda expression
		Predicate<Integer> predicate3 = i -> i % 2 == 0;
		int num = 8;
		int num1 = 7;
		int num2 = 9;
		System.out.println(num + " is even number : " + predicate.test(num));
		System.out.println(num1 + " is even number : " + predicate2.test(num1));
		System.out.println(num2 + " is even number : " + predicate3.test(num2));
	}
}
