package com.ST.clase4;

public class Constructor {
    private Integer Id;
    private String nombre;
    private String apellido;
    private Float promedio;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }

    public Constructor (Integer Id, String nombre, String apellido, Float promedio){
        this.Id=Id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.promedio=promedio;

    }
}

