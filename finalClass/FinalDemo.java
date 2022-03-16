package com.te.learn.finalClass;

public class FinalDemo {
	public static void main(String[] args) {
		Person person = new Person();
		person.getAddress().setStreatName("ABC");
		person.getAddress().setCity("CITY");
		
		System.out.println(person);
		
		person.getAddress().setStreatName("DEF");
		person.getAddress().setCity("City");
		
		System.out.println(person);
	}
}
