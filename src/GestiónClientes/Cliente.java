package GestiónClientes;

public class Cliente {
	/**
	 * Nombre del cliente
	 */
	private String nombre;
	/**
	 * Appellidos del cliente
	 */
	private String apellidos;
	/**
	 * Telefono movil del cliente
	 */
	private String telefono;
	/**
	 * Correo Electronico del cliente
	 */
	private String correoElectronico;
	/**
	 * Constructor de Cliente
	 * 
	 * @param nombreRecivido nombre del cliente 
	 * @param apellidosRecividos apellidos del cliente
	 * @param telefonoRecivido telefono del cliente
	 * @param correoElectronico correo electronico del cliente
	 */
	public Cliente(String nombreRecivido, String apellidosRecividos, String telefonoRecivido, String correoElectronicoRecivido) {
		this.nombre=nombreRecivido;
		this.apellidos=apellidosRecividos;
		this.telefono=telefonoRecivido;
		this.correoElectronico=correoElectronicoRecivido;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	/**
 	* Devuelve el nombre del cliente
 	* @return nombre cliente
 	*/
	public String getNombre() {
		return nombre;
	}
	/**
 	* Establece el nombre del cliente
	* @param nombre Nombre a establecer
 	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve los apellidos del cliente
	 * @return appelidos cliente
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * Establece el nombre del cliente
	 * @param apellidos Appelidos a establecer
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * Devuelve el telefono del cliente
	 * @return telefono cliente
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * Establece el telefono del cliente
	 * @param telefono Telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 *Devuelve el correo del cliente
	 * @return correo cliente
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	/**
	 * Establece el correo del cliente
	 * @param correoElectronico Correo a establecer
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	/**
	 * Da formato a cliente
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", correoElectronico=" + correoElectronico + "]";
	}
}
