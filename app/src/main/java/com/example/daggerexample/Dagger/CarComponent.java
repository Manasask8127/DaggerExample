package com.example.daggerexample.Dagger;

import com.example.daggerexample.Car.Car;
import com.example.daggerexample.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class,DieselEngineModule.class})
public interface CarComponent {
    //creates the graph engine<- car -> Wheels [car needs both] this is DAG its knows the order this is called as injector ,
    // compile time generation to gett rid od reflection

    Car getCar();

    void Inject(MainActivity mainActivity);
}
