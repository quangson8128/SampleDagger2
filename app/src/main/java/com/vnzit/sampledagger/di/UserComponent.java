package com.vnzit.sampledagger.di;

import com.vnzit.sampledagger.ui.tutorial.TutorialActivity;

import dagger.Component;

/**
 * Created by quangson8128 on 2/15/16.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class, UserModule.class})
public interface UserComponent extends ActivityComponent{
    void inject(TutorialActivity tutorialActivity);
    void inject(com.vnzit.sampledagger.ui.tutorial2.TutorialActivity tutorialActivity);
}
