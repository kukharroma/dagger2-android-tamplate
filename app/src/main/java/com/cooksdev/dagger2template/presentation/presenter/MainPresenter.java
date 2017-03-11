package com.cooksdev.dagger2template.presentation.presenter;


import com.cooksdev.dagger2template.domain.GetUserUseCase;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class MainPresenter {

//    @Inject
//    @Named("cache")
//    GetUserUseCase getUserUseCaseCache;
//
//    @Inject
//    @Named("non_cache")
//    GetUserUseCase getUserUseCaseNonCache;

    public void getUser() {
//        System.out.println(getUserUseCaseCache.getUser());
//        System.out.println(getUserUseCaseNonCache.getUser());
    }
}
