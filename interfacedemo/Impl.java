package com.te.learn.interfacedemo;

public class Impl implements Left,Right{
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("overriden");
		Left.super.m1();
	}
}
