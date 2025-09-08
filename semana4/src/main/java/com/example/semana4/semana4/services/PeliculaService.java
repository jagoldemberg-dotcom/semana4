package com.example.semana4.semana4.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.semana4.semana4.model.Pelicula;

@Service
public interface PeliculaService {

    List<Pelicula> getAllPelicula();
    Optional<Pelicula> getPeliculaById(int id);

}
