package com.kalpvaig.daggerimplementation.component;

/**
 * Created by shashwat on 6/4/18.
 */

import com.kalpvaig.daggerimplementation.model.Vehicle;
import com.kalpvaig.daggerimplementation.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kerry on 14/02/15.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

}