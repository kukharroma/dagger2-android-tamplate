package com.cooksdev.dagger2template.presentation.di.module;

import com.cooksdev.dagger2template.domain.GetUserUseCase;
import com.cooksdev.dagger2template.presentation.presenter.MainPresenter;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    @Singleton
    MainPresenter mainPresenter(@Named("cache") GetUserUseCase getUserUseCase, @Named("non_cache") GetUserUseCase getUserUseCaseNoNCache) {
        return new MainPresenter(getUserUseCase, getUserUseCaseNoNCache);
    }
}
