package org.sportaplication.model;

import java.util.List;

public class Apuesta {
    //Relaciones
    public List<Competencia> competenciaList;

    //Atributos
    int valorApostado;

    //Constructor
    public Apuesta(int valorApostado){
        this.valorApostado = valorApostado;
    }

    //Metodos
    public static void apostar(Prediccion prediccion){
    }
    public boolean confirmarApuesta(){
        return true;
    }

    //Getters y Setters

    public List<Competencia> getCompetenciaList() {
        return competenciaList;
    }

    public void setCompetenciaList(List<Competencia> competenciaList) {
        this.competenciaList = competenciaList;
    }

    public int getValorApostado() {
        return valorApostado;
    }

    public void setValorApostado(int valorApostado) {
        this.valorApostado = valorApostado;
    }
}
