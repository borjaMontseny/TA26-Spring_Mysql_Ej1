package com.ta26.ej1.service;

import java.util.List;

import com.ta26.ej1.dto.Suministra;

public interface ISuministraService {

	//Metodos del CRUD
	public List<Suministra> listarSuministra(); //Listar All 
	
	public Suministra guardarSuministra(Suministra suministra);	//Guarda una tupla Suministra. CREATE
	
	public Suministra suministraXID(int id); //Leer datos de Suministra. READ
	
	public Suministra actualizarSuministra(Suministra suministra); //Actualiza datos de Suministra. UPDATE
	
	public void eliminarSuministra(int id);// Elimina el Suministra. DELETE

}
