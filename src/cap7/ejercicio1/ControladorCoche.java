package cap7.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorCoche {

	private static ControladorCoche instance = null;
	public Connection conn = null;
	
	/**
	 * 
	 * @return
	 */
	public static ControladorCoche getInstance () {
		if (instance == null) {
			instance = new ControladorCoche();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorCoche() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	
	/**
	 * 
	 * @return
	 */
	public Cliente findPrimero () {
		Cliente f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id limit 1");
			if (rs.next()) {
				f = new Cliente();
				f.setId(rs.getInt("id"));
				f.setNombre(rs.getString("nombre"));
				f.setApellidos(rs.getString("apellidos"));
				f.setLocalidad(rs.getString("localidad"));
				f.setDni(rs.getString("dniNie"));
				f.setfechaNac(rs.getString("fechaNac"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	

	/**
	 * 
	 * @return
	 */
	public Cliente findUltimo () {
		Cliente f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id desc limit 1");
			if (rs.next()) {
				f = new Cliente();
				f.setId(rs.getInt("id"));
				f.setNombre(rs.getString("nombre"));
				f.setApellidos(rs.getString("apellidos"));
				f.setLocalidad(rs.getString("localidad"));
				f.setDni(rs.getString("dniNie"));
				f.setfechaNac(rs.getString("fechaNac"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public Cliente findSiguiente (int idActual) {
		Cliente f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				f = new Cliente();
				f.setId(rs.getInt("id"));
				f.setNombre(rs.getString("nombre"));
				f.setApellidos(rs.getString("apellidos"));
				f.setLocalidad(rs.getString("localidad"));
				f.setDni(rs.getString("dniNie"));
				f.setfechaNac(rs.getString("efechaNac"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	


	/**
	 * 
	 * @return
	 */
	public Cliente findAnterior (int idActual) {
		Cliente f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				f = new Cliente();
				f.setId(rs.getInt("id"));
				f.setNombre(rs.getString("nombre"));
				f.setApellidos(rs.getString("apellidos"));
				f.setLocalidad(rs.getString("localidad"));
				f.setDni(rs.getString("dniNie"));
				f.setfechaNac(rs.getString("efechaNac"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public int modificar (Cliente f) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update cliente set nombre='" + f.getNombre() + "', " +
					" apellidos='" + f.getApellidos() + " apellidos='" + f.getLocalidad() + " dniNie='" + f.getDni() + " efechaNac='" + f.getfechaNac() +"' where id=" + f.getId() + ";");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Cliente f) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into cliente values(" + idNuevoRegistro + ", " +
			"'" + f.getNombre() + "', '" + f.getApellidos() + "', " + " '" + f.getLocalidad() + "', '" + f.getDni() + "', '" + f.getfechaNac() + "');");
		   	
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId () throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches.cliente";
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int borrar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from cliente where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

}
