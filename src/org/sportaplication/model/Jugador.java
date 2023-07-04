package org.sportaplication.model;

import java.util.List;

public class Jugador extends Persona {

    //Relaciones
    public DeporteIndividual deporteIndividual;
    public Equipo equipo;
    public Estadistica estadistica;

    //Atributos
    String deporteProfesion;

    //Constructor
    public Jugador(String nombre, String apellido, String deporteProfesion) {
        super(nombre, apellido);
        this.deporteProfesion = deporteProfesion;
    }

    //Metodos
    public static void inscribirDeporte(Inscripcion inscripcion) {
        inscripcion.validarInscripcion();
        inscripcion.registrarInscripcion();
    }
    public void agregarEstadistica(Estadistica estadistica) {
    }

    //Setters and Getters
    public Estadistica getEstadistica() {
        return estadistica;
    }

    public void setEstadistica(Estadistica estadistica) {
        this.estadistica = estadistica;
    }

    public DeporteIndividual getDeporteIndividual() {
        return deporteIndividual;
    }

    public void setDeporteIndividual(DeporteIndividual deporteIndividual) {
        this.equipo = null;
        this.deporteIndividual = deporteIndividual;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.deporteIndividual = null;
        this.equipo = equipo;
    }

    //toString
    @Override
    public String toString() {
        return "Jugador: {" + "Nombre: " + super.getNombre() + ", Apellido: " + super.getApellido() +  ", Profesion: " + deporteProfesion + "}";
    }


}
