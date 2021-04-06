package cap7.ejercicio1;

public class Cliente {
	
	int id;
	String nombre;
	String apellidos;
	String localidad;
	String dni;
	String fechaNac;
	
	public Cliente(int id, String nombre, String apellidos, String localidad,String dni, String fechaNac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dni = dni;
		this.fechaNac = fechaNac;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getfechaNac() {
		return fechaNac;
	}

	public void setfechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	
	

}
