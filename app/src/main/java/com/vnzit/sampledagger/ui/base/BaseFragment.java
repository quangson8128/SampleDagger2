package com.vnzit.sampledagger.ui.base;

import android.support.v4.app.Fragment;

import com.vnzit.sampledagger.di.HasComponent;

/**
 * Created by quangson8128 on 2/15/16.
 */
public abstract class BaseFragment extends Fragment{

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }
}
