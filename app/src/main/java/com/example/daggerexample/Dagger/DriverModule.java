package com.example.daggerexample.Dagger;

/*@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver()
    {
        return new Driver();
    }
}*/

import com.example.daggerexample.Car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {
    private String driverName;
    public DriverModule(String driverName) {
        this.driverName = driverName;
    }
    @Provides
    @Singleton
    Driver provideDriver() {
        return new Driver(driverName);
    }
}
