package org.sportaplication.model;

public class Inscripcion {

    //Atributos
    private Temporada temporada;
    private DeporteIndividual deporteIndividual;
    private Equipo equipo;

    //Constructor
    public Inscripcion(Temporada temporada, Equipo equipo) {
        this.temporada = temporada;
        this.equipo = equipo;
    }

    //Metodos
    public void validarInscripcion() {
    }
    public void registrarInscripcion() {
    }

    //Setters and Getters

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public DeporteIndividual getDeporteIndividual() {
        return deporteIndividual;
    }

    public void setDeporteIndividual(DeporteIndividual deporteIndividual) {
        this.deporteIndividual = deporteIndividual;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    //toString
    @Override
    public String toString() {
        return "Inscripcion{" + "Temporada: " + temporada + ", Equipo: " + equipo + " Inscripcion exitosa";
    }
}
