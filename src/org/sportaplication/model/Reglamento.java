package org.sportaplication.model;

import java.util.ArrayList;
import java.util.List;

public class Reglamento {
    //Relaciones
    private List<Regla> reglaList;

    //Atributos
    private String titulo;

    //Constructor
    public Reglamento(String titulo) {
        this.titulo = titulo;
        this.reglaList = new ArrayList<>();
    }

    //Metodos
    public void agregarRegla(Regla regla) {
        reglaList.add(regla);
    }

    //Setters y Getters


    public List<Regla> getReglaList() {
        return reglaList;
    }

    public void setReglaList(List<Regla> reglaList) {
        this.reglaList = reglaList;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reglamento: ").append(titulo).append("\n");
        sb.append("-Reglas-\n");

        for (Regla regla : reglaList) {
            sb.append(regla.toString());
        }

        return sb.toString();
    }
}
