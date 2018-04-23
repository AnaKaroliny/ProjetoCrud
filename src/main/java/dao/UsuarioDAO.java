package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class UsuarioDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("projetocrud");
	EntityManager manager = factory.createEntityManager();

	@SuppressWarnings("unchecked")
	public List<Usuario> listar() {
		return manager.createQuery("select u from Usuario u order by u.id").getResultList();
	}

	public void salvarOuAtualizar(Usuario usuario) {
		manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(usuario);
		manager.getTransaction().commit();
		manager.close();
	}

	public void remover(Usuario usuario) {
		manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.createQuery("delete from Usuario where id = :id").setParameter("id", usuario.getId()).executeUpdate();
		manager.getTransaction().commit();
		manager.close();
	}
}
