package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class Demo04 {

	
	public static void main(String[] args) {
		//OBTENER CONEXION CON BD > SEGUN UNIDAD DE PERSISTENCIA
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	
		// crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();

	
		//PROCCESO > para obteber ka inforacion de un usuario
		Usuario u = em.find(Usuario.class, 10);   // DEVUELVE EL OBJETO SEGUNDO USUARIO                 
		
		if (u==null) {
			System.out.println("Codigo no existe");
		}else {
			System.out.println("Bienvenido : "+ u.getNombre());
			System.out.println(u);
		}
		//PARA REGISTRAR  , ACTUALIZAR Y ELIMINAR
		// SE MANEJA POR TRANSACCIONES
		em.getTransaction().begin();
		
		//METODO PARA eliminar
		em.remove(u); // pata eliminar borrar de la tabla
		em.getTransaction().commit();
		
		System.out.println("Eliminacion OK"+ u.getCodigo()+"SHULLS");
		em.close();
		
	}

}
