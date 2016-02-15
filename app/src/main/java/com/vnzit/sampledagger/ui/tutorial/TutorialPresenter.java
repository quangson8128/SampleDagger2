package com.vnzit.sampledagger.ui.tutorial;

import android.content.SharedPreferences;

import com.vnzit.sampledagger.di.PerActivity;
import com.vnzit.sampledagger.repository.Api;

import javax.inject.Inject;

/**
 * Created by quangson8128 on 2/15/16.
 */
@PerActivity
public class TutorialPresenter {
    final SharedPreferences pref;
    final Api api;

    @Inject
    public TutorialPresenter(SharedPreferences pref, Api api) {
        this.pref = pref;
        this.api = api;
    }

    public void write(String key, String msg) {
        pref.edit().putString(key, msg).commit();
    }

    public String read(String key) {
        return pref.getString(key, "");
    }
}
