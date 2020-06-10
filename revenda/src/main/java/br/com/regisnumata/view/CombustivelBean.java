package br.com.regisnumata.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import br.com.regisnumata.entidade.Combustivel;
import br.com.regisnumata.servicos.ServicoCombustivel;

@Named
@ViewScoped
public class CombustivelBean implements Serializable {

	private static final long serialVersionUID = 3772890085115915275L;
	
	
	private Combustivel combustivel;
	
	private List<Combustivel> combustiveis;
	
	@Inject
	private ServicoCombustivel servicoCombustivel;
	

	public CombustivelBean() {
		
	}
	
	@PostConstruct
	public void init() {
		this.combustivel = new Combustivel();
		this.listar();
	}
	
	private void listar() {
		this.combustiveis = this.servicoCombustivel.listar();
	}

	public void cadastrar() {
		
		try {
			this.servicoCombustivel.cadastrar(combustivel);
			this.combustivel = new Combustivel();
			listar();
			Messages.addGlobalInfo("Cadastro OK!!");
		} catch (Exception e) {
			Messages.addGlobalError(e.getMessage());
		}
		
	}
	
	
	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public ServicoCombustivel getServicoCombustivel() {
		return servicoCombustivel;
	}

	public void setServicoCombustivel(ServicoCombustivel servicoCombustivel) {
		this.servicoCombustivel = servicoCombustivel;
	}

	public List<Combustivel> getCombustiveis() {
		return combustiveis;
	}

	public void setCombustiveis(List<Combustivel> combustiveis) {
		this.combustiveis = combustiveis;
	}
	
	
	
	
	
	
	

}// fim classe
