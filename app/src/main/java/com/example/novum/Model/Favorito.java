package com.example.novum.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
public class Favorito implements Serializable {
    @SerializedName("id_favoritos")
    private Long id_favoritos;
    @SerializedName("id_cliente")
    private Long id_cliente;
    @SerializedName("id_producto")
    private Long id_producto;

    public Favorito() {
    }

    public Favorito(Long id_favoritos, Long id_cliente, Long id_producto) {
        this.id_favoritos = id_favoritos;
        this.id_cliente = id_cliente;
        this.id_producto = id_producto;
    }

    public Long getId_favoritos() {
        return id_favoritos;
    }

    public void setId_favoritos(Long id_favoritos) {
        this.id_favoritos = id_favoritos;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }
}
