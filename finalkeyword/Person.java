package com.te.learn.finalkeyword;


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
	public void setAddress() {
		address=new Address();
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}

}