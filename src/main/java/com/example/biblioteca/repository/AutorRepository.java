package com.example.biblioteca.repository;

import com.example.biblioteca.models.Autor;
import com.example.biblioteca.models.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AutorRepository {
    private final List<Autor> autores = new ArrayList<>();

    public AutorRepository() {
        List<Libro> libros = List.of(
                new Libro(1L, "Cien años de soledad"),
                new Libro(2L, "El coronel no tiene quien le escriba"),
                new Libro(3L, "El amor en los tiempos del cólera")
        );

        autores.add(new Autor(1L, "Gabriel Garcia Márquez", libros));
    }

    public List<Autor> findAll(){
        return autores;
    }

    public Optional<Autor> findById (Long id){
        return autores.stream()
                .filter(a ->a.getId().equals(id))
                .findFirst();
    }
}
