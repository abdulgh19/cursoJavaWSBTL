package mz.co.devtec.cursoJavaWSBTL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mz.co.devtec.cursoJavaWSBTL.domain.Grupo;


@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
	
	
	
}
