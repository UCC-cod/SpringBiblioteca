package com.example.biblioteca.models;

import java.util.List;

public class Autor {
    private Long id;
    private String nombre;
    private List<Libro> libros;

    public Autor(Long id, String nombre, List<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.libros = libros;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }
}
