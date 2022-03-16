package com.te.learn.interfacedemo;

public interface Right {
	default void m1() {
		System.out.println("Right implemented");
	}
}
