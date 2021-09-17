package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class Demo03 {
	
	public static void main(String[] args) {
		//OBTENER CONEXION CON BD > SEGUN UNIDAD DE PERSISTENCIA
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	
		// crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();

	
		//PROCCESO > REGISTRAR UN NUEVO USUARIO
		Usuario u = new Usuario();
		u.setCodigo(20);
	
		
		//PARA REGISTRAR  , ACTUALIZAR Y ELIMINAR
		// SE MANEJA POR TRANSACCIONES
		em.getTransaction().begin();
		
		//METODO PARA eliminar
		em.remove(u); // pata eliminar borrar de la tabla
		em.getTransaction().commit();
		
		System.out.println("Eliminacion OK");
		em.close();
		
	}

}
