package com.example.novum.Model;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServiceFichaSocio {
    @POST("/api/fichaSocio")
    Call<FichaSocio> createPost(@Body FichaSocio fichasocio);
}
