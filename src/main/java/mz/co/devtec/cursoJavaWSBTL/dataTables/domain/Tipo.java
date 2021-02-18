package mz.co.devtec.cursoJavaWSBTL.dataTables.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tipo")
public class Tipo extends AbstractEntity {

	@Column(name = "designacao", unique = true, nullable = false)
	private String designacao;

	@OneToMany(mappedBy = "tipo")
	private List<Unidade> unidades;

	public String getDesignacao() {
		return designacao;
	}


	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}


	public List<Unidade> getUnidades() {
		return unidades;
	}


	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

	
	
	

}
