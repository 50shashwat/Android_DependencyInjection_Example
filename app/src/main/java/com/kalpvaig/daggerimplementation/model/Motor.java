package com.kalpvaig.daggerimplementation.model;

/**
 * Created by shashwat on 6/4/18.
 */

public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
