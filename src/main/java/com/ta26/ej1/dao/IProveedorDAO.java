package com.ta26.ej1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta26.ej1.dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, String> {

}
