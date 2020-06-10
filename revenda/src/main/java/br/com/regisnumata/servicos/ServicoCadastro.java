package br.com.regisnumata.servicos;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.regisnumata.entidade.Cadastro;
import br.com.regisnumata.util.JPAUtils;

/**
 * Classe para persistência
 * @author regisnumata
 *
 */

@Named
@RequestScoped
public class ServicoCadastro {
	
	
	/**
	 * Cadastra uma nova marca
	 * @param marca
	 * @return
	 * @throws Exception
	 */
	public Cadastro salvarCadastro(Cadastro cadastro) throws Exception {
		
		EntityManager em = JPAUtils.getInstance();
		
		Cadastro placaExistente = buscarPorPlaca(cadastro.getPlaca());
		
		if (placaExistente != null) {
			throw new Exception("Placa já cadastrada!");
		} else {
			try {
				em.getTransaction().begin();
				em.persist(cadastro);
				em.getTransaction().commit();
				return cadastro;
			} catch (Exception e) {
				em.getTransaction().rollback();
				throw new Exception("Falha no cadastro => " + e.getMessage());
			}
		}
	} // fim do metodo

	
	private Cadastro buscarPorPlaca(String placa) {
		
		EntityManager em = JPAUtils.getInstance();
		
		Query query = em.createQuery("FROM Cadastro c WHERE c.placa = :p1").setParameter("p1",placa);
		
		try {
			return (Cadastro) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	} // fim do metodo
	
	
	public List<Cadastro> listarCadastro(){
		EntityManager em = JPAUtils.getInstance();
		Query query = em.createQuery("Select c FROM Cadastro c");
		return query.getResultList();
	}
	
	
	
	
	
	
}// fim classe
