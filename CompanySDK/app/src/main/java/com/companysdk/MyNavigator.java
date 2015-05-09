package com.companysdk;

import android.util.Log;

import com.nybase.INavigator;

/**
 * Created by tedliang on 15/5/9.
 */
public class MyNavigator implements INavigator {
    @Override
    public void navigate() {
        Log.d("Ted","doNavigate");
    }
}
