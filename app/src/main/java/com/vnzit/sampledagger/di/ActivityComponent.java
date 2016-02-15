package com.vnzit.sampledagger.di;

import android.app.Activity;

import dagger.Component;

/**
 * Created by quangson8128 on 2/15/16.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
