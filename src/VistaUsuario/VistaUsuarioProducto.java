package VistaUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import GestiónClientes.ControlClientes;
import SQL.ClientesSQL;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class VistaUsuarioProducto {

	private JFrame frame;
	private JTextField textoNombre;
	private JTextField textoApellidos;
	private JTextField textoCorreo;
	private JTextField textoTelefono;
	private JTextPane textoListaClientes;
	ClientesSQL cliente = new ClientesSQL();
	private JTextField textoClienteAñadido;
	private JButton btnNewButton_2;
	private JTextField textoClienteEliminar;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JTextField textoClienteBuscar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaUsuarioProducto window = new VistaUsuarioProducto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void esperar (int segundos) {
		try {
		Thread.sleep (segundos*1000);
		} catch (Exception e) {
		// Mensaje en caso de que falle
		}
		}

	/**
	 * Create the application.
	 */
	public VistaUsuarioProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1242, 801);
		frame.setTitle("Programa de gestión");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-----------------------Boton Añadir clientes-----------------
		JButton btnNewButton = new JButton("Añadir Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.AñadirClientesSQL(textoNombre.getText(), textoApellidos.getText(), textoCorreo.getText(), textoTelefono.getText());
				textoNombre.setText("");
				textoApellidos.setText("");
				textoCorreo.setText("");
				textoTelefono.setText("");
				textoClienteAñadido.setText("Producto añadido con exito!");
				System.out.println(textoNombre.getText()+ textoApellidos.getText()+ textoCorreo.getText()+ textoTelefono.getText());
			}
		});
		//-----------------------Boton Ver clientes-----------------
		JButton btnNewButton_1 = new JButton("Ver Clientes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textoListaClientes.setText(cliente.RecuperarClientes());

			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		
		JLabel lblNewLabel_1_1 = new JLabel("Correo Electronico");
		
		JLabel lblNewLabel_1_2 = new JLabel("Telefono");
		
		JLabel lblNewLabel_1_3 = new JLabel("Nombre");
		
		textoNombre = new JTextField();
		textoNombre.setColumns(10);
		
		textoApellidos = new JTextField();
		textoApellidos.setColumns(10);
		
		textoCorreo = new JTextField();
		textoCorreo.setColumns(10);
		
		textoTelefono = new JTextField();
		textoTelefono.setColumns(10);
		
		textoListaClientes = new JTextPane();
		textoListaClientes.setEditable(false);
		
		textoClienteAñadido = new JTextField();
		textoClienteAñadido.setEditable(false);
		textoClienteAñadido.setColumns(10);
		
		btnNewButton_2 = new JButton("Eliminar Cliente");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.EliminarCliente(textoClienteEliminar.getText());
			}
		});
		
		textoClienteEliminar = new JTextField();
		textoClienteEliminar.setColumns(10);
		
		btnNewButton_3 = new JButton("Buscar cliente");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(cliente.BuscarCliente(textoClienteBuscar.getText()));
				
			}
		});
		
		lblNewLabel = new JLabel("Nombre Cliente");
		
		lblNewLabel_2 = new JLabel("Nombre Cliente");
		
		textoClienteBuscar = new JTextField();
		textoClienteBuscar.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textoClienteAñadido)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textoNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textoApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textoCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textoTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textoListaClientes, GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textoClienteEliminar, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(textoClienteBuscar, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_3)
								.addComponent(textoNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(textoApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1)
								.addComponent(textoCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2)
								.addComponent(textoTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textoClienteAñadido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textoListaClientes, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel)
										.addComponent(textoClienteEliminar, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
									.addGap(11)
									.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textoClienteBuscar, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(83, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
