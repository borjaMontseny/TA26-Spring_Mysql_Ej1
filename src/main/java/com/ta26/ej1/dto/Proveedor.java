package com.ta26.ej1.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "proveedores")
public class Proveedor {

	// Atributos de entidad Proveedor
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "idproveedor")
	private List<Suministra> suministra;

	// Constructores

	public Proveedor() {
		super();
	}

	public Proveedor(String id, String nombre, List<Suministra> suministra) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.suministra = suministra;
	}

	// Getters & Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Suministra> getSuministra() {
		return suministra;
	}

	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "SUMINISTRA")

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + ", suministra=" + suministra + "]";
	}

}
