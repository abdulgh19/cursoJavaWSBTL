package mz.co.devtec.cursoJavaWSBTL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mz.co.devtec.cursoJavaWSBTL.domain.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
}
