package com.scalastudy.chapter12;

abstract public class BirdJava {
}

class HawkJava extends BirdJava {
    private String flyingmessage = "I'm a good flyer.";
    private FlyingBehavior flying;
    private SwimmingBehavior swimming;
    public HawkJava(FlyingBehavior flying, SwimmingBehavior swimming){
        this.flying = flying;
        this.swimming = swimming;
    }

    public void fly(){
        flying.fly(flyingmessage);
    }

    public void swim(){
        swimming.swim();
    }
}


class PigeonJava extends BirdJava{
    private String flyingmessage = "I'm a good flyer.";
    private FlyingBehavior flying;
    private SwimmingBehavior swimming;
    public PigeonJava(FlyingBehavior flying, SwimmingBehavior swimming) {
        this.flying = flying;
        this.swimming = swimming;
    }
    public void fly(){
        flying.fly(flyingmessage);
    }

    public void swim(){
        swimming.swim();
    }

}