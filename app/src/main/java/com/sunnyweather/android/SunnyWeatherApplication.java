package com.sunnyweather.android;

import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {

    private static Context mContext;
    public static String TOKEN = "EYUJgpVe531bAKZX";

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext(){
        return mContext;
    }
}
