package br.com.regisnumata.view;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import br.com.regisnumata.entidade.Cadastro;
import br.com.regisnumata.servicos.ServicoCadastro;

import java.io.Serializable;
import java.util.List;


@Named
@ViewScoped
public class CadastroBean implements Serializable {

	private static final long serialVersionUID = 1387266905447892872L;

	private Cadastro cadastro;
	
	@Inject
	private ServicoCadastro servicoCadastro;
	
	private List<Cadastro> cadastros;
	
	
	public CadastroBean() {
		
	}
	
	@PostConstruct
	public void init() {
		this.cadastro = new Cadastro();
	}
	
	public void salvarCadastro() {
		try {
			this.servicoCadastro.salvarCadastro(cadastro);
			this.cadastro = new Cadastro();
			Messages.addFlashGlobalInfo("Cadastro OK!!");
		} catch (Exception e) {
			Messages.addGlobalError(e.getMessage());
		}
	}
	
	

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public List<Cadastro> getCadastros() {
		return cadastros;
	}

	public void setCadastros(List<Cadastro> cadastros) {
		this.cadastros = cadastros;
	}


	public ServicoCadastro getServicoCadastro() {
		return servicoCadastro;
	}


	public void setServicoCadastro(ServicoCadastro servicoCadastro) {
		this.servicoCadastro = servicoCadastro;
	}
	
	
	
	
	
	
	
	
}
