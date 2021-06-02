package com.practice.java8.functional;

public class AddAllImpl {


    public  static void  main(
            String a[]
    )
    {
    AddAll add = i-> (int) (i*2);

    System.out.println(add.sum(2.0));


    Runnable r = ()->{System.out.println(Thread.currentThread().getName());};

    Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
