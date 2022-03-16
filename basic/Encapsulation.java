package com.te.learn.basic;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human=new Human();
		human.setHumanAge(0);
		human.setHumanHeight(12);
		human.setHumanName("name");
		human.setHumanWeight(55);
		System.out.println(human.getHumanAge());
		System.out.println(human.getHumanHeight());
		System.out.println(human.getHumanName());
		System.out.println(human.getHumanWeight());
	}

}
