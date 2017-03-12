package com.cooksdev.dagger2template.presentation.di.component;


import com.cooksdev.dagger2template.presentation.di.module.AppModule;
import com.cooksdev.dagger2template.presentation.di.module.DomainModule;
import com.cooksdev.dagger2template.presentation.di.module.PresenterModule;
import com.cooksdev.dagger2template.presentation.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DomainModule.class, PresenterModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
