package org.sportaplication.model;

public class Estadistica {
    //Atributes
    private int encuentrosTotalesGanados;
    private int encuentrosTotalesPerdidos;
    private int encuentrosTotalesEmpatados;
    private int rachaVictoria;
    private int competenciasGanadas;

    //Constructor


    public Estadistica() {
    }

    //Metodos
    public void actualizarEstadistica(int encuentrosTotalesGanados, int encuentrosTotalesPerdidos, int encuentrosTotalesEmpatados, int rachaVictorias, int competenciasGanadas) {
    }

    //Setters y Getters
    public int getEncuentrosTotalesGanados() {
        return encuentrosTotalesGanados;
    }

    public void setEncuentrosTotalesGanados(int encuentrosTotalesGanados) {
        this.encuentrosTotalesGanados = encuentrosTotalesGanados;
    }

    public int getEncuentrosTotalesPerdidos() {
        return encuentrosTotalesPerdidos;
    }

    public void setEncuentrosTotalesPerdidos(int encuentrosTotalesPerdidos) {
        this.encuentrosTotalesPerdidos = encuentrosTotalesPerdidos;
    }

    public int getEncuentrosTotalesEmpatados() {
        return encuentrosTotalesEmpatados;
    }

    public void setEncuentrosTotalesEmpatados(int encuentrosTotalesEmpatados) {
        this.encuentrosTotalesEmpatados = encuentrosTotalesEmpatados;
    }

    public int getRachaVictoria() {
        return rachaVictoria;
    }

    public void setRachaVictoria(int rachaVictoria) {
        this.rachaVictoria = rachaVictoria;
    }

    public int getCompetenciasGanadas() {
        return competenciasGanadas;
    }

    public void setCompetenciasGanadas(int competenciasGanadas) {
        this.competenciasGanadas = competenciasGanadas;
    }

    @Override
    public String toString() {
        return "Encuentros totales ganados: " + encuentrosTotalesGanados + "\n" +
                "Encuentros totales perdidos: " + encuentrosTotalesPerdidos + "\n" +
                "Encuentros totales empatados: " + encuentrosTotalesEmpatados + "\n" +
                "Racha de victorias: " + rachaVictoria + "\n" +
                "Competencias ganadas: " + competenciasGanadas;
    }
}