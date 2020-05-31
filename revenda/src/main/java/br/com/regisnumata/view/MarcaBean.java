package br.com.regisnumata.view;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import br.com.regisnumata.entidade.Marca;
import br.com.regisnumata.servicos.ServicoMarca;

import java.io.Serializable;

@Named
@ViewScoped
public class MarcaBean implements Serializable {

	private static final long serialVersionUID = 6520333234197281582L;

	private Marca marca;
	
	@Inject
	private ServicoMarca servicoMarca;

	public MarcaBean() {
		this.marca = new Marca();
	}
	
	public void cadastrar() {
		try {
			this.servicoMarca.cadastrar(marca);
			this.marca = new Marca();
			Messages.addGlobalInfo("Cadastro Ok!");
		} catch (Exception e) {
			Messages.addGlobalError(e.getMessage());
		}
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public ServicoMarca getServicoMarca() {
		return servicoMarca;
	}

	public void setServicoMarca(ServicoMarca servicoMarca) {
		this.servicoMarca = servicoMarca;
	}
	
	
	
	
	
	
}
