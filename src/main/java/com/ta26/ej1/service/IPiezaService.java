package com.ta26.ej1.service;

import java.util.List;

import com.ta26.ej1.dto.Pieza;

public interface IPiezaService {

	//Metodos del CRUD
	public List<Pieza> listarPiezas(); //Listar All 
	
	public Pieza guardarPieza(Pieza pieza);	//Guarda un Pieza. CREATE
	
	public Pieza piezaXID(int codigo); //Leer datos de una Pieza. READ
	
	public Pieza actualizarPieza(Pieza pieza); //Actualiza datos de Piezas. UPDATE
	
	public void eliminarPieza(int id);// Elimina la pieza. DELETE
}
