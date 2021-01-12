package cl.security.model;

import java.util.List;

public interface IUsuarios {
	public void creaUsuario(Usuarios u);
	public List<Usuarios> readAll();
	public Usuarios readOne(int idusuario);
	public Usuarios updateUsuario(Usuarios u);
	public Usuarios deleteUsuario(Usuarios u);
	public List<Usuarios> searchUsuario(String busqueda);
}
