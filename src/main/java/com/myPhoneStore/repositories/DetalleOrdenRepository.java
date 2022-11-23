package com.myPhoneStore.repositories;

import com.myPhoneStore.entities.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleOrdenRepository extends BaseRepository<DetalleOrden, Long> {

}
