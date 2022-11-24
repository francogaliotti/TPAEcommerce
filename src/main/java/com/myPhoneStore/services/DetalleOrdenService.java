package com.myPhoneStore.services;

import com.myPhoneStore.entities.DetalleOrden;

public interface DetalleOrdenService extends BaseService<DetalleOrden, Long>{
	DetalleOrden save (DetalleOrden detalleOrden);

}
