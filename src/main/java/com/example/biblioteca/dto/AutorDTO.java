package com.example.biblioteca.dto;

import java.util.List;

public class AutorDTO {
    private Long id;
    private String nombre;
    private List<LibroDTO> libros;

    public AutorDTO(Long id, String nombre, List<LibroDTO> libros) {
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

    public List<LibroDTO> getLibros() {
        return libros;
    }
}
