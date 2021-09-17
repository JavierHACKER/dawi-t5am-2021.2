package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import modelo.Usuario;

public class Validacion_Usu_Procedure {

	
	public static void main(String[] args) {
		// OBTENER CONEXION CON BD > SEGUN UNIDAD DE PERSISTENCIA
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");

		// crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();

		// Validar un usuario segun su usuario y contraseña

		String sql2 = "{call usp_validaAcceso (? , ?)}";// JPA

		// JPA TypedQuery<Usuario> query = em.createQuery(sql2, Usuario.class);
		// valor fijo
		Query query = em.createNativeQuery(sql2, Usuario.class);
		query.setParameter(1, "U002@gmail.com");
		query.setParameter(2, "10002");

		Usuario u = null;
		try {
			u = (Usuario) query.getSingleResult();
			System.out.println("Bienvenido : " + u.getNombre());
			System.out.println("Tus Datos Son >>> : "+ u);
			System.out.println(u);
		} catch (Exception e) {
			System.out.println("Usuario No registrado");
		}

	

		em.close();

	}
}
