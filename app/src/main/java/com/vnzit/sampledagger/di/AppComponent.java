package com.vnzit.sampledagger.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.vnzit.sampledagger.repository.Api;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by quangson8128 on 2/15/16.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context provideAppContext();

    SharedPreferences provideSharedPreferences();
}
