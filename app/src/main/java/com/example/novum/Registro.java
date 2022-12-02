package com.example.novum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.example.novum.Model.Cliente;
import com.example.novum.Model.ServiceCliente;
import com.example.novum.Model.Apis;
import com.example.novum.Model.ResponsesClass;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Registro extends AppCompatActivity {

    EditText txtUsuario,txtContra;
    Button btncrearcuenta,btnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtUsuario= findViewById(R.id.txt_Usuario);
        txtContra= findViewById(R.id.txt_Contra);
        btncrearcuenta = findViewById(R.id.btncrearcuenta);
        btnlog = findViewById(R.id.btniniciarsesion);

        btncrearcuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), LlenarRegistro.class);
                startActivityForResult(intent, 0);
            }

        });

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cliente responseRegisterClass = new Cliente(txtUsuario.getText().toString(), txtContra.getText().toString());

                ServiceCliente apiService = Apis.getInstance().create(ServiceCliente.class);
                apiService.getUser(responseRegisterClass).enqueue(new Callback<ResponsesClass>() {
                    @Override
                    public void onResponse(Call<ResponsesClass> call, Response<ResponsesClass> response) {
                        if (response.body() != null) {
                            Toast.makeText(Registro.this, "Login successful", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Registro.this, MainCategoria.class);
                            intent.putExtra("usuario", response.body().getUsuario());
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponsesClass> call, Throwable t) {
                        Toast.makeText(Registro.this, "Credenciales Invalidos", Toast.LENGTH_SHORT).show();
                    }
                });

            }
    });
}
}
