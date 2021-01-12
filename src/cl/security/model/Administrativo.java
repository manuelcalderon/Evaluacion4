package cl.security.model;

public class Administrativo {

	int runAdministrativo;
	String nombreAdm;
	String Apellidos;
	String correo;
	String area;
	public Administrativo(int runAdministrativo, String nombreAdm, String apellidos, String correo, String area) {
		super();
		this.runAdministrativo = runAdministrativo;
		this.nombreAdm = nombreAdm;
		Apellidos = apellidos;
		this.correo = correo;
		this.area = area;
	}
	
	public int getRunAdministrativo() {
		return runAdministrativo;
	}
	public void setRunAdministrativo(int runAdministrativo) {
		this.runAdministrativo = runAdministrativo;
	}
	public String getNombreAdm() {
		return nombreAdm;
	}
	public void setNombreAdm(String nombreAdm) {
		this.nombreAdm = nombreAdm;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	
}
