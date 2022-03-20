package com.te.learn.threadRunable;

public class Read implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<story.s.length();i++) {
			System.out.println(story.s.charAt(i));
		}
		
	}
	

}
