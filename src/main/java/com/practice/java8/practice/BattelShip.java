package com.practice.java8.practice;

public class BattelShip <E>{
    public <T extends E> void fire(T t)
    {
        if(t.getClass() == Missile.class)
        {
            System.out.println("Launch");
        }
        else if(t.getClass() == Shell.class)
        {
            System.out.println("fire");
        }
    }

    public static void main(String[] args) {
        BattelShip<Object> battelshi = new BattelShip();
        battelshi.fire(new Projectile());
        battelshi.fire(new Missile());
        battelshi.fire(new Shell());
    }
}
