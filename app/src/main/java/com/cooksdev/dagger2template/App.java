package com.cooksdev.dagger2template;


import android.app.Application;


import com.cooksdev.dagger2template.presentation.di.component.AppComponent;
import com.cooksdev.dagger2template.presentation.di.component.DaggerAppComponent;
import com.cooksdev.dagger2template.presentation.di.module.AppModule;

public class App extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
