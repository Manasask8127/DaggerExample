package com.example.daggerexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerexample.Car.Car;
import com.example.daggerexample.Dagger.CarComponent;
import com.example.daggerexample.Dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this);
        car.drive();
    }
}