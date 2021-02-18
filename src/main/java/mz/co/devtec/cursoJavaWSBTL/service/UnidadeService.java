package mz.co.devtec.cursoJavaWSBTL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.co.devtec.cursoJavaWSBTL.domain.Unidade;
import mz.co.devtec.cursoJavaWSBTL.repository.UnidadeRepository;

@Service
public class UnidadeService {
	
	@Autowired
	private UnidadeRepository repository;
	
	@Transactional(readOnly = false)
	public void registarUnidade(Unidade unidade) {
		repository.save(unidade);		
	}
	
	@Transactional(readOnly = false)
	public void remover(Long id) {
		repository.deleteById(id);				
	}

	@Transactional(readOnly = true)
	public List<Unidade> buscarTodas() {
		return repository.findAll();
	}

	@Transactional(readOnly = true)
	public Unidade buscarPorId(Long id) { //Busca Unidades por ID
		return repository.findById(id).get(); 
		
	}

}
