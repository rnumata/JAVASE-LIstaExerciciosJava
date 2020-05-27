package br.com.regisnumata.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import org.omnifaces.util.Messages;


/**
 * Classe representa Marca do veiculo
 * @author regisnumata
 *
 */



@Named
@ViewScoped
public class Marca implements Serializable{

	private static final long serialVersionUID = -4140309345029583344L;
	
	@NotNull
	private String nome;
	@NotNull
	private String descricao;
	
	private List<String> marcas;
	
	

	public Marca() {
		this.marcas = new ArrayList<String>();
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
	
	public List<String> getMarcas() {
		return marcas;
	}


	public void setMarcas(List<String> marcas) {
		this.marcas = marcas;
	}
	
	
	public void salvarMarcaBD() {
		this.marcas.add(this.nome);
		Messages.addFlashGlobalInfo("Cadastro {0} Ok !", this.nome);
		this.nome = null;
	}


	
	
	
	
}
