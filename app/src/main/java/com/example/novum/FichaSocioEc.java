package com.example.novum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FichaSocioEc extends AppCompatActivity {
    EditText txtCedula,txtNombreCli,txtApellidoCli,txtEmail,txtTelefono,txtCiudad,
            txtPais,txtLugarNac,txtGradoInstr,txtNombreMadre,txtNombrePadre,
            txtNumPadre,txtNumMadre,txtOcupacion, txtDomicilio,txtSalario,
            txtPersonasFam;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_socio_ec);
        initializeListeners();
    }

    private void initializeListeners() {
        txtCedula = findViewById(R.id.editCedula);
        txtNombreCli = findViewById(R.id.editNombre);
        txtApellidoCli = findViewById(R.id.editApellido);
        txtEmail = findViewById(R.id.editEmail);
        txtTelefono = findViewById(R.id.editTelefono);
        txtCiudad = findViewById(R.id.editCiudad);
        txtPais = findViewById(R.id.editPais);
        txtLugarNac = findViewById(R.id.editLugarNacimiento);
        txtGradoInstr = findViewById(R.id.editInstruccion);
        txtNombreMadre = findViewById(R.id.editNomMadre);
        txtNumPadre = findViewById(R.id.editNumPadre);
        txtNumMadre = findViewById(R.id.editNumMadre);
        txtOcupacion = findViewById(R.id.editOcupacion);
        txtDomicilio = findViewById(R.id.editDomicilio);
        txtSalario = findViewById(R.id.editSalario);
        txtPersonasFam = findViewById(R.id.editNumIntegrantes);
        btnGuardar = findViewById(R.id.btn_Gurdar);

        btnGuardar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (    txtCedula.getText().toString().isEmpty() ||
                        txtNombreCli.getText().toString().isEmpty() ||
                        txtApellidoCli.getText().toString().isEmpty() ||
                        txtEmail.getText().toString().isEmpty() ||
                        txtTelefono.getText().toString().isEmpty() ||
                        txtDomicilio.getText().toString().isEmpty() ||
                        txtCiudad.getText().toString().isEmpty() ||
                        txtPais.getText().toString().isEmpty() ||
                        txtLugarNac.getText().toString().isEmpty() ||
                        txtGradoInstr.getText().toString().isEmpty() ||
                        txtNombreMadre.getText().toString().isEmpty() ||
                        txtNumPadre.getText().toString().isEmpty() ||
                        txtNumMadre.getText().toString().isEmpty() ||
                        txtOcupacion.getText().toString().isEmpty() ||
                        txtSalario.getText().toString().isEmpty() ||
                        txtPersonasFam.getText().toString().isEmpty() ||
                        txtLugarNac.getText().toString().isEmpty()
                ) {
                    Toast.makeText(FichaSocioEc.this, "Datos Erroneos", Toast.LENGTH_SHORT).show();
                    return;
                }


    }
});
    }
}