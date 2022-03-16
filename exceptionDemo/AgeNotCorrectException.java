package com.te.learn.exceptionDemo;

public class AgeNotCorrectException extends RuntimeException {
	public AgeNotCorrectException(String str){
		super(str);
	}
}
