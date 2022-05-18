package com.ta26.ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta26.ej1.dao.IProveedorDAO;
import com.ta26.ej1.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDAO iProveedorDAO;

	@Override
	public List<Proveedor> listarProveedors() {
		// TODO Auto-generated method stub
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor proveedorXID(String id) {
		// TODO Auto-generated method stub
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(String id) {
		iProveedorDAO.deleteById(id);
	}

}
