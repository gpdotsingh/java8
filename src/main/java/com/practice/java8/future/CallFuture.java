package com.practice.java8.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CallFuture {
	public static void main(String a[]) {
	SquareCalculator squareCalculator = new SquareCalculator();
	 
	Future<Integer> future1 = squareCalculator.calculate(10);
	Future<Integer> future2 = squareCalculator.calculate(100);

	/*while (!(future1.isDone() && future2.isDone())) {
	    System.out.println(
	      String.format(
	        "future1 is %s and future2 is %s", 
	        future1.isDone() ? "done" : "not done", 
	        future2.isDone() ? "done" : "not done"
	      )
	    );
	    try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 */
	Integer result1=0;
	Integer result2=0;
	try {
		result1 = future1.get();
		System.out.println("result1>>>"+result1);
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result2 = future2.get();
		System.out.println("result2>>>"+result2);


	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	System.out.println(result1 + " and " + result2);
}
}
