package com.myPhoneStore.services;

import com.myPhoneStore.entities.DetalleOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.myPhoneStore.repositories.DetalleOrdenRepository;

import java.util.List;

@Service
public class DetalleOrdenServiceImpl implements DetalleOrdenService {
	
	@Autowired
	private DetalleOrdenRepository detalleOrdenRepository;

	@Override
	public List<DetalleOrden> findall() throws Exception {
		return null;
	}

	@Override
	public Page<DetalleOrden> findall(Pageable pageable) throws Exception {
		return null;
	}

	@Override
	public DetalleOrden findById(Long aLong) throws Exception {
		return null;
	}

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

	@Override
	public DetalleOrden update(Long aLong, DetalleOrden entity) throws Exception {
		return null;
	}

	@Override
	public boolean delete(Long aLong) throws Exception {
		return false;
	}

}
