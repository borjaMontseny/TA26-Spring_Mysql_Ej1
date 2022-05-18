package com.ta26.ej1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ta26.ej1.dto.Proveedor;
import com.ta26.ej1.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;

	@GetMapping("/proveedor")
	public List<Proveedor> listarCproveedors() {
		return proveedorServiceImpl.listarProveedors();
	}

	@PostMapping("/proveedor")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor) {

		return proveedorServiceImpl.guardarProveedor(proveedor);
	}

	@GetMapping("/proveedor/{id}")
	public Proveedor proveedorXID(@PathVariable(name = "id") String id) {

		Proveedor Proveedor_xid = new Proveedor();

		Proveedor_xid = proveedorServiceImpl.proveedorXID(id);

		System.out.println("Proveedor XID: " + Proveedor_xid);

		return Proveedor_xid;
	}

	@PutMapping("/proveedor/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedor proveedor) {

		Proveedor Proveedor_seleccionado = new Proveedor();
		Proveedor Proveedor_actualizado = new Proveedor();

		Proveedor_seleccionado = proveedorServiceImpl.proveedorXID(id);

		Proveedor_seleccionado.setId(proveedor.getId());
		Proveedor_seleccionado.setNombre(proveedor.getNombre());

		Proveedor_actualizado = proveedorServiceImpl.actualizarProveedor(Proveedor_seleccionado);

		System.out.println("El Proveedor actualizado es: " + Proveedor_actualizado);

		return Proveedor_actualizado;
	}

	@DeleteMapping("/proveedor/{id}")
	public void eleiminarProveedor(@PathVariable(name = "id") String id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}

}
