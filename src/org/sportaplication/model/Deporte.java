package org.sportaplication.model;

import java.util.List;

public abstract class Deporte {
    //Relaciones
    public Formato formato;
    public Reglamento reglamento;
    public List<Temporada> temporadaList;

    //Atributos
    String nombre;
    String descripcion;
    int numParticipantes;
    int numParticipantesEncuentro = 2;

    //Constructor

    public Deporte(String nombre, Formato formato) {
        this.nombre = nombre;
        this.formato = formato;
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public Reglamento getReglamento() {
        return reglamento;
    }

    public void setReglamento(Reglamento reglamento) {
        this.reglamento = reglamento;
    }

    public List<Temporada> getTemporadaList() {
        return temporadaList;
    }

    public void setTemporadaList(List<Temporada> temporadaList) {
        this.temporadaList = temporadaList;
    }
}
