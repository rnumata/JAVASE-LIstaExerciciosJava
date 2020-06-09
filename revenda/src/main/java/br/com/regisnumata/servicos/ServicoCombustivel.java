package br.com.regisnumata.servicos;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.regisnumata.entidade.Combustivel;
import br.com.regisnumata.util.JPAUtils;



@Named
@RequestScoped
public class ServicoCombustivel  {
	
	

	public void cadastrar(Combustivel combustivel) throws Exception {
		
		EntityManager em = JPAUtils.getInstance();
		
		try {
			em.getTransaction().begin();
			em.persist(combustivel);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Falha no cadastro" + e.getMessage());
		}
		
	}
	
	
	public List<Combustivel> listar() {
		EntityManager em = JPAUtils.getInstance();
		Query query = em.createQuery("SELECT c FROM Combustivel c");
		return query.getResultList();
	}
	
	
	
	
	
}// fim classe
