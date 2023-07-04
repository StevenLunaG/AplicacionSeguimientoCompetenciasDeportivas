package org.sportaplication.model;

public class Regla{
    //Atributos
    private String nombre;
    private String descripcion;

    //Constructor
    public Regla(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //toString
    @Override
    public String toString() {
        return " " + nombre + ": " + descripcion + "\n";
    }
}
