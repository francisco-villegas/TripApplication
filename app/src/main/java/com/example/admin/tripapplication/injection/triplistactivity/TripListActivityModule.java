package com.example.admin.tripapplication.injection.triplistactivity;

import com.example.admin.tripapplication.view.triplistactivity.TripListActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by FRANCISCO on 22/08/2017.
 */

@Module
public class TripListActivityModule {

    @Provides
//    @Singleton this is going to make the class as singleton
    TripListActivityPresenter providesTripListActivityPresenter(){

        return new TripListActivityPresenter();
    }
}
