package com.myPhoneStore.repositories;

import java.util.Optional;

import com.myPhoneStore.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long>{
	Optional<Usuario> findByEmail(String email);
}
