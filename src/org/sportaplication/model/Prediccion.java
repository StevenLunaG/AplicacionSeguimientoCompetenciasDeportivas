package org.sportaplication.model;

public class Prediccion {
    //Relaciones
    public Encuentro encuentro;

    //Atributos
    private Encuentro.Resultado resultado;
    float porcentajeApostado;

    //Constructor
    public Prediccion(){
    }

    //Getters y Setters


    public Encuentro getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
    }

    public Encuentro.Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Encuentro.Resultado resultado) {
        this.resultado = resultado;
    }

    public float getPorcentajeApostado() {
        return porcentajeApostado;
    }

    public void setPorcentajeApostado(float porcentajeApostado) {
        this.porcentajeApostado = porcentajeApostado;
    }

    //Metodos
    public void actualizarPorcentajeApostado(){
    }
}
