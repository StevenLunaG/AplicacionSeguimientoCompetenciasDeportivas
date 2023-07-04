package org.sportaplication.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Fecha {
    //Relaciones
    public Encuentro encuentro;
    private Calendario calendario;

    //Atributos
    private LocalDate fechaAsignada;
    private LocalTime horaAsignada;

    //Constructor
    public Fecha(LocalDate fechaAsignada, LocalTime horaAsignada){
        this.fechaAsignada = fechaAsignada;
        this.horaAsignada = horaAsignada;
    }

    //Setters y Getters

    public Encuentro getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    public LocalDate getFechaAsignada() {
        return fechaAsignada;
    }

    public void setFechaAsignada(LocalDate fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }

    public LocalTime getHoraAsignada() {
        return horaAsignada;
    }

    public void setHoraAsignada(LocalTime horaAsignada) {
        this.horaAsignada = horaAsignada;
    }

    //toString

    @Override
    public String toString() {
        return "{" + fechaAsignada +" Hora: "+ horaAsignada + "}";
    }
}
