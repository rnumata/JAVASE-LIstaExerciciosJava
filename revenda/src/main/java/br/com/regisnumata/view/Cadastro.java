package br.com.regisnumata.view;

import java.io.Serializable;
import java.util.Date;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;



@Named
@ViewScoped
public class Cadastro implements Serializable {

	private static final long serialVersionUID = -4150071040394653157L;
	
	@NotNull
	private String marca;
	
	@NotNull
	private String modelo;
	
	@NotNull
	private String placa;
	
	@NotNull
	private String cor;
	
	@NotNull
	private Date anomodelo;
	
	@NotNull
	private Date anofabricacao;
	
	@NotNull
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
	
	
	public void mensagem() {
		Messages.addFlashGlobalInfo("Cadastro Ok!", this.placa);
	}
	

}
