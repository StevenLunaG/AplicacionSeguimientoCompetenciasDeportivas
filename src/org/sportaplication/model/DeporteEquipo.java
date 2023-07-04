package org.sportaplication.model;

import java.util.List;

public class DeporteEquipo extends Deporte {
    //Relaciones
    public List<Equipo> equipoList;

    //Atributos
    private int numJugadoresEquipo = 12;

    //Constructor
    public DeporteEquipo(String nombre, Formato formato) {
        super(nombre, formato);
    }

    //Setters y Getters

    public int getNumJugadoresEquipo() {
        return numJugadoresEquipo;
    }

    public void setNumJugadoresEquipo(int numJugadoresEquipo) {
        this.numJugadoresEquipo = numJugadoresEquipo;
    }

    //toString

    @Override
    public String toString() {
        return "DeporteEquipo {" + "Nombre: " + nombre + ", Formato: " + formato +  '}' ;
    }
}
