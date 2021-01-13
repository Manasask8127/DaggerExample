package com.example.daggerexample.Car;

/*@Singleton
public class Driver {

    /*@Inject 't own it so don't annotate with @Inject' do
    public Driver() {
    }
}*/
public class Driver {
    //we don't own this class so we can't annotate it with @Inject
    String name;
    public Driver(String name) {
        this.name = name;
    }
}