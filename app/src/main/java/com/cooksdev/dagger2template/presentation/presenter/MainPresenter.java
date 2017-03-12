package com.cooksdev.dagger2template.presentation.presenter;


import com.cooksdev.dagger2template.domain.GetUserUseCase;

import javax.inject.Inject;
public class MainPresenter {

    public GetUserUseCase getUserUseCaseCache;
    public GetUserUseCase getUserUseCaseNoNCache;

    @Inject
    public MainPresenter(GetUserUseCase getUserUseCase, GetUserUseCase getUserUseCaseNoNCache) {
        this.getUserUseCaseCache = getUserUseCase;
        this.getUserUseCaseNoNCache = getUserUseCaseNoNCache;
    }

    public void getUser() {
        System.out.println(getUserUseCaseCache.getUser());
        System.out.println(getUserUseCaseNoNCache.getUser());
    }
}
