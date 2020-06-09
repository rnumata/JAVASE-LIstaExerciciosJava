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


@Entity
@Table(name = "TB_REV_COMB")
public class Combustivel implements Serializable {

	private static final long serialVersionUID = 904791359500698014L;

	@Id
	@SequenceGenerator(name = "SEQUENCIAL_COMB", sequenceName = "NUM_SEQ_COMB", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCIAL_COMB")
	@Column(name = "NUM_SEQ_COMB")
	private Long id;
	
	@NotEmpty
	@Column(name = "COMBUSTIVEL")
	private String tipoCombustivel;
	
	

	public Combustivel() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
}
