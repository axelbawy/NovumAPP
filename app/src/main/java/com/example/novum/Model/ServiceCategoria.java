package com.example.novum.Model;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceCategoria {

    String API_ROUTE="api/categoria/";
    @GET(API_ROUTE)
    Call<List<Categoria>> getCategorias();

}
