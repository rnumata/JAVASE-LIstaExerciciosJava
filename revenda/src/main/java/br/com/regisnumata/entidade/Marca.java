package br.com.regisnumata.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * Representa uma marca
 * @author regisnumata
 *
 */

@Entity
@Table(name = "TB_REV_MARCA")
public class Marca implements Serializable {
	
	private static final long serialVersionUID = -7487869629207239228L;

	
	@Id
	@SequenceGenerator(name = "SEQUENCIAL_MARCA", sequenceName = "NUM_SEQ_MAR", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCIAL_MARCA")
	@Column(name = "NUM_SEQ_MAR")
	private Long id;
	
	@NotEmpty
	@Column(name = "NOME_MAR")
	private String nome;
	
	@NotEmpty
	@Column(name = "DESC_MAR")
	private String descricao;
	
	@NotEmpty
	@Column(name = "NAC_MAR")
	private String nacionalidade;
	

	public Marca() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}
