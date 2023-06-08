package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import menu.MenuPrincipal;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listaMoto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextArea txtS;	
	private JScrollPane scroll;
	private JButton btnListar1;
	private JButton btnCerrar1;
	public static listaMoto formlistaMoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listaMoto frame = new listaMoto();
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
	public listaMoto() {
		setTitle("Listar Moto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 553, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setLocationRelativeTo(null);

		setContentPane(contentPane);

		btnListar1 = new JButton("Listar");
		btnListar1.addActionListener(this);

		btnCerrar1 = new JButton("Cerrar");
		btnCerrar1.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(76)
					.addComponent(btnCerrar1, GroupLayout.PREFERRED_SIZE, 85, Short.MAX_VALUE)
					.addGap(206)
					.addComponent(btnListar1, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
					.addGap(75))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(259)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnListar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCerrar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(39))
		);
		contentPane.setLayout(gl_contentPane);

		txtS = new JTextArea();

		scroll = new JScrollPane(txtS);
		scroll.setEnabled(false);

		scroll.setBounds(34, 10, 470, 219);

		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		contentPane.add(scroll);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar1) {
			actionPerformedBtnCerrar1(e);
		}
		if (e.getSource() == btnListar1) {
			actionPerformedBtnListar1(e);
		}
	}

	protected void actionPerformedBtnListar1(ActionEvent e) {
	    txtS.setText("");

		txtS.append("LISTADO DE MOTOS");
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("Modelo		:  " + MenuPrincipal.modelo0);
		txtS.append("\n");
		txtS.append("Precio		:  " + "$ " + MenuPrincipal.precio0);
		txtS.append("\n");
		txtS.append("Cambio de velocidad	:  " + MenuPrincipal.velocidad0);
		txtS.append("\n");
		txtS.append("Tipo de cilindrada	:  " + MenuPrincipal.cilindrada0);
		txtS.append("\n");
		txtS.append("Velocidad maxima de la moto	:  " + MenuPrincipal.kilometraje0 + " km/h");
		txtS.append("\n");
		txtS.append("Peso de la Moto	:  " + MenuPrincipal.dimensiones0);
		txtS.append("\n");
		txtS.append("Trancisión 		:  " + MenuPrincipal.trasmicion0);
		txtS.append("\n");
		txtS.append("Nro. de cilindradas	: " + MenuPrincipal.pistones0);
		txtS.append("\n");
		txtS.append("Garantia		: " + MenuPrincipal.garantia0);
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("LISTADO DE MOTOS");
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("Modelo		:  " + MenuPrincipal.modelo1);
		txtS.append("\n");
		txtS.append("Precio		:  " + "$ " + MenuPrincipal.precio1);
		txtS.append("\n");
		txtS.append("Cambio de velocidad	:  " + MenuPrincipal.velocidad1);
		txtS.append("\n");
		txtS.append("Tipo de cilindrada	:  " + MenuPrincipal.cilindrada1);
		txtS.append("\n");
		txtS.append("Velocidad maxima de la moto	:  " + MenuPrincipal.kilometraje1 + " km/h");
		txtS.append("\n");
		txtS.append("Peso de la Moto	:  " + MenuPrincipal.dimensiones1);
		txtS.append("\n");
		txtS.append("Trancisión 		:  " + MenuPrincipal.trasmicion1);
		txtS.append("\n");
		txtS.append("Nro. de cilindradas	: " + MenuPrincipal.pistones1);
		txtS.append("\n");
		txtS.append("Garantia		: " + MenuPrincipal.garantia1);
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("LISTADO DE MOTOS");
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("Modelo		:  " + MenuPrincipal.modelo2);
		txtS.append("\n");
		txtS.append("Precio		:  " + "$ " + MenuPrincipal.precio2);
		txtS.append("\n");
		txtS.append("Cambio de velocidad	:  " + MenuPrincipal.velocidad2);
		txtS.append("\n");
		txtS.append("Tipo de cilindrada	:  " + MenuPrincipal.cilindrada2);
		txtS.append("\n");
		txtS.append("Velocidad maxima de la moto	:  " + MenuPrincipal.kilometraje2 + " km/h");
		txtS.append("\n");
		txtS.append("Peso de la Moto	:  " + MenuPrincipal.dimensiones2);
		txtS.append("\n");
		txtS.append("Trancisión 		:  " + MenuPrincipal.trasmicion2);
		txtS.append("\n");
		txtS.append("Nro. de cilindradas	: " + MenuPrincipal.pistones2);
		txtS.append("\n");
		txtS.append("Garantia		: " + MenuPrincipal.garantia2);
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("LISTADO DE MOTOS");
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("Modelo		:  " + MenuPrincipal.modelo3);
		txtS.append("\n");
		txtS.append("Precio		:  " + "$ " + MenuPrincipal.precio3);
		txtS.append("\n");
		txtS.append("Cambio de velocidad	:  " + MenuPrincipal.velocidad3);
		txtS.append("\n");
		txtS.append("Tipo de cilindrada	:  " + MenuPrincipal.cilindrada3);
		txtS.append("\n");
		txtS.append("Velocidad maxima de la moto	:  " + MenuPrincipal.kilometraje3 + " km/h");
		txtS.append("\n");
		txtS.append("Peso de la Moto	:  " + MenuPrincipal.dimensiones3);
		txtS.append("\n");
		txtS.append("Trancisión 		:  " + MenuPrincipal.trasmicion3);
		txtS.append("\n");
		txtS.append("Nro. de cilindradas	: " + MenuPrincipal.pistones3);
		txtS.append("\n");
		txtS.append("Garantia		: " + MenuPrincipal.garantia3);
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("LISTADO DE MOTOS");
		txtS.append("\n");
		txtS.append("\n");
		txtS.append("Modelo		:  " + MenuPrincipal.modelo4);
		txtS.append("\n");
		txtS.append("Precio		:  " + "$ " + MenuPrincipal.precio4);
		txtS.append("\n");
		txtS.append("Cambio de velocidad	:  " + MenuPrincipal.velocidad4);
		txtS.append("\n");
		txtS.append("Tipo de cilindrada	:  " + MenuPrincipal.cilindrada4);
		txtS.append("\n");
		txtS.append("Velocidad maxima de la moto	:  " + MenuPrincipal.kilometraje4 + " km/h");
		txtS.append("\n");
		txtS.append("Peso de la Moto	:  " + MenuPrincipal.dimensiones4);
		txtS.append("\n");
		txtS.append("Trancisión 		:  " + MenuPrincipal.trasmicion4);
		txtS.append("\n");
		txtS.append("Nro. de cilindradas	: " + MenuPrincipal.pistones4);
		txtS.append("\n");
		txtS.append("Garantia		: " + MenuPrincipal.garantia4);
		txtS.append("\n");
		txtS.append("\n");

	}

	protected void actionPerformedBtnCerrar1(ActionEvent e) {
		 dispose();
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}
}
