package com.myPhoneStore.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.myPhoneStore.entities.Orden;
import com.myPhoneStore.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.myPhoneStore.repositories.OrdenRepository;

@Service
public class OrdenServiceImpl implements OrdenService {
	
	@Autowired
	private OrdenRepository ordenRepository;

	@Override
	public List<Orden> findall() throws Exception {
		return null;
	}

	@Override
	public Page<Orden> findall(Pageable pageable) throws Exception {
		return null;
	}

	@Override
	public Orden findById(Long aLong) throws Exception {
		return null;
	}

	@Override
	public Orden save(Orden orden) {
		return ordenRepository.save(orden);
	}

	@Override
	public Orden update(Long aLong, Orden entity) throws Exception {
		return null;
	}

	@Override
	public boolean delete(Long aLong) throws Exception {
		return false;
	}

	@Override
	public List<Orden> findAll() {
		return ordenRepository.findAll();
	}
	// 0000010
	public String generarNumeroOrden() {
		int numero=0;
		String numeroConcatenado="";
		
		List<Orden> ordenes = findAll();
		
		List<Integer> numeros= new ArrayList<Integer>();
		
		ordenes.stream().forEach(o -> numeros.add( Integer.parseInt( o.getNumero())));
		
		if (ordenes.isEmpty()) {
			numero=1;
		}else {
			numero= numeros.stream().max(Integer::compare).get();
			numero++;
		}
		
		if (numero<10) { //0000001000
			numeroConcatenado="000000000"+String.valueOf(numero);
		}else if(numero<100) {
			numeroConcatenado="00000000"+String.valueOf(numero);
		}else if(numero<1000) {
			numeroConcatenado="0000000"+String.valueOf(numero);
		}else if(numero<10000) {
			numeroConcatenado="0000000"+String.valueOf(numero);
		}		
		
		return numeroConcatenado;
	}

	@Override
	public List<Orden> findByUsuario(Usuario usuario) {
		return ordenRepository.findByUsuario(usuario);
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		return ordenRepository.findById(id);
	}

}
