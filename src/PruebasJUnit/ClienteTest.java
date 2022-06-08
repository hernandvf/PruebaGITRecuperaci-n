package PruebasJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import GestiónClientes.Cliente;

class ClienteTest {
	
	Cliente c = new Cliente();
	
	@Before
	public void before() {
		
	}
	@After
	public void after() {
		System.out.println("prueba realizada\n");
	}
	@Test
	void testClienteStringStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testCliente() {
		String n="Marcos";
		String s="Gutierrez";
		String ce="mg@hotmail.es";
		String t="768765654";
		Cliente cliente =  new Cliente(n,s,ce,t);
		String nE=c.getNombre();
		String sE=c.getApellidos();
		String ceE=c.getCorreoElectronico();
		String tE=c.getTelefono();
		String clienteEsperado=nE+sE+ceE+tE;
		
		assertEquals("Error en el Test Cliente",cliente,clienteEsperado);
	}

	@Test
	void testGetNombre() {
		String nombreDado= "Manolo";
		c.setNombre(nombreDado);
		String nombreEsperado=c.getNombre();
		assertEquals("Error en el Test getNombre",nombreDado, nombreEsperado);
	}

	@Test
	void testSetNombre() {
		String nombreDado="Juan";
		c.setNombre(nombreDado);
		String nombreEsperado=	c.getNombre();
		assertEquals("Error en el Test setNombre",nombreDado, nombreEsperado);
	
	}

	@Test
	void testGetApellidos() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellidos() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTelefono() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTelefono() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCorreoElectronico() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCorreoElectronico() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
