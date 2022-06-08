package GestiónProductos;

import java.util.ArrayList;



public class ControlProductos {
	
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	

	
	public ControlProductos() {
		
	}
	public void añadirNuevoProducto(String idProducto, String nombreProducto, String unidades, String precioCompra, String linkCompra) {
		Producto producto = new Producto();
		producto.setIdProducto(idProducto);
		producto.setUnidades(unidades);
		producto.setNombreProducto(nombreProducto);
		producto.setPrecioCompra(precioCompra);
		producto.setLinkCompra(linkCompra);
		listaProductos.add(producto);
	}
	public void mostrarProducto() {
		for (int i=0;i< listaProductos.size();i++) {
			System.out.println(listaProductos.get(i));
		}
	}
	//-------------------------------GET/SET ListaProductos------------------------------
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
}
