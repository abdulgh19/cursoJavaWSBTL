package mz.co.devtec.cursoJavaWSBTL.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "grupo")
public class Grupo extends AbstractEntity {


	@Column(name = "designacao", unique = true, nullable = false)
	private String designacao;
	
	@ManyToOne (optional = false)
	@JoinColumn(name = "id_categoria", unique = false, nullable = false)
	private Categoria categoria;	
	
	@OneToMany(mappedBy = "grupo")
	private List<Produto> produtos;

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	


	
	
	

}
