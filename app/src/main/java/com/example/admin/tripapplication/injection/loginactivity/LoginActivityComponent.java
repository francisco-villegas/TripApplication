package com.example.admin.tripapplication.injection.loginactivity;

import com.example.admin.tripapplication.view.loginactivity.LoginActivity;

import dagger.Component;

@Component(modules = LoginActivityModule.class)  //@Component(modules = 1.class,2.class) separated by commas for 2 or more modules
public interface LoginActivityComponent {

    void inject(LoginActivity loginActivity);

}
