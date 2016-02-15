package com.vnzit.sampledagger.di;

import com.vnzit.sampledagger.model.Item;
import com.vnzit.sampledagger.repository.Api;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by quangson8128 on 2/15/16.
 */
@Module
public class UserModule {

    @Provides @PerActivity
    Api provideApi() {
        return new Api();
    }

    @Provides @PerActivity
    Item provideItem() {
        return new Item("title", "content");
    }
}
