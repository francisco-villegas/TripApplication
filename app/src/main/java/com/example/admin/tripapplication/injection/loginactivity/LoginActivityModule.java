package com.example.admin.tripapplication.injection.loginactivity;

import com.example.admin.tripapplication.view.loginactivity.LoginActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule {

    @Provides
//    @Singleton this is going to make the class as singleton
    LoginActivityPresenter providesLoginActivityPresenter(){

        return new LoginActivityPresenter();
    }
}
