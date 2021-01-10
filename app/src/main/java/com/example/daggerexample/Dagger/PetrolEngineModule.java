package com.example.daggerexample.Dagger;

import com.example.daggerexample.Car.Engine;
import com.example.daggerexample.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    /*@Provides
    Engine providePetrolEngine(PetrolEngine engine)
    {
        return engine;
    }*/
    //to optimize use abstract to overcome redundancy
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
