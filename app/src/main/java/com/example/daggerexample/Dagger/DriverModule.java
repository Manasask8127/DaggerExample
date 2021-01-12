package com.example.daggerexample.Dagger;

import com.example.daggerexample.Car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver()
    {
        return new Driver();
    }
}
