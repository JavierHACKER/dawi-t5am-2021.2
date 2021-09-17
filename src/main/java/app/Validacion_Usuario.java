package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.Usuario;

public class Validacion_Usuario {

	public static void main(String[] args) {
		// OBTENER CONEXION CON BD > SEGUN UNIDAD DE PERSISTENCIA
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");

		// crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();

		// Validar un usuario segun su usuario y contraseña

		String sql2 = "select u from Usuario u where u.usuario= :xuser and u.clave = :xclave";// JPA

		TypedQuery<Usuario> query = em.createQuery(sql2, Usuario.class);
		// PARAMETROS
		/*
		 * query.setParameter("xuser",1); query.setParameter("xclave", 2);
		 */

		// valor fijo
		query.setParameter("xuser", "U002@gmail.com");
		query.setParameter("xclave", "10002");

		Usuario u = null;
		try {
			u = query.getSingleResult();
			System.out.println("Bienvenido : " + u.getNombre());
			System.out.println(u);
		} catch (Exception e) {
			System.out.println("Usuario No registrado");
		}

	

		em.close();

	}

}
