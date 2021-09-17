package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;
import modelo.Usuario;

public class Demo_Listadoxtipo {

	public static void main(String[] args) {
		
	EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("mysql");
	
	EntityManager em= fabrica.createEntityManager();

	
	
	//LISTADO DE USUARIOS
	System.out.println("-- Listado de usuarios X TIPO -- ");
	
		String sql2 = "select u from Usuario u where u.tipo= :xtipo";// JPA
	
		List<Usuario> lstUsuarios2= em.createQuery(sql2, Usuario.class).setParameter("xtipo", 1).getResultList();
			
		System.out.println("Cantidad de Usuarios:"+ lstUsuarios2.size());
		
		for(Usuario u: lstUsuarios2) {
			System.out.println(">>>>"+ u);
		}
		
		em.close();
		
	}
	
}