package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import menu.MenuPrincipal;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modificarMoto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCambioDeVelocidad;
	private JLabel lblPistones;
	private JLabel lblKilometraje;
	private JLabel lblTama;
	private JLabel lblSuspension;
	private JComboBox btnComboBox;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_7;
	private JButton btnCerrar;
	private JTextField textPrecio;
	private JTextField textStock;
	private JTextField textGarantia;
	private JButton btnGrabar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modificarMoto frame = new modificarMoto();
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
	public modificarMoto() {
		setTitle("Modificar Moto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
		);
		

		lblNewLabel = new JLabel("MODELO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(31, 39, 167, 20);
		desktopPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("PRECIOS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(31, 72, 167, 20);
		desktopPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("STOCK");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(31, 104, 167, 20);
		desktopPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6_1 = new JLabel("GARANTIA");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_1.setBounds(31, 136, 167, 20);
		desktopPane.add(lblNewLabel_6_1);
		
		btnComboBox = new JComboBox();
		btnComboBox.addActionListener(this);
		btnComboBox.setBounds(208, 39, 203, 22);
		desktopPane.add(btnComboBox);
		btnComboBox.addItem(MenuPrincipal.modelo0);
		btnComboBox.addItem(MenuPrincipal.modelo1);
		btnComboBox.addItem(MenuPrincipal.modelo2);
		btnComboBox.addItem(MenuPrincipal.modelo3);
		btnComboBox.addItem(MenuPrincipal.modelo4);
		
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(459, 136, 89, 23);
		desktopPane.add(btnCerrar);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(208, 73, 203, 20);
		desktopPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		textStock = new JTextField();
		textStock.setBounds(208, 105, 203, 20);
		desktopPane.add(textStock);
		textStock.setColumns(10);
		contentPane.setLayout(gl_contentPane);

			
		btnComboBox.setSelectedIndex(0);
		
		textGarantia = new JTextField();
		textGarantia.setColumns(10);
		textGarantia.setBounds(208, 137, 203, 20);
		desktopPane.add(textGarantia);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(459, 39, 89, 23);
		desktopPane.add(btnGrabar);
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnComboBox) {
			actionPerformedBtnComboBox(e);
		}
	}
	protected void actionPerformedBtnComboBox(ActionEvent e) {
		int index = btnComboBox.getSelectedIndex();
		
		
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	public boolean isClosed() {
		
		return false;
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		
		int index = btnComboBox.getSelectedIndex();
		
		if(index == 0) {
			MenuPrincipal.precio0=Double.parseDouble(textPrecio.getText());
			MenuPrincipal.stock0=Integer.parseInt(textStock.getText());
			MenuPrincipal.garantia0=String.valueOf(textGarantia.getText());
			JOptionPane.showMessageDialog(null,"Grabado correctamente");
		}
		if(index == 1) {
			MenuPrincipal.precio1=Double.parseDouble(textPrecio.getText());
			MenuPrincipal.stock1=Integer.parseInt(textStock.getText());
			MenuPrincipal.garantia1=String.valueOf(textGarantia.getText());
			JOptionPane.showMessageDialog(null,"Grabado correctamente");
		}
		if(index == 2) {
			MenuPrincipal.precio2=Double.parseDouble(textPrecio.getText());
			MenuPrincipal.stock2=Integer.parseInt(textStock.getText());
			MenuPrincipal.garantia2=String.valueOf(textGarantia.getText());
			JOptionPane.showMessageDialog(null,"Grabado correctamente");
		}
		if(index == 3) {
			MenuPrincipal.precio3=Double.parseDouble(textPrecio.getText());
			MenuPrincipal.stock3=Integer.parseInt(textStock.getText());
			MenuPrincipal.garantia3=String.valueOf(textGarantia.getText());
			JOptionPane.showMessageDialog(null,"Grabado correctamente");
		}
		if(index == 4) {
			MenuPrincipal.precio4=Double.parseDouble(textPrecio.getText());
			MenuPrincipal.stock4=Integer.parseInt(textStock.getText());
			MenuPrincipal.garantia4=String.valueOf(textGarantia.getText());
			JOptionPane.showMessageDialog(null,"Grabado correctamente");
		}
	}
}
