package com.example.admin.tripapplication.view.loginactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.tripapplication.R;
import com.example.admin.tripapplication.injection.loginactivity.DaggerLoginActivityComponent;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

    @Inject
    LoginActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setupDaggerComponent();
    }

    private void setupDaggerComponent() {
        DaggerLoginActivityComponent.create().inject(this);
    }

    //TODO facebook authentication

    //TODO google authentication

    //TODO permissions check (internet, location)

    //TODO regular authentication

    //new line
}
