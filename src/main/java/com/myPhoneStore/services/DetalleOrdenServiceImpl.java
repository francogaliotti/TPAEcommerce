package com.myPhoneStore.services;

import com.myPhoneStore.entities.DetalleOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myPhoneStore.repositories.IDetalleOrdenRepository;

@Service
public class DetalleOrdenServiceImpl implements DetalleOrdenService {
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

}
