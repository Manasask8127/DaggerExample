package com.example.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerexample.Car.Car;
import com.example.daggerexample.Dagger.CarComponent;
import com.example.daggerexample.Dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car; //field injection (not to be private)
    //private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //since compiled dagger created DaggerComponent  CarComponent is interface can't instantiate
        CarComponent carComponent= DaggerCarComponent.create();
        //car=carComponent.getCar();
        carComponent.Inject(this);//field injection in mainactivity constructor can't be injected so this will the Car class
        car.drive();
    }
}