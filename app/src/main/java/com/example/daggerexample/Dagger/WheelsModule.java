package com.example.daggerexample.Dagger;

import com.example.daggerexample.Car.Rims;
import com.example.daggerexample.Car.Tires;
import com.example.daggerexample.Car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
//to optimize and non-instantiating we made it static
    @Provides
    static Rims provideRims()
    {
        return new Rims();
    }

    @Provides
    static Tires provideTires()
    {
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires)
    {
        return new Wheels(rims,tires);
    }

}
