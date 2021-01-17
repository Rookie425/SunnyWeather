package com.sunnyweather.android.logic.network;

public class SunnyWeatherNetWork {
    private static volatile SunnyWeatherNetWork mInstance;
    private PlaceService mPlaceService = ServiceCreator.getInstance().create(PlaceService.class);

    public static SunnyWeatherNetWork getInstance() {
        if (mInstance == null) {
            synchronized (SunnyWeatherNetWork.class) {
                if (mInstance == null) {
                    mInstance = new SunnyWeatherNetWork();
                }
            }
        }
        return mInstance;
    }


}
