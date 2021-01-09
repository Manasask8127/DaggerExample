 package com.example.daggerexample;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    @Inject Engine engine;
    //private Engine engine;
    private Wheels wheels;

    @Inject
    public Car( Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject //method injection
    public void enableRemote(Remote remote)
    {
        remote.setListener(this);
    }

    public void drive()
    {
        Log.d(TAG, "drive: driving...");
    }


}
