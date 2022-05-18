package com.ta26.ej1.service;

import java.util.List;

import com.ta26.ej1.dto.Proveedor;

public interface IProveedorService {

	// Metodos del CRUD
	public List<Proveedor> listarProveedors(); // Listar All

	public Proveedor guardarProveedor(Proveedor proveedor); // Guarda un Proveedor. CREATE

	public Proveedor proveedorXID(String id); // Leer datos de una Proveedor. READ

	public Proveedor actualizarProveedor(Proveedor proveedor); // Actualiza datos de Proveedors. UPDATE

	public void eliminarProveedor(String id);// Elimina la proveedor. DELETE

}
