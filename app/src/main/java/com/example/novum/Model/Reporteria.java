package com.example.novum.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Reporteria implements Serializable {
    @SerializedName("id_reporteria")
    private Long id_reporteria;
    @SerializedName("cedula")
    private String cedula;
    @SerializedName("nombre_cliente")
    private String nombre_cliente;
    @SerializedName("apellido_cliente")
    private String apellido_cliente;
    @SerializedName("nombrePro")
    private String nombrePro;
    @SerializedName("foto")
    private String foto;
    @SerializedName("id_fav")
    private Long id_fav;
    @SerializedName("nombreCat")
    private String nombreCat;

    public Reporteria() {
    }

    public Reporteria(Long id_reporteria, String cedula, String nombre_cliente, String apellido_cliente, String nombrePro, String foto, Long id_fav, String nombreCat) {
        this.id_reporteria = id_reporteria;
        this.cedula = cedula;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.nombrePro = nombrePro;
        this.foto = foto;
        this.id_fav = id_fav;
        this.nombreCat = nombreCat;
    }

    public Long getId_reporteria() {
        return id_reporteria;
    }

    public void setId_reporteria(Long id_reporteria) {
        this.id_reporteria = id_reporteria;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Long getId_fav() {
        return id_fav;
    }

    public void setId_fav(Long id_fav) {
        this.id_fav = id_fav;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }
}