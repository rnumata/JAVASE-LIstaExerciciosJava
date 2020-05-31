package br.com.regisnumata.servicos;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.regisnumata.entidade.Marca;
import br.com.regisnumata.util.JPAUtils;

/**
 * Classe para persistência
 * @author regisnumata
 *
 */

@Named
@RequestScoped
public class ServicoMarca {
	
	public Marca cadastrar(Marca marca) throws Exception {
		
		EntityManager em = JPAUtils.getInstance();
		
		try {
			em.getTransaction().begin();
			em.persist(marca);
			em.getTransaction().commit();
			return marca;
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Falha no cadastro" + e.getMessage());
		}
		
		
	}
	
	
	

}
