package com.sunnyweather.android;

import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {

    public static Context context;
    public static String TOKEN = "EYUJgpVe531bAKZX";

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
