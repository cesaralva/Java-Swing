package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menu.MenuPrincipal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class configurarDescuento extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1865291468709602947L;
	private JPanel contentPane;
	private JLabel etiquetaUnidad1;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton botonAceptar;
	private JButton botonCancelar;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarDescuento frame = new configurarDescuento();
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
	public configurarDescuento() {
		setTitle("Configurar porcentajes de descuento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 476, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiquetaUnidad1 = new JLabel("1 a 5 unidades");
		etiquetaUnidad1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiquetaUnidad1.setBounds(10, 8, 103, 19);
		contentPane.add(etiquetaUnidad1);
		
		textField = new JTextField();
		textField.setBounds(174, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(true);
		textField.setEditable(true);
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		textField1.setBounds(174, 39, 86, 20);
		contentPane.add(textField1);
		
		textField2 = new JTextField();
		textField2.setBounds(174, 72, 86, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(174, 103, 86, 20);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		lblNewLabel = new JLabel("6 a 10 unidades");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 44, 103, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("11 a 15 unidades");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 75, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Más de 15 unidades");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 106, 142, 14);
		contentPane.add(lblNewLabel_2);
		
		botonAceptar = new JButton("ACEPTAR");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        guardarCambios();		
			}
			
		
		});
		botonAceptar.setBounds(337, 7, 103, 23);
		contentPane.add(botonAceptar);
		
		botonCancelar = new JButton("CANCELAR");
		botonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botonCancelar.setBounds(337, 44, 103, 23);
		contentPane.add(botonCancelar);
		//Mostrar los valores de los porcentajes al cargar la ventana
				textField.setText(""+MenuPrincipal.porcentaje1);
				textField1.setText(""+MenuPrincipal.porcentaje2);
				textField2.setText(""+MenuPrincipal.porcentaje3);
				textField3.setText(""+MenuPrincipal.porcentaje4);
				
				lblNewLabel_3 = new JLabel("%");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel_3.setBounds(270, 10, 49, 14);
				contentPane.add(lblNewLabel_3);
				
				lblNewLabel_4 = new JLabel("%");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel_4.setBounds(270, 42, 37, 14);
				contentPane.add(lblNewLabel_4);
				
				lblNewLabel_5 = new JLabel("%");
				lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel_5.setBounds(270, 75, 49, 14);
				contentPane.add(lblNewLabel_5);
				
				lblNewLabel_6 = new JLabel("%");
				lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel_6.setBounds(270, 106, 49, 14);
				contentPane.add(lblNewLabel_6);
				
	}
	 void guardarCambios() {
	    // Obtener los nuevos valores de los porcentajes
	    double nuevoPorcentaje1 = Double.parseDouble(textField.getText());
	    double nuevoPorcentaje2 = Double.parseDouble(textField1.getText());
	    double nuevoPorcentaje3 = Double.parseDouble(textField2.getText());
	    double nuevoPorcentaje4 = Double.parseDouble(textField3.getText());

	    // Actualizar los valores de las variables estáticas
	    MenuPrincipal.porcentaje1 = nuevoPorcentaje1;
	    MenuPrincipal.porcentaje2 = nuevoPorcentaje2;
	    MenuPrincipal.porcentaje3 = nuevoPorcentaje3;
	    MenuPrincipal.porcentaje4 = nuevoPorcentaje4;
	    JOptionPane.showMessageDialog(null, "Los porcentajes han sido guardados correctamente");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}
	}