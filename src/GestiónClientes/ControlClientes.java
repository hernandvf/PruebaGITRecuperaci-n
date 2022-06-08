package GestiónClientes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import SQL.ConexionSQL;




public class ControlClientes {
	/**
	 * Lista de Clientes
	 */
	private ArrayList<Cliente> carteraClientes;
	/**
	 * Archivo con la cartera de clientes
	 */
	private File SQL;
	/**
	 * Constructor de control clientes
	 *
	 */
	public ControlClientes() {
		this.carteraClientes = new ArrayList<Cliente>();
		SQL=new File("CarteraClientes.txt");
	}
	/**
	 * Constructor, crea un cliente que añade a la cartera de clientes
	 * @param nombre nombre del cliente
	 * @param apellidos apellidos del cliente
	 * @param correoElectronico correo electronico del cliente
	 * @param telefono telefono del cliente
	 */
	public void AñadirClientes(String nombre,String apellidos, String correoElectronico, String telefono) {

		Cliente cliente= new Cliente();
		cliente.setNombre(nombre);
		cliente.setApellidos(apellidos);
		cliente.setCorreoElectronico(correoElectronico);
		cliente.setTelefono(telefono);
		carteraClientes.add(cliente);
	}
	/**
	 * Metodo para llamar al constructor y crear un nuevo cliente
	 * @param nombre nombre del cliente
	 * @param apellidos apellidos del cliente
	 * @param correoElectronico correo electronico del cliente
	 * @param telefono telefono del cliente
	 */
	public ControlClientes(String nombre,String apellidos, String correoElectronico, String telefono) {
		AñadirClientes(nombre,apellidos,correoElectronico,telefono);
	}
	/**
	 * Añade un nuevo objeto cliente al arraylist cartera cliente
	 * @param a Cliente que recive
	 */
	public void NuevoCliente(Cliente a) {
		carteraClientes.add(a);
	}
	/**
	 * Muestra por consola el arraylist con la cartera de cliente
	 */
	@SuppressWarnings("null")
	public void MostrarClientes() {
		ControlClientes CC = new ControlClientes();
		ConexionSQL cs = new ConexionSQL();
		Connection con = cs.getConexion();
		String listaNombres = "-";
		java.sql.Statement s = null;
		try {
			s = con.createStatement();
			ResultSet rs = s.executeQuery ("select * from Clientes");
			while (rs.next())
			{
				Cliente c = null;
			    c.setNombre(rs.getString(1));
			    c.setApellidos(rs.getString(2));
			    c.setCorreoElectronico(rs.getString(3));
			    c.setTelefono(rs.getString(4));
			    carteraClientes.add(c);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (int i=0; i<carteraClientes.size();i++) {
			System.out.println(carteraClientes.get(i));
		}
	}
	/**
	 * Guarda en el archivo de la cartera clientes, el arraylist cartera clientes
	 */
	public void Cargar() {
		try {
	BufferedWriter bw = new BufferedWriter(new FileWriter(SQL, true));
			
			for (int i=0; i<carteraClientes.size(); i++) {
				Cliente c = this.carteraClientes.get(i);
				String linea = c.getNombre() + "," + c.getApellidos() + "," + c.getCorreoElectronico() + "," + c.getTelefono() + "\n";
				bw.append(linea);
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	/**
	 * Muestra por pantalla el contenido del archivo con la cartera de clientes
	 */
	public void Leer() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(SQL));
			String linea= "";
			while((linea=br.readLine()) != null) {
				System.out.print(linea + "\n");
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Añade los datos del los cliente del archivo, a el arraylist con la cartera de clientes
	 */
	public void Recuperar() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(SQL));
			String linea= "";
			while((linea=br.readLine()) != null) {
				System.out.print(linea + "\n");
				Cliente c = new Cliente();
				c.setNombre(linea.split(",")[0]);
				c.setApellidos(linea.split(",")[1]);
				c.setCorreoElectronico(linea.split(",")[2]);
				c.setTelefono(linea.split(",")[3]);
				carteraClientes.add(c);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
