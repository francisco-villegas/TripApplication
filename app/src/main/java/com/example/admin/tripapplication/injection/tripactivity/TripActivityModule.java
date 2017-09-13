package com.example.admin.tripapplication.injection.tripactivity;

import com.example.admin.tripapplication.view.tripactivity.TripActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by FRANCISCO on 22/08/2017.
 */

@Module
public class TripActivityModule {

    @Provides
//    @Singleton this is going to make the class as singleton
    TripActivityPresenter providesTripActivityPresenter(){

        return new TripActivityPresenter();
    }
}
