package com.cooksdev.dagger2template.presentation.di.module;


import com.cooksdev.dagger2template.presentation.presenter.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

}
