package com.myPhoneStore.services;

import java.util.List;
import java.util.Optional;

import com.myPhoneStore.entities.Producto;
import com.myPhoneStore.entities.Usuario;
import com.myPhoneStore.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.myPhoneStore.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto, Long> implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;

	public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Producto> findall() throws Exception {
		return null;
	}

	@Override
	public Page<Producto> findall(Pageable pageable) throws Exception {
		return null;
	}

	@Override
	public Producto findById(Long aLong) throws Exception {
		return null;
	}

	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Producto update(Long aLong, Producto entity) throws Exception {
		return null;
	}

	@Override
	public boolean delete(Long aLong) throws Exception {
		return false;
	}

	@Override
	public Optional<Usuario> get(Integer id) {
		return productoRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);		
	}

	@Override
	public void delete(Integer id) {
		productoRepository.deleteById(id);		
	}

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

}
