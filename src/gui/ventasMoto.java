package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menu.MenuPrincipal;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ventasMoto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox btnComboBox;
	private JLabel lblPrecio;
	private JTextField textCantidad;
	private JTextArea textArea;
	private JButton btnNewButton;
	private int index;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventasMoto frame = new ventasMoto();
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
	public ventasMoto() {
		
		
		

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 553, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);

		Border borde = BorderFactory.createLineBorder(Color.gray);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel = new JLabel("MODELO");
		lblNewLabel.setBounds(31, 23, 121, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("PRECIOS");
		lblNewLabel_1.setBounds(31, 54, 121, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("CANTIDAD");
		lblNewLabel_2.setBounds(31, 85, 121, 20);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_2);

		lblPrecio = new JLabel("");
		lblPrecio.setBorder(borde);
		lblPrecio.setBackground(new Color(0, 0, 0));
		lblPrecio.setBackground(Color.BLACK);

		lblPrecio.setBounds(175, 54, 124, 20);
		contentPane.add(lblPrecio);

		btnComboBox = new JComboBox();
		btnComboBox.addActionListener(this);
		btnComboBox.setBounds(175, 23, 147, 22);
		contentPane.add(btnComboBox);
		btnComboBox.addItem(MenuPrincipal.modelo0);
		btnComboBox.addItem(MenuPrincipal.modelo1);
		btnComboBox.addItem(MenuPrincipal.modelo2);
		btnComboBox.addItem(MenuPrincipal.modelo3);
		btnComboBox.addItem(MenuPrincipal.modelo4);

		btnComboBox.setSelectedIndex(0);

		textCantidad = new JTextField();
		textCantidad.setBounds(174, 86, 124, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);

		textArea = new JTextArea();
		textArea.setBounds(31, 131, 471, 168);
		contentPane.add(textArea);

		btnNewButton = new JButton("Vender");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnNewButton.setBounds(413, 23, 89, 23);
		contentPane.add(btnNewButton);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnCerrar.setBounds(413, 54, 89, 23);
		contentPane.add(btnCerrar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnComboBox) {
			actionPerformedComboBox(e);
		}
	}

	protected void actionPerformedComboBox(ActionEvent e) {

		index = btnComboBox.getSelectedIndex();

		switch (index) {

		case 0:
			lblPrecio.setText(String.valueOf(MenuPrincipal.precio0));
			break;
		case 1:
			lblPrecio.setText(String.valueOf(MenuPrincipal.precio1));
			break;
		case 2:
			lblPrecio.setText(String.valueOf(MenuPrincipal.precio2));
			break;
		case 3:
			lblPrecio.setText(String.valueOf(MenuPrincipal.precio3));
			break;
		case 4:
			lblPrecio.setText(String.valueOf(MenuPrincipal.precio4));
			break;

		}

	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		textArea.setText("");
		int cantidad = 0, cantidadObsequios = 0;
		double importeCompra, descuento = 0, importeDescuento, importePago, precio;
		String obsequio, modelo;

		index = btnComboBox.getSelectedIndex();
		modelo = (String) btnComboBox.getSelectedItem();

		precio = Double.parseDouble(lblPrecio.getText());
		cantidad = Integer.parseInt(textCantidad.getText());
		importeCompra = cantidad * precio;

		obsequio = MenuPrincipal.tipoObsequio1;

		if (cantidad > 1 && cantidad <= 5) {
			descuento = 0.01;
		} else if (cantidad > 6 && cantidad <= 10) {
			descuento = 0.02;
		}

		importeDescuento = importeCompra * descuento;
		importePago = importeCompra - importeDescuento;

		if (cantidad > 1 && cantidad <= 5) {
			cantidadObsequios = MenuPrincipal.obsequioCantidad1;
		} else if (cantidad > 6 && cantidad <= 10) {
			cantidadObsequios = MenuPrincipal.obsequioCantidad2;
		}
		DecimalFormat df = new DecimalFormat("000.00");
		textArea.append("BOLETA DE VENTA \n\n");
		textArea.append("Modelo		:" + modelo + "\n");
		textArea.append("Precio		:" + df.format(precio) + "\n");
		textArea.append("Cantidad		:" + cantidad + "\n");
		textArea.append("Importe de compra	:" + df.format(importeCompra) + "\n");
		textArea.append("Importe de pago	:" + df.format(importeDescuento) + "\n");
		textArea.append("Tipo de obsequio	:" + obsequio + "\n");
		textArea.append("Cantidad de obsequios	:" + cantidadObsequios + "\n");

		switch (index) {
		case 0:
			MenuPrincipal.cntVendida0=MenuPrincipal.cntVendida0+cantidad;
			MenuPrincipal.ventas0++;
			MenuPrincipal.importeVentas0 = MenuPrincipal.importeVentas0 + importePago;
			MenuPrincipal.avanceCuota0 = (MenuPrincipal.importeVentas0 / MenuPrincipal.cuotaDiaria) * 100;
			if (MenuPrincipal.ventas0 % 5 == 0) {
				JOptionPane.showMessageDialog(this,
						"Ventas Nro. " + MenuPrincipal.ventas0 + "\n" + "Importe de ventas s/."
								+ MenuPrincipal.importeVentas0 + "\n" + "El avance de la cuota es: "
								+ Math.round(MenuPrincipal.avanceCuota0) + "%\n");
			}
			break;
		case 1:
			MenuPrincipal.cntVendida1=MenuPrincipal.cntVendida1+cantidad;
			MenuPrincipal.ventas1++;
			MenuPrincipal.importeVentas1 = MenuPrincipal.importeVentas1 + importePago;
			MenuPrincipal.avanceCuota1 = (MenuPrincipal.importeVentas1 / MenuPrincipal.cuotaDiaria) * 100;
			if (MenuPrincipal.ventas1 % 5 == 0) {
				JOptionPane.showMessageDialog(this,
						"Ventas Nro. " + MenuPrincipal.ventas1 + "\n" + "Importe de ventas s/."
								+ MenuPrincipal.importeVentas1 + "\n" + "El avance de la cuota es: "
								+ Math.round(MenuPrincipal.avanceCuota1) + "%\n");
			}
			break;
		case 2:
			MenuPrincipal.cntVendida2=MenuPrincipal.cntVendida2+cantidad;
			MenuPrincipal.ventas2++;
			MenuPrincipal.importeVentas2 = MenuPrincipal.importeVentas2 + importePago;
			MenuPrincipal.avanceCuota2 = (MenuPrincipal.importeVentas2 / MenuPrincipal.cuotaDiaria) * 100;
			if (MenuPrincipal.ventas2 % 5 == 0) {
				JOptionPane.showMessageDialog(this,
						"Ventas Nro. " + MenuPrincipal.ventas2 + "\n" + "Importe de ventas s/."
								+ MenuPrincipal.importeVentas2 + "\n" + "El avance de la cuota es: "
								+ Math.round(MenuPrincipal.avanceCuota2) + "%\n");
			}
			break;
		case 3:
			MenuPrincipal.cntVendida3=MenuPrincipal.cntVendida3+cantidad;
			MenuPrincipal.ventas3++;
			MenuPrincipal.importeVentas3 = MenuPrincipal.importeVentas3 + importePago;
			MenuPrincipal.avanceCuota3 = (MenuPrincipal.importeVentas3 / MenuPrincipal.cuotaDiaria) * 100;
			if (MenuPrincipal.ventas3 % 5 == 0) {
				JOptionPane.showMessageDialog(this,
						"Ventas Nro. " + MenuPrincipal.ventas3 + "\n" + "Importe de ventas s/."
								+ MenuPrincipal.importeVentas3 + "\n" + "El avance de la cuota es: "
								+ Math.round(MenuPrincipal.avanceCuota3) + "%\n");
			}
			break;
		case 4:
			MenuPrincipal.cntVendida4=MenuPrincipal.cntVendida4+cantidad;
			MenuPrincipal.ventas4++;
			MenuPrincipal.importeVentas4 = MenuPrincipal.importeVentas4 + importePago;
			MenuPrincipal.avanceCuota4 = (MenuPrincipal.importeVentas4 / MenuPrincipal.cuotaDiaria) * 100;
			if (MenuPrincipal.ventas4 % 5 == 0) {
				JOptionPane.showMessageDialog(this,
						"Ventas Nro. " + MenuPrincipal.ventas4 + "\n" + "Importe de ventas s/."
								+ MenuPrincipal.importeVentas4 + "\n" + "El avance de la cuota es: "
								+ Math.round(MenuPrincipal.avanceCuota4) + "%\n");
			}
			break;

		}

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return true;
	}
}
