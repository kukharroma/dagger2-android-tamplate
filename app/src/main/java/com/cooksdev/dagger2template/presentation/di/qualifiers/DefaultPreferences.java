package com.cooksdev.dagger2template.presentation.di.qualifiers;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Custom qualifier and you can use it instead @Named("non_cache") @Named("cache")
 * and when you will inject GetUserUseCase you can say like this
 *
 * @DefaultPreferences
 * @Inject GetUserUseCase getUserUseCase;
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface DefaultPreferences {
}
