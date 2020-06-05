package br.com.regisnumata.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_REV_CADASTRO")
public class Cadastro implements Serializable {

	private static final long serialVersionUID = -4150071040394653157L;
	
	@Id
	@SequenceGenerator(name = "SEQUENCIAL_CADASTRO", sequenceName = "NUM_SEQ_CAD", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCIAL_CADASTRO")
	@Column(name = "NUM_SEQ_CAD")
	private Long id;
	
	
	// significa que muitos veiculos terao uma marca
	@ManyToOne 
	@NotNull
	private Marca marca;
	
	@NotEmpty
	private String modelo;
	
	@NotEmpty
	private String placa;
	
	@NotEmpty
	private String cor;
	
	
	private Date anomodelo;
	
	
	private Date anofabricacao;
	
	@NotEmpty
	private String combustivel;
	
	@NotNull
	private Double fipe;
	
	
	public Cadastro() {
		
	}

	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Date getAnomodelo() {
		return anomodelo;
	}


	public void setAnomodelo(Date anomodelo) {
		this.anomodelo = anomodelo;
	}


	public Date getAnofabricacao() {
		return anofabricacao;
	}


	public void setAnofabricacao(Date anofabricacao) {
		this.anofabricacao = anofabricacao;
	}


	public String getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


	public Double getFipe() {
		return fipe;
	}


	public void setFipe(Double fipe) {
		this.fipe = fipe;
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
		Cadastro other = (Cadastro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor
				+ ", anomodelo=" + anomodelo + ", anofabricacao=" + anofabricacao + ", combustivel=" + combustivel
				+ ", fipe=" + fipe + "]";
	}
	

	
	
}
