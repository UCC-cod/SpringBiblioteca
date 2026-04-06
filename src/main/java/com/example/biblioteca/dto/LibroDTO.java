package com.example.biblioteca.dto;

public class LibroDTO {
    private Long id;
    private String titulo;

    public LibroDTO(Long id, String titulo) {
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
