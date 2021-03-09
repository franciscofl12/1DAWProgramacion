package cap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class Ejercicio0 {
	
	public static void main(String[] args) {
		try {
			Connection conn;
			conn = ConnectionManagerV2.getConexion();
			int opcion;
			do {
				System.out.println("Aplicacion Fabricantes - Menu \n 1- Agregar fabricantes \n 2- Eliminar fabricantes \n 3- Modificar fabricante \n 4- Lista de fabricantes \n 0 - Salir\n\n");
			    opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción: "));
				if (opcion == 1) {
					agregarALista(conn);
				}
				else {
					if (opcion == 2) {
						eliminarLista(conn);
					}
					else {
						if (opcion == 3) {
							editarLista(conn);
						}
						else {
							if (opcion == 4) {
								mostrarLista();
							}
						}
					}
				}
			} while (opcion != 0);
		} catch (SQLException | ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void mostrarLista() {
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL, si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante");
		   
			// Navegaci�n del objeto ResultSet
			while (rs.next()) { 
				System.out.println (rs.getInt("id") + " " + rs.getString (2)+ 
						" " + rs.getString(3) + " \n"); 
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static void eliminarLista(Connection conn) {
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL, si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Statement s = (Statement) conn.createStatement();
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
			
			mostrarLista();
			
			String id = JOptionPane.showInputDialog("Introduce id que quieres eliminar");
			
			String sql = "DELETE FROM tutorialjavacoches.fabricante " + " WHERE id= " + id ;
			s.executeUpdate(sql);
			
			System.out.println("Dato eliminado.");
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static void editarLista(Connection conn) {
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL, si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Statement s = (Statement) conn.createStatement();
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
			
			mostrarLista();
			
			String id = JOptionPane.showInputDialog("Introduce id que quieres editar");
			String cif = JOptionPane.showInputDialog("Introduce el CIF del fabricante");
			String nombre = JOptionPane.showInputDialog("Introduce el nombre del fabricante");
		
			String sqlcif = "UPDATE tutorialjavacoches.fabricante " +  "set  cif='" + cif +"'" + " WHERE id= " + id;
			s.executeUpdate(sqlcif);
			String sqlnombre = "UPDATE tutorialjavacoches.fabricante " +  "set nombre='" + nombre +"'" + " WHERE id= " + id;
			s.executeUpdate(sqlnombre);
			
			System.out.println("Cambio realizado.");
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static int parseInt(String showInputDialog) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void agregarALista(Connection conn) {
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL, si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Statement s = (Statement) conn.createStatement();
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
			
			String cif = JOptionPane.showInputDialog("Introduce el CIF del fabricante");
			String nombre = JOptionPane.showInputDialog("Introduce el nombre del fabricante");
			
			String sql = "INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " +
					"VALUES  (" + nextIdEnTabla(conn, "fabricante") + ", '" + cif + "', '" + nombre + "')";
			s.executeUpdate(sql);
			
			System.out.println("Dato agregado.");
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/****
	 * 
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	
	private static int maxIdEnTabla (Connection conn, String tabla) throws SQLException {
		Statement s = (Statement) conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches." + tabla;
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max;
	}
	
	/**
	 * 
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	private static int nextIdEnTabla (Connection conn, String tabla) throws SQLException {
		return maxIdEnTabla(conn, tabla) + 1;
	}
}
