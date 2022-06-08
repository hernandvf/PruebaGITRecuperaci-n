package GestiónProductos;

public class Producto {
	String idProducto;
	String nombreProducto;
	String unidades;
	String precioCompra;
	String linkCompra;
	//-------------------------------Constructor producto------------------------------
	public Producto(String idProducto, String nombreProducto, String unidades, String precioCompra, String linkCompra) {
		this.idProducto=idProducto;
		this.nombreProducto=nombreProducto;
		this.unidades=unidades;
		this.precioCompra=precioCompra;
		this.linkCompra=linkCompra;
	}
	
	public Producto() {
		
	}
	
	//-------------------------------IdProducto------------------------------
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	//-------------------------------NombreProducto------------------------------
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	//-------------------------------Unidades------------------------------
	public String getUnidades() {
		return unidades;
	}
	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}
	//-------------------------------PrecioCompra------------------------------
	public String getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(String precioCompra) {
		this.precioCompra = precioCompra;
	}
	//-------------------------------LinkCompra------------------------------
	public String getLinkCompra() {
		return linkCompra;
	}
	public void setLinkCompra(String linkCompra) {
		this.linkCompra = linkCompra;
	}
}
