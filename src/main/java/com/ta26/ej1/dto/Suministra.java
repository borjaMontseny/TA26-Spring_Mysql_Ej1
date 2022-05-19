package com.ta26.ej1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "suministra")
public class Suministra {

	// Atributos de entidad Suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "codigopieza")
	Pieza piezas;

	@ManyToOne
	@JoinColumn(name = "idproveedor")
	Proveedor proveedor;

	@Column(name = "precio")
	private int precio;

	// Constructores

	public Suministra() {
		super();
	}

	public Suministra(int id, Pieza piezas, Proveedor proveedores, int precio) {
		super();
		this.id = id;
		this.piezas = piezas;
		this.proveedor = proveedores;
		this.precio = precio;
	}

	// Getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pieza getPiezas() {
		return piezas;
	}

	public void setPiezas(Pieza piezas) {
		this.piezas = piezas;
	}


	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}



}
