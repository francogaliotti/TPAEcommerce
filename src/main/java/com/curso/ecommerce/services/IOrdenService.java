package com.curso.ecommerce.services;

import java.util.List;
import java.util.Optional;

import com.curso.ecommerce.entities.Orden;
import com.curso.ecommerce.entities.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
