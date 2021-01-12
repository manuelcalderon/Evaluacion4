package cl.security.model;

public class Profesional {
	
	int runProfesional;
	String nombreProfesional;
	String apellidosProfesional;
	String telefonoProfesional;
	String titulo;
	String nombreProyecto;
	
	public Profesional(int runProfesional, String nombreProfesional, String apellidosProfesional,
			String telefonoProfesional, String titulo, String nombreProyecto) {
		super();
		this.runProfesional = runProfesional;
		this.nombreProfesional = nombreProfesional;
		this.apellidosProfesional = apellidosProfesional;
		this.telefonoProfesional = telefonoProfesional;
		this.titulo = titulo;
		this.nombreProyecto = nombreProyecto;
	}

	public int getRunProfesional() {
		return runProfesional;
	}

	public void setRunProfesional(int runProfesional) {
		this.runProfesional = runProfesional;
	}

	public String getNombreProfesional() {
		return nombreProfesional;
	}

	public void setNombreProfesional(String nombreProfesional) {
		this.nombreProfesional = nombreProfesional;
	}

	public String getApellidosProfesional() {
		return apellidosProfesional;
	}

	public void setApellidosProfesional(String apellidosProfesional) {
		this.apellidosProfesional = apellidosProfesional;
	}

	public String getTelefonoProfesional() {
		return telefonoProfesional;
	}

	public void setTelefonoProfesional(String telefonoProfesional) {
		this.telefonoProfesional = telefonoProfesional;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	
	

}
