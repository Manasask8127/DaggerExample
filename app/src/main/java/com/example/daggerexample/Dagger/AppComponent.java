package com.example.daggerexample.Dagger;

/*@Singleton
@Component(modules=DriverModule.class)
public interface AppComponent {
    //Driver getDriver();
    //ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
    //ActivityComponent.Builder getActivityComponentBuilder();
    ActivityComponent.Factory getActivityComponentFactory();

}*/

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent.Factory getActivityComponentFactory();
    @Component.Factory
    interface Factory {
        AppComponent create(DriverModule driverModule);
    }
}