package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private JPanel contentPane;
	protected JTextField txtMatricula;
	protected JTextField txtDatos;
	protected JTextField txtAlquiler;
	protected JTextField txtCantidad;
	protected JButton btnValidar;
	protected JLabel lblMensaje;

	
	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Operacion", null, panel_1, null);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Alta", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alta coche");
		lblNewLabel.setBounds(164, 11, 159, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("matricula");
		lblNewLabel_1.setBounds(26, 47, 46, 14);
		panel.add(lblNewLabel_1);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(26, 70, 359, 20);
		panel.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("datos");
		lblNewLabel_2.setBounds(26, 101, 46, 14);
		panel.add(lblNewLabel_2);
		
		txtDatos = new JTextField();
		txtDatos.setBounds(26, 126, 359, 20);
		panel.add(txtDatos);
		txtDatos.setColumns(10);
		
		txtAlquiler = new JTextField();
		txtAlquiler.setBounds(26, 167, 36, 20);
		panel.add(txtAlquiler);
		txtAlquiler.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("alquiler");
		lblNewLabel_3.setBounds(72, 170, 46, 14);
		panel.add(lblNewLabel_3);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(128, 183, 135, 20);
		panel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel(" ");
		lblCantidad.setBounds(159, 157, 46, 14);
		panel.add(lblCantidad);
		
		btnValidar = new JButton("Validar");
		
		btnValidar.setBounds(273, 182, 89, 23);
		panel.add(btnValidar);
		
		lblMensaje = new JLabel(" ");
		lblMensaje.setBounds(26, 242, 46, 14);
		panel.add(lblMensaje);
	}
}
