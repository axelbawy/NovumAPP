package com.example.novum.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
public class Subcategoria implements Serializable {
    @SerializedName("id_subcategoria")
    private Long id_subcategoria;
    @SerializedName("id_categoria")
    private Long id_categoria;
    @SerializedName("nombreSubcategoria")
    private String nombreSubcategoria;

    public Subcategoria() {
    }

    public Subcategoria(Long id_subcategoria, Long id_categoria, String nombreSubcategoria) {
        this.id_subcategoria = id_subcategoria;
        this.id_categoria = id_categoria;
        this.nombreSubcategoria = nombreSubcategoria;
    }


    public Long getId_subcategoria() {
        return id_subcategoria;
    }

    public void setId_subcategoria(Long id_subcategoria) {
        this.id_subcategoria = id_subcategoria;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombreSubcategoria() {
        return nombreSubcategoria;
    }

    public void setNombreSubcategoria(String nombreSubcategoria) {
        this.nombreSubcategoria = nombreSubcategoria;
    }
}
