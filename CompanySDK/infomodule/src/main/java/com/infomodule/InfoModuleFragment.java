package com.infomodule;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.nybase.BaseInject;
import com.nybase.NyBaseApplication;

/**
 * Created by tedliang on 15/5/9.
 */
public class InfoModuleFragment extends Fragment implements BaseInject {


    public static Fragment newInstance(){
        return new InfoModuleFragment();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getNavigator().navigate();
        getRefer();
        getApi();
    }

    @Override
    public com.nybase.INavigator getNavigator() {
        return NyBaseApplication.getInstance().provideNavigator();
    }

    @Override
    public com.nybase.IRef getRefer() {
        return NyBaseApplication.getInstance().provideRefer();
    }

    @Override
    public com.nybase.IApi getApi() {
        return NyBaseApplication.getInstance().provideApi();
    }
}
