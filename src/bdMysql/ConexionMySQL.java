package bdMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

	public static void main(String[] args) {
	      Connection conexion = null;
	      String url = "jdbc:mysql://localhost:3306/SQLQuery2";
	      String usuario = "usuario";
	      String contrasena = "123";

	      try {
	         Class.forName("com.mysql.jdbc.Driver");
	         conexion = DriverManager.getConnection(url, usuario, contrasena);
	         System.out.println("Conexión exitosa a la base de datos MySQL");
	      } catch (SQLException e) {
	         System.out.println("Error al conectar con la base de datos MySQL: " + e.getMessage());
	      } catch (ClassNotFoundException e) {
	         System.out.println("Error al cargar el controlador MySQL: " + e.getMessage());
	      } finally {
	         if (conexion != null) {
	            try {
	               conexion.close();
	            } catch (SQLException e) {
	               System.out.println("Error al cerrar la conexión con la base de datos MySQL: " + e.getMessage());
	            }
	         }
	      }
	   }
	}
