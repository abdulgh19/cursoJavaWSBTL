package mz.co.devtec.cursoJavaWSBTL.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "categoria")
public class Categoria extends AbstractEntity {

	
	@Column(name = "designacao", unique = true, nullable = false)
	private String designacao;
	
	@OneToMany(mappedBy = "categoria")
	private List<Grupo> grupos;

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	
	
	

}
