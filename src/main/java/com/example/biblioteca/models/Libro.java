package com.example.biblioteca.models;

public class Libro {
    private Long id;
    private String titulo;

    public Libro(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }
}
