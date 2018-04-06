package com.kalpvaig.daggerimplementation.module;

import com.kalpvaig.daggerimplementation.model.Motor;
import com.kalpvaig.daggerimplementation.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by shashwat on 6/4/18.
 */
@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
