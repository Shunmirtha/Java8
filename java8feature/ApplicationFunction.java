package com.te.learn.java8feature;

import java.util.function.Function;

public class ApplicationFunction {
	public static void main(String[] args) {
		Function<Integer, Integer> function = i -> i = i * i;
		int i = 4;
		System.out.println("Square of "+i+" is "+ function.apply(i));
	}
}
