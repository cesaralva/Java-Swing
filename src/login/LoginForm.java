package login;

import javax.swing.*;

import menu.MenuPrincipal;

import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    // Componentes de la interfaz
    private JTextField campoUsuario;
    private JPasswordField campoContraseña;
    private JButton botonLogin;
    private JButton btnNewButton;
    private final JLabel lblNewLabel = new JLabel(" ");
    private JLabel lblNewLabel_1;
    private JLabel etiquetaUsuario;
    private JPanel panel_1;
    private JLabel lblNewLabel_2;

    public LoginForm() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/img/nauu.png")));
    	
        setTitle("Ingresar al sistema");
        setSize(557, 351);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setForeground(new Color(64, 224, 208));
        panel.setLayout(null);
        getContentPane().add(panel);
        lblNewLabel.setIgnoreRepaint(true);
        lblNewLabel.setIcon(new ImageIcon(LoginForm.class.getResource("/img/fonditomoto.jpg")));
        lblNewLabel.setBounds(0, 0, 308, 314);
        panel.add(lblNewLabel);
        
        panel_1 = new JPanel();
        panel_1.setForeground(new Color(255, 255, 255));
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(306, 0, 237, 314);
        panel.add(panel_1);
                panel_1.setLayout(null);
        
                etiquetaUsuario = new JLabel("USUARIO:");
                etiquetaUsuario.setBounds(62, 110, 110, 21);
                panel_1.add(etiquetaUsuario);
                etiquetaUsuario.setFont(new Font("TangoSans", Font.BOLD, 18));
                etiquetaUsuario.setForeground(new Color(0, 0, 0));
                lblNewLabel_1 = new JLabel("LA COALICION");
                lblNewLabel_1.setBounds(10, 63, 217, 36);
                panel_1.add(lblNewLabel_1);
                lblNewLabel_1.setForeground(Color.RED);
                lblNewLabel_1.setFont(new Font("Roboto Bk", Font.BOLD, 30));
                JLabel etiquetaPassword = new JLabel("CONTRASEÑA:");
                etiquetaPassword.setBackground(new Color(0, 255, 0));
                etiquetaPassword.setBounds(43, 160, 149, 30);
                panel_1.add(etiquetaPassword);
                etiquetaPassword.setFont(new Font("TangoSans", Font.BOLD, 18));
                etiquetaPassword.setForeground(new Color(0, 0, 0));
                botonLogin = new JButton("INICIAR SESION");
                botonLogin.setForeground(new Color(255, 255, 255));
                botonLogin.setBackground(new Color(255, 69, 0));
                botonLogin.setBounds(43, 218, 140, 29);
                panel_1.add(botonLogin);
                botonLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
                campoContraseña = new JPasswordField(10);
                campoContraseña.setBounds(53, 186, 123, 20);
                panel_1.add(campoContraseña);
                campoUsuario = new JTextField(10);
                campoUsuario.setBounds(53, 136, 123, 20);
                panel_1.add(campoUsuario);
                
                btnNewButton = new JButton("SALIR");
                btnNewButton.setBounds(62, 259, 110, 29);
                panel_1.add(btnNewButton);
                btnNewButton.setForeground(new Color(255, 255, 255));
                btnNewButton.setBackground(new Color(255, 0, 0));
                btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
                
                lblNewLabel_2 = new JLabel("New label");
                lblNewLabel_2.setIcon(new ImageIcon(LoginForm.class.getResource("/img/uwu.png")));
                lblNewLabel_2.setBounds(82, 11, 58, 58);
                panel_1.add(lblNewLabel_2);
                btnNewButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		System.exit(0);
                	}
                });
                botonLogin.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
////////////////////////////
char [] contraseña = campoContraseña.getPassword();
String claveFinal = new String(contraseña);
if (campoUsuario.getText().equals("lacolicion") && claveFinal.equals("1234")) {
	dispose();
	JOptionPane.showMessageDialog(null, "Bienvenido al sistema"
			, "Ingresaste", JOptionPane.INFORMATION_MESSAGE);
	MenuPrincipal a = new MenuPrincipal();
	a.setVisible(true);
	} else {
	JOptionPane.showMessageDialog(null, "Escriba correctamente el usuario o contraseña "
  			+ "", "Error", JOptionPane.ERROR_MESSAGE);
	campoUsuario.setText("");
	campoContraseña.setText("");
	campoUsuario.requestFocus();
	}
    }
    public static void main(String[] args) {
        LoginForm login = new LoginForm();
        login.setVisible(true);
    }
}