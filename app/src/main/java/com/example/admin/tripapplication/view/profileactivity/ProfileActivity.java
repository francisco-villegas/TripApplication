package com.example.admin.tripapplication.view.profileactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.tripapplication.R;

import javax.inject.Inject;

public class ProfileActivity extends AppCompatActivity {

    @Inject
    ProfileActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setupDaggerComponent();
    }

    private void setupDaggerComponent() {
//        DaggerProfileActivityComponent.create().inject(this);
    }

    //TODO segment view by user/viewer

    //TODO get profile information for signed in user

    //TODO edit/add profile information

    //TODO get review information for user
    
    //TODO write review for user
}
