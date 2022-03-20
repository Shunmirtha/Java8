package com.te.learn.threadRunnableUsingLambda;

import com.te.learn.threadRunable.story;

public class Story implements Runnable {
	public static StringBuilder s = new StringBuilder("This is a Thread");

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < story.s.length(); i++) {
			System.out.println(story.s.charAt(i));
		}
	}

}
