package com.cooksdev.dagger2template.presentation.di.module;


import com.cooksdev.dagger2template.domain.GetUserUseCase;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DomainModule {

    @Provides
    @Singleton
    @Named("cache")
    GetUserUseCase provideGetUserUseCaseCache() {
        GetUserUseCase getUserUseCase = new GetUserUseCase();
        getUserUseCase.setCache(true);
        return getUserUseCase;
    }

    @Provides
    @Singleton
    @Named("non_cache")
    GetUserUseCase provideGetUserUseCaseNonCache() {
        GetUserUseCase getUserUseCase = new GetUserUseCase();
        getUserUseCase.setCache(false);
        return getUserUseCase;
    }

}
