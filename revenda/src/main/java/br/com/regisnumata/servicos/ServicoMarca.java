package br.com.regisnumata.servicos;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.regisnumata.entidade.Marca;
import br.com.regisnumata.util.JPAUtils;

/**
 * Classe para persistência
 * @author regisnumata
 *
 */

@Named
@RequestScoped
@Path(value = "/marcas") // /api/marcas
public class ServicoMarca {
	
	
	/**
	 * Cadastra uma nova marca
	 * @param marca
	 * @return
	 * @throws Exception
	 */
	public Marca cadastrar(Marca marca) throws Exception {
		
		EntityManager em = JPAUtils.getInstance();
		
		Marca marcaExistente = buscarPorNome(marca.getNome());
		
		if (marcaExistente != null) {
			throw new Exception("Marca já existe!");
		}else {
			try {
				em.getTransaction().begin();
				em.persist(marca);
				em.getTransaction().commit();
				return marca;
			} catch (Exception e) {
				em.getTransaction().rollback();
				throw new Exception("Falha no cadastro" + e.getMessage());
			}
		}// fim if
		
	}
	
	
	/**
	 * Exclui um registro da marca
	 * @param marca
	 * @throws Exception
	 */
	public void excluir(Marca marca) throws Exception {
		
		EntityManager em = JPAUtils.getInstance();
		
		try {
			em.getTransaction().begin();
			em.remove(em.merge(marca));
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Falha na exclusão" + e.getMessage());
		}
	}
	
	
	/**
	 * Edita uma marca selecionada
	 * @param marca
	 * @throws Exception
	 */
	public void editarMarca(Marca marca) throws Exception {
		
		EntityManager em = JPAUtils.getInstance();
		
		try {
			em.getTransaction().begin();
			em.merge(marca);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception("Falha na edição. Erro:" + e.getMessage());
		}
		
	}
	
	
	/**
	 * Lista todos os registros
	 * Também envia a lista para o API com o @GET e @produces e MediaType javax.ws.rs e Application_Json String: MediaType
	 * @return
	 */
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	
	public List<Marca> listar(){
		EntityManager em = JPAUtils.getInstance();
		return em.createNamedQuery("marca.listar.todos", Marca.class).getResultList();
	}
	
	
	/**
	 * Busca a marca por nome
	 * @param nome
	 * @return marca ou Null se não encontrar
	 */
	
	public Marca buscarPorNome(String nome) {
		EntityManager em = JPAUtils.getInstance();
		Query query = em.createQuery("FROM Marca m WHERE m.nome = :p1").setParameter("p1", nome);
		try {
			return (Marca) query.getSingleResult();
		}catch (NoResultException e) {
			return null;
		}
	}
	
}// fim classe
