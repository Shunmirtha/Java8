package com.te.learn.java8feature;

import java.util.function.Predicate;

public class ApplicationPredicate1 {
	public static void main(String[] args) {
		Predicate<String> predicate = i ->{
			if(i.length()<5)
				return true;
			return false;
		};
		String s = "hell";
		System.out.println("Length of "+s+" is less than 5 "+ predicate.test(s));
	}
}
