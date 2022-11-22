package com.MyPhoneStore.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.MyPhoneStore.ecommerce.entities.Orden;
import com.MyPhoneStore.ecommerce.entities.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
