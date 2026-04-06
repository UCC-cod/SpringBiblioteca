package com.example.biblioteca.service;

import com.example.biblioteca.dto.AutorDTO;

import java.util.List;

public interface AutorService {
    List<AutorDTO> obtenerAutores();
    AutorDTO obtenerAutorPorId(Long id);
}
