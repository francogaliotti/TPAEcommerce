package com.myPhoneStore.repositories;

import java.util.List;

import com.myPhoneStore.entities.Orden;
import com.myPhoneStore.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenRepository extends BaseRepository<Orden, Long> {
	List<Orden> findByUsuario (Usuario usuario);
}
