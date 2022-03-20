package com.te.learn.basic;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		
		String s = "This@@@; ;;is;$$$;; program#3";
		System.out.println(s.replaceAll("[^a-zA-Z0-9 ]", ""));
		
		System.out.println(s);
	}
}
