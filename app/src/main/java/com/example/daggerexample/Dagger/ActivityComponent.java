package com.example.daggerexample.Dagger;

import com.example.daggerexample.Car.Car;
import com.example.daggerexample.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;

/*@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
    /*@Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        //Builder appComponent(AppComponent appComponent);
        ActivityComponent build();
    }
    @Subcomponent.Builder
    interface Factory{
        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower ,@BindsInstance @Named("engine capacity") int engineCapacity);
    }


}*/
@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
    @Subcomponent.Factory
    interface Factory {
        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower,
                                 @BindsInstance @Named("engine capacity") int engineCapacity);
    }
}