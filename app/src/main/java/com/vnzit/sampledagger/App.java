package com.vnzit.sampledagger;

import android.app.Application;
import android.content.Context;

import com.vnzit.sampledagger.di.AppComponent;
import com.vnzit.sampledagger.di.AppModule;
import com.vnzit.sampledagger.di.DaggerAppComponent;

/**
 * Created by quangson8128 on 2/15/16.
 */
public class App extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initialize();
    }

    private void initialize() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }
}
