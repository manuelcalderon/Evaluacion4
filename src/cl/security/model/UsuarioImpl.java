package cl.security.model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UsuarioImpl implements IUsuarios {

	public void creaUsuario(Usuarios u) {
		// TODO Auto-generated method stub

	}

	
	

		@Override
		public List<Usuarios> readAll() {
			List<Usuarios> lista = new ArrayList<Usuarios>();

			try {
				Connection c = Conexion.getConnection();
				Statement s = c.createStatement();
				String sql = "select IDUSUARIO,NOMBRE,APELLIDO,FECHANAC,RUNUSUARIO from USUARIOS";

				ResultSet rs = s.executeQuery(sql);

				while (rs.next()) {
					lista.add(new Usuarios(rs.getInt("IDUSUARIO"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
							rs.getString("FECHANAC"),rs.getString("RUNUSUARIO")));
				}

			} catch (SQLException e) {
				System.out.println("ERROR: método readAll()");
				e.printStackTrace();
			}

			
		
		return null;
	}

	@Override
	public Usuarios readOne(int idusuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios updateUsuario(Usuarios u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios deleteUsuario(Usuarios u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> searchUsuario(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
