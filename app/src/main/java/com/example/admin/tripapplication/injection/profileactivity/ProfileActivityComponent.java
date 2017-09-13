package com.example.admin.tripapplication.injection.profileactivity;

import com.example.admin.tripapplication.view.profileactivity.ProfileActivity;

import dagger.Component;

@Component(modules = ProfileActivityModule.class)  //@Component(modules = 1.class,2.class) separated by commas for 2 or more modules
public interface ProfileActivityComponent {

    void inject(ProfileActivity profileActivity);

}
