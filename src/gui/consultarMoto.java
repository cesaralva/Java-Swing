package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import menu.MenuPrincipal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class consultarMoto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JComboBox btnComboBox;
	private JButton btnCerrar;
	private JLabel lblCambioVelocidad;
	private JLabel lblCilindrada;
	private JLabel lblKilometraje;
	private JLabel lblTamanioDisco;
	private JLabel lblSock;
	private JLabel lblGarantia;
	private JLabel lblPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultarMoto frame = new consultarMoto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public consultarMoto() {
		setTitle("Consultar Moto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 600, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.setLocationRelativeTo(null);


		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("MODELO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(31, 23, 167, 20);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("PRECIOS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(31, 54, 167, 20);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("CAMBIO DE VELOCIDAD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(31, 85, 167, 20);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("CILINDRADA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(31, 116, 167, 20);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("KILOMETRAJE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(31, 153, 167, 20);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("TAMAÑO DE DISCO");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(31, 185, 167, 20);
		contentPane.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("STOCK");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(31, 223, 167, 20);
		contentPane.add(lblNewLabel_6);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(458, 23, 89, 23);
		contentPane.add(btnCerrar);
		Border borde = BorderFactory.createLineBorder(Color.gray);

		lblCambioVelocidad = new JLabel("");
		lblCambioVelocidad.setEnabled(false);
		lblCambioVelocidad.setBorder(borde);
		lblCambioVelocidad.setBackground(new Color(0, 0, 0));
		lblCambioVelocidad.setBackground(Color.BLACK);
		lblCambioVelocidad.setBounds(208, 89, 203, 18);
		contentPane.add(lblCambioVelocidad);

		lblCilindrada = new JLabel("");
		lblCilindrada.setEnabled(false);
		lblCilindrada.setBorder(borde);
		lblCilindrada.setBackground(new Color(0, 0, 0));
		lblCilindrada.setBackground(Color.BLACK);
		lblCilindrada.setBounds(208, 120, 203, 18);
		contentPane.add(lblCilindrada);

		lblKilometraje = new JLabel("");
		lblKilometraje.setEnabled(false);
		lblKilometraje.setBorder(borde);
		lblKilometraje.setBackground(new Color(0, 0, 0));
		lblKilometraje.setBackground(Color.BLACK);
		lblKilometraje.setBounds(208, 157, 203, 18);
		contentPane.add(lblKilometraje);

		lblTamanioDisco = new JLabel("");
		lblTamanioDisco.setEnabled(false);
		lblTamanioDisco.setBorder(borde);
		lblTamanioDisco.setBackground(new Color(0, 0, 0));
		lblTamanioDisco.setBackground(Color.BLACK);
		lblTamanioDisco.setBounds(208, 189, 203, 18);
		contentPane.add(lblTamanioDisco);

		lblSock = new JLabel("");
		lblSock.setEnabled(false);
		lblSock.setBorder(borde);
		lblSock.setBackground(new Color(0, 0, 0));
		lblSock.setBackground(Color.BLACK);
		lblSock.setBounds(208, 227, 203, 18);
		contentPane.add(lblSock);

		JLabel lblNewLabel_6_1 = new JLabel("GARANTIA");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_1.setBounds(31, 264, 167, 20);
		contentPane.add(lblNewLabel_6_1);

		lblGarantia = new JLabel("");
		lblGarantia.setEnabled(false);
		lblGarantia.setBorder(borde);
		lblGarantia.setBackground(new Color(0, 0, 0));
		lblGarantia.setBackground(Color.BLACK);
		lblGarantia.setBounds(208, 268, 203, 18);
		contentPane.add(lblGarantia);
		
		
		lblPrecio = new JLabel("");
		lblPrecio.setEnabled(false);
		lblPrecio.setBorder(borde);
		lblPrecio.setBackground(new Color(0, 0, 0));		
		lblPrecio.setBackground(Color.BLACK);
		lblPrecio.setBounds(208, 54, 203, 18);
		contentPane.add(lblPrecio);

		btnComboBox = new JComboBox();
		btnComboBox.addActionListener(this);

		btnComboBox.setBounds(208, 23, 206, 22);
		contentPane.add(btnComboBox);
		btnComboBox.addItem(MenuPrincipal.modelo0);
		btnComboBox.addItem(MenuPrincipal.modelo1);
		btnComboBox.addItem(MenuPrincipal.modelo2);
		btnComboBox.addItem(MenuPrincipal.modelo3);
		btnComboBox.addItem(MenuPrincipal.modelo4);
		/*
		 * btnComboBox.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * 
		 * int Index = btnComboBox.getSelectedIndex(); switch (Index) { case 0:
		 * lblPrecio.setText(String.valueOf(MenuPrincipal.precio0));
		 * lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad0));
		 * lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada0));
		 * lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje0));
		 * lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion0));
		 * lblPistones.setText(String.valueOf(MenuPrincipal.pistones0));
		 * lblGarantia.setText(String.valueOf(MenuPrincipal.garantia0));
		 * 
		 * break; case 1: lblPrecio.setText(String.valueOf(MenuPrincipal.precio1));
		 * lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad1));
		 * lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada1));
		 * lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje1));
		 * lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion1));
		 * lblPistones.setText(String.valueOf(MenuPrincipal.pistones1));
		 * lblGarantia.setText(String.valueOf(MenuPrincipal.garantia1));
		 * 
		 * break; case 2: lblPrecio.setText(String.valueOf(MenuPrincipal.precio2));
		 * lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad2));
		 * lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada2));
		 * lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje2));
		 * lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion2));
		 * lblPistones.setText(String.valueOf(MenuPrincipal.pistones2));
		 * lblGarantia.setText(String.valueOf(MenuPrincipal.garantia2));
		 * 
		 * break; case 3: lblPrecio.setText(String.valueOf(MenuPrincipal.precio3));
		 * lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad3));
		 * lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada3));
		 * lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje3));
		 * lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion3));
		 * lblPistones.setText(String.valueOf(MenuPrincipal.pistones3));
		 * lblGarantia.setText(String.valueOf(MenuPrincipal.garantia3));
		 * 
		 * break; case 4: lblPrecio.setText(String.valueOf(MenuPrincipal.precio4));
		 * lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad4));
		 * lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada4));
		 * lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje4));
		 * lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion4));
		 * lblPistones.setText(String.valueOf(MenuPrincipal.pistones4));
		 * lblGarantia.setText(String.valueOf(MenuPrincipal.garantia4));
		 * 
		 * break; default: lblPrecio.setText(""); break;
		 * 
		 * } } });
		 */
		btnComboBox.setSelectedIndex(0);
	
		
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnComboBox) {
			actionPerformedBtnComboBox(e);
		}
	}

	protected void actionPerformedBtnComboBox(ActionEvent e) {

		int index = btnComboBox.getSelectedIndex();
		if (index == 0) {
			lblPrecio.setText(Double.toString(MenuPrincipal.precio0));
			lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad0));
			lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada0));
			lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje0));
			lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion0));
			lblSock.setText(String.valueOf(MenuPrincipal.stock0));
			lblGarantia.setText(String.valueOf(MenuPrincipal.garantia0));
		}
		if (index == 1) {
			lblPrecio.setText(Double.toString(MenuPrincipal.precio1));
			lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad1));
			lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada1));
			lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje1));
			lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion1));
			lblSock.setText(String.valueOf(MenuPrincipal.stock1));
			lblGarantia.setText(String.valueOf(MenuPrincipal.garantia1));
		}
		if (index == 2) {
			lblPrecio.setText(Double.toString(MenuPrincipal.precio2));
			lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad2));
			lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada2));
			lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje2));
			lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion2));
			lblSock.setText(String.valueOf(MenuPrincipal.stock2));			
			lblGarantia.setText(String.valueOf(MenuPrincipal.garantia2));
		}
		if (index == 3) {
			lblPrecio.setText(Double.toString(MenuPrincipal.precio3));
			lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad3));
			lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada3));
			lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje3));
			lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion3));
			lblSock.setText(String.valueOf(MenuPrincipal.stock3));
			lblGarantia.setText(String.valueOf(MenuPrincipal.garantia3));
		}
		if (index == 4) {
			lblPrecio.setText(Double.toString(MenuPrincipal.precio4));
			lblCambioVelocidad.setText(String.valueOf(MenuPrincipal.velocidad4));
			lblCilindrada.setText(String.valueOf(MenuPrincipal.cilindrada4));
			lblKilometraje.setText(String.valueOf(MenuPrincipal.kilometraje4));
			lblTamanioDisco.setText(String.valueOf(MenuPrincipal.trasmicion4));
			lblSock.setText(String.valueOf(MenuPrincipal.stock4));
			lblGarantia.setText(String.valueOf(MenuPrincipal.garantia4));
		}

	}

	public boolean isClosed() {

		return false;
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {

		dispose();
	}
}
