package com.companysdk;

import android.app.Application;
import android.util.Log;

import com.nybase.IApi;
import com.nybase.INavigator;
import com.nybase.IRef;
import com.nybase.NyBaseApplication;
import com.nybase.Provider;

/**
 * Created by tedliang on 15/5/9.
 */
public class NyApp extends NyBaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public INavigator provideNavigator() {
        Log.d("Ted", "provideNavigator");
        return new MyNavigator();
    }

    @Override
    public IRef provideRefer() {
        Log.d("Ted", "provideRef");
        return new MyRef();
    }

    @Override
    public IApi provideApi() {
        Log.d("Ted", "provideApi");
        return new MyApi();

    }
}
