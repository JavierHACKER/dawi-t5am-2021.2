package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Producto;
import modelo.Producto_Dependency;

public class Pro_Registro_Producto_Prue{

	// METODO MAIN
	public static void main(String[] args) {
		
		//Obtenemos conexion con base de datos
		EntityManagerFactory conexion= Persistence.createEntityManagerFactory("mysql");
		
		//Creamos manejador de entidades
		EntityManager em = conexion.createEntityManager();
		
		Producto_Dependency p = new Producto_Dependency();
		p.setIdprod("P0053");
		p.setDescripcion("Prueba");
		p.setStock(10);
		p.setIdcategoria(1);
		p.setPrecio(0.99);
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("Registro Ok");
		em.close();

	}
}