package com.vnzit.sampledagger.di;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by quangson8128 on 2/15/16.
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides @PerActivity Activity activity() {
        return this.activity;
    }
}
