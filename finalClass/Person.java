package com.te.learn.finalClass;

public class Person {
	private Address address;

	public Person() {
		super();
	}

	public Person(Address address) {
		super();
	}

	public Address getAddress() {
		return address;
	}

	

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
	
	
}
