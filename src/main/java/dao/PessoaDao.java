package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Pessoa;
import util.JPAUtil;

public class PessoaDao {
	public static void save(Pessoa pessoa) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void update(Pessoa pessoa) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
		em.close();
	}
	
	public static Pessoa find(Integer id) {
		EntityManager em = JPAUtil.criarEntityManager();
		Pessoa pessoa = em.find(Pessoa.class, id);
		em.close();
		return pessoa;
	}
	
	public static void delete(Pessoa pessoa) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		pessoa = em.find(Pessoa.class, pessoa.getId());
		em.remove(pessoa);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Pessoa> findAll(){
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select a from Pessoa a");
		List<Pessoa> lista = q.getResultList();
		em.close();
		return lista;
		
	}
}
