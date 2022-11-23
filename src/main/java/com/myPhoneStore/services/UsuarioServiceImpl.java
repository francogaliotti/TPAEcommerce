package com.myPhoneStore.services;

import java.util.List;
import java.util.Optional;

import com.myPhoneStore.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.myPhoneStore.entities.Usuario;
import com.myPhoneStore.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> findall() throws Exception {
		return null;
	}

	@Override
	public Page<Usuario> findall(Pageable pageable) throws Exception {
		return null;
	}

	@Override
	public Usuario findById(Long aLong) throws Exception {
		return null;
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario update(Long aLong, Usuario entity) throws Exception {
		return null;
	}

	@Override
	public boolean delete(Long aLong) throws Exception {
		return false;
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	
}
