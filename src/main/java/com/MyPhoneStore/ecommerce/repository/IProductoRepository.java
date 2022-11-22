package com.MyPhoneStore.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyPhoneStore.ecommerce.entities.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
