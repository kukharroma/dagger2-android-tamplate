package com.cooksdev.dagger2template.dagger;


import com.cooksdev.dagger2template.App;
import com.cooksdev.dagger2template.presentation.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);

    void inject(MainActivity activity);
}
