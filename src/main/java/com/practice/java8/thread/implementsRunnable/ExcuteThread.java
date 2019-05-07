package com.practice.java8.thread.implementsRunnable;

public class ExcuteThread {

	public static void main(String a[]) {
		ThreadImplementsRunnable r = new ThreadImplementsRunnable("Hiiii");
	 Thread t1 = new Thread(r,"pngImageFile1"); 
     Thread t2 = new Thread(r,"pngImageFile2");
     Thread t3 = new Thread(r,"pngImageFile3");
     Thread t4 = new Thread(r,"pngImageFile4");
     Thread t5 = new Thread(r,"pngImageFile5");
     Thread t6 = new Thread(r,"pngImageFile6");
     Thread t7 = new Thread(r,"pngImageFile7");
     Thread t8 = new Thread(r,"pngImageFile8");
     

     t1.start();
     t2.start();
     t3.start();
     t4.start();
     t5.start();
     t6.start();
     t7.start();
     t8.start();
     try {
         t1.join();  
            t2.join();  
            t3.join();
            t4.join();
            t5.join();
            t6.join();  
            t7.join();
            t8.join();
      } catch (InterruptedException e) {
            e.printStackTrace();
      }
	}
   
}
