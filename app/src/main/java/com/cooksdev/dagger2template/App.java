package com.cooksdev.dagger2template;


import android.app.Application;

import com.cooksdev.dagger2template.presentation.di.component.AppComponent;
import com.cooksdev.dagger2template.presentation.di.component.DaggerAppComponent;
import com.cooksdev.dagger2template.presentation.di.module.AppModule;
import com.cooksdev.dagger2template.presentation.di.module.DomainModule;
import com.cooksdev.dagger2template.presentation.di.module.PresenterModule;

public class App extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .presenterModule(new PresenterModule())
                .domainModule(new DomainModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
