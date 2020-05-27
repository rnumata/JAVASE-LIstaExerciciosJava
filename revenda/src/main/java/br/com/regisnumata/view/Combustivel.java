package br.com.regisnumata.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;


/**
 *  Classe representa os tipos de combustiveis
 * @author regisnumata
 *
 */


@Named
@ViewScoped
public class Combustivel implements Serializable {

	private static final long serialVersionUID = 434805575999788179L;
	
	private String combustivel;
	
	private List<String> combustiveis;
	
	
	public Combustivel() {
		this.combustiveis = new ArrayList<>();
		this.combustiveis.add("Gasolina");
		this.combustiveis.add("Alcool");
		this.combustiveis.add("Diesel");
		this.combustiveis.add("GNV");
	}

	
	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public List<String> getCombustiveis() {
		return combustiveis;
	}

	public void setCombustiveis(List<String> combustiveis) {
		this.combustiveis = combustiveis;
	}
	
	
	
	

}
