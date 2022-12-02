package com.example.novum.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponsesClass implements Serializable {
    @SerializedName("id_cliente")
    private int id_cliente;

    @SerializedName("usuario")
    private String usuario;

    @SerializedName("contrasena")
    private String contrasena;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    @Override
    public String toString() {
        return
                "ResponsesClass{" +
                        "id_cliente = '" + id_cliente + '\'' +
                        ",usuario = '" + usuario + '\'' +
                        ",contrasena = '" + contrasena + '\'' +
                        "}";
    }
}
