 package com.example.daggerexample.Car;

import android.util.Log;

import com.example.daggerexample.Dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {

    private static final String TAG = "Car";

    @Inject Engine engine;
    //private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver,Engine engine,Wheels wheels) {
        this.driver=driver;
        this.engine=engine;
        this.wheels = wheels;
    }

    @Inject //method injection
    public void enableRemote(Remote remote)
    {
        remote.setListener(this);
    }

    public void drive()
    {
        engine.start();
        Log.d(TAG, driver+" drives "+this);
    }


}
