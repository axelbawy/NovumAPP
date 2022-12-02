package com.example.novum.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ServiceCliente {

    @GET("/api//cliente/{id}")
    Call<Cliente> find(@Path("id") String id);

    @POST("/api//crearcliente")
    Call<Cliente> createPost(@Body Cliente cliente);

    @POST("/api/getUser")
    Call<ResponsesClass> getUser(@Body Cliente responseRegisterClass);
}
