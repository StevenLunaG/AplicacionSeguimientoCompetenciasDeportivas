package org.sportaplication.model;

import java.time.LocalDate;
import java.util.List;

public class Temporada {
    //Relaciones
    public Deporte deporte;
    public List<Noticia> noticiaList;
    public List<Competencia> competenciaList;

    //Atributos
    private String nombre;
    private LocalDate periodoInicio;
    private LocalDate periodoFin;

    //Constructor
    public Temporada(String nombre, LocalDate periodoInicio, LocalDate periodoFin) {
        this.nombre = nombre;
        this.periodoInicio = periodoInicio;
        this.periodoFin = periodoFin;
    }

    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getPeriodoInicio() {
        return periodoInicio;
    }

    public void setPeriodoInicio(LocalDate periodoInicio) {
        this.periodoInicio = periodoInicio;
    }

    public LocalDate getPeriodoFin() {
        return periodoFin;
    }

    public void setPeriodoFin(LocalDate periodoFin) {
        this.periodoFin = periodoFin;
    }

    //toString
    @Override
    public String toString() {
        return "Temporada: {" + nombre + "  Periodo: " + periodoInicio + " - " + periodoFin + "}";
    }
}
