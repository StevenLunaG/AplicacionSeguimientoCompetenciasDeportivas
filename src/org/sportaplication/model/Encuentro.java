package org.sportaplication.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Encuentro {

    //Relaciones
    public Estado estado = Estado.NO_INICIADO;
    private Marcador marcador;
    public Fecha fecha;

    //Atributos
    public boolean hayMarcador;
    //Constructor
    public Encuentro(boolean hayMarcador) {
        this.hayMarcador = hayMarcador;
    }

    //Metodos
    public Estado actualizarEstado(){
        return null;
    }

    public void asignarFecha(LocalDate fechaAsignada, LocalTime horaAsignada){
        this.fecha = new Fecha(fechaAsignada, horaAsignada);
    }
    public void asignarMarcador(String puntaje, LocalTime tiempo){
        this.marcador = new Marcador(puntaje, tiempo);
    }

    //Setters y Getters

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public boolean isHayMarcador() {
        return hayMarcador;
    }

    public void setHayMarcador(boolean hayMarcador) {
        this.hayMarcador = hayMarcador;
    }

    public Marcador getMarcador() {
        return marcador;
    }

    public void setMarcador(Marcador marcador) {
        if(hayMarcador != true){
            this.marcador = null;
        }this.marcador = marcador;
    }

    //toString
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Encuentro: ");
        stringBuilder.append("Estado: ").append(estado).append("Fecha: ").append(fecha).append(" ");
        if (hayMarcador && marcador != null) {
            stringBuilder.append("Marcador: ").append(marcador.toString());
        } else {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
    class Resultado{

        //Atributos
        private Participante ganador;
        private String descripcion = "Sin detalles";

        //Constructor
        public Resultado(Participante ganador, String descripcion) {
            this.ganador = ganador;
            this.descripcion = descripcion;
        }

        //Metodos
        public void definirEmpate(){
        }
    }
    }




