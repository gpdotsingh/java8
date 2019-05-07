package com.practice.java8.thread.implementsRunnable;

public class ThreadImplementsRunnable implements Runnable{

	
	public ThreadImplementsRunnable(String s) {
		
		System.out.println("Inside constructor"+s);
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());		
	}

	
}
