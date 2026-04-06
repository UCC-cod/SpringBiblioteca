package com.example.biblioteca.service.impl;

import com.example.biblioteca.dto.AutorDTO;
import com.example.biblioteca.dto.LibroDTO;
import com.example.biblioteca.models.Autor;
import com.example.biblioteca.repository.AutorRepository;
import com.example.biblioteca.service.AutorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutorServiceImpl implements AutorService {
    private final AutorRepository autorRepository;

    public AutorServiceImpl(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @Override
    public List<AutorDTO> obtenerAutores() {
        return autorRepository.findAll()
                .stream()
                .map(this::);
    }

    @Override
    public AutorDTO obtenerAutorPorId(Long id) {
        return null;
    }

    private AutorDTO convertirAutor(Autor autor){
        List<LibroDTO> libroDTOS = autor.getLibros()
                .stream()
                .map(l->new LibroDTO(l.getId(), l.getTitulo()))
                .collect(Collectors.toList());

        return new AutorDTO(autor.getId(), autor.getNombre(), libroDTOS);
    }
}
