package com.te.learn.interfacedemo;

public interface Left {
	default void m1() {
		System.out.println("Left implemented");
	}
}
