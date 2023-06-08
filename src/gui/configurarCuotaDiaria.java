package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menu.MenuPrincipal;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configurarCuotaDiaria extends JFrame {

	private JPanel contentPane;
	private JLabel etiqueta1;
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
					configurarCuotaDiaria frame = new configurarCuotaDiaria();
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
	public configurarCuotaDiaria() {
		setTitle("Configurar cuota diaria");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiqueta1 = new JLabel("Cuota diaria esperada (S/.)");
		etiqueta1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiqueta1.setBounds(10, 25, 178, 14);
		contentPane.add(etiqueta1);
		
		textField = new JTextField();
		textField.setBounds(220, 25, 96, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		botonAceptar = new JButton("ACEPTAR");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal.cuotaDiaria = Double.parseDouble(textField.getText());
			}
		});
		botonAceptar.setBounds(365, 11, 104, 24);
		contentPane.add(botonAceptar);
		
		botonCancelar = new JButton("CANCELAR");
		botonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botonCancelar.setBounds(365, 46, 104, 24);
		contentPane.add(botonCancelar);
		//mostrar al abrir la ventana la cantidad de cuota diaria
		textField.setText(""+MenuPrincipal.cuotaDiaria);
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}

}
