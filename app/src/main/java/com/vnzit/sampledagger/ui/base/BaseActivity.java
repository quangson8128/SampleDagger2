package com.vnzit.sampledagger.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.vnzit.sampledagger.App;
import com.vnzit.sampledagger.di.ActivityModule;
import com.vnzit.sampledagger.di.AppComponent;
import com.vnzit.sampledagger.di.HasComponent;

/**
 * Created by quangson8128 on 2/15/16.
 */
public abstract class BaseActivity<C> extends AppCompatActivity implements HasComponent<C> {

    private C component;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        component = initializeInjector();
    }

    protected abstract C initializeInjector();

    protected AppComponent getAppComponent() {
        return App.get(this).getAppComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    @Override
    public C getComponent() {
        return component;
    }
}
