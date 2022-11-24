package com.myPhoneStore.services;

import java.util.List;
import java.util.Optional;

import com.myPhoneStore.entities.Producto;
import com.myPhoneStore.entities.Usuario;

public interface ProductoService extends BaseService<Producto, Long> {
	public Producto save(Producto producto);
	public Optional<Usuario> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();

}
