package com.cooksdev.dagger2template.domain;


import com.cooksdev.dagger2template.data.User;

public class GetUserUseCase {

    private boolean cache;

    public boolean isCache() {
        return cache;
    }

    public void setCache(boolean cache) {
        this.cache = cache;
    }

    public User getUser() {
        if (cache)
            return getUserFromCache();
        else
            return getUserNonFromCache();
    }

    private User getUserFromCache() {
        return new User("from_cache");
    }

    private User getUserNonFromCache() {
        return new User("non_from_cache");
    }
}
