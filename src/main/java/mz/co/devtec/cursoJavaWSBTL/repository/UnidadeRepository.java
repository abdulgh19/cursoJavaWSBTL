package mz.co.devtec.cursoJavaWSBTL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mz.co.devtec.cursoJavaWSBTL.domain.Unidade;


@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {
	

	
}

