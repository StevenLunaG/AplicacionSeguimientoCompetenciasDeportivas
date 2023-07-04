package org.sportaplication.model;

import java.util.ArrayList;
import java.util.List;

public class TablaPosicion {
    //Relaciones
    public List<Participante> participanteList;

    //Atributos
    private String posicionList;
    private int encuentrosJugados;

    //Constructor
    public TablaPosicion(int encuentrosJugados) {
        this.encuentrosJugados = encuentrosJugados;
        this.participanteList = new ArrayList<>();
    }

    //Metodos
    public void agregarParticipante(Participante participante) {
        participanteList.add(participante);
    }
    public void actualizarTabla(){
    }

    //Getters y Setters

    public List<Participante> getParticipanteList() {
        return participanteList;
    }

    public void setParticipanteList(List<Participante> participanteList) {
        this.participanteList = participanteList;
    }

    public String getPosicionList() {
        return posicionList;
    }

    public void setPosicionList(String posicionList) {
        this.posicionList = posicionList;
    }

    public int getEncuentrosJugados() {
        return encuentrosJugados;
    }

    public void setEncuentrosJugados(int encuentrosJugados) {
        this.encuentrosJugados = encuentrosJugados;
    }

    //toString

}
