
public class Alumno implements Comparable {

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	
	
	public Alumno() {
		
	}


	
	public Alumno(String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
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



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Alumno a = (Alumno)o;
		int res = this.apellidos.compareTo(a.apellidos);
		if(res == 0) {
			return this.nombre.compareTo(a.nombre);
		}
		return res;
	}


	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	
	
}
