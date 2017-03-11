package com.cooksdev.dagger2template.presentation.di.module;


import com.cooksdev.dagger2template.domain.GetUserUseCase;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DomainModule {

    @Provides
    @Named("cache")
    GetUserUseCase provideGetUserUseCaseCache() {
        GetUserUseCase getUserUseCase = new GetUserUseCase();
        getUserUseCase.setCache(true);
        return getUserUseCase;
    }

    @Provides
    @Named("non_cache")
    GetUserUseCase provideGetUserUseCaseNonCache() {
        GetUserUseCase getUserUseCase = new GetUserUseCase();
        getUserUseCase.setCache(false);
        return getUserUseCase;
    }

//    @Provides
//    @Singleton
//    @DefaultPreferences
//    GetUserUseCase getUserUseCaseCustomQualifiers() {
//        GetUserUseCase getUserUseCase = new GetUserUseCase();
//        return getUserUseCase;
//    }


}
