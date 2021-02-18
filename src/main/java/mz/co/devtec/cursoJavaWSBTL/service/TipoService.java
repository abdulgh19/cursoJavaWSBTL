package mz.co.devtec.cursoJavaWSBTL.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.co.devtec.cursoJavaWSBTL.domain.Tipo;
import mz.co.devtec.cursoJavaWSBTL.repository.TipoRepository;

@Service
public class TipoService {
	
	@Autowired
	private TipoRepository repository;
	
	@Transactional(readOnly = false)
	public void registarTipo(Tipo tipo) {
		repository.save(tipo);		
	}
	
	@Transactional(readOnly = false)
	public void remover(Long id) {
		repository.deleteById(id);				
	}

	@Transactional(readOnly = true)
	public List<Tipo> buscarTodos() {
		return repository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Tipo buscarPorId(Long id) { //Busca Tipos por ID
		return repository.findById(id).get(); 
	}

}
