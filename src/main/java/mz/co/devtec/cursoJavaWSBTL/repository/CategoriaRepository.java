package mz.co.devtec.cursoJavaWSBTL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mz.co.devtec.cursoJavaWSBTL.domain.Categoria;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
}
