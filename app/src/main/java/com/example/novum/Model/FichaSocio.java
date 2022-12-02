package com.example.novum.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FichaSocio implements Serializable {
    @SerializedName("id_ficha")
    private Long id_ficha;
    @SerializedName("cedula")
    private String cedula;
    @SerializedName("nombre_cliente")
    private String nombre_cliente;
    @SerializedName("apellido_cliente")
    private String apellido_cliente;
    @SerializedName("email")
    private String email;
    @SerializedName("telefono")
    private String telefono;
    @SerializedName("ciudad")
    private String ciudad;
    @SerializedName("pais")
    private String pais;
    @SerializedName("lugarNacimiento")
    private String lugarNacimiento;
    @SerializedName("grado_istruccion")
    private String grado_istruccion;
    @SerializedName("nombre_apellido_padre")
    private String nombre_apellido_padre;
    @SerializedName("nombre_apellido_madre")
    private String nombre_apellido_madre;
    @SerializedName("num_padre")
    private String num_padre;
    @SerializedName("num_madre")
    private String num_madre;
    @SerializedName("ocupacion")
    private String ocupacion;
    @SerializedName("domicilio")
    private String domicilio;
    @SerializedName("salario")
    private String salario;
    @SerializedName("num_personas_familia")
    private Long num_personas_familia;

    public FichaSocio() {
    }

    public FichaSocio(Long id_ficha, String cedula, String nombre_cliente, String apellido_cliente, String email, String telefono, String ciudad, String pais, String lugarNacimiento, String grado_istruccion, String nombre_apellido_padre, String nombre_apellido_madre, String num_padre, String num_madre, String ocupacion, String domicilio, String salario, Long num_personas_familia) {
        this.id_ficha = id_ficha;
        this.cedula = cedula;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.email = email;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.pais = pais;
        this.lugarNacimiento = lugarNacimiento;
        this.grado_istruccion = grado_istruccion;
        this.nombre_apellido_padre = nombre_apellido_padre;
        this.nombre_apellido_madre = nombre_apellido_madre;
        this.num_padre = num_padre;
        this.num_madre = num_madre;
        this.ocupacion = ocupacion;
        this.domicilio = domicilio;
        this.salario = salario;
        this.num_personas_familia = num_personas_familia;
    }

    public Long getId_ficha() {
        return id_ficha;
    }

    public void setId_ficha(Long id_ficha) {
        this.id_ficha = id_ficha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getGrado_istruccion() {
        return grado_istruccion;
    }

    public void setGrado_istruccion(String grado_istruccion) {
        this.grado_istruccion = grado_istruccion;
    }

    public String getNombre_apellido_padre() {
        return nombre_apellido_padre;
    }

    public void setNombre_apellido_padre(String nombre_apellido_padre) {
        this.nombre_apellido_padre = nombre_apellido_padre;
    }

    public String getNombre_apellido_madre() {
        return nombre_apellido_madre;
    }

    public void setNombre_apellido_madre(String nombre_apellido_madre) {
        this.nombre_apellido_madre = nombre_apellido_madre;
    }

    public String getNum_padre() {
        return num_padre;
    }

    public void setNum_padre(String num_padre) {
        this.num_padre = num_padre;
    }

    public String getNum_madre() {
        return num_madre;
    }

    public void setNum_madre(String num_madre) {
        this.num_madre = num_madre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Long getNum_personas_familia() {
        return num_personas_familia;
    }

    public void setNum_personas_familia(Long num_personas_familia) {
        this.num_personas_familia = num_personas_familia;
    }
}