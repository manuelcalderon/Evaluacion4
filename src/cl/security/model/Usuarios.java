package cl.security.model;


public class Usuarios {

	private int idusuario;
	private String nombre;
	private String apellido;
	private String fechanac;
	private int runusuario;
	public Usuarios(int idusuario, String nombre, String apellido, String fechanac, int runusuario) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
		this.runusuario = runusuario;
	}
	public Usuarios(int int1, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
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
	public String getFechanac() {
		return fechanac;
	}
	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}
	public int getRunusuario() {
		return runusuario;
	}
	public void setRunusuario(int runusuario) {
		this.runusuario = runusuario;
	}
	
	

}
