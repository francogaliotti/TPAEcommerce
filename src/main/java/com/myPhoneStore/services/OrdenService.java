package com.myPhoneStore.services;

import java.util.List;
import java.util.Optional;

import com.myPhoneStore.entities.Orden;
import com.myPhoneStore.entities.Usuario;

public interface OrdenService extends BaseService<Orden, Long>{
	List<Orden> findAll();
	Optional<Usuario> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
