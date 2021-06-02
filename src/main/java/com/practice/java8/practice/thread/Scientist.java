package com.practice.java8.practice.thread;

import java.security.PublicKey;

public class Scientist {

    private Boolean isHungry=true;
    private String name="";

    public Scientist (String name)
    {
        this.name =name;
    }

    public String getName(){
        return name;
    }

    public void eat(Spoon spoon, Scientist s){
        while(isHungry)
        {
            if(spoon.getOwner()!= this)
            {
            try{
                Thread.sleep(1);
            }
            catch (InterruptedException e){
                e.printStackTrace();
                continue;
            }
            continue;
        }
        if(s.isHungry){
            System.out.printf("%s I am giving you spoon ,%s, the spoon",name,s.getName());
        }
        spoon.setOwner(s);
        continue;
        }

        spoon.use();

        isHungry=false;
        System.out.printf("%s, Iam nt hungry ny more",name);

        spoon.setOwner(s);
    }

}
