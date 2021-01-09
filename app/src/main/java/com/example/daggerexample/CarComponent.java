package com.example.daggerexample;

import dagger.Component;

@Component
public interface CarComponent {
    //creates the graph engine<- car -> Wheels [car needs both] this is DAG its knows the order this is called as injector ,
    // compile time generation to gett rid od reflection

    Car getCar();

    void Inject(MainActivity mainActivity);
}
