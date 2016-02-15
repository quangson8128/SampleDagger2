package com.vnzit.sampledagger.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.vnzit.sampledagger.repository.Api;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by quangson8128 on 2/15/16.
 */
@Module
public class AppModule {
    private final Application app;

    public AppModule(Application app) {
        this.app = app;
    }

    @Provides @Singleton
    Context provideAppContext() {
        return this.app;
    }

    @Provides @Singleton
    SharedPreferences provideSharedPreferences() {
        return this.app.getSharedPreferences("global_shared", Context.MODE_PRIVATE);
    }
}
