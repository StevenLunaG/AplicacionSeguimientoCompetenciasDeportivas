package org.sportaplication.model;

import java.util.List;

public class DeporteIndividual extends Deporte {
    //Relaciones
    public List<Jugador> jugadorList;

    //Constructor
    public DeporteIndividual(String nombre, Formato formato) {
        super(nombre, formato);
    }

    //toString
    @Override
    public String toString() {
        return "DeporteIndividual {" + "Nombre: " + nombre + ", Formato: " + formato + '\'' + '}' ;
    }
}
