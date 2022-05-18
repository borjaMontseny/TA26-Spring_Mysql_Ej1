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

import com.ta26.ej1.dto.Suministra;
import com.ta26.ej1.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServiceImpl;

	@GetMapping("/suministras")
	public List<Suministra> listarSuministra() {
		return suministraServiceImpl.listarSuministra();
	}

	@PostMapping("/suministras")
	public Suministra salvarSuministra(@RequestBody Suministra suministra) {

		return suministraServiceImpl.guardarSuministra(suministra);
	}

	@GetMapping("/suministras/{id}")
	public Suministra SuministraXID(@PathVariable(name = "id") int id) {

		Suministra Suministra_xid = new Suministra();

		Suministra_xid = suministraServiceImpl.suministraXID(id);

		System.out.println("Suministra XID: " + Suministra_xid);

		return Suministra_xid;
	}

	@PutMapping("/registroCursos/{id}")
	public Suministra actualizarSuministra(@PathVariable(name = "id") int id, @RequestBody Suministra Suministra) {

		Suministra Suministra_seleccionado = new Suministra();
		Suministra Suministra_actualizado = new Suministra();

		Suministra_seleccionado = suministraServiceImpl.suministraXID(id);

		Suministra_seleccionado.setPiezas(Suministra.getPiezas());
		Suministra_seleccionado.setProveedor(Suministra.getProveedor());
		Suministra_seleccionado.setPrecio(Suministra.getPrecio());

		Suministra_actualizado = suministraServiceImpl.actualizarSuministra(Suministra_seleccionado);

		System.out.println("El Suministro actualizado es: " + Suministra_actualizado);

		return Suministra_actualizado;
	}

	@DeleteMapping("/suministras/{id}")
	public void eleiminarSuministra(@PathVariable(name = "id") int id) {
		suministraServiceImpl.eliminarSuministra(id);
	}

}
