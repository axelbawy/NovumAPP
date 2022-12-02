package com.example.novum.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceProducto {
    @GET("api/productos")
    Call<List<Producto>> getProductos();
}
