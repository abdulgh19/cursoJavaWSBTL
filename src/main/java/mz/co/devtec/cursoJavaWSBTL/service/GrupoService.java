package mz.co.devtec.cursoJavaWSBTL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.co.devtec.cursoJavaWSBTL.domain.Grupo;
import mz.co.devtec.cursoJavaWSBTL.repository.GrupoRepository;

@Service
public class GrupoService {

	@Autowired
	private GrupoRepository repository;

	@Transactional(readOnly = false)
	public void registarGrupo(Grupo grupo) {
		repository.save(grupo);
	}

	@Transactional(readOnly = false)
	public void remover(Long id) {
		repository.deleteById(id);
	}

	@Transactional(readOnly = true)
	public List<Grupo> buscarTodos() {
		return repository.findAll();
	}

	@Transactional(readOnly = true)
	public Grupo buscarPorId(Long id) { // Busca Grupos por ID
		return repository.findById(id).get(); 
	}

}
