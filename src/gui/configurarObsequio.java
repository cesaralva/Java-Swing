package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import menu.MenuPrincipal;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
public class configurarObsequio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiquetaUnidad1;
	private JLabel etiquetaUnidad2;
	private JLabel etiquetaUnidad3;
	private JTextField campoTexto1;
	private JTextField campoTexto2;
	private JTextField campoTexto3;
	private JButton botonAceptar;
	private JButton botonLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configurarObsequio frame = new configurarObsequio();
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
	public configurarObsequio() {
		setTitle("Configurar obsequios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiquetaUnidad1 = new JLabel("1 unidad");
		etiquetaUnidad1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiquetaUnidad1.setBounds(10, 32, 75, 14);
		contentPane.add(etiquetaUnidad1);
		
		etiquetaUnidad2 = new JLabel("2 a 5 unidades");
		etiquetaUnidad2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiquetaUnidad2.setBounds(10, 57, 90, 14);
		contentPane.add(etiquetaUnidad2);
		
		etiquetaUnidad3 = new JLabel("6 a más  unidades");
		etiquetaUnidad3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiquetaUnidad3.setBounds(10, 82, 135, 14);
		contentPane.add(etiquetaUnidad3);
		
		campoTexto1 = new JTextField();
		campoTexto1.setBounds(162, 26, 96, 20);
		contentPane.add(campoTexto1);
		campoTexto1.setColumns(10);
		
		campoTexto2 = new JTextField();
		campoTexto2.setBounds(162, 51, 96, 20);
		contentPane.add(campoTexto2);
		campoTexto2.setColumns(10);
		
		campoTexto3 = new JTextField();
		campoTexto3.setBounds(162, 76, 96, 20);
		contentPane.add(campoTexto3);
		campoTexto3.setColumns(10);
		
		botonAceptar = new JButton("ACEPTAR");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				guardarObsequios();
			}
		});
		botonAceptar.setBounds(317, 22, 109, 23);
		contentPane.add(botonAceptar);
		
		botonLimpiar = new JButton("CANCELAR");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botonLimpiar.setBounds(317, 51, 109, 23);
		contentPane.add(botonLimpiar);
		//al abrir la ventana para que se vea los obsequios
		campoTexto1.setText(""+MenuPrincipal.tipoObsequio1);
		campoTexto2.setText(""+MenuPrincipal.tipoObsequio2);
		campoTexto3.setText(""+MenuPrincipal.tipoObsequio3);
	}
	/////////////////////////METODO GUARDAR LOS CAMBIOS DE OBSEQUIOS///////////////////////
	void guardarObsequios() {
		// Obtener los nuevos valores de obsequios
		String nuevoObsequio = String.valueOf(campoTexto1.getText());
		String nuevoObsequi1 = String.valueOf(campoTexto2.getText());
		String nuevoObsequi2 = String.valueOf(campoTexto3.getText());
		// Actualizar los valores de las variables estáticas
	    MenuPrincipal.tipoObsequio1 = nuevoObsequio;
	    MenuPrincipal.tipoObsequio2 = nuevoObsequi1;
	    MenuPrincipal.tipoObsequio3 = nuevoObsequi2;
	    // Mensaje que se guardo cuando das click en boton Aceptar
	    JOptionPane.showMessageDialog(null, "Los obsequios se guardaron correctamente");
		
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}
}
