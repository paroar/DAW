
public class Alumno implements Comparable{
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private Lista asignaturas;
		
	public Alumno() {
		this.asignaturas = new Lista();
		
	}
	
	public Alumno(String nombre, String apellido, int edad, String dni, Lista asignaturas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.asignaturas = new Lista();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	

	public Lista getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Lista asignaturas) {
		this.asignaturas = asignaturas;
	}

	public void añadirAsignaturas() {
		int n;
		Asignatura asignatura;
		System.out.println("¿Cuántas asignaturas quieres introducir?");
		n = InputData.leerEntero();
		for (int i = 0; i < n; i++) {
			asignatura = InputData.leerAsignatura();
			this.asignaturas.addEnd(asignatura);
		}
	}
	
	@Override
	public String toString() {
		return "Alumno [" + nombre + ", " + apellido + ", " + edad + " aÃ±os y dni " + dni + "Asignaturas" + this.asignaturas.toString() + "]";
	}


	@Override
	public int compareTo(Object o) {
		Alumno a = (Alumno)o;
		
		int res = this.apellido.compareTo(a.apellido);
		if (res == 0)
			return this.nombre.compareTo(a.nombre);
		return res;
	}
	
	public void ponerNota()
	
	
}
