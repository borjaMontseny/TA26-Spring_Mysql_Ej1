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

import com.ta26.ej1.dto.Pieza;
import com.ta26.ej1.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;

	@GetMapping("/piezas")
	public List<Pieza> listarPiezas() {
		return piezaServiceImpl.listarPiezas();
	}

	@PostMapping("/piezas")
	public Pieza salvarPieza(@RequestBody Pieza pieza) {

		return piezaServiceImpl.guardarPieza(pieza);
	}

	@GetMapping("/piezas/{codigo}")
	public Pieza piezaXID(@PathVariable(name = "codigo") int codigo) {

		Pieza Pieza_xid = new Pieza();

		Pieza_xid = piezaServiceImpl.piezaXID(codigo);

		// System.out.println("Pieza XID: "+Pieza_xid);

		return Pieza_xid;
	}

	@PutMapping("/piezas/{codigo}")
	public Pieza actualizarPieza(@PathVariable(name = "codigo") int codigo, @RequestBody Pieza pieza) {

		Pieza Pieza_seleccionado = new Pieza();
		Pieza Pieza_actualizado = new Pieza();

		Pieza_seleccionado = piezaServiceImpl.piezaXID(codigo);

		Pieza_seleccionado.setNombre(pieza.getNombre());

		Pieza_actualizado = piezaServiceImpl.actualizarPieza(Pieza_seleccionado);

		// System.out.println("La Pieza actualizada es: "+ Pieza_actualizado);

		return Pieza_actualizado;
	}

	@DeleteMapping("/piezas/{codigo}")
	public void eliminarPieza(@PathVariable(name = "codigo") int codigo) {
		piezaServiceImpl.eliminarPieza(codigo);
	}
}
