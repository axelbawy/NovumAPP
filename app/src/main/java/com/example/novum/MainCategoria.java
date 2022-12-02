package com.example.novum;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.example.novum.Model.Categoria;
import com.example.novum.Model.ListAdapterCategorias;
import com.example.novum.Model.ServiceCategoria;
import com.example.novum.Model.ConnectionRest;
import com.example.novum.databinding.ActivityCategoriaBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainCategoria extends AppCompatActivity {

    ActivityCategoriaBinding binding;
    ArrayList<Categoria> categoriaArrayList = new ArrayList<Categoria>();
    ListView lstcat = null;
    ListAdapterCategorias adapatador = null;
    Button btnconfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategoriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        lstcat = (ListView) findViewById(R.id.lis_Categoria);
        adapatador = new ListAdapterCategorias(MainCategoria.this,categoriaArrayList);
        lstcat.setAdapter(adapatador);
        binding.lisCategoria.setAdapter(adapatador);
        cargaCategorias();


    }

    public void cargaCategorias(){
        ServiceCategoria api = ConnectionRest.getConnetion().create(ServiceCategoria.class);

        Call<List<Categoria>> call = api.getCategorias();
        call.enqueue(new Callback<List<Categoria>>() {
            @Override
            public void onResponse(Call<List<Categoria>> call, Response<List<Categoria>> response) {
                List<Categoria> lista = response.body();
                for(Categoria x:lista){
                    categoriaArrayList.add(x);
                }
                adapatador.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<List<Categoria>> call, Throwable t) {}
        });

    }
}