package com.sunnyweather.android.logic.network;

import com.sunnyweather.android.logic.model.PlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    public Call<PlaceResponse> searchPlaces(@Query("query") String query){
        return null;
    }
}
