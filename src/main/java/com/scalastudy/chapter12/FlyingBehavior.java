package com.scalastudy.chapter12;

public interface FlyingBehavior {
    default void fly(String flyingmessage){
        System.out.println(flyingmessage);
    }
}
