package mz.co.devtec.cursoJavaWSBTL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.co.devtec.cursoJavaWSBTL.domain.Categoria;
import mz.co.devtec.cursoJavaWSBTL.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	
		
	@Autowired
	private CategoriaRepository repository;
	
	@Transactional(readOnly = false)
	public void registarCategoria(Categoria categoria) {
		repository.save(categoria);
	}
	
	@Transactional(readOnly = false)
	public void remover(Long id) {
		repository.deleteById(id);				
	}


	@Transactional(readOnly = true)
	public List<Categoria> buscarTodas() {
		return repository.findAll();
	}

	@Transactional(readOnly = true)
	public Categoria buscarPorId(Long id) { //Busca Categorias por ID
		return repository.findById(id).get(); 
	}


}
