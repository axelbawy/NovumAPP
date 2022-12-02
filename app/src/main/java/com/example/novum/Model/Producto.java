package com.example.novum.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Producto implements Serializable{

    @SerializedName("id_producto")
    private Long id_producto;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("stock")
    private Long stock;
    @SerializedName("estado")
    private String estado;
    @SerializedName("foto")
    private String foto;

    public Producto() {

    }

    public Producto(Long id_producto, String nombre, Long stock, String estado, String foto) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.stock = stock;
        this.estado = estado;
        this.foto = foto;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
