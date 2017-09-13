package com.example.admin.tripapplication.view.triplistactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.tripapplication.R;

import javax.inject.Inject;

public class TripListActivity extends AppCompatActivity {

    @Inject
    TripListActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_list);

        setupDaggerComponent();
    }

    private void setupDaggerComponent() {
//        DaggerProfileActivityComponent.create().inject(this);
    }
}
