package br.com.regisnumata.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class Cadastro implements Serializable {

	private static final long serialVersionUID = -4150071040394653157L;
	
	@NotEmpty
	private String marca;
	
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


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
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
	

}
