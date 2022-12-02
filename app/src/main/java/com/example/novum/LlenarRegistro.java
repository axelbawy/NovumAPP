package com.example.novum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.novum.Model.ServiceCliente;
import com.example.novum.Model.Cliente;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class LlenarRegistro extends AppCompatActivity {

    EditText txtId,txtNombre,txtCedula,txtApellido,txtEmail,txtTelefono,txtDireccion,txtUsuario,txtContra,txtRepContra;
    Button btnGuardarRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_llenar_registro);
        txtNombre= findViewById(R.id.txtNombre);
        txtCedula= findViewById(R.id.txtCedula);
        txtApellido= findViewById(R.id.txtApellido);
        txtEmail= findViewById(R.id.txtCorreo);
        txtTelefono= findViewById(R.id.txtTelefono);
        txtDireccion= findViewById(R.id.txtDireccion);
        txtUsuario= findViewById(R.id.txtUsuario);
        txtContra= findViewById(R.id.txtContra);
        txtRepContra= findViewById(R.id.txtRepContra);
        btnGuardarRegistro = findViewById(R.id.btnGuardarRegistro);

        btnGuardarRegistro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (    txtCedula.getText().toString().isEmpty() ||
                        txtNombre.getText().toString().isEmpty() ||
                        txtApellido.getText().toString().isEmpty() ||
                        txtEmail.getText().toString().isEmpty() ||
                        txtTelefono.getText().toString().isEmpty() ||
                        txtDireccion.getText().toString().isEmpty() ||
                        txtUsuario.getText().toString().isEmpty() ||
                        txtContra.getText().toString().isEmpty() ||
                        txtRepContra.getText().toString().isEmpty() ||
                        !isNumeric(txtCedula.getText().toString())||
                        !isNumeric(txtTelefono.getText().toString())||
                        !txtRepContra.getText().toString().equalsIgnoreCase(txtContra.getText().toString())
                        ) {
                    Toast.makeText(LlenarRegistro.this, "Datos Erroneos", Toast.LENGTH_SHORT).show();
                    return;
                }
                postData(Long.parseLong(txtCedula.getText().toString()), txtCedula.getText().toString(),
                        txtNombre.getText().toString(),
                        txtApellido.getText().toString(),
                        txtEmail.getText().toString(),
                        txtTelefono.getText().toString(),
                        txtDireccion.getText().toString(),
                        txtUsuario.getText().toString(),
                        txtContra.getText().toString());

                Intent intent = new Intent (view.getContext(), Registro.class);
                startActivityForResult(intent, 0);

            }

        });
    }

    public  boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    private void postData( Long id,String cedula, String nombre, String apellido, String email, String telefono, String direccion, String usuario, String contra) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2:8080")
                .addConverterFactory(GsonConverterFactory.create()).build();

        ServiceCliente clienteservice = retrofit.create(ServiceCliente.class);
        Cliente c = new Cliente(id,cedula,nombre,apellido,email,telefono,direccion,usuario,contra);
        Call<Cliente> call=clienteservice.createPost(c);

        call.enqueue(new Callback<Cliente>() {
            @Override
            public void onResponse(Call<Cliente> call, Response<Cliente> response) {
                Toast.makeText(LlenarRegistro.this, "MainCategoria añadido con exito", Toast.LENGTH_SHORT).show();
                txtNombre.setText("Nombre");
                txtCedula.setText("Cedula");
                txtApellido.setText("Apellido");
                txtEmail.setText("Email");
                txtTelefono.setText("Telefono");
                txtDireccion.setText("Direccion");
                txtUsuario.setText("MainCategoria");
                txtContra.setText("Contraseña");
                txtRepContra.setText("Repetir Contr.");
            }

            @Override
            public void onFailure(Call<Cliente> call, Throwable t) {
                Toast.makeText(LlenarRegistro.this, "ERROR de RED", Toast.LENGTH_SHORT).show();
            }

        });
    }
}