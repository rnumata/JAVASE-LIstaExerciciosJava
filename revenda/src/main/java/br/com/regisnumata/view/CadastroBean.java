package br.com.regisnumata.view;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import br.com.regisnumata.entidade.Cadastro;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Named
@ViewScoped
public class CadastroBean implements Serializable {

	private static final long serialVersionUID = 1387266905447892872L;

	private Cadastro cadastro;
	
	private List<Cadastro> cadastros;
	
	
	

	public CadastroBean() {
		this.cadastro = new Cadastro();
		this.cadastros = new ArrayList<Cadastro>();
	}


	public void salvarCadastro() {
		this.cadastros.add(cadastro);
		this.cadastro = new Cadastro();
		Messages.addFlashGlobalInfo("Cadastro Ok");
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
	
	
	
	
	
	
	
	
}
