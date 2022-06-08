package PruebasMain;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import GestiónClientes.ControlClientes;
import GestiónProductos.ControlProductos;
import SQL.ClientesSQL;
import SQL.ConexionSQL;

public class MainP1 {
	static ControlProductos producto = new ControlProductos();
	static ClientesSQL cliente = new ClientesSQL();
	public static void main(String[] args) {
			cliente.AñadirClientesSQL("a", "a", "a", "a");
		}
	}


