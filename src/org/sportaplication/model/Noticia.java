package org.sportaplication.model;

import java.time.LocalDate;

public class Noticia {

    //Relaciones
    public Temporada temporada;

    //Atributos
    private String titulo;
    private LocalDate fecha;
    private String autor;
    private String informacion;

    //Constructor
    public Noticia(String titulo, LocalDate fecha, String autor, String informacion) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.autor = autor;
        this.informacion = informacion;
    }
}
