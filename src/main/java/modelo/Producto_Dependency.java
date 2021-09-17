package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="tb_productos")
//DATA CONTIENE GET Y SETTER , Y TOSTRING
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Producto_Dependency {
	
	@Id
	private String idprod;
	private String descripcion;
	private int stock;
	private double precio;
	private int idcategoria;
	private int estado;
	
	
	
	
	
	

}
