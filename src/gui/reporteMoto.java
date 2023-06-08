package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menu.MenuPrincipal;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class reporteMoto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox btnComboBox;
	private JButton btnCerrar;
	private JScrollPane scroll;
	private JTextArea textArea;
	int ventasArray[] = new int[4];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reporteMoto frame = new reporteMoto();
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
	public reporteMoto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 553, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("tipo de reporte");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(31, 23, 106, 20);
		contentPane.add(lblNewLabel);

		btnComboBox = new JComboBox();
		btnComboBox.addActionListener(this);
		btnComboBox.setModel(
				new DefaultComboBoxModel(new String[] { "Ventas por modelo", "Ventas en relación a la venta óptima",
						"Precios en relación al precio promedio", "Promedios, menores y mayores" }));
		btnComboBox.setBounds(147, 23, 222, 22);
		contentPane.add(btnComboBox);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(407, 23, 89, 23);
		contentPane.add(btnCerrar);

		scroll = new JScrollPane();
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(31, 88, 468, 212);
		contentPane.add(scroll);

		textArea = new JTextArea();
		scroll.setViewportView(textArea);
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

		int index = 0;
		index = btnComboBox.getSelectedIndex();
		switch (index) {
		case 0:
			ventasPorModelo();
			textArea.append("");
			break;
		case 1:
			razonPrecios();
			break;
		case 2:
			estadisticaCantidad();
			break;

		case 3:
			estadisticaPrecios();
			break;

		}

	}

	void ventasPorModelo() {

		textArea.append("VENTAS POR MODELO \n \n");
		textArea.append("Modelo : " + MenuPrincipal.modelo0 + "\n");
		textArea.append("Cantidad de ventas : " + MenuPrincipal.ventas0 + "\n");
		textArea.append("Cantidad de unidades vendidas : " + MenuPrincipal.cntVendida0 + "\n");
		textArea.append("Importe total vendido : " + MenuPrincipal.importeVentas0 + "\n");
		textArea.append("Aporte a la cuota diaria: " + Math.round(MenuPrincipal.avanceCuota0) + "%\n\n");

		textArea.append("Modelo : " + MenuPrincipal.modelo1 + "\n");
		textArea.append("Cantidad de ventas : " + MenuPrincipal.ventas1 + "\n");
		textArea.append("Cantidad de unidades vendidas : " + MenuPrincipal.cntVendida1 + "\n");
		textArea.append("Importe total vendido : " + MenuPrincipal.importeVentas1 + "\n");
		textArea.append("Aporte a la cuota diaria: " + Math.round(MenuPrincipal.avanceCuota1) + "%\n\n");

		textArea.append("Modelo : " + MenuPrincipal.modelo2 + "\n");
		textArea.append("Cantidad de ventas : " + MenuPrincipal.ventas2 + "\n");
		textArea.append("Cantidad de unidades vendidas : " + MenuPrincipal.cntVendida2 + "\n");
		textArea.append("Importe total vendido : " + MenuPrincipal.importeVentas2 + "\n");
		textArea.append("Aporte a la cuota diaria: " + Math.round(MenuPrincipal.avanceCuota2) + "%\n\n");

		textArea.append("Modelo : " + MenuPrincipal.modelo3 + "\n");
		textArea.append("Cantidad de ventas : " + MenuPrincipal.ventas3 + "\n");
		textArea.append("Cantidad de unidades vendidas : " + MenuPrincipal.cntVendida3 + "\n");
		textArea.append("Importe total vendido : " + MenuPrincipal.importeVentas3 + "\n");
		textArea.append("Aporte a la cuota diaria: " + Math.round(MenuPrincipal.avanceCuota3) + "%\n\n");

		textArea.append("Modelo : " + MenuPrincipal.modelo4 + "\n");
		textArea.append("Cantidad de ventas : " + MenuPrincipal.ventas4 + "\n");
		textArea.append("Cantidad de unidades vendidas : " + MenuPrincipal.cntVendida4 + "\n");
		textArea.append("Importe total vendido : " + MenuPrincipal.importeVentas4 + "\n");
		textArea.append("Aporte a la cuota diaria: " + Math.round(MenuPrincipal.avanceCuota4) + "%\n\n");

	}

	void razonPrecios() {
		textArea.setText("");
		double mayor = 0;
		if (MenuPrincipal.precio0 > MenuPrincipal.precio1 && MenuPrincipal.precio0 > MenuPrincipal.precio2) {
			mayor = MenuPrincipal.precio0;

		} else if (MenuPrincipal.precio1 > MenuPrincipal.precio0 && MenuPrincipal.precio1 > MenuPrincipal.precio2) {
			mayor = MenuPrincipal.precio1;

		} else
			mayor = MenuPrincipal.precio2;

		textArea.append("RAZON DE PRECIOS EN RELACION AL PRECIO MAYOR \n \n");
		textArea.append("Modelo : " + MenuPrincipal.modelo0 + "\n");
		textArea.append("Precio : " + MenuPrincipal.precio0 + "\n");
		textArea.append("Precio : " + Math.round(MenuPrincipal.precio0 / mayor * 100.0) / 100.0 + "\n\n");

		textArea.append("Modelo : " + MenuPrincipal.modelo1 + "\n");
		textArea.append("Precio : " + MenuPrincipal.precio1 + "\n");
		textArea.append("Precio : " + Math.round(MenuPrincipal.precio1 / mayor * 100.0) / 100.0 + "\n\n");

		textArea.append("Modelo : " + MenuPrincipal.modelo2 + "\n");
		textArea.append("Precio : " + MenuPrincipal.precio2 + "\n");
		textArea.append("Precio : " + Math.round(MenuPrincipal.precio2 / mayor * 100.0) / 100.0 + "\n\n");

	}

	void estadisticaCantidad() {
		textArea.setText("");
		int superaron = 0, igualaron = 0;
		if (MenuPrincipal.cntVendida0 > MenuPrincipal.cantidadOptima) {
			superaron++;
		} else if (MenuPrincipal.cntVendida1 > MenuPrincipal.cantidadOptima) {
			superaron++;
		} else if (MenuPrincipal.cntVendida2 > MenuPrincipal.cantidadOptima) {
			superaron++;
		}

		if (MenuPrincipal.cntVendida0 == MenuPrincipal.cantidadOptima) {
			igualaron++;
		} else if (MenuPrincipal.cntVendida1 == MenuPrincipal.cantidadOptima) {
			igualaron++;
		} else if (MenuPrincipal.cntVendida2 == MenuPrincipal.cantidadOptima) {
			igualaron++;
		}

		textArea.append("ESTADISTICAS SOBRE CANTIDAD OPTIMA \n \n");
		textArea.append("Cantidad de modelos que superaron la cantidad óptima: " + superaron + "\n");
		textArea.append("Cantidad de modelos que no superaron la cantidad óptima: " + (3 - superaron) + "\n");
		textArea.append("Cantidad de modelos que igualaron la cantidad óptima: " + igualaron);
	}

	void estadisticaPrecios() {
		textArea.append("");
		double mayor, menor, promedio;

		if (MenuPrincipal.precio0 > MenuPrincipal.precio1 && MenuPrincipal.precio0 > MenuPrincipal.precio2) {
			mayor = MenuPrincipal.precio0;

		} else if (MenuPrincipal.precio1 > MenuPrincipal.precio0 && MenuPrincipal.precio2 > MenuPrincipal.precio2) {
			mayor = MenuPrincipal.precio1;
		} else
			mayor = MenuPrincipal.precio2;

		if (MenuPrincipal.precio0 < MenuPrincipal.precio1 && MenuPrincipal.precio0 < MenuPrincipal.precio2) {
			menor = MenuPrincipal.precio0;

		} else if (MenuPrincipal.precio1 < MenuPrincipal.precio0 && MenuPrincipal.precio2 < MenuPrincipal.precio2) {
			menor = MenuPrincipal.precio1;
		} else
			menor = MenuPrincipal.precio2;

		promedio = (MenuPrincipal.precio0 + MenuPrincipal.precio1 + MenuPrincipal.precio2) / 3;

		textArea.append("ESTADISTICAS SOBRE PRECIO \n\n");
		textArea.append("Precio promedio: " + promedio + "\n");
		textArea.append("Precio mayor: " + mayor + "\n");
		textArea.append("Precio menor: " + menor + "\n");
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}
}
