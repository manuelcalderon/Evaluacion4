package cl.security.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static Connection con = null;
	
	
	private Conexion() {
		try {
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String usr = "System";
			String psw = "july2018";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, usr, psw);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection() {
		if (con == null) {
			new Conexion();
		}
		
		return con;
	}
}
	
	