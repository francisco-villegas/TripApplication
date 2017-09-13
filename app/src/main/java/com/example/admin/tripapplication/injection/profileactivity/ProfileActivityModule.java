package com.example.admin.tripapplication.injection.profileactivity;

import com.example.admin.tripapplication.view.profileactivity.ProfileActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ProfileActivityModule {

    @Provides
//    @Singleton this is going to make the class as singleton
    ProfileActivityPresenter providesProfileActivityPresenter(){

        return new ProfileActivityPresenter();
    }
}
