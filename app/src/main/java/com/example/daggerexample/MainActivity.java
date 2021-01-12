package com.example.daggerexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerexample.Car.Car;
import com.example.daggerexample.Dagger.ActivityComponent;
import com.example.daggerexample.Dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent component = ((ExampleApp)getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(1400));
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}