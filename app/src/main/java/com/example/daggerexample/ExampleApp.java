package com.example.daggerexample;

import android.app.Application;

import com.example.daggerexample.Dagger.AppComponent;
import com.example.daggerexample.Dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent activityComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        activityComponent = DaggerAppComponent.create();
    }
    public AppComponent getAppComponent()
    {
        return activityComponent;
    }
}
