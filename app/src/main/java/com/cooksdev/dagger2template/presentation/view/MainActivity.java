package com.cooksdev.dagger2template.presentation.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cooksdev.dagger2template.App;
import com.cooksdev.dagger2template.R;
import com.cooksdev.dagger2template.presentation.presenter.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getAppComponent().inject(this);

        presenter.getUser();
    }
}
