package com.example.admin.tripapplication.injection.tripactivity;

import com.example.admin.tripapplication.view.tripactivity.TripActivity;

import dagger.Component;

@Component(modules = TripActivityModule.class)  //@Component(modules = 1.class,2.class) separated by commas for 2 or more modules
public interface TripActivityComponent {

    void inject(TripActivity tripActivity);

}
