package com.cooksdev.dagger2template.presentation.di.module;


import com.cooksdev.dagger2template.presentation.presenter.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    @Singleton
    MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

}
