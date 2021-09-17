package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class Demo01_Registro_Usuario {
	
	//METODO MAIN
	public static void main(String[] args) {
		//OBTENER CONEXION CON BD > SEGUN UNIDAD DE PERSISTENCIA
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
	
		// crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();

	
		//PROCCESO > REGISTRAR UN NUEVO USUARIO
		Usuario u = new Usuario();
		u.setCodigo(61);
		u.setNombre("javier");
		u.setApellido("perez");
		//USUARIO ES UNICO , RECORDAR / UNIQUE
		u.setUsuario("asdsad");
		u.setClave("987654321");
		u.setFnacim("2021/09/10");
		u.setTipo(2);
		u.setEstado(2);
		
		//PARA REGISTRAR  , ACTUALIZAR Y ELIMINAR
		// SE MANEJA POR TRANSACCIONES
		em.getTransaction().begin();
		
		//METODO PARA REGISTRAR
		em.persist(u);
		em.getTransaction().commit();
		
		System.out.println("USUARIO REGISTRADO CORRECTAMENTE");
		em.close();
		
	}

}
