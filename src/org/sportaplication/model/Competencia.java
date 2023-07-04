package org.sportaplication.model;

import java.time.LocalDate;

public class Competencia {
    //Relaciones
    public Temporada temporada;
    public TablaPosicion tablaPosicion;

    //Atributos
    private String nombre;
    private LocalDate periodoFechaInicio;
    private LocalDate periodoFechaFin;

    //Constructor


    public Competencia(Temporada temporada, String nombre, LocalDate periodoFechaInicio, LocalDate periodoFechaFin) {
        this.temporada = temporada;
        this.nombre = nombre;
        this.periodoFechaInicio = periodoFechaInicio;
        this.periodoFechaFin = periodoFechaFin;
    }

    //Metodos
    public Temporada asignarPeriodoTemporada(LocalDate fechaInicio, LocalDate fechaFin){
        this.periodoFechaInicio = fechaInicio;
        this.periodoFechaFin = fechaFin;
        return this.temporada;
    }

    //Setters y Getters
    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getPeriodoFechaInicio() {
        return periodoFechaInicio;
    }

    public void setPeriodoFechaInicio(LocalDate periodoFechaInicio) {
        this.periodoFechaInicio = periodoFechaInicio;
    }

    public LocalDate getPeriodoFechaFin() {
        return periodoFechaFin;
    }

    public void setPeriodoFechaFin(LocalDate periodoFechaFin) {
        this.periodoFechaFin = periodoFechaFin;
    }

    //toString
    @Override
    public String toString() {
        return "Competencia: {" + "Nombre: " + nombre + ", Fecha de Inicio: " + periodoFechaInicio + ", Fecha de Fin: " + periodoFechaFin +'}';
    }
}
