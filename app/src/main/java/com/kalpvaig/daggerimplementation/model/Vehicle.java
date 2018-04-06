package com.kalpvaig.daggerimplementation.model;

import javax.inject.Inject;

/**
 * Created by shashwat on 6/4/18.
 */

public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
