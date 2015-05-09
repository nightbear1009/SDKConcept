package com.nybase;

/**
 * Created by tedliang on 15/5/9.
 */
public interface Provider {
    public INavigator provideNavigator();
    public IRef provideRefer();
    public IApi provideApi();
}
