package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionSQL {
	static String usuario="root";
	static String contraseña="";
	static String nombreSQL="pg";
	
	private static Connection conec;
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String usuarioSQL=usuario;
	private static final String contraseñaSQL=contraseña;
	private static final String url="jdbc:mysql://localhost:3306/" + nombreSQL;
	/**
	 * Constructor de clase 
	 */
	public ConexionSQL() {
		conec = null;
		try {
			Class.forName(driver);
			conec= DriverManager.getConnection(url, usuarioSQL, contraseñaSQL);
			if (conec != null) {
				System.out.println("Conexión con la BD establecida");
			}
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("Error de conexión con la BD " + e);
		}
	}
	/**
	 * Metodo para conectarse a la base de datos
	 * @return Estado de la conexion
	 */
	public Connection getConexion() {
		return conec;
	}
	/**
	 * Metodo para desconectar de la BD
	 */
	public void desconectar() {
		conec=null;
		if(conec==null) {
			System.out.println("Conexion terminada");
		}
	}
	//String variable= ConexionSQL.getConexion().prepareStatement(variable)
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}
}
