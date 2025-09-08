package com.example.semana4.semana4.services.Impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.semana4.semana4.model.Pelicula;
import com.example.semana4.semana4.repository.PeliculaRepository;
import com.example.semana4.semana4.services.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService {
    private static final Logger log = LoggerFactory.getLogger(PeliculaServiceImpl.class);
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPelicula() {
        log.info("extrayendo datos");
        return peliculaRepository.findAll();
    }

    @Override
    public Optional<Pelicula> getPeliculaById(int id) {
        return peliculaRepository.findById(id);
    }
}