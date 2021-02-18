package mz.co.devtec.cursoJavaWSBTL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mz.co.devtec.cursoJavaWSBTL.domain.Produto;
import mz.co.devtec.cursoJavaWSBTL.repository.ProdutoRepository;


@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Transactional(readOnly = false)
	public void registarProduto(Produto produto) {
		repository.save(produto);		
	}

	@Transactional(readOnly = false)
	public void remover(Long id) {
		repository.deleteById(id);				
	}

	@Transactional(readOnly = true)
	public List<Produto> buscarTodos() {
		return repository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Produto buscarPorId(Long id) { //Busca Produtos por ID
		return repository.findById(id).get();
	}

}
