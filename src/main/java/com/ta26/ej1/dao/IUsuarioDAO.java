package com.ta26.ej1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta26.ej1.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}