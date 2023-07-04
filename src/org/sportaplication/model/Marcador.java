package org.sportaplication.model;

import java.time.LocalTime;

public class Marcador {

    //Relaciones
    public Encuentro encuentro;

    //Atributos
    private String puntaje;
    private LocalTime tiempo;

    //Constructor
    public Marcador(String puntaje, LocalTime tiempo) {
        this.puntaje = puntaje;
        this.tiempo = tiempo;
    }

    //Metodos
    public void actualizarMarcador(String puntaje, LocalTime tiempo){
    }
    //Setters y Getters
    public Encuentro getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    //toString
    @Override
    public String toString() {
        return "{" + puntaje + '}'+ " Tiempo: " + tiempo;
    }
}
