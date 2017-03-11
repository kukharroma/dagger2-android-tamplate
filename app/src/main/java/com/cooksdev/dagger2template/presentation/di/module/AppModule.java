package com.cooksdev.dagger2template.presentation.di.module;

import android.content.Context;

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

}
