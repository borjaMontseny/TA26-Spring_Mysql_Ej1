package com.ta26.ej1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta26.ej1.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Integer> {

}
