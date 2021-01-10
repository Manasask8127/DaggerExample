package com.example.daggerexample.Dagger;

import com.example.daggerexample.Car.DieselEngine;
import com.example.daggerexample.Car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    /*@Provides
    Engine providePetrolEngine(PetrolEngine engine)
    {
        return engine;
    }*/
    //to optimize use abstract to overcome redundancy
    @Binds
    abstract Engine bindEngine(DieselEngine engine);

}
