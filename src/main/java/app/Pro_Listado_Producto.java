package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Producto;

public class Pro_Listado_Producto {

	
	public static void main(String[] args) {
		EntityManagerFactory conexion = Persistence.createEntityManagerFactory("mysql");
		
		EntityManager em = conexion.createEntityManager();
		
		//PROCESO LISTADO DE PRODUCTOS
		
		System.out.println(">>>>>-- LISTADO DE PRODUCTOS -- <<<<<");
		
		String sql= "Select p from Producto p "; //JPA
		
			List<Producto> listado= em.createQuery(sql,Producto.class).getResultList();
			
			for (Producto p: listado) {
				System.out.println("DATOS DE BD>>> "+p);
			}
		em.close();
	}
	
}
