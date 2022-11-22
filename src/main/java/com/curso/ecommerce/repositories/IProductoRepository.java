package com.curso.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.entities.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
