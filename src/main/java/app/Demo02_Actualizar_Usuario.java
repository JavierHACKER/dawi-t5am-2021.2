package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class Demo02_Actualizar_Usuario {

	//METODO MAIN
		public static void main(String[] args) {
			//OBTENER CONEXION CON BD > SEGUN UNIDAD DE PERSISTENCIA
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
			// crea el manejador de entidades
			EntityManager em = fabrica.createEntityManager();

		
			//PROCCESO > REGISTRAR UN NUEVO USUARIO
			Usuario u = new Usuario();
			u.setCodigo(60);
			u.setNombre("Angel");
			u.setApellido("ACTUALIZADO2");
			u.setUsuario("ACTUALIZADO3@GMAIL.COM");
			u.setClave("ACTYALIZAR2");
			u.setFnacim("2021/08/25");
			u.setTipo(1);
			u.setEstado(1);
			
			//PARA REGISTRAR  , ACTUALIZAR Y ELIMINAR
			// SE MANEJA POR TRANSACCIONES
			em.getTransaction().begin();
			
			//METODO PARA ACTUALIZAR , MERGE
			em.merge(u); // PARA ACTUALIZAR , SI EXISTE EL CODIGO, PERO SI NO EXISTE , REGISTRA
			em.getTransaction().commit();
			
			System.out.println("USUARIO ACTUALIZADO CORRECTAMENTE");
			em.close();
			
		}
	
}
