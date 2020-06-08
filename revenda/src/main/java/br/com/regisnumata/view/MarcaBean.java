package br.com.regisnumata.view;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import br.com.regisnumata.entidade.Marca;
import br.com.regisnumata.servicos.ServicoMarca;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class MarcaBean implements Serializable {

	private static final long serialVersionUID = 6520333234197281582L;
	

	private Marca marca;
	
	private List<Marca> marcas;
	
	@Inject
	private ServicoMarca servicoMarca;
	

	public MarcaBean() {
		
	}
	
	@PostConstruct
	public void init() {
		this.marca = new Marca();
		this.atualizarMarcas();
	}
	
	private void atualizarMarcas() {
		this.marcas = this.servicoMarca.listar();
	}
	
	public void cadastrar() {
		try {
			this.servicoMarca.cadastrar(marca);
			this.marca = new Marca();
			atualizarMarcas();
			Messages.addGlobalInfo("Cadastro Ok!");
		} catch (Exception e) {
			Messages.addGlobalError(e.getMessage());
		}
	}
	
	public void excluir(Marca marca) {
		try {
			this.servicoMarca.excluir(marca);
			this.atualizarMarcas();
			Messages.addGlobalInfo("Excluído com sucesso!");
		} catch (Exception e) {
			Messages.addGlobalError(e.getMessage());
		}
	}
	
	public void editar(Marca marca) {
		this.marca = marca;
	}
	
	public void editarMarca () {
		try {
			this.servicoMarca.editarMarca(this.marca);
			this.marca = new Marca();
			Messages.addGlobalInfo("Marca Atualizada!");
		} catch (Exception e) {
			Messages.addGlobalError(e.getMessage());
		}
	}
	
	public void cancelarEdicao() {
		this.marca = new Marca();
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
	
	public List<Marca> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<Marca> marcas) {
		this.marcas = marcas;
	}
	
	
	
}
