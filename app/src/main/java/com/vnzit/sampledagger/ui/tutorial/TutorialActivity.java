package com.vnzit.sampledagger.ui.tutorial;

import android.os.Bundle;
import android.widget.TextView;

import com.vnzit.sampledagger.R;
import com.vnzit.sampledagger.di.DaggerUserComponent;
import com.vnzit.sampledagger.di.UserComponent;
import com.vnzit.sampledagger.di.UserModule;
import com.vnzit.sampledagger.model.Item;
import com.vnzit.sampledagger.ui.base.BaseActivity;

import javax.inject.Inject;

public class TutorialActivity extends BaseActivity<UserComponent> {

    @Inject
    Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tvContent = (TextView) findViewById(R.id.tvContent);
        getComponent().inject(this);
        tvContent.setText(item.getContent());
    }

    protected UserComponent initializeInjector() {
        return DaggerUserComponent.builder()
                .appComponent(getAppComponent())
                .activityModule(getActivityModule())
                .userModule(new UserModule())
                .build();
    }
}
