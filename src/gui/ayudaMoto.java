package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ayudaMoto extends JInternalFrame implements ActionListener {
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblAutores;
	private JLabel lblAlvaValdiviaCesar;
	private JLabel lblCarlosCamposSalvador;
	private JLabel lblRubenOcaaCeledonio;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ayudaMoto frame = new ayudaMoto();
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
	public ayudaMoto() {
		setClosable(true);
		setResizable(true);
		setEnabled(false);
		setTitle("Acerca de la Tienda");
		setBounds(10, 10, 760, 371);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Tienda Moto");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 22));
		lblNewLabel.setBounds(298, 0, 130, 77);
		getContentPane().add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(40, 71, 645, 2);
		getContentPane().add(separator);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Roboto", Font.BOLD, 22));
		lblAutores.setBounds(318, 71, 77, 48);
		getContentPane().add(lblAutores);
		
		lblAlvaValdiviaCesar = new JLabel("Alva Valdivia Cesar Enrique");
		lblAlvaValdiviaCesar.setFont(new Font("Roboto", Font.PLAIN, 18));
		lblAlvaValdiviaCesar.setBounds(250, 114, 227, 32);
		getContentPane().add(lblAlvaValdiviaCesar);
		
		lblCarlosCamposSalvador = new JLabel("Carlos Campos Salvador");
		lblCarlosCamposSalvador.setFont(new Font("Roboto", Font.PLAIN, 18));
		lblCarlosCamposSalvador.setBounds(258, 146, 196, 32);
		getContentPane().add(lblCarlosCamposSalvador);
		
		lblRubenOcaaCeledonio = new JLabel("Ruben Ocaña Celedonio");
		lblRubenOcaaCeledonio.setFont(new Font("Roboto", Font.PLAIN, 18));
		lblRubenOcaaCeledonio.setBounds(260, 177, 190, 32);
		getContentPane().add(lblRubenOcaaCeledonio);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(303, 231, 102, 32);
		getContentPane().add(btnCerrar);
		


	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
