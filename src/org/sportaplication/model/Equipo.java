package org.sportaplication.model;

import java.util.List;

public class Equipo {
    //Relaciones
    public List<Jugador> jugadorList;
    public DeporteEquipo deporteEquipo;
    public List<Estadistica> estadisticaList;

    //Atributos
    private String nombre;
    private String nacionalidad;
    private String alineacion;

    //Metodos
    public void actualizarAlinacion(String alineacion) {
    }

    //Constructor
    public Equipo(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    //Setters y Getters

    public List<Estadistica> getEstadisticaList() {
        return estadisticaList;
    }

    public void setEstadisticaList(List<Estadistica> estadisticaList) {
        this.estadisticaList = estadisticaList;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    //toString

    @Override
    public String toString() {
        return "{" + "Nombre: " + nombre  + ", Nacionalidad: " + nacionalidad + '}' ;
    }
}
