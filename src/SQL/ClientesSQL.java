package SQL;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import GestiónClientes.Cliente;
import GestiónClientes.ControlClientes;

public class ClientesSQL extends ControlClientes {
    public String nombre;
    public String apellidos;
    public String correoElectronico;
    public String telefono;
	public void AñadirClientesSQL(String Nombre, String Apellidos, String CorreoElectronico, String Telefono) {
    		Connection con = null;
		     PreparedStatement stmt = null;
		     ConexionSQL cs = new ConexionSQL();
		     try{   
		        con = cs.getConexion();
		        String nombrelocal = Nombre;
		        String apellidoslocal = Apellidos;
		        String correolocal=CorreoElectronico;
		        String telefonolocal = Telefono;

		        stmt = con.prepareStatement("INSERT INTO cliente VALUES (?,?,?,?)");
		        stmt.setString(1,nombrelocal);
		        stmt.setString(2,apellidoslocal);
		        stmt.setString(3,correolocal);
		        stmt.setString(4,telefonolocal);

		        int retorno = stmt.executeUpdate();
		        if (retorno>0)
		           System.out.println("Insertado correctamente");      

		     } catch (SQLException sqle){
		        System.out.println("SQLState: " 
		           + sqle.getSQLState());
		        System.out.println("SQLErrorCode: " 
		           + sqle.getErrorCode());
		        sqle.printStackTrace();
		     } catch (Exception e){
		        e.printStackTrace();
		     } finally {
		        if (con != null) {
		           try{
		              stmt.close();
		              con.close();
		           } catch(Exception e){
		              e.printStackTrace();
		           }
		        }
		     } 
	}
	public void EliminarCliente(String nombreCliente) {
		Connection con = null;
	     PreparedStatement stmt = null;
	     ConexionSQL cs = new ConexionSQL();

	        con = cs.getConexion();
	        String nombreEliminar = nombreCliente;

	        try {
				stmt = con.prepareStatement("DELETE FROM Cliente WHERE Nombre LIKE ? ");
				stmt.setString(1,nombreEliminar);    

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	public String BuscarCliente(String nombreCliente) {
		Connection con = null;
	     PreparedStatement stmt = null;
	     ConexionSQL cs = new ConexionSQL();
	     String listaNombres = null;
	        con = cs.getConexion();
	        String nombreBuscar = nombreCliente;

	        try {
				stmt = con.prepareStatement("SELECT * FROM Cliente WHERE Nombre LIKE ? ");
				stmt.setString(1,nombreBuscar);
				  int retorno = stmt.executeUpdate();
			        if (retorno>0)
			           System.out.println("BUSCADO correctamente");
			        while (((ResultSet) stmt).next())
					{

					    String n=((ResultSet) stmt).getString(1);
					    String a=((ResultSet) stmt).getString(2);
					    String c=((ResultSet) stmt).getString(3);
					    String t=((ResultSet) stmt).getString(4);
					     listaNombres = " Nombre: "+ n+"  Apellidos: "+a+"  Correo Electronico: "+c+"  Telefono: "+t+"\n";
					}
			        con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return listaNombres;
	}
	public String RecuperarClientes() {
		ControlClientes CC = new ControlClientes();
		ConexionSQL cs = new ConexionSQL();
		Connection con = cs.getConexion();
		String listaNombres = "-";
		java.sql.Statement s = null;
		try {
			s = con.createStatement();
			ResultSet rs = s.executeQuery ("select * from Cliente");
			int i = 0;
			while (rs.next())
			{
				i++;
			    String n=rs.getString(1);
			    String a=rs.getString(2);
			    String c=rs.getString(3);
			    String t=rs.getString(4);
			    listaNombres+="["+i+"]"+" Nombre: "+ n+"  Apellidos: "+a+"  Correo Electronico: "+c+"  Telefono: "+t+"\n";
			    this.AñadirClientes(n,a,c,t);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaNombres;				     
	}
}
	
	

