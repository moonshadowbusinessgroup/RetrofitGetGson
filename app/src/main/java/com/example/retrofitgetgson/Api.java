package com.example.retrofitgetgson;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://gorest.co.in/public/v1/";

    @GET("users")
    Call<MyModel> getWhatWeNeed();

}

