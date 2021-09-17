package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;
import modelo.Usuario;

public class Demo_Listado_Usuario {

	public static void main(String[] args) {
		
	EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("mysql");
	
	EntityManager em= fabrica.createEntityManager();

	
	
	//LISTADO DE USUARIOS
	System.out.println("-- Listado de usuarios -- ");
	
		String sql = "select u from Usuario u";// JPA
	
		List<Usuario> lstUsuarios= em.createQuery(sql, Usuario.class).getResultList();
			
		System.out.println("Cantidad de Usuarios:"+ lstUsuarios.size());
		
		for(Usuario u: lstUsuarios) {
			System.out.println(">>>>"+ u);
		}
		
		em.close();
		
	}
	
}
