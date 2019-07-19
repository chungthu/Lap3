package com.example.lap3;

import com.example.lap3.model.Lap3Response;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @POST("login.php")
    @FormUrlEncoded
    Call<String> Login(@Field("username") String username,
                       @Field("password") String password,
                       @Field("name") String name);

    @GET("bai1.php")
    Call<String> Food(@Query("food") String food);

    @GET("lab3.json")
    Call<Lap3Response> getlap3();

}
