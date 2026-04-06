package com.example.biblioteca.controller;

import com.example.biblioteca.dto.AutorDTO;
import com.example.biblioteca.service.AutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("autor")
public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public List<AutorDTO> obtenerAutores(){
        return autorService.obtenerAutores();
    }

    @GetMapping("/{id}")
    public AutorDTO obtenerAutorPorId(@PathVariable Long id){
        try{
            return autorService.obtenerAutorPorId(id);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /*
    @PostMapping
    @PutMapping
    @DeleteMapping
    */
}
