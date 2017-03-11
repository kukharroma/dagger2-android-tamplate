package com.cooksdev.dagger2template;


import android.app.Application;

import com.cooksdev.dagger2template.dagger.AppComponent;
import com.cooksdev.dagger2template.dagger.AppModule;
import com.cooksdev.dagger2template.dagger.DaggerAppComponent;

public class App extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
