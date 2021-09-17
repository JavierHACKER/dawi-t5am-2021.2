package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class Demo05_Eliminar_Usuario {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em= fabrica.createEntityManager();
		Usuario u= em.find(Usuario.class, 50);
		if(u== null) {
				System.out.println("El codigo no existe estudiante ciberteño");		
		}else
		{

			em.getTransaction().begin();	
			em.remove(u); 
			em.getTransaction().commit();	
			System.out.println("Registro eliminado correctamente" );

			

		}	

		em.close();

	}
}
