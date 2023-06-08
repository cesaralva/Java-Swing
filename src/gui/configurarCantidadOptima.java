package gui;

import java.awt.EventQueue;
import menu.MenuPrincipal;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class configurarCantidadOptima extends JFrame {

	private JPanel contentPane;
	private JLabel etiquetaCantidadOptima;
	private JTextField textField;
	private JButton botonAceptar;
	private JButton botonCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarCantidadOptima frame = new configurarCantidadOptima();
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
	public configurarCantidadOptima() {
		setTitle("Configurar cantidad óptima");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 524, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiquetaCantidadOptima = new JLabel("cantidad óptima de motos vendidas");
		etiquetaCantidadOptima.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiquetaCantidadOptima.setBounds(10, 31, 223, 14);
		contentPane.add(etiquetaCantidadOptima);
		
		textField = new JTextField();
		textField.setBounds(257, 31, 81, 16);
		contentPane.add(textField);
		textField.setColumns(10);
		
		botonAceptar = new JButton("ACEPTAR");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MenuPrincipal.cantidadOptima = Integer.parseInt(textField.getText());
			}
		});
		botonAceptar.setBounds(372, 28, 112, 23);
		contentPane.add(botonAceptar);
		
		botonCancelar = new JButton("CANCELAR");
		botonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botonCancelar.setBounds(372, 62, 112, 23);
		contentPane.add(botonCancelar);
		//Mostrar los valores de la cantidad optima al cargar la ventana
		textField.setText(""+MenuPrincipal.cantidadOptima);
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}

}
