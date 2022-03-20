package com.te.learn.java8feature;

import java.util.function.Function;
import java.util.function.Predicate;

public class ApplicationFunction1 {
	public static void main(String[] args) {
		Function<String, Boolean> function= s ->{
			char ch ;
			String reverse="";
			for(int i=0 ; i < s.length() ; i++)
			{
				ch = s.charAt(i);
				reverse = ch + reverse;
			}
			if(s.equalsIgnoreCase(reverse)) {
				return true;
			}
			return false;
		};
		String s = "moM";
		System.out.println(s + " is Palindrome "+ function.apply(s));
	}
}