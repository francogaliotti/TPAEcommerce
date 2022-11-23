package com.myPhoneStore.repositories;


import com.myPhoneStore.entities.Base;
import com.myPhoneStore.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface BaseRepository<E extends Base, ID extends Serializable> extends JpaRepository<E,ID> {
    Optional<Usuario> findById(Integer id);

    void deleteById(Integer id);
}
