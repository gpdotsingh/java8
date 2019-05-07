package com.practice.java8.reference;

public class Reference {

	public static void printMessage() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String a[]) {
		Thread t1=new Thread(Reference::printMessage);
		Thread t2=new Thread(()->printMessage());
		t1.start();
		t2.start();
	}
}
