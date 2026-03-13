package com.rpg.model;

public class Items {
    private String id;
    private String nombre;
    private String tipo;
    private Integer valor;
    private String nombre_ciudad;
    public Items(String id, String nombre, String tipo, Integer valor, String nombre_ciudad){
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.nombre_ciudad = nombre_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public String getId() {
        return id;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
