package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexionbd {

	private static Connection con = null;
	
	
	private Conexionbd() {
		try {
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String usr = "palabras";
			String psw = "kupita";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, usr, psw);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection() {
		if (con == null) {
			new Conexionbd();
		}
		
		return con;
	}
	
	
}
