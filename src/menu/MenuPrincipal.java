package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import gui.*;
import gui.modificarMoto;
import gui.reporteMoto;
import gui.ventasMoto;
import gui.ayudaMoto;
import gui.configurarCantidadOptima;
import gui.consultarMoto;
import gui.listaMoto;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;

public class MenuPrincipal extends JFrame implements ActionListener  {
	private JMenuBar menuBar;
	private JMenu btnArchivo;
	private JMenuItem btnSalir;
	private JMenu btnMantenimiento;
	private JMenuItem btnConsultarMoto;
	private JMenuItem btnModificarMoto;
	private JMenuItem btnListarMoto;
	private JMenu btnConfiguracion;
	private JMenu btnVentas;
	private JMenuItem btnConfiDescuento;
	private JMenuItem btnConfiObsequio;
	private JMenuItem btnConfiCantOptima;
	private JMenuItem btnConfiCuotaDiaria;
	private JMenuItem btnVender;
	private JMenuItem btnGenerarReportes;
	private JMenu btnAyuda;
	private JMenuItem btnAcercaTienda;
	public static consultarMoto formConsultarMoto;
	public static listaMoto formListaMoto;
	public static modificarMoto formModificarMoto;
	public static reporteMoto formReporteMoto;
	public static ventasMoto formVentasMoto;
	public static ayudaMoto formAyudaMoto;
	public static configurarCuotaDiaria formConfigurarCuotaDiaria; 
	public static configurarDescuento formConfigurarDescuento;
	public static configurarObsequio formConfigurarObsequio;
	public static configurarCantidadOptima formConfigurarCantidadOptima; 

	/*
	
	
	
	*/

	// Datos mínimos de la primera Moto
	public static String modelo0 = "Honda CB190R"; // marca y modelo de moto
	public static double precio0 = 12760.00; // precio de moto en soles
	public static int velocidad0 = 5; // cambio de velocidades
	public static int cilindrada0 = 184; // tipo de cilindrada
	public static double kilometraje0 = 126; // velocidad maxima de la moto
	public static int dimensiones0 = 140; // peso de la moto
	public static String trasmicion0 = "Mecánica"; // TRANSMISIÓN
	public static String pistones0 = "Nro. de cilindros 1"; // numerode cilindros
	public static String garantia0 = "12 meses"; // garantia de la moto
	public static int ventas0 = 0;
	public static int stock0 = 20;
	public static double importeVentas0 = 0;
	public static double avanceCuota0 = 0;
	public static int cntVendida0=0;

	// Datos mínimos de la segunda Moto
	public static String modelo1 = "Yamaha R15 V4"; // marca y modelo de moto
	public static double precio1 = 19618.00; // precio de moto en soles
	public static int velocidad1 = 6; // cambio de velocidades
	public static int cilindrada1 = 155; // tipo de cilindrada
	public static double kilometraje1 = 140; // velocidad maxima de la moto
	public static int dimensiones1 = 140; // peso de la moto
	public static String trasmicion1 = "Mecánica"; // TRANSMISIÓN
	public static String pistones1 = "Nro. de cilindros 1"; // numerode cilindros
	public static String garantia1 = "48 meses"; // garantia de la moto
	public static int ventas1 = 0;
	public static int stock1 = 10;
	public static double importeVentas1 = 0;
	public static double avanceCuota1 = 0;
	public static int cntVendida1=0;

	// Datos mínimos de la tercera Moto
	public static String modelo2 = "Pulsar NS200 FI"; // marca y modelo de moto
	public static double precio2 = 13729.00; // precio de moto en soles
	public static int velocidad2 = 6; // cambio de velocidades
	public static int cilindrada2 = 200; // tipo de cilindrada
	public static double kilometraje2 = 136; // velocidad maxima de la moto
	public static int dimensiones2 = 145; // peso de la moto
	public static String trasmicion2 = "Mecánica"; // TRANSMISIÓN
	public static String pistones2 = "Nro. de cilindros 1"; // numerode cilindros
	public static String garantia2 = "12 meses"; // garantia de la moto
	public static int ventas2 = 0;
	public static int stock2 = 10;
	public static double importeVentas2 = 0;
	public static double avanceCuota2 = 0;
	public static int cntVendida2=0;
	// Datos mínimos de la cuarta Moto
	public static String modelo3 = "Apache RR310X"; // marca y modelo de moto
	public static double precio3 = 13729.00; // precio de moto en soles
	public static int velocidad3 = 6; // cambio de velocidades
	public static int cilindrada3 = 313; // tipo de cilindrada
	public static double kilometraje3 = 160; // velocidad maxima de la moto
	public static int dimensiones3 = 155; // peso de la moto
	public static String trasmicion3 = "Mecánica"; // TRANSMISIÓN
	public static String pistones3 = "Nro. de cilindros 1"; // numerode cilindros
	public static String garantia3 = "24 meses"; // garantia de la moto
	public static int ventas3 = 0;
	public static int stock3 = 15;
	public static double importeVentas3 = 0;
	public static double avanceCuota3 = 0;
	public static int cntVendida3=0;

	// Datos mínimos de la quinta Moto
	public static String modelo4 = "Hunk 160R"; // marca y modelo de moto
	public static double precio4 = 9335.00; // precio de moto en soles
	public static int velocidad4 = 5; // cambio de velocidades
	public static int cilindrada4 = 163; // tipo de cilindrada
	public static double kilometraje4 = 160; // velocidad maxima de la moto
	public static int dimensiones4 = 138; // peso de la moto
	public static String trasmicion4 = "Mecánica"; // TRANSMISIÓN
	public static String pistones4 = "Nro. de cilindros 1"; // numerode cilindros
	public static String garantia4 = "36 meses"; // garantia de la moto
	public static int ventas4 = 0;
	public static int stock4 = 20;
	public static double importeVentas4 = 0;
	public static double avanceCuota4 = 0;
	public static int cntVendida4=0;
	// Obsequios
	public static String tipoObsequio1 = "Casco";
	public static String tipoObsequio2 = "Guantes";
	public static String tipoObsequio3 = "Repuestos";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 4;
	public static int obsequioCantidad3 = 5;
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 450000.00;

	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	public static double porcentaje1 = 0.5;

	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
					
					//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/img/entrega.png")));
		
		
		
	

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		this.setLocationRelativeTo(null);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		btnArchivo = new JMenu("Archivo");
		btnArchivo.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/icons8-página-principal-16.png")));
		menuBar.add(btnArchivo);

		btnSalir = new JMenuItem("Salir");
		btnSalir.addActionListener(this);

		btnArchivo.add(btnSalir);

		btnMantenimiento = new JMenu("Mantenimiento");
		btnMantenimiento.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/mantenimiento.png")));
		menuBar.add(btnMantenimiento);

		btnConsultarMoto = new JMenuItem("Consultar Moto");
		btnConsultarMoto.addActionListener(this);

		btnMantenimiento.add(btnConsultarMoto);

		btnModificarMoto = new JMenuItem("Modificar Moto");
		btnModificarMoto.addActionListener(this);
		btnMantenimiento.add(btnModificarMoto);

		btnListarMoto = new JMenuItem("Listar Moto");
		btnListarMoto.addActionListener(this);

		btnMantenimiento.add(btnListarMoto);

		btnVentas = new JMenu("Ventas");
		btnVentas.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/venta.png")));
		menuBar.add(btnVentas);

		btnVender = new JMenuItem("Vender");
		btnVender.addActionListener(this);
		btnVentas.add(btnVender);

		btnGenerarReportes = new JMenuItem("Generar Reportes");
		btnGenerarReportes.addActionListener(this);
		btnVentas.add(btnGenerarReportes);

		btnConfiguracion = new JMenu("Configuración");
		btnConfiguracion.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/confguracion.png")));
		menuBar.add(btnConfiguracion);

		btnConfiDescuento = new JMenuItem("Configurar descuentos");
		btnConfiDescuento.addActionListener(this);
		btnConfiguracion.add(btnConfiDescuento);

		btnConfiObsequio = new JMenuItem("Configurar obsequios");
		btnConfiObsequio.addActionListener(this);
		btnConfiguracion.add(btnConfiObsequio);

		btnConfiCantOptima = new JMenuItem("Configurar cantidad óptima");
		btnConfiCantOptima.addActionListener(this);
		btnConfiguracion.add(btnConfiCantOptima);

		btnConfiCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		btnConfiCuotaDiaria.addActionListener(this);
		btnConfiguracion.add(btnConfiCuotaDiaria);

		btnAyuda = new JMenu("Ayuda");
		btnAyuda.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/img/Help.png")));
		menuBar.add(btnAyuda);

		btnAcercaTienda = new JMenuItem("Acerca de la Tienda");
		btnAcercaTienda.addActionListener(this);
		btnAyuda.add(btnAcercaTienda);

		desktopPane = new JDesktopPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(desktopPane,
				GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(desktopPane,
				GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE));
		getContentPane().setLayout(groupLayout);

	}
	
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfiCuotaDiaria) {
			actionPerformedBtnConfiCuotaDiaria(e);
		}
		if (e.getSource() == btnConfiCantOptima) {
			actionPerformedBtnConfiCantOptima(e);
		}
		if (e.getSource() == btnConfiObsequio) {
			actionPerformedBtnConfiObsequio(e);
		}
		if (e.getSource() == btnAcercaTienda) {
			actionPerformedBtnAcercaTienda(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == btnGenerarReportes) {
			actionPerformedBtnGenerarReportes(e);
		}
		if (e.getSource() == btnConfiDescuento) {
			actionPerformedBtnConfiDescuento(e);
		}
		if (e.getSource() == btnSalir) {
			actionPerformedBtnSalir(e);
		}
		if (e.getSource() == btnConsultarMoto) {
			actionPerformedBtnConsultarMoto(e);
		}
		if (e.getSource() == btnModificarMoto) {
			actionPerformedBtnModificarMoto(e);
		}
		if (e.getSource() == btnListarMoto) {
			actionPerformedBtnListarMoto(e);
		}
	}

	protected void actionPerformedBtnListarMoto(ActionEvent e) {
		if (formListaMoto == null || formListaMoto.isClosed()) {

			listaMoto abrir = new listaMoto();
			abrir.setVisible(true);
		}
	}

	protected void actionPerformedBtnModificarMoto(ActionEvent e) {
		if (formModificarMoto == null || formModificarMoto.isClosed()) {

			modificarMoto abrir = new modificarMoto();
			abrir.setVisible(true);
		}

	}

	protected void actionPerformedBtnConsultarMoto(ActionEvent e) {
		if (formConsultarMoto == null || formConsultarMoto.isClosed()) {

			consultarMoto formConsultarMoto = new consultarMoto();
			formConsultarMoto.setVisible(true);
		}
	}

	protected void actionPerformedBtnSalir(ActionEvent e) {

		int resp = javax.swing.JOptionPane.showConfirmDialog(null, "¿Desea salir, seguro que guardaste?", null,
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (resp == 0) {

			System.exit(0);

		}
	}

	protected void actionPerformedBtnConfiDescuento(ActionEvent e) {
		 if(formConfigurarDescuento == null || formConfigurarDescuento.isClosed()) {
		 configurarDescuento abrir= new configurarDescuento();
		 abrir.setVisible(true);
	}}
	protected void actionPerformedBtnGenerarReportes(ActionEvent e) {
		if (formReporteMoto == null || formReporteMoto.isClosed()) {

			reporteMoto abrir = new reporteMoto();
			abrir.setVisible(true);
		}
		
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
		
		if (formVentasMoto == null || formVentasMoto.isClosed()) {

			ventasMoto abrir = new ventasMoto();
			abrir.setVisible(true);
		}
	}
	protected void actionPerformedBtnAcercaTienda(ActionEvent e) {
		
		if (formAyudaMoto == null || formAyudaMoto.isClosed()) {
			formAyudaMoto = new ayudaMoto();
			desktopPane.add(formAyudaMoto);
			formAyudaMoto.show();
		}
	}
	protected void actionPerformedBtnConfiObsequio(ActionEvent e) {
		if (formConfigurarObsequio == null || formConfigurarObsequio.isClosed()) {

			configurarObsequio abrir = new configurarObsequio();
			abrir.setVisible(true);
		}
	}
	protected void actionPerformedBtnConfiCantOptima(ActionEvent e) {
		if (formConfigurarCantidadOptima == null || formConfigurarCantidadOptima.isClosed()) {

			configurarCantidadOptima abrir = new configurarCantidadOptima();
			abrir.setVisible(true);
		}
	}
	protected void actionPerformedBtnConfiCuotaDiaria(ActionEvent e) {
		if (formConfigurarCuotaDiaria == null || formConfigurarCuotaDiaria.isClosed()) {

			configurarCuotaDiaria abrir = new configurarCuotaDiaria();
			abrir.setVisible(true);
		}
	}
}
