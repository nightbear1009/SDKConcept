package com.nybase;

import android.app.Application;

/**
 * Created by tedliang on 15/5/9.
 */
public abstract class NyBaseApplication extends Application implements Provider{
    private static NyBaseApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    //should never null
    public static NyBaseApplication getInstance(){
        return instance;
    }
}
