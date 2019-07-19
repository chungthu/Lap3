package com.example.lap3;

public class ApiUlti {
    public static RetrofitInterface getService() {
        return RetrofitAPI.getRetrofit("http://dotplays.com/android/").create(RetrofitInterface.class);
    }
}
