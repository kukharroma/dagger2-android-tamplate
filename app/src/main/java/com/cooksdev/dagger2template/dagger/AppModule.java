package com.cooksdev.dagger2template.dagger;

import android.content.Context;
import android.content.SharedPreferences;

import com.cooksdev.dagger2template.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Context provideContext() {
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Context app) {
        return app.getSharedPreferences("My_pref_title", Context.MODE_PRIVATE);
    }
}
