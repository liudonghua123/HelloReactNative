package com.example.hello;

import com.facebook.react.ReactActivity;

import javax.annotation.Nullable;

public class MyReactActivity extends ReactActivity {

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "MyReactNativeApp";
    }
}