package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="tb_usuarios")
public class Usuario {
	//ID ES PARA DARLE LLAVE PRIMARIA A UN DATO
	// COLUMN ES PARA SABER A QUE DATO SE LE ASIGNA LA VARIABLE
	
	@Id
	@Column(name = "cod_usua")
	private int codigo; 
	
	@Column(name = "nom_usua")
	private String nombre; 
	
	@Column(name = "ape_usua")
	private String apellido; 
	
	@Column(name = "usr_usua")
	private String usuario; 
	
	@Column(name = "cla_usua")
	private String clave; 
	
	@Column(name = "fna_usua")
	private String fnacim; 
	
	@Column(name = "idtipo")
	private int tipo; 
	
	@Column(name = "est_usua")
	private int estado;
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
				+ ", clave=" + clave + ", fnacim=" + fnacim + ", tipo=" + tipo + ", estado=" + estado + "]";
	}


	//CONTRUCTOR VACIO
	public Usuario() {
		super();
	}
	
	
	// CONSTRUCTOR CON CAMPOS
	public Usuario(int codigo, String nombre, String apellido, String usuario, String clave, String fnacim, int tipo,
			int estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.clave = clave;
		this.fnacim = fnacim;
		this.tipo = tipo;
		this.estado = estado;
	}
	
	// METODOS GET Y SET
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFnacim() {
		return fnacim;
	}
	public void setFnacim(String fnacim) {
		this.fnacim = fnacim;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	

}
