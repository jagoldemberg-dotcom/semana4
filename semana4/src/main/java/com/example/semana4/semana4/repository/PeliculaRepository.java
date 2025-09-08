package com.example.semana4.semana4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.semana4.semana4.model.Pelicula;

public interface PeliculaRepository extends JpaRepository <Pelicula, Integer> {
}
