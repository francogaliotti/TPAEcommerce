package com.myPhoneStore.services;

import java.util.List;
import java.util.Optional;

import com.myPhoneStore.entities.Usuario;

public interface UsuarioService {
	List<Usuario> findAll();
	Optional<Usuario> findById(Integer id);
	Usuario save (Usuario usuario);
	Optional<Usuario> findByEmail(String email);

}
