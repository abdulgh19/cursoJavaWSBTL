package mz.co.devtec.cursoJavaWSBTL.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.co.devtec.cursoJavaWSBTL.domain.Entrada;
import mz.co.devtec.cursoJavaWSBTL.repository.EntradaRepository;


@Service
public class EntradaService {
	
	@Autowired
	private EntradaRepository repository;
		
	@Transactional(readOnly = false)
	public void registarEntrada(Entrada entrada) {
		repository.save(entrada);		
	}

	@Transactional(readOnly = false)
	public void remover(Long id) {
		repository.deleteById(id);				
	}

	@Transactional(readOnly = true)
	public List<Entrada> buscarTodas() {
		return repository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Entrada buscarPorId(Long id) { //Busca Entradas por ID
		return repository.findById(id).get(); 
	}



}
