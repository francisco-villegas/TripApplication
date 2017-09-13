package com.example.admin.tripapplication.injection.triplistactivity;


import com.example.admin.tripapplication.view.triplistactivity.TripListActivity;

import dagger.Component;

@Component(modules = TripListActivityModule.class)  //@Component(modules = 1.class,2.class) separated by commas for 2 or more modules
public interface TripListActivityComponent {

    void inject(TripListActivity tripActivity);

}
