package com.example.daggerexample.Dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules=DriverModule.class)
public interface AppComponent {
    //Driver getDriver();
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);

}
