package com.ta26.ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta26.ej1.dao.IPiezaDAO;
import com.ta26.ej1.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {

	@Autowired
	IPiezaDAO iPiezaDAO;

	@Override
	public List<Pieza> listarPiezas() {
		// TODO Auto-generated method stub
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(int codigo) {
		// TODO Auto-generated method stub
		return iPiezaDAO.findById(codigo).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		// TODO Auto-generated method stub
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int codigo) {
		// TODO Auto-generated method stub
		iPiezaDAO.deleteById(codigo);
	}

}
