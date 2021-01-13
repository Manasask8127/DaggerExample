package com.example.daggerexample;

import android.app.Application;

import com.example.daggerexample.Dagger.AppComponent;
import com.example.daggerexample.Dagger.DriverModule;

public class ExampleApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.factory().create(new DriverModule("Hans"));
    }
    public AppComponent getAppComponent() {
        return component;
    }
}